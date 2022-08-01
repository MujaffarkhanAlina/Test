package com.model;
// Generated Feb 18, 2018 9:05:49 PM by Hibernate Tools 4.3.1.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Animals.
 * @see com.model.Animals
 * @author Hibernate Tools
 */
@Stateless
public class AnimalsHome {

	private static final Log log = LogFactory.getLog(AnimalsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Animals transientInstance) {
		log.debug("persisting Animals instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Animals persistentInstance) {
		log.debug("removing Animals instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Animals merge(Animals detachedInstance) {
		log.debug("merging Animals instance");
		try {
			Animals result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Animals findById(Integer id) {
		log.debug("getting Animals instance with id: " + id);
		try {
			Animals instance = entityManager.find(Animals.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
