package www.express.pojo;

import java.util.Date;

/**
 * ExpressItems entity. @author MyEclipse Persistence Tools
 */

public class ExpressItems implements java.io.Serializable {

	// Fields

	private Integer id;
	private Users usersByGId;
	private Users usersByPId;
	private String expressId;
	private String expressName;
	private String getAddress;
	private Long tel;
	private Integer getNumber;
	private String sendAddress;
	private String remark;
	private Integer money;
	private Date getTime;
	private Integer isfinished;
	private Integer isfailed;

	// Constructors

	/** default constructor */
	public ExpressItems() {
	}

	/** minimal constructor */
	public ExpressItems(Users usersByPId, String expressName, Long tel,
			Integer getNumber, String remark) {
		this.usersByPId = usersByPId;
		this.expressName = expressName;
		this.tel = tel;
		this.getNumber = getNumber;
		this.remark = remark;
	}

	/** full constructor */
	public ExpressItems(Users usersByGId, Users usersByPId, String expressId,
			String expressName, String getAddress, Long tel, Integer getNumber,
			String sendAddress, String remark, Integer money, Date getTime,
			Integer isfinished, Integer isfailed) {
		this.usersByGId = usersByGId;
		this.usersByPId = usersByPId;
		this.expressId = expressId;
		this.expressName = expressName;
		this.getAddress = getAddress;
		this.tel = tel;
		this.getNumber = getNumber;
		this.sendAddress = sendAddress;
		this.remark = remark;
		this.money = money;
		this.getTime = getTime;
		this.isfinished = isfinished;
		this.isfailed = isfailed;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Users getUsersByGId() {
		return this.usersByGId;
	}

	public void setUsersByGId(Users usersByGId) {
		this.usersByGId = usersByGId;
	}

	public Users getUsersByPId() {
		return this.usersByPId;
	}

	public void setUsersByPId(Users usersByPId) {
		this.usersByPId = usersByPId;
	}

	public String getExpressId() {
		return this.expressId;
	}

	public void setExpressId(String expressId) {
		this.expressId = expressId;
	}

	public String getExpressName() {
		return this.expressName;
	}

	public void setExpressName(String expressName) {
		this.expressName = expressName;
	}

	public String getGetAddress() {
		return this.getAddress;
	}

	public void setGetAddress(String getAddress) {
		this.getAddress = getAddress;
	}

	public Long getTel() {
		return this.tel;
	}

	public void setTel(Long tel) {
		this.tel = tel;
	}

	public Integer getGetNumber() {
		return this.getNumber;
	}

	public void setGetNumber(Integer getNumber) {
		this.getNumber = getNumber;
	}

	public String getSendAddress() {
		return this.sendAddress;
	}

	public void setSendAddress(String sendAddress) {
		this.sendAddress = sendAddress;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getMoney() {
		return this.money;
	}

	public void setMoney(Integer money) {
		this.money = money;
	}

	public Date getGetTime() {
		return this.getTime;
	}

	public void setGetTime(Date getTime) {
		this.getTime = getTime;
	}

	public Integer getIsfinished() {
		return this.isfinished;
	}

	public void setIsfinished(Integer isfinished) {
		this.isfinished = isfinished;
	}

	public Integer getIsfailed() {
		return this.isfailed;
	}

	public void setIsfailed(Integer isfailed) {
		this.isfailed = isfailed;
	}

}