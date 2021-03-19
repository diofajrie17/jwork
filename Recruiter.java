
/**
 * 
 *
 * @author (Dio Fajrie Fadlullah)
 * @version (18.03.2021)
 */
public class Recruiter
{
    // instance variables - replace the example below with your own
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private Location location;

    /**
     * Constructor for objects of class Recruiter
     * @param id merupakan id dari Recruiter terkait
     * @param name merupakan nama dari Recruiter terkait
     * @param email merupakan email dari Recruiter terkait
     * @param phoneNumber merupakan nomor hp dari Recruiter terkait
     * @param location merupakan lokasi dari Recruiter terkait
     */
    public Recruiter(int id, String name, String email, String phoneNumber, Location location)
    {
      this.id = id;
      this.name = name;
      this.email = email;
      this.phoneNumber = phoneNumber;
      this.location = location;
    }

    /**
     * Getter variable id
     * @return id dari objek Recruiter terkait
     */
    public int getId()
    {
        return id;
    }
    
    /**
     * Getter variable name
     * @return name dari objek Recruiter terkait
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Getter variable email
     * @return email dari objek Recruiter terkait
     */
    public String getEmail()
    {
        return email;
    }
    
    /**
     * Getter variable phoneNumber
     * @return phoneNumber dari objek Recruiter terkait
     */
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    
    /**
     * Getter variable location
     * @return location dari objek Recruiter terkait
     */
    public Location getLocation(){
        return location;   
    }
    
    /**
     * Setter id
     * mengassign nilai id baru pada objek Recruiter
     */
    public void setId(int id) {
        this.id = id;
    }
    
    /**
     * Setter email
     * mengassign nilai email baru pada objek Recruiter
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    /**
     * Setter name
     * mengassign nilai name baru pada objek Recruiter
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Setter phoneNumber
     * mengassign nilai phoneNumber baru pada objek Recruiter
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    /**
     * Setter id
     * mengassign nilai pointer location baru pada objek Recruiter
     */
    public void setLocation(Location location){
        this.location = location;
    }
    
    /**
     * fungsi untuk melakukan print data ke layar
     */
    public void printData(){
        System.out.println(getName() + "," + getEmail() + "," + getPhoneNumber());
    }
}
