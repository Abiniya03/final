package com.Demo;

import org.springframework.sterotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Addition {
	
	@RequestMapping("/")
	public void add() {
		int fnum=Integer.parseInt("10");
		int snum=Integer.parseInt("3");
		int result = fnum + snum;
		System.out.println(result);
		
	}

}
