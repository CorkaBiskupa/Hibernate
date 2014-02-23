package org.example.dao;

import java.util.Collection;

import org.example.domain.Address;
import org.example.domain.Person;


public interface PersonDao extends Dao<Person> {
	
	public Collection<Address> getAddresses(Person person);
	
}
