package web.fdu_ac_service.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	@RequestMapping("/getTestData")
	@ResponseBody
	public String returnTest(){
		System.out.println("success");
		return "Test success";
	}

}
