import java.util.Calendar;

/**
 * Write a description of class EwalletPayment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EwalletPayment extends Invoice
{
    private Bonus bonus;
    private static final PaymentType PAYMENT_TYPE = PaymentType.EwalletPayment;

    public EwalletPayment(int id, Job job, Jobseeker jobseeker, InvoiceStatus invoiceStatus)
    {
        super(id, job,jobseeker, invoiceStatus);
    }
    
    public EwalletPayment(int id, Job job, Jobseeker jobseeker, Bonus bonus ,InvoiceStatus invoiceStatus)   {
        super(id, job, jobseeker, invoiceStatus);
        this.bonus = bonus;
    }

    public PaymentType getPaymentType() 
    { 
        return PAYMENT_TYPE; 
    }
    
    public void setBonus(Bonus bonus)
    {
        this.bonus = bonus;
    }
    
    public void setTotalFee(){
        if(bonus != null && bonus.getActive() == true && totalFee > bonus.getMinTotalFee()){
            totalFee = getJob().getFee() + bonus.getExtraFee();
        } else {
            totalFee = getJob().getFee();
        }
    }
    
    /*public void printData() 
    {
        System.out.println(
            "===================== INVOICE =====================" +
            "\nID: " + getId() +
            "\nJob: " + getJob().getName() +
            "\nDate: " + getDate() +
            "\nJob Seeker: " + getJobseeker().getName());
            if (bonus != null && bonus.getActive() == true && totalFee > bonus.getMinTotalFee()) {
            System.out.println("\nReferralCode: " + bonus.getReferralCode());
            }
        setTotalFee();
        System.out.println(
            "Fee: " + getTotalFee() +
            "\nStatus: " + getInvoiceStatus() +
            "\nPayment Type: " + PAYMENT_TYPE);
    }*/
    public String toString() {
        return String.format("===================== INVOICE ===================== \nID: %d \nJob: %s \nDate: %s \nJob Seeker: %s \nAdmin Fee: %d \nTotal Fee: %d \nStatus: %s \nPayment Type: %s", getId(), getJob().getName(), bonus.getReferralCode(),getTotalFee(), getInvoiceStatus(), PAYMENT_TYPE);

    }
}