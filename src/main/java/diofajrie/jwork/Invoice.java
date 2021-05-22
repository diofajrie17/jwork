package diofajrie.jwork;
import java.util.*;
/**
 * Write a description of class EwalletPayment here.
 *
 * @author (Dio Fajrie Fadlullah)
 * @version (22.04.2021)
 */
public abstract class Invoice
{
    private int id;
    ArrayList<Job> jobs = new ArrayList<>();
    private Calendar date;
    protected int totalFee;
    private Jobseeker jobseeker;
    private InvoiceStatus invoiceStatus;
    /**
     * Constructor for objects of class Invoice
     * @param id merupakan id dari Invoice terkait
     * @param jobs id dari job terkait
     * @param jobseeker variable yang menampung pointer objek jobSeeker
     * 
     */
    public Invoice(int id, ArrayList<Job> jobs,Jobseeker jobseeker, InvoiceStatus invoiceStatus)
    {
        this.id = id;
        this.jobs = jobs;
        this.jobseeker = jobseeker;
        this.invoiceStatus = invoiceStatus;
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
    public ArrayList<Job> getJobs()
    {
        return jobs;
    }
    
    /**
     * Getter date
     * @return tanggal dikeluarkannya invoice
     */
    public Calendar getDate()
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
    
    public abstract PaymentType getPaymentType();
    
    public InvoiceStatus getInvoiceStatus(){
        return invoiceStatus;
    }
    
    /**
     * Setter id
     * mengassign nilai id baru pada objek invoice
     */
    public void setId(int id) {
        this.id = id;
    }
    
    /**
     * setter job
     * mengassign job baru pada objek invoice
     */
    public void setJobs(ArrayList<Job> jobs) {
        this.jobs = jobs;
    }
    
    /**
     * setter date
     * mengassign nilai date baru pada objek invoice
     */
    public void setDate(Calendar date) {
        this.date = date;
    }
    
    /**
     * setter date
     * mengassign nilai date baru pada objek invoice
     */
    public void setDate(int year,int month, int dayOfMonth) {
        this.date = new GregorianCalendar(year, month, dayOfMonth);
    }
    
    /**
     * setter totalFee
     * mengassign nilai totalFee baru pada objek invoice
     */
    public void setTotalFee(int totalFee){

        this.totalFee = totalFee;
    }
    public abstract void setTotalFee();
    /**
     * setter jobseeker
     * mengassign nilai pointer jobseeker baru pada objek invoice
     */
    public void setJobSeeker(Jobseeker jobseeker){
        this.jobseeker = jobseeker;
    }
    
    /*public void setPaymentType(PaymentType paymentType){
        this.paymentType = paymentType;
    }*/
    
    public void setInvoiceStatus(InvoiceStatus invoiceStatus){
        this.invoiceStatus = invoiceStatus;
    }
    
    //public abstract void printData();
    /*{
        System.out.println("\n======Invoice======\n"+
            "ID          = "+id +"\n"+
            "ID Job      = "+job +"\n"+
            "Date        = "+date+"\n"+
            "Seeker      = "+jobseeker.getName()+"\n"+
            "Fee         = "+totalFee+"\n"+
            "Status      = "+invoiceStatus );
    }*/
    public String toString() {
        return "";
    }
}
