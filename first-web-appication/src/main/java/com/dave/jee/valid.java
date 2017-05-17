package com.dave.jee;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class valid {

	public boolean isvalid(String user,String pass)
	{
		if(user.equals("dave") && pass.equals("123"))
			return true;
		 
		return false;
	}
}
