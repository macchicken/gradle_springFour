package com.macchicken.service;

import com.macchicken.dto.Person;


public interface EditService {

	Person getPerson() ;

	void savePerson(Person personBean);
}
