package com.example.demo.dao.impl.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class BaseHibernate {

	@PersistenceContext
	EntityManager em;
}
