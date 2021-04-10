import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * 
 *
 * @author (Dio Fajrie Fadlullah)
 * @version (25.03.2021)
 */
abstract class Invoice
{
    private int id;
    private Job job;
    private Calendar date;
    protected int totalFee;
    private Jobseeker jobseeker;
    //private PaymentType paymentType;
    private InvoiceStatus invoiceStatus;
    /**
     * Constructor for objects of class Invoice
     * @param id merupakan id dari Invoice terkait
     * @param idJob id dari job terkait
     * @param date adalah tanggal invoice dikeluarkan
     * @param totalFee adalah variable yang menampung total pembayaran
     * @param jobSeeker variable yang menampung pointer objek jobSeeker
     * 
     */
    public Invoice(int id, Job job,Jobseeker jobseeker, InvoiceStatus invoiceStatus)
    {
        this.id = id;
        this.job = job;
        this.jobseeker = jobseeker;
        //this.paymentType = paymentType;
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
    public Job getJob()
    {
        return job;
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
     * setter idJob
     * mengassign nilai idJob baru pada objek invoice
     */
    public void setjob(Job job) {
        this.job = job;
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
    public String toString(){
        return String.format("ID = %d \nJob = %s \nDate = %s \nTotal Fee = %s \nJob Seeker = %s \nInvoice Status = %s", id, job.getName(), totalFee, invoiceStatus);
    }
}
