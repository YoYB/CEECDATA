package okkpp.service;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

import okkpp.dao.GTMJMapper;
import okkpp.dao.HGJJMapper;
import okkpp.dao.IMANDEXMapper;
import okkpp.dao.JJZYDZSMapper;
import okkpp.dao.MYQKMapper;
import okkpp.dao.SHHJMapper;
import okkpp.dao.WLJXZSMapper;
import okkpp.dao.YSHJMapper;
import okkpp.utils.ExcelUtil;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author DUCK  E-mail: okkpp@qq.com
 * @date ����ʱ�䣺2018��1��19�� ����9:18:44 
 * @version 1.0 
 */
@Service
@Transactional
public class UploadDataService {

	@Autowired
	private GTMJMapper GTMJMapper;
	@Autowired
	private HGJJMapper HGJJMapper;
	@Autowired
	private IMANDEXMapper IMANDEXMapper;
	@Autowired
	private JJZYDZSMapper JJZYDZSMapper;
	@Autowired
	private MYQKMapper MYQKMapper;
	@Autowired
	private SHHJMapper SHHJMapper;
	@Autowired
	private WLJXZSMapper WLJXZSMapper;
	@Autowired
	private YSHJMapper YSHJMapper;
	private String uploadData(String lb,List<Map<String, String>> data){
		switch(lb.toUpperCase()){
		case "GTMJ":GTMJMapper.uploadData(data);break;
		case "HGJJ":HGJJMapper.uploadData(data);break;
		case "IMANDEX":IMANDEXMapper.uploadData(data);break;
		case "JJZYDZS":JJZYDZSMapper.uploadData(data);break;
		case "MYQK":MYQKMapper.uploadData(data);break;
		case "SHHJ":SHHJMapper.uploadData(data);break;
		case "WLJXZS":WLJXZSMapper.uploadData(data);break;
		case "YSHJ":YSHJMapper.uploadData(data);break;
		default : return "δ֪���͡�";
		}
		return "������ϡ�";
	}
	public String importFile(MultipartFile mfile){
		String fileName = mfile.getOriginalFilename();
		String suffix = fileName.substring(fileName.lastIndexOf(".") + 1, fileName.length());
		System.out.println(fileName+"\n"+suffix);
		int size = 0;
		try {
			File file = new File("/upload/"
					+new SimpleDateFormat("yyyyMMddHHmmss")
					.format(System.currentTimeMillis())
					+suffix);
			file.mkdirs();
			
			mfile.transferTo(file);
			ExcelUtil eu = new ExcelUtil();
			eu.xls(file);
			System.out.println(eu.lb);
			size = eu.data.size();
			if(size<1)return "û�����ݡ�";
			this.uploadData(eu.lb,eu.data);
			System.out.println("file path :"+file.getPath());
		} catch (IllegalStateException e) {
			e.printStackTrace();
			return "�ļ�����";
		} catch (IOException e) {
			e.printStackTrace();
			return "��������";
		} catch (InvalidFormatException e) {
			e.printStackTrace();
			return "��Ч�ļ���";
		}
		return "�ϴ��ɹ���������"+size+"�����ݡ�";
	}
	

}
