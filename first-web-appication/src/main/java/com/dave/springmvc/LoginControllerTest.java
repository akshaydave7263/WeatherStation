package com.dave.springmvc;

import static org.junit.Assert.*;


import org.junit.Test;

public class LoginControllerTest {
	
LoginController akshay = new LoginController();


	@Test
	public void test() {
		String s = "login";
		assertEquals("the expected string is:",s,akshay.showLoginPage());
		
	}

}
