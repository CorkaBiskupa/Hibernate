package org.example.dao;

import java.util.Collection;

public interface Dao<TEntity> {

	public void save(TEntity entity);
	public void delete(TEntity entity);
	public void update(TEntity entity);
	public TEntity get(int id);
	public Collection<TEntity> getAll();
	
}
