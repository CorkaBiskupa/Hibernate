package org.example.dao;

import java.util.Collection;

import org.example.domain.Person;
import org.example.domain.Privilege;
import org.example.domain.Role;
import org.example.domain.User;

public interface UserDao extends Dao<User> {
	
	public Person getUserData(User user);
	public Collection<Privilege> getUserPrivileges(User user);
	public Collection<Role> getUserRoles(User user);
	
}
