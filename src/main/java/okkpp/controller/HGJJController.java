package okkpp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import okkpp.model.HGJJ;
import okkpp.service.HGJJService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.gson.Gson;

/**
 * @author DUCK  E-mail: okkpp@qq.com
 * @date ����ʱ�䣺2018��1��17�� ����2:34:08 
 * @version 1.0 
 */
@Controller
@RequestMapping("/HGJJ")
public class HGJJController {

	@Autowired
	private HGJJService service;
	
	@RequestMapping("/GDP")
	public String GDP(Model model,String GJDM,HttpServletRequest request){
//		System.out.println(request.getCharacterEncoding()+"\n"+GJDM);
		List<HGJJ> list = service.getHGJJ(GJDM);
		if(list.isEmpty())return "/404";
		model.addAttribute("HGJJ",new Gson().toJson(list));
		model.addAttribute("GJ", list.get(0).getGJ());
		return "/��۾���/��۾��á�GDP";
	}
	@RequestMapping("/FJZ")
	public String FJZ(Model model,String GJDM){
		List<HGJJ> list = service.getHGJJ(GJDM);
		if(list.isEmpty())return "/404";
		model.addAttribute("HGJJ",new Gson().toJson(list));
		model.addAttribute("GJ", list.get(0).getGJ());
		return "/��۾���/��۾��á�����ȸ���ֵ";
	}
	@RequestMapping("/RJGDP")
	public String RJGDP(Model model,String GJDM){
		List<HGJJ> list = service.getHGJJ(GJDM);
		if(list.isEmpty())return "/404";
		model.addAttribute("HGJJ",new Gson().toJson(list));
		model.addAttribute("GJ", list.get(0).getGJ());
		return "/��۾���/��۾��á��˾�GDP";
	}
	@RequestMapping("/TZL")
	public String TZL(Model model,String GJDM){
		List<HGJJ> list = service.getHGJJ(GJDM);
		if(list.isEmpty())return "/404";
		model.addAttribute("HGJJ",new Gson().toJson(list));
		model.addAttribute("GJ", list.get(0).getGJ());
		return "/��۾���/��۾��á�ͨ����";
	}
}
