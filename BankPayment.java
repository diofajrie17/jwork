
/**
 * Write a description of class EwalletPayment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankPayment extends Invoice
{
    private int adminFee;
    private static final PaymentType PAYMENT_TYPE = PaymentType.BankPayment;

    public BankPayment(int id, Job job, Jobseeker jobseeker, InvoiceStatus invoiceStatus)
    {
        super(id, job, jobseeker, invoiceStatus);
    }
    
    public BankPayment(int id, Job job, Jobseeker jobseeker, InvoiceStatus invoiceStatus, int adminFee)   {
        super(id, job, jobseeker, invoiceStatus);
        this.adminFee = adminFee;
    }

    public PaymentType getPaymentType() 
    { 
        return PAYMENT_TYPE; 
    }
    
    public int getAdminFee()
    {
        return adminFee;
    }
    
    public void serAdminFee(int adminFee){
        this.adminFee = adminFee;
    }
    
    public void setTotalFee(){
        if (adminFee != 0){
            totalFee = totalFee - adminFee;
        }
        else{
            totalFee = getTotalFee();
        }
    }
    
    /*public void printData() 
    {
        System.out.println(
            "===================== INVOICE =====================" +
            "\nID: " + getId() +
            "\nJob: " + getJob().getName() +
            "\nDate: " + getDate() +
            "\nJob Seeker: " + getJobseeker().getName()+
            "\nAdmin Fee: " +getAdminFee()+
            "\nTotal Fee: " + getTotalFee() +
            "\nStatus: " + getInvoiceStatus() +
            "\nPayment Type: " + PAYMENT_TYPE );
    }*/
    public String toString() {
        return String.format("===================== INVOICE ===================== \nID: %d \nJob: %s \nDate: %s \nJob Seeker: %s \nAdmin Fee: %d \nTotal Fee: %d \nStatus: %s \nPayment Type: %s", getId(), getJob().getName(), getAdminFee(),getTotalFee(), getInvoiceStatus(), PAYMENT_TYPE);

    }
}