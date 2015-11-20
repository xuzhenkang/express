package www.express.dao.implement;

import org.hibernate.Session;

import www.express.dao.IBaseHibernateDAO;
import www.express.util.HibernateSessionFactory;


/**
 * Data access object (DAO) for domain model
 * @author MyEclipse Persistence Tools
 */
public class BaseHibernateDAO implements IBaseHibernateDAO {
	
	public Session getSession() {
		return HibernateSessionFactory.getSession();
	}
	
}