package top.kkzhixia.contorller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class UserController {

	@RequestMapping("/getuser")
	String getUser(){
		
		return "hello word! ";
	}
}
