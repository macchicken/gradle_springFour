package com.macchicken.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.macchicken.dto.MessageStore;
import com.macchicken.model.User;
import com.macchicken.utils.Constants;

@RestController
public class MyhelloworldsecController {

	@RequestMapping(value="/mymvc/getMessageInJson.do", method = RequestMethod.GET)  
	public Map<String, Object> getMessageInJson(String message,Integer count,HttpSession session){
		MessageStore temp=new MessageStore();
		User my=(User) session.getAttribute(Constants.ACEUSER);
		if (my!=null){temp.setUserName(my.getName());};
		if (StringUtils.isNotEmpty(message)){temp.setMessage(message);}
		if (count!=null) {count+=1;temp.setHelloCount(count);}
		HashMap<String,Object> result=new HashMap<String,Object>();
		result.put("success", true);
		result.put("messageObj", temp);
		return result;
	}
	
	
}
