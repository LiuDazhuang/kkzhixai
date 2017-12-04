package top.kkzhixia.contorller.kkzhixia;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class blogController {

	
	@RequestMapping("/blog")
	public String getUser(){
		
		return "hello word! ";
	}
}
