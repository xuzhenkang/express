package www.express.factory;

import www.express.dao.IExpressNamesDAO;
import www.express.dao.implement.ExpressNamesDAO;

public class ExpressNamesFactory {
	public static IExpressNamesDAO getMethod() {
		return new ExpressNamesDAO();
	}
}
