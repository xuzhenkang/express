package www.express.dao;

import java.util.List;

import www.express.pojo.ExpressOutlets;

public interface IExpressOutletsDAO {

	public abstract void save(ExpressOutlets transientInstance);

	public abstract void delete(ExpressOutlets persistentInstance);

	public abstract ExpressOutlets findById(java.lang.String id);

	public abstract List findByExample(ExpressOutlets instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findAll();

	public abstract ExpressOutlets merge(ExpressOutlets detachedInstance);

	public abstract void attachDirty(ExpressOutlets instance);

	public abstract void attachClean(ExpressOutlets instance);

}