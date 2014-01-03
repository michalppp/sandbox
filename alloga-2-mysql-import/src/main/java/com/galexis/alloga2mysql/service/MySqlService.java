package com.galexis.alloga2mysql.service;

import java.util.Date;
import java.util.List;

public interface MySqlService {

	<T> Date lastCreated(Class<T> entityClazz);

	<T> Date lastChanged(Class<T> entityClazz);

	<T> void insert(Class<T> entityClazz, List<T> data);

	<T> void deleteAll(Class<T> entityClazz);

	<T> void update(Class<T> entityClazz, List<T> data);

	void foreignKeysChecksOff();

	void foreignKeysCheckOn();

}
