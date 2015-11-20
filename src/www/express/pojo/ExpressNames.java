package www.express.pojo;



/**
 * ExpressNames entity. @author MyEclipse Persistence Tools
 */

public class ExpressNames  implements java.io.Serializable {


    // Fields    

     private String expressName;


    // Constructors

    /** default constructor */
    public ExpressNames() {
    }

    
    /** full constructor */
    public ExpressNames(String expressName) {
        this.expressName = expressName;
    }

   
    // Property accessors

    public String getExpressName() {
        return this.expressName;
    }
    
    public void setExpressName(String expressName) {
        this.expressName = expressName;
    }
   








}