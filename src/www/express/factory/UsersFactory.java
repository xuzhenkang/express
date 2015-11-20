package www.express.factory;

import www.express.dao.IUsersDAO;
import www.express.dao.implement.UsersDAO;

public class UsersFactory {
	public static IUsersDAO getMethod() {
		return new UsersDAO();
	}
}
