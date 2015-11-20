package www.express.dao.implement;

import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import www.express.dao.IUsersDAO;
import www.express.pojo.Users;

/**
 * A data access object (DAO) providing persistence and search support for Users
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see www.express.pojo.Users
 * @author MyEclipse Persistence Tools
 */
public class UsersDAO extends BaseHibernateDAO implements IUsersDAO {
	private static final Logger log = LoggerFactory.getLogger(UsersDAO.class);
	/* (non-Javadoc)
	 * @see www.express.dao.implement.UsersDAO#save(www.express.pojo.Users)
	 */
	public void save(Users transientInstance) {
		log.debug("saving Users instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see www.express.dao.implement.UsersDAO#delete(www.express.pojo.Users)
	 */
	public void delete(Users persistentInstance) {
		log.debug("deleting Users instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see www.express.dao.implement.UsersDAO#findById(java.lang.Long)
	 */
	public Users findById(java.lang.Long id) {
		log.debug("getting Users instance with id: " + id);
		try {
			Users instance = (Users) getSession().get("www.express.pojo.Users",
					id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see www.express.dao.implement.UsersDAO#findByExample(www.express.pojo.Users)
	 */
	public List findByExample(Users instance) {
		log.debug("finding Users instance by example");
		try {
			List results = getSession()
					.createCriteria("www.express.pojo.Users")
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
	 * @see www.express.dao.implement.UsersDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Users instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Users as model where model."
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
	 * @see www.express.dao.implement.UsersDAO#findByUsername(java.lang.Object)
	 */
	public List findByUsername(Object username) {
		return findByProperty(USERNAME, username);
	}

	/* (non-Javadoc)
	 * @see www.express.dao.implement.UsersDAO#findByPassword(java.lang.Object)
	 */
	public List findByPassword(Object password) {
		return findByProperty(PASSWORD, password);
	}

	/* (non-Javadoc)
	 * @see www.express.dao.implement.UsersDAO#findByIdCard(java.lang.Object)
	 */
	public List findByIdCard(Object idCard) {
		return findByProperty(ID_CARD, idCard);
	}

	/* (non-Javadoc)
	 * @see www.express.dao.implement.UsersDAO#findByDepartment(java.lang.Object)
	 */
	public List findByDepartment(Object department) {
		return findByProperty(DEPARTMENT, department);
	}

	/* (non-Javadoc)
	 * @see www.express.dao.implement.UsersDAO#findByTel(java.lang.Object)
	 */
	public List findByTel(Object tel) {
		return findByProperty(TEL, tel);
	}

	/* (non-Javadoc)
	 * @see www.express.dao.implement.UsersDAO#findByEmail(java.lang.Object)
	 */
	public List findByEmail(Object email) {
		return findByProperty(EMAIL, email);
	}

	/* (non-Javadoc)
	 * @see www.express.dao.implement.UsersDAO#findByHonor(java.lang.Object)
	 */
	public List findByHonor(Object honor) {
		return findByProperty(HONOR, honor);
	}

	/* (non-Javadoc)
	 * @see www.express.dao.implement.UsersDAO#findByGetTimes(java.lang.Object)
	 */
	public List findByGetTimes(Object getTimes) {
		return findByProperty(GET_TIMES, getTimes);
	}

	/* (non-Javadoc)
	 * @see www.express.dao.implement.UsersDAO#findByPermission(java.lang.Object)
	 */
	public List findByPermission(Object permission) {
		return findByProperty(PERMISSION, permission);
	}

	/* (non-Javadoc)
	 * @see www.express.dao.implement.UsersDAO#findAll()
	 */
	public List findAll() {
		log.debug("finding all Users instances");
		try {
			String queryString = "from Users";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see www.express.dao.implement.UsersDAO#merge(www.express.pojo.Users)
	 */
	public Users merge(Users detachedInstance) {
		log.debug("merging Users instance");
		try {
			Users result = (Users) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see www.express.dao.implement.UsersDAO#attachDirty(www.express.pojo.Users)
	 */
	public void attachDirty(Users instance) {
		log.debug("attaching dirty Users instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see www.express.dao.implement.UsersDAO#attachClean(www.express.pojo.Users)
	 */
	public void attachClean(Users instance) {
		log.debug("attaching clean Users instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}