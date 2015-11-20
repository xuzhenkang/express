package www.express.action.login;

import org.apache.struts2.ServletActionContext;

import www.express.factory.UsersFactory;
import www.express.pojo.Users;

public class UsersLoginAction {
	public String execute() {
		String sId = ServletActionContext.getRequest().getParameter("id");
		long lId = Long.parseLong(sId);
		String sPassword = ServletActionContext.getRequest().getParameter(
				"password");
		Users user = UsersFactory.getMethod().findById(lId);
		if (null == user) {
			return "noThisUser"; // 没有该用户
		} else if (user.getPermission() == 1) { // 判断管理员身份
			if (sPassword.equals(user.getPassword())) {
				ServletActionContext.getRequest().getSession()
						.setAttribute("admin", user);
				return "adminLoginSuccess";
			} else {
				return "adminLoginFailure";
			}
		} else { // 判断普通用户身份
			if (sPassword.equals(user.getPassword())) {
				ServletActionContext.getRequest().getSession()
						.setAttribute("student", user);
				return "studentLoginSuccess";
			} else {
				return "studentLoginFailure";
			}
		}
	}
}
