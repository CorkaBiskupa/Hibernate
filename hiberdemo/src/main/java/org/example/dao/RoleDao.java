package org.example.dao;

import java.util.Collection;

import org.example.domain.Privilege;
import org.example.domain.Role;

public interface RoleDao extends Dao<Role> {

	public Collection<Privilege> getPRivilages(Role role);
	public void addPrivilege(Privilege privilege);
	public void removePrivilege(Privilege privelege);
}
