
/**
 * 
 *
 * @author (Dio Fajrie Fadlullah)
 * @version (25.03.2021)
 */
public class Invoice
{
    private int id;
    private int idJob;
    private String date;
    private int totalFee;
    private Jobseeker jobseeker;
    private PaymentType paymentType;
    private InvoiceStatus status;
    /**
     * Constructor for objects of class Invoice
     * @param id merupakan id dari Invoice terkait
     * @param idJob id dari job terkait
     * @param date adalah tanggal invoice dikeluarkan
     * @param totalFee adalah variable yang menampung total pembayaran
     * @param jobSeeker variable yang menampung pointer objek jobSeeker
     * 
     */
    public Invoice(int id, int idJob, String date, int totalFee, Jobseeker jobseeker, PaymentType paymentType, InvoiceStatus status)
    {
        this.id = id;
        this.idJob = idJob;
        this.date = date;
        this.totalFee = totalFee;
        this.jobseeker = jobseeker;
        this.paymentType = paymentType;
        this.status = status;
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
    
    public PaymentType getPaymentType(){
        return paymentType;
    }
    
    public InvoiceStatus getInvoiceStatus(){
        return status;
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
    
    public void setPaymentType(PaymentType paymentType){
        this.paymentType = paymentType;
    }
    
    public void setInvoiceStatus(InvoiceStatus status){
        this.status = status;
    }
    
    public void printData(){
        System.out.println("\n======Invoice======\n"+
            "ID          = "+id +"\n"+
            "ID Job      = "+idJob +"\n"+
            "Date        = "+date+"\n"+
            "Seeker      = "+jobseeker.getName()+"\n"+
            "Fee         = "+totalFee+"\n"+
            "Status      = "+status );
    }
}
