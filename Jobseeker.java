
/**
 * 
 *
 * @author (Dio Fajrie Fadlullah)
 * @version (18.03.2021)
 */
public class Jobseeker
{
    // instance variables - replace the example below with your own
    private int id;
    private String name;
    private String email;
    private String password;
    private String joinDate;

    /**
     * Constructor for objects of class Jobseeker
     * @param id merupakan id dari Jobseeker terkait
     * @param name merupakan nama dari Jobseeker terkait
     * @param email merupakan email dari Jobseeker terkait
     * @param password merupakan password dari Jobseeker terkait
     * @param joinDate merupakan joinDate dari Jobseeker terkait
     */
    public Jobseeker(int id, String name, String email, String password, String joinDate)
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.joinDate = joinDate;
    }

    /**
     * Getter variable id
     * @return id dari objek Jobseeker terkait
     */
    public int getId()
    {
        return id;
    }
    
    /**
     * Getter variable name
     * @return name dari objek Jobseeker terkait
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Getter variable email
     * @return email dari objek Jobseeker terkait
     */
    public String getEmail()
    {
        return email;
    }
    
    /**
     * Getter variable password
     * @return password dari objek Jobseeker terkait
     */
    public String getPassword()
    {
        return password;
    }
    
    /**
     * Getter variable joinDate
     * @return joinDate dari objek Jobseeker terkait
     */
    public String getJoinDate()
    {
        return joinDate;
    }
    
    /**
     * Setter id
     * mengassign nilai id baru pada objek Jobseeker
     */
    public void setId(int id) {
        this.id = id;
    }
    
    /**
     * Setter name
     * mengassign nilai name baru pada objek Jobseeker
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Setter email
     * mengassign nilai email baru pada objek Jobseeker
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    /**
     * Setter password
     * mengassign nilai password baru pada objek Jobseeker
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    /**
     * Setter joinDate
     * mengassign nilai joinDate baru pada objek Jobseeker
     */
    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }
    
    /**
     * fungsi untuk melakukan print data ke layar
     */

    public void printData(){
        System.out.println(getName());
    }
}
