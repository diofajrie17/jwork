import java.text.*;

/**
 * Write a description of class EwalletPayment here.
 *
 * @author (Dio Fajrie Fadlullah)
 * @version (25.03.2021)
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
    if (getDate() == null) {
            return  "===================== INVOICE =====================" + "\nId = " + getId() + "\nJob = " + getJob().getName() + "\nDate = " + getDate() + "\nJob Seeker = "
                    + getJobseeker().getName() + "\nAdmin Fee = " + getAdminFee() + "\nTotal Fee" + getJob().getFee() +
                    "\nStatus : " + getInvoiceStatus() + "\nPayment Type: " + PAYMENT_TYPE;
        } else {
            SimpleDateFormat formattedDate = new SimpleDateFormat("dd-MMMM-yyyy");
            String date = formattedDate.format(getDate().getTime());
            return "Id = " + getId() + "\nJob = " + getJob().getName() + "\nDate = " + getDate() + "\nJob Seeker = "
                    + getJobseeker().getName() + "\nAdmin Fee = " + getAdminFee() + "\nTotal Fee" + getJob().getFee() +
                    "\nStatus : " + getInvoiceStatus() + "\nPayment Type: " + PAYMENT_TYPE;
        }
    }
}