package com.galexis.alloga2mysql.service;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

import com.galexis.search.common.util.GaxBeanUtils;

public class DefaultMySqlService implements MySqlService {

	private static final Logger logger = LoggerFactory.getLogger(DefaultMySqlService.class);

	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	@Override
	public <T> Date lastCreated(Class<T> entityClazz) {
		return (Date) entityManager.createQuery("select max(e.recordcreationtime) from " + entityClazz.getSimpleName() + " as e").getSingleResult();
	}

	@Transactional
	@Override
	public <T> Date lastChanged(Class<T> entityClazz) {
		return (Date) entityManager.createQuery("select max(e.recordlastchangetime) from " + entityClazz.getSimpleName() + " as e").getSingleResult();
	}

	// unfortunately are the data in the as400 system are not consistent therefore the insert 
	// method does merge which results in insert for non-existing rows and and update for existing
	@Transactional
	@Override
	public <T> void insert(Class<T> entityClazz, List<T> data) {

		foreignKeysChecksOff();

		for (T item : data) {
			if (item != null) {
				entityManager.merge(item);
			} else {
				logger.warn("Entity {} is null", GaxBeanUtils.collectionElementsSimpleClassName(data));
			}
		}
	}

	@Transactional
	@Override
	public <T> void update(Class<T> entityClazz, List<T> data) {

		foreignKeysChecksOff();

		for (T item : data) {
			if (item != null) {
				entityManager.merge(item);
			} else {
				logger.warn("Entity {} is null", GaxBeanUtils.collectionElementsSimpleClassName(data));
			}
		}
	}

	@Transactional
	@Override
	public void foreignKeysChecksOff() {
		entityManager.createNativeQuery("SET FOREIGN_KEY_CHECKS = 0").executeUpdate();
	}

	@Transactional
	@Override
	public void foreignKeysCheckOn() {
		entityManager.createNativeQuery("SET FOREIGN_KEY_CHECKS = 1").executeUpdate();
	}

	@Transactional
	@Override
	public <T> void deleteAll(Class<T> entityClazz) {
		foreignKeysChecksOff();

		entityManager.createQuery("delete from  " + entityClazz.getSimpleName()).executeUpdate();
	}

}
