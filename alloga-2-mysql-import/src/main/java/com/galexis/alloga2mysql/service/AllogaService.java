package com.galexis.alloga2mysql.service;

import java.util.Date;
import java.util.List;

public interface AllogaService {

	<T> int allCount(Class<T> entityClazz);

	<T> List<T> all(Class<T> entityClazz, int first, int count);

	<T> int changedCount(Class<T> entityClazz, Date since);

	<T> List<T> changed(Class<T> entityClazz, Date since, int first, int count);

	<T> int newlyCreatedCount(Class<T> entityClazz, Date since);

	<T> List<T> newlyCreated(Class<T> entityClazz, Date since, int first, int count);

}
