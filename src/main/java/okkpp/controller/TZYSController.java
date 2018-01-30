package okkpp.controller;

import java.util.List;

import okkpp.model.JJZYDZS;
import okkpp.model.YSHJ;
import okkpp.service.TZYSService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.gson.Gson;

/**
 * @author DUCK  E-mail: okkpp@qq.com
 * @date ����ʱ�䣺2018��1��22�� ����1:45:48 
 * @version 1.0 
 */
@Controller
@RequestMapping("/TZYS")
public class TZYSController {

	@Autowired
	private TZYSService service;
	
	@RequestMapping("/JJZYDZS")
	public String JJZYDZS(Model model,String GJDM){
		List<JJZYDZS> list = service.getJJZYDZS(GJDM);
		if(list.isEmpty())return "/404";
		model.addAttribute("JJZYDZS", new Gson().toJson(list));
		model.addAttribute("GJ", list.get(0).getGJ());
		return "/Ͷ��Ӫ��/Ͷ��Ӫ�̡��������ɶ�ָ��";
	}
	@RequestMapping("/YSHJ")
	public String YSHJ(Model model,String GJDM){
		List<YSHJ> list = service.getYSHJ(GJDM);
		if(list.isEmpty())return "/404";
		model.addAttribute("YSHJ", new Gson().toJson(list));
		model.addAttribute("GJ", list.get(0).getGJ());
		return "/Ͷ��Ӫ��/Ͷ��Ӫ�̡�Ӫ�̻���";
	}
}
