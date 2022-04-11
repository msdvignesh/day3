package com.sbi.layer3;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;
public class BaseDaoImpl<T> implements BaseDao<T> {
	@PersistenceContext(unitName = "MyJPA")
	EntityManager em;

	public BaseDaoImpl() {
//	 emf = Persistence.createEntityManagerFactory("MyJPA");
//	 em = emf.createEntityManager();
	}

	//@Transactional
	public void persist(Object object) {
//		em = emf.createEntityManager();

		em.persist(object);

	}

	//@Transactional
	public void merge(Object object) {
//		em = emf.createEntityManager();

		em.merge(object);

	}

	//@Transactional
	public void remove(Object object) {

		em.remove(object);

	}

	public <E> E find(Class<E> className, Serializable primaryKey) {

		E e = em.find(className, primaryKey);
		return e;

	}

	public <E> List<E> findAll(String entityName) {

		List<E> listFindAll;

		Query query = em.createQuery("from " + entityName);
		listFindAll = query.getResultList();
		return listFindAll;
	}
}
