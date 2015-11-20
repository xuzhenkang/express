package www.express.action.crud;

import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import www.express.factory.UsersFactory;
import www.express.pojo.Users;
import www.express.util.HibernateSessionFactory;

public class UsersAction {
	private Session session = HibernateSessionFactory.getSession();
	private Transaction transaction = session.beginTransaction();
	private List<Users> list;
	private Users user;

	public List<Users> getList() {
		return list;
	}

	public void setList(List<Users> list) {
		this.list = list;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	/**
	 * 显示所有用户
	 * 
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public String listUsers() {
		System.out.println("list()");
		list = UsersFactory.getMethod().findAll();
		return "list";
	}

	/**
	 * 显示指定用户信息
	 * 
	 * @return
	 */

	public String showUser() {
		String sId = ServletActionContext.getRequest().getParameter("id");
		long lId = Long.parseLong(sId);
		Users user = UsersFactory.getMethod().findById(lId);
		return "user";
	}

	/**
	 * 更新指定用户信息
	 * 
	 * @return
	 */
	public String update() {
		String sId = ServletActionContext.getRequest().getParameter("id");
		long lId = Long.parseLong(sId);
		String sPassword = ServletActionContext.getRequest().getParameter(
				"password");
		String sDepartment = ServletActionContext.getRequest().getParameter(
				"department");
		String sTel = ServletActionContext.getRequest().getParameter("tel");
		long lTel = Long.parseLong(sTel);
		String sEmail = ServletActionContext.getRequest().getParameter("email");
		Users user = UsersFactory.getMethod().findById(lId);
		user.setPassword(sPassword);
		user.setDepartment(sDepartment);
		user.setEmail(sEmail);
		user.setTel(lTel);

		try {
			UsersFactory.getMethod().merge(user);
			transaction.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			if (transaction != null)
				transaction.rollback();
			throw e;
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return "update";
	}

	/**
	 * 删除指定用户
	 * 
	 * @return
	 */
	public String delete() {
		String sId = ServletActionContext.getRequest().getParameter("id");
		long lId = Long.parseLong(sId);
		Users user = UsersFactory.getMethod().findById(lId);
		try {
			UsersFactory.getMethod().delete(user);
			transaction.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			if (transaction != null)
				transaction.rollback();
			throw e;
		} finally {
			if (session != null)
				session.close();
		}
		return "delete";
	}

	/**
	 * 添加用户
	 * 
	 * @return
	 */
	public String add() {
		String sId = ServletActionContext.getRequest().getParameter("id");
		long lId = Long.parseLong(sId);
		String sUsername = ServletActionContext.getRequest().getParameter(
				"username");
		String sPassword = ServletActionContext.getRequest().getParameter(
				"password");
		String sIdCard = ServletActionContext.getRequest().getParameter(
				"idCard");
		String sDepartment = ServletActionContext.getRequest().getParameter(
				"department");
		String sTel = ServletActionContext.getRequest().getParameter("tel");
		long lTel = Long.parseLong(sTel);
		String sEmail = ServletActionContext.getRequest().getParameter("email");
		String sHonor = ServletActionContext.getRequest().getParameter("honor");
		String sGetTimes = ServletActionContext.getRequest().getParameter(
				"getTimes");
		int iGetTimes = Integer.parseInt(sGetTimes);
		try {
			Users user = new Users(sUsername, sPassword, sIdCard, sDepartment,
					lTel, sEmail, sHonor, iGetTimes, 0, null, null);
			UsersFactory.getMethod().save(user);
		} catch (Exception e) {
			e.printStackTrace();
			if (transaction != null)
				transaction.rollback();
		} finally {
			if (session != null)
				session.close();
		}
		return "add";
	}
}
