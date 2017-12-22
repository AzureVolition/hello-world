package handler;

import javax.servlet.ServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import bean.Servent;

@RequestMapping("/fgo")
@Controller
public class ServentHandler {
	
	 
	 
	@RequestMapping("test")
	public ModelAndView getServent(){
		ModelAndView nonename = new ModelAndView();
		Servent ser = new Servent();
		ser.setName("clearlove");
		ser.setAtk(4396);
		ser.setHp(4396);
		
		nonename.addObject("servent", ser);
		nonename.setViewName("/WEB-INF/page/test.jsp");
		return nonename;
	}
	
	public ModelAndView register(Servent ser){
		ModelAndView newass = new ModelAndView();
		if(true){}
		return newass;
	}
}
