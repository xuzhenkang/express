package www.express.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * Users entity. @author MyEclipse Persistence Tools
 */

public class Users implements java.io.Serializable {

	// Fields

	private Long id;
	private String username;
	private String password;
	private String idCard;
	private String department;
	private Long tel;
	private String email;
	private String honor;
	private Integer getTimes;
	private Integer permission;
	private Set expressItemsesForPId = new HashSet(0);
	private Set expressItemsesForGId = new HashSet(0);

	// Constructors

	/** default constructor */
	public Users() {
	}

	/** minimal constructor */
	public Users(String password, String idCard, String department) {
		this.password = password;
		this.idCard = idCard;
		this.department = department;
	}

	/** full constructor */
	public Users(String username, String password, String idCard,
			String department, Long tel, String email, String honor,
			Integer getTimes, Integer permission, Set expressItemsesForPId,
			Set expressItemsesForGId) {
		this.username = username;
		this.password = password;
		this.idCard = idCard;
		this.department = department;
		this.tel = tel;
		this.email = email;
		this.honor = honor;
		this.getTimes = getTimes;
		this.permission = permission;
		this.expressItemsesForPId = expressItemsesForPId;
		this.expressItemsesForGId = expressItemsesForGId;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getIdCard() {
		return this.idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Long getTel() {
		return this.tel;
	}

	public void setTel(Long tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHonor() {
		return this.honor;
	}

	public void setHonor(String honor) {
		this.honor = honor;
	}

	public Integer getGetTimes() {
		return this.getTimes;
	}

	public void setGetTimes(Integer getTimes) {
		this.getTimes = getTimes;
	}

	public Integer getPermission() {
		return this.permission;
	}

	public void setPermission(Integer permission) {
		this.permission = permission;
	}

	public Set getExpressItemsesForPId() {
		return this.expressItemsesForPId;
	}

	public void setExpressItemsesForPId(Set expressItemsesForPId) {
		this.expressItemsesForPId = expressItemsesForPId;
	}

	public Set getExpressItemsesForGId() {
		return this.expressItemsesForGId;
	}

	public void setExpressItemsesForGId(Set expressItemsesForGId) {
		this.expressItemsesForGId = expressItemsesForGId;
	}

}