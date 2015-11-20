package www.express.dao;

import java.util.List;

import www.express.pojo.ExpressItems;

public interface IExpressItemsDAO {

	// property constants
	public static final String EXPRESS_ID = "expressId";
	public static final String EXPRESS_NAME = "expressName";
	public static final String GET_ADDRESS = "getAddress";
	public static final String TEL = "tel";
	public static final String GET_NUMBER = "getNumber";
	public static final String SEND_ADDRESS = "sendAddress";
	public static final String REMARK = "remark";
	public static final String MONEY = "money";
	public static final String ISFINISHED = "isfinished";
	public static final String ISFAILED = "isfailed";

	public abstract void save(ExpressItems transientInstance);

	public abstract void delete(ExpressItems persistentInstance);

	public abstract ExpressItems findById(java.lang.Integer id);

	public abstract List findByExample(ExpressItems instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findByExpressId(Object expressId);

	public abstract List findByExpressName(Object expressName);

	public abstract List findByGetAddress(Object getAddress);

	public abstract List findByTel(Object tel);

	public abstract List findByGetNumber(Object getNumber);

	public abstract List findBySendAddress(Object sendAddress);

	public abstract List findByRemark(Object remark);

	public abstract List findByMoney(Object money);

	public abstract List findByIsfinished(Object isfinished);

	public abstract List findByIsfailed(Object isfailed);

	public abstract List findAll();

	public abstract ExpressItems merge(ExpressItems detachedInstance);

	public abstract void attachDirty(ExpressItems instance);

	public abstract void attachClean(ExpressItems instance);

}