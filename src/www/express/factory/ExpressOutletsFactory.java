package www.express.factory;

import www.express.dao.IExpressOutletsDAO;
import www.express.dao.implement.ExpressOutletsDAO;

public class ExpressOutletsFactory {
	public static IExpressOutletsDAO getMethod() {
		return new ExpressOutletsDAO();
	}
}
