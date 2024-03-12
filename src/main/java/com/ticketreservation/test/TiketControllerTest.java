package com.ticketreservation.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TiketControllerTest {

	@GetMapping("/test")
	public String test() { //초기 테스트
		return "test성공";
	}
	
	@GetMapping("/testAPI")
	public String testAPI() {
		return "테스트API";
	}
	
}
