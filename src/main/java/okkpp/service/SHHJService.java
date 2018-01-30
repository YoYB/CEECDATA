package okkpp.service;

import java.util.List;

import okkpp.dao.GTMJMapper;
import okkpp.dao.SHHJMapper;
import okkpp.model.GTMJ;
import okkpp.model.SHHJ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author DUCK  E-mail: okkpp@qq.com
 * @date ����ʱ�䣺2018��1��18�� ����4:03:48 
 * @version 1.0 
 */
@Service
@Transactional
public class SHHJService {

	@Autowired
	private SHHJMapper Smapper;
	@Autowired
	private GTMJMapper Gmapper;
	
	public List<SHHJ> getSHHJ(String GJDM){
		return Smapper.getSHHJ(GJDM);
	}
	
	public List<GTMJ> getGTMJ(String GJDM){
		return Gmapper.getGTMJ(GJDM);
	}
}
