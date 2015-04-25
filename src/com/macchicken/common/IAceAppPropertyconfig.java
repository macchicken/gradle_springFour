package com.macchicken.common;

import java.util.HashMap;

public interface IAceAppPropertyconfig {

	public HashMap<String, Object> getAceproperties();
	
	public Object getPropertyValue(String key);
}
