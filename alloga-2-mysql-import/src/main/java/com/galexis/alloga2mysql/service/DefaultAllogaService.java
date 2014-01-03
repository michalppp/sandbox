package com.galexis.alloga2mysql.service;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

public class DefaultAllogaService implements AllogaService {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public <T> int allCount(Class<T> entityClazz) {
		Long count = (Long) entityManager.createQuery("select count(*) from " + entityClazz.getSimpleName()).setHint("org.hibernate.readOnly", true).getSingleResult();
		return count.intValue();
	}

	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	@Override
	public <T> List<T> all(Class<T> entityClazz, int first, int count) {
		return entityManager.createQuery("select e from " + entityClazz.getSimpleName() + " as e").setFirstResult(first).setMaxResults(count)
		        .setHint("org.hibernate.readOnly", true).getResultList();
	}

	@Transactional(readOnly = true)
	@Override
	public <T> int changedCount(Class<T> entityClazz, Date since) {
		Long count = (Long) entityManager.createQuery("select count(*) from " + entityClazz.getSimpleName() + " as e where e.recordlastchangetime > :since")
		        .setParameter("since", since).setHint("org.hibernate.readOnly", true).getSingleResult();
		return count.intValue();
	}

	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	@Override
	public <T> List<T> changed(Class<T> entityClazz, Date since, int first, int count) {
		return entityManager.createQuery("select e from " + entityClazz.getSimpleName() + " as e where e.recordlastchangetime > :since").setParameter("since", since)
		        .setFirstResult(first).setMaxResults(count).setHint("org.hibernate.readOnly", true).getResultList();
	}

	@Transactional(readOnly = true)
	@Override
	public <T> int newlyCreatedCount(Class<T> entityClazz, Date since) {
		Long count = (Long) entityManager.createQuery("select count(*) from " + entityClazz.getSimpleName() + " as e where e.recordcreationtime > :since")
		        .setParameter("since", since).setHint("org.hibernate.readOnly", true).getSingleResult();
		return count.intValue();
	}

	@Transactional
	@SuppressWarnings("unchecked")
	@Override
	public <T> List<T> newlyCreated(Class<T> entityClazz, Date since, int first, int count) {
		return entityManager.createQuery("select e from " + entityClazz.getSimpleName() + " as e where e.recordcreationtime > :since").setParameter("since", since)
		        .setFirstResult(first).setMaxResults(count).setHint("org.hibernate.readOnly", true).getResultList();
	}

}
