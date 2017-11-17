package top.kkzhixia.contorller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import top.kkzhixia.util.CheckUtil;



@RestController
@RequestMapping("/")
public class WeixinController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@RequestMapping("/")
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("我是日志,我来证明程序启动了");
		String  signature=req.getParameter("signature");
		String  timestamp=req.getParameter("timestamp");
		String  nonce=req.getParameter("nonce");
		String  echostr=req.getParameter("echostr");
		
		if(CheckUtil.checkSignature(signature,timestamp,nonce)){
			System.out.println(echostr);
		}
		
		
	}
	
	

}
