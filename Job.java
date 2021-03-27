
/**
 * 
 *
 * @author (Dio Fajrie Fadlullah)
 * @version (25.03.2021)
 */
public class Job
{
    // instance variables - replace the example below with your own
    private int id;
    private String name;
    private int fee;
    private Recruiter recruiter;
    private JobCategory category;

    /**
     * Constructor for objects of class Job
     * @param id merupakan id dari pekerjaan/Job terkait
     * @param name merupakan nama dari pekerjaan/Job terkait
     * @param recruiter merupakan pointer ke objek recruiter dari pekerjaan/Job terkait
     * @param fee merupakan fee dari pekerjaan/Job terkait
     * @param category merupakan category dari pekerjaan/Job terkait
     */
    public Job(int id, String name, Recruiter recruiter, int fee, JobCategory category)
    {
        this.id = id;
        this.name = name;
        this.recruiter = recruiter;
        this.fee = fee;
        this.category = category;
    }

    /**
     * Getter variable id
     * @return id dari job terkait
     */
    public int getId()
    {
        return id;
    }
    
    /**
     * Getter variable name
     * @return name dari job terkait
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Getter variable fee
     * @return fee dari job terkait
     */
    public int getFee()
    {
        return fee;
    }
    
    /**
     * Getter variable category
     * @return category dari job terkait
     */
    public JobCategory getCategory()
    {
        return category;
    }
    
    /**
     * Getter variable recruiter
     * @return recruiter dari job terkait
     */
    public Recruiter getRecruiter(){
        return recruiter;
    }
    
    /**
     * Setter id
     * mengassign nilai id baru pada objek Job
     */
    public void setId(int id) {
        this.id = id;
    }
    
    /**
     * Setter name
     * mengassign nilai name baru pada objek Job
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Setter fee
     * mengassign nilai fee baru pada objek Job
     */
    public void setFee(int fee) {
        this.fee = fee;
    }
    
    /**
     * Setter category
     * mengassign nilai category baru pada objek Job
     */
    public void setCategory(JobCategory category) {
        this.category = category;
    }
    
    /**
     * Setter recruiter
     * mengassign pointer recruiter baru pada objek Job
     */
    public void setRecruiter(Recruiter recruiter){
        this.recruiter = recruiter;
    }
    
    public void printData(){
        System.out.println("\n======Job======\n"+
            "ID          = "+id +"\n"+
            "Nama        = "+name +"\n"+
            "Recruiter   = "+recruiter.getName()+"\n"+
            "City        = "+recruiter.getLocation().getCity()+"\n"+
            "Fee         = "+fee+"\n"+
            "Category    = "+ category );
    }
}
