package com.macchicken.dao;

import java.util.List;
import java.util.Map;

import com.macchicken.dto.PersonVS;



public interface NewPersonDao {

	public PersonVS selectPerson(String id);
	   
    public void savePerson(PersonVS person);
   
    public void updatePerson(PersonVS person);
   
    public void deletePerson(String id);
   
    public List<PersonVS> selectAll();

    public List<PersonVS> selectBySize(Map<String,Integer> params);

    public Integer selectCountAll();
}
