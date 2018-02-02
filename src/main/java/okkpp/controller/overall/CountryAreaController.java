package okkpp.controller.overall;

import okkpp.service.overall.CountryAreaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * @author DUCK  E-mail: okkpp@qq.com
 * @date ����ʱ�䣺2018��2��2�� ����1:43:10 
 * @version 1.0 
 */
@Controller
@RequestMapping("/overall")
public class CountryAreaController {

	@Autowired
	CountryAreaService service;
	
	@RequestMapping("/CountryArea")
	public String getAll(Model model){
		model.addAttribute("data", service.getAll());
		return "test";
	}
	
}
