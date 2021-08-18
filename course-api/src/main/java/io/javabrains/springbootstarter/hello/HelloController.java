package io.javabrains.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {//@controller, rstcontroller
	
	@RequestMapping("/hello")
	public String sayHi() {
		return "Hi";
	}

}
