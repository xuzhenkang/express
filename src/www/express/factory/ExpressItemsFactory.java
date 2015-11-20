package www.express.factory;

import www.express.dao.IExpressItemsDAO;
import www.express.dao.implement.ExpressItemsDAO;

public class ExpressItemsFactory {
	public static IExpressItemsDAO getMethod() {
		return new ExpressItemsDAO();
	}
}
