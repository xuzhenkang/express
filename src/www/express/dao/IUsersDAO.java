package www.express.dao;

import java.util.List;

import www.express.pojo.Users;

public interface IUsersDAO {

	// property constants
	public static final String USERNAME = "username";
	public static final String PASSWORD = "password";
	public static final String ID_CARD = "idCard";
	public static final String DEPARTMENT = "department";
	public static final String TEL = "tel";
	public static final String EMAIL = "email";
	public static final String HONOR = "honor";
	public static final String GET_TIMES = "getTimes";
	public static final String PERMISSION = "permission";

	public abstract void save(Users transientInstance);

	public abstract void delete(Users persistentInstance);

	public abstract Users findById(java.lang.Long id);

	public abstract List findByExample(Users instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findByUsername(Object username);

	public abstract List findByPassword(Object password);

	public abstract List findByIdCard(Object idCard);

	public abstract List findByDepartment(Object department);

	public abstract List findByTel(Object tel);

	public abstract List findByEmail(Object email);

	public abstract List findByHonor(Object honor);

	public abstract List findByGetTimes(Object getTimes);

	public abstract List findByPermission(Object permission);

	public abstract List findAll();

	public abstract Users merge(Users detachedInstance);

	public abstract void attachDirty(Users instance);

	public abstract void attachClean(Users instance);

}