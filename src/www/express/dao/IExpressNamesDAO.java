package www.express.dao;

import java.util.List;

import www.express.pojo.ExpressNames;

public interface IExpressNamesDAO {

	public abstract void save(ExpressNames transientInstance);

	public abstract void delete(ExpressNames persistentInstance);

	public abstract ExpressNames findById(java.lang.String id);

	public abstract List findByExample(ExpressNames instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findAll();

	public abstract ExpressNames merge(ExpressNames detachedInstance);

	public abstract void attachDirty(ExpressNames instance);

	public abstract void attachClean(ExpressNames instance);

}