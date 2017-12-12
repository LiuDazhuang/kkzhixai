package top.kkzhixia.contorller.kkzhixia;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class blogController {

	
	@RequestMapping("/blog")
	public String getUser(){
		return "index.jsp";
	}
}
