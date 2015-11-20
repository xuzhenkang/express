package www.express.factory;

import www.express.dao.IDepartmentsDAO;
import www.express.dao.implement.DepartmentsDAO;

public class DepartmentsFactory {
	public static IDepartmentsDAO getMethod() {
		return new DepartmentsDAO();
	}
}
