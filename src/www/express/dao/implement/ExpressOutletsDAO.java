package www.express.dao.implement;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import www.express.dao.IExpressOutletsDAO;
import www.express.pojo.ExpressOutlets;

/**
 * A data access object (DAO) providing persistence and search support for
 * ExpressOutlets entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see www.express.pojo.ExpressOutlets
 * @author MyEclipse Persistence Tools
 */
public class ExpressOutletsDAO extends BaseHibernateDAO implements IExpressOutletsDAO {
	private static final Logger log = LoggerFactory
			.getLogger(ExpressOutletsDAO.class);

	// property constants

	/* (non-Javadoc)
	 * @see www.express.dao.implement.IExpressOutlets#save(www.express.pojo.ExpressOutlets)
	 */
	public void save(ExpressOutlets transientInstance) {
		log.debug("saving ExpressOutlets instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see www.express.dao.implement.IExpressOutlets#delete(www.express.pojo.ExpressOutlets)
	 */
	public void delete(ExpressOutlets persistentInstance) {
		log.debug("deleting ExpressOutlets instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see www.express.dao.implement.IExpressOutlets#findById(java.lang.String)
	 */
	public ExpressOutlets findById(java.lang.String id) {
		log.debug("getting ExpressOutlets instance with id: " + id);
		try {
			ExpressOutlets instance = (ExpressOutlets) getSession().get(
					"www.express.pojo.ExpressOutlets", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see www.express.dao.implement.IExpressOutlets#findByExample(www.express.pojo.ExpressOutlets)
	 */
	public List findByExample(ExpressOutlets instance) {
		log.debug("finding ExpressOutlets instance by example");
		try {
			List results = getSession()
					.createCriteria("www.express.pojo.ExpressOutlets")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see www.express.dao.implement.IExpressOutlets#findByProperty(java.lang.String, java.lang.Object)
	 */
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding ExpressOutlets instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from ExpressOutlets as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see www.express.dao.implement.IExpressOutlets#findAll()
	 */
	public List findAll() {
		log.debug("finding all ExpressOutlets instances");
		try {
			String queryString = "from ExpressOutlets";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see www.express.dao.implement.IExpressOutlets#merge(www.express.pojo.ExpressOutlets)
	 */
	public ExpressOutlets merge(ExpressOutlets detachedInstance) {
		log.debug("merging ExpressOutlets instance");
		try {
			ExpressOutlets result = (ExpressOutlets) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see www.express.dao.implement.IExpressOutlets#attachDirty(www.express.pojo.ExpressOutlets)
	 */
	public void attachDirty(ExpressOutlets instance) {
		log.debug("attaching dirty ExpressOutlets instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see www.express.dao.implement.IExpressOutlets#attachClean(www.express.pojo.ExpressOutlets)
	 */
	public void attachClean(ExpressOutlets instance) {
		log.debug("attaching clean ExpressOutlets instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}