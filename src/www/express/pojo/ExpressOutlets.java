package www.express.pojo;

/**
 * ExpressOutlets entity. @author MyEclipse Persistence Tools
 */

public class ExpressOutlets implements java.io.Serializable {

	// Fields

	private String outletsName;

	// Constructors

	/** default constructor */
	public ExpressOutlets() {
	}

	/** full constructor */
	public ExpressOutlets(String outletsName) {
		this.outletsName = outletsName;
	}

	// Property accessors

	public String getOutletsName() {
		return this.outletsName;
	}

	public void setOutletsName(String outletsName) {
		this.outletsName = outletsName;
	}

}