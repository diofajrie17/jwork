
/**
 * 
 *
 * @author (Dio Fajrie Fadlullah)
 * @version (18.03.2021)
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
     * @param id merupakan id dari Invoice terkait
     * @param idJob id dari job terkait
     * @param date adalah tanggal invoice dikeluarkan
     * @param totalFee adalah variable yang menampung total pembayaran
     * @param jobSeeker variable yang menampung pointer objek jobSeeker
     * 
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
     * Getter variable id
     * @return id dari invoice terkait
     */
    public int getId()
    {
        return id;
    }
    
    /**
     * Getter variable idJob
     * @return id job yg terdapat pada invoice
     */
    public int getIdJob()
    {
        return idJob;
    }
    
    /**
     * Getter date
     * @return tanggal dikeluarkannya invoice
     */
    public String getDate()
    {
        return date;
    }
    /**
     * Getter totalFee
     * @return totalFee atau total pembayaran
     */
    public int getTotalFee()
    {
        return totalFee;
    }
    
    /**
     * Getter jobseeker
     * @return pointer ke objek jobseeker terkait
     */
    public Jobseeker getJobseeker(){
        return jobseeker;
    }
    
    /**
     * Setter id
     * mengassign nilai id baru pada objek invoice
     */
    public void setId(int id) {
        this.id = id;
    }
    
    /**
     * setter idJob
     * mengassign nilai idJob baru pada objek invoice
     */
    public void setIdJob(int idJob) {
        this.idJob = idJob;
    }
    
    /**
     * setter date
     * mengassign nilai date baru pada objek invoice
     */
    public void setDate(String date) {
        this.date = date;
    }
    
    /**
     * setter totalFee
     * mengassign nilai totalFee baru pada objek invoice
     */
    public void setTotalFee(int totalFee) {
        this.totalFee = totalFee;
    }
    
    /**
     * setter jobseeker
     * mengassign nilai pointer jobseeker baru pada objek invoice
     */
    public void setJobSeeker(Jobseeker jobseeker){
        this.jobseeker = jobseeker;
    }
}
