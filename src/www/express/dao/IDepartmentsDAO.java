package www.express.dao;

import java.util.List;

import www.express.pojo.Departments;

public interface IDepartmentsDAO {

	public abstract void save(Departments transientInstance);

	public abstract void delete(Departments persistentInstance);

	public abstract Departments findById(java.lang.String id);

	public abstract List findByExample(Departments instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findAll();

	public abstract Departments merge(Departments detachedInstance);

	public abstract void attachDirty(Departments instance);

	public abstract void attachClean(Departments instance);

}