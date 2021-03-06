package com.macchicken.service;

import java.util.List;
import java.util.Map;

import com.macchicken.dto.PersonVS;


public interface IPersonServie {

	public PersonVS save(PersonVS person);
	public PersonVS update(PersonVS person);
	public void delete(String id);
	public PersonVS select(String id);
	public List<PersonVS> selectAll();
	public List<PersonVS> selectBySize(Map<String,Integer> params);
	public Integer selectCountAll();
}
