package www.express.pojo;



/**
 * Departments entity. @author MyEclipse Persistence Tools
 */

public class Departments  implements java.io.Serializable {


    // Fields    

     private String departmentName;


    // Constructors

    /** default constructor */
    public Departments() {
    }

    
    /** full constructor */
    public Departments(String departmentName) {
        this.departmentName = departmentName;
    }

   
    // Property accessors

    public String getDepartmentName() {
        return this.departmentName;
    }
    
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
   








}