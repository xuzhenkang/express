package www.express.dao.implement;

import java.util.Date;
import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import www.express.dao.IExpressItemsDAO;
import www.express.pojo.ExpressItems;

/**
 * A data access object (DAO) providing persistence and search support for
 * ExpressItems entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see www.express.pojo.ExpressItems
 * @author MyEclipse Persistence Tools
 */
public class ExpressItemsDAO extends BaseHibernateDAO implements IExpressItemsDAO {
	private static final Logger log = LoggerFactory
			.getLogger(ExpressItemsDAO.class);
	/* (non-Javadoc)
	 * @see www.express.dao.implement.IExpressItemsDAO#save(www.express.pojo.ExpressItems)
	 */
	public void save(ExpressItems transientInstance) {
		log.debug("saving ExpressItems instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see www.express.dao.implement.IExpressItemsDAO#delete(www.express.pojo.ExpressItems)
	 */
	public void delete(ExpressItems persistentInstance) {
		log.debug("deleting ExpressItems instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see www.express.dao.implement.IExpressItemsDAO#findById(java.lang.Integer)
	 */
	public ExpressItems findById(java.lang.Integer id) {
		log.debug("getting ExpressItems instance with id: " + id);
		try {
			ExpressItems instance = (ExpressItems) getSession().get(
					"www.express.pojo.ExpressItems", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see www.express.dao.implement.IExpressItemsDAO#findByExample(www.express.pojo.ExpressItems)
	 */
	public List findByExample(ExpressItems instance) {
		log.debug("finding ExpressItems instance by example");
		try {
			List results = getSession()
					.createCriteria("www.express.pojo.ExpressItems")
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
	 * @see www.express.dao.implement.IExpressItemsDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding ExpressItems instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from ExpressItems as model where model."
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
	 * @see www.express.dao.implement.IExpressItemsDAO#findByExpressId(java.lang.Object)
	 */
	public List findByExpressId(Object expressId) {
		return findByProperty(EXPRESS_ID, expressId);
	}

	/* (non-Javadoc)
	 * @see www.express.dao.implement.IExpressItemsDAO#findByExpressName(java.lang.Object)
	 */
	public List findByExpressName(Object expressName) {
		return findByProperty(EXPRESS_NAME, expressName);
	}

	/* (non-Javadoc)
	 * @see www.express.dao.implement.IExpressItemsDAO#findByGetAddress(java.lang.Object)
	 */
	public List findByGetAddress(Object getAddress) {
		return findByProperty(GET_ADDRESS, getAddress);
	}

	/* (non-Javadoc)
	 * @see www.express.dao.implement.IExpressItemsDAO#findByTel(java.lang.Object)
	 */
	public List findByTel(Object tel) {
		return findByProperty(TEL, tel);
	}

	/* (non-Javadoc)
	 * @see www.express.dao.implement.IExpressItemsDAO#findByGetNumber(java.lang.Object)
	 */
	public List findByGetNumber(Object getNumber) {
		return findByProperty(GET_NUMBER, getNumber);
	}

	/* (non-Javadoc)
	 * @see www.express.dao.implement.IExpressItemsDAO#findBySendAddress(java.lang.Object)
	 */
	public List findBySendAddress(Object sendAddress) {
		return findByProperty(SEND_ADDRESS, sendAddress);
	}

	/* (non-Javadoc)
	 * @see www.express.dao.implement.IExpressItemsDAO#findByRemark(java.lang.Object)
	 */
	public List findByRemark(Object remark) {
		return findByProperty(REMARK, remark);
	}

	/* (non-Javadoc)
	 * @see www.express.dao.implement.IExpressItemsDAO#findByMoney(java.lang.Object)
	 */
	public List findByMoney(Object money) {
		return findByProperty(MONEY, money);
	}

	/* (non-Javadoc)
	 * @see www.express.dao.implement.IExpressItemsDAO#findByIsfinished(java.lang.Object)
	 */
	public List findByIsfinished(Object isfinished) {
		return findByProperty(ISFINISHED, isfinished);
	}

	/* (non-Javadoc)
	 * @see www.express.dao.implement.IExpressItemsDAO#findByIsfailed(java.lang.Object)
	 */
	public List findByIsfailed(Object isfailed) {
		return findByProperty(ISFAILED, isfailed);
	}

	/* (non-Javadoc)
	 * @see www.express.dao.implement.IExpressItemsDAO#findAll()
	 */
	public List findAll() {
		log.debug("finding all ExpressItems instances");
		try {
			String queryString = "from ExpressItems";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see www.express.dao.implement.IExpressItemsDAO#merge(www.express.pojo.ExpressItems)
	 */
	public ExpressItems merge(ExpressItems detachedInstance) {
		log.debug("merging ExpressItems instance");
		try {
			ExpressItems result = (ExpressItems) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see www.express.dao.implement.IExpressItemsDAO#attachDirty(www.express.pojo.ExpressItems)
	 */
	public void attachDirty(ExpressItems instance) {
		log.debug("attaching dirty ExpressItems instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see www.express.dao.implement.IExpressItemsDAO#attachClean(www.express.pojo.ExpressItems)
	 */
	public void attachClean(ExpressItems instance) {
		log.debug("attaching clean ExpressItems instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}