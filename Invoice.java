
/**
 * Write a description of class Invoice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Invoice
{
    private int id;
    private int idJob;
    private String date;
    private int totalFee;
    private Jobseeker jobseeker;
    /**
     * Constructor for objects of class Invoice
     */
    public Invoice(int id, int idJob, String date, int totalFee, Jobseeker jobseeker)
    {
        this.id = id;
        this.idJob = idJob;
        this.date = date;
        this.totalFee = totalFee;
        this.jobseeker = jobseeker;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getId()
    {
        return id;
    }
    
    public int getIdJob()
    {
        return idJob;
    }
    
    public String getDate()
    {
        return date;
    }
    
    public int getTotalFee()
    {
        return totalFee;
    }
    
    public Jobseeker getJobseeker(){
        return jobseeker;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public void setIdJob(int idJob) {
        this.idJob = idJob;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public void setTotalFee(int totalFee) {
        this.totalFee = totalFee;
    }
}
