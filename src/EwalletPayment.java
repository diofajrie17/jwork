import java.util.Calendar;
import java.text.*;

/**
 * Write a description of class EwalletPayment here.
 *
 * @author (Dio Fajrie Fadlullah)
 * @version (25.03.2021)
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
    if (bonus != null && (bonus.getActive() == true) && getJob().getFee() > bonus.getMinTotalFee()) {
                System.out.println("ReferralCode: " + bonus.getReferralCode());
            }
            setTotalFee();
            System.out.println(
                            "===================== INVOICE =====================" +
                            "\nFee: " + getTotalFee() +
                            "\nStatus: " + getInvoiceStatus() +
                            "\nPayment Type: " + PAYMENT_TYPE);
    if (getDate() == null) {
            return "Id = " + getId() + "\nJob = " + getJob().getName() + "\nDate = " + getDate() + "\nJob Seeker = " + getJobseeker().getName();
        } else {
            SimpleDateFormat formattedDate = new SimpleDateFormat("dd-MMMM-yyyy");
            String date = formattedDate.format(getDate().getTime());
            return "Id = " + getId() + "\nJob = " + getJob().getName() + "\nDate = " + getDate() + "\nJob Seeker = " + getJobseeker().getName();
        }
        }
}