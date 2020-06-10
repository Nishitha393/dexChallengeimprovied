package com.pro.dex.dao;

import java.util.List;

public interface DAO {

	public Boolean save(Object entity);
	public Boolean update(Object entity);
	public Boolean delete(Integer id);
	public default Object get(Integer id) {return null;}
	public default List<Object>list(){return null;}
}