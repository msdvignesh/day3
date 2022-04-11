package com.sbi.layer3;

import java.io.Serializable;
import java.util.List;

public interface BaseDao<T> {

	void persist(Object object);

	void merge(Object object);

	void remove(Object object);

	<E> E find(Class<E> className, Serializable primaryKey);

	<E> List<E> findAll(String entityName);

}