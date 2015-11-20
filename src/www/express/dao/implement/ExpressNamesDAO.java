package www.express.dao.implement;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import www.express.dao.IExpressNamesDAO;
import www.express.pojo.ExpressNames;

/**
 	* A data access object (DAO) providing persistence and search support for ExpressNames entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see www.express.pojo.ExpressNames
  * @author MyEclipse Persistence Tools 
 */
public class ExpressNamesDAO extends BaseHibernateDAO implements IExpressNamesDAO  {
	     private static final Logger log = LoggerFactory.getLogger(ExpressNamesDAO.class);
		//property constants



    
    /* (non-Javadoc)
	 * @see www.express.dao.implement.IExpressNamesDAO#save(www.express.pojo.ExpressNames)
	 */
    public void save(ExpressNames transientInstance) {
        log.debug("saving ExpressNames instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	/* (non-Javadoc)
	 * @see www.express.dao.implement.IExpressNamesDAO#delete(www.express.pojo.ExpressNames)
	 */
	public void delete(ExpressNames persistentInstance) {
        log.debug("deleting ExpressNames instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    /* (non-Javadoc)
	 * @see www.express.dao.implement.IExpressNamesDAO#findById(java.lang.String)
	 */
    public ExpressNames findById( java.lang.String id) {
        log.debug("getting ExpressNames instance with id: " + id);
        try {
            ExpressNames instance = (ExpressNames) getSession()
                    .get("www.express.pojo.ExpressNames", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    /* (non-Javadoc)
	 * @see www.express.dao.implement.IExpressNamesDAO#findByExample(www.express.pojo.ExpressNames)
	 */
    public List findByExample(ExpressNames instance) {
        log.debug("finding ExpressNames instance by example");
        try {
            List results = getSession()
                    .createCriteria("www.express.pojo.ExpressNames")
                    .add(Example.create(instance))
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    
    /* (non-Javadoc)
	 * @see www.express.dao.implement.IExpressNamesDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
    public List findByProperty(String propertyName, Object value) {
      log.debug("finding ExpressNames instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from ExpressNames as model where model." 
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
	 * @see www.express.dao.implement.IExpressNamesDAO#findAll()
	 */
	public List findAll() {
		log.debug("finding all ExpressNames instances");
		try {
			String queryString = "from ExpressNames";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    /* (non-Javadoc)
	 * @see www.express.dao.implement.IExpressNamesDAO#merge(www.express.pojo.ExpressNames)
	 */
    public ExpressNames merge(ExpressNames detachedInstance) {
        log.debug("merging ExpressNames instance");
        try {
            ExpressNames result = (ExpressNames) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    /* (non-Javadoc)
	 * @see www.express.dao.implement.IExpressNamesDAO#attachDirty(www.express.pojo.ExpressNames)
	 */
    public void attachDirty(ExpressNames instance) {
        log.debug("attaching dirty ExpressNames instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    /* (non-Javadoc)
	 * @see www.express.dao.implement.IExpressNamesDAO#attachClean(www.express.pojo.ExpressNames)
	 */
    public void attachClean(ExpressNames instance) {
        log.debug("attaching clean ExpressNames instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}