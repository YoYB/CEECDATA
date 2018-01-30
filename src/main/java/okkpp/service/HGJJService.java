package okkpp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.HGJJMapper;
import okkpp.model.HGJJ;

/**
 * @author DUCK  E-mail: okkpp@qq.com
 * @date ����ʱ�䣺2018��1��17�� ����2:56:04 
 * @version 1.0 
 */
@Service
@Transactional
public class HGJJService {

	@Autowired
	HGJJMapper mapper;
	
	public List<HGJJ> getHGJJ(String GJDM){
		return mapper.getHGJJ(GJDM);
	}
}
