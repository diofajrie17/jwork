package diofajrie.jwork;
import java.text.*;
import java.util.ArrayList;

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

    public BankPayment(int id, ArrayList<Job> jobs, Jobseeker jobseeker)
    {
        super(id, jobs, jobseeker);
    }

    public BankPayment(int id, ArrayList<Job> jobs, Jobseeker jobseeker, int adminFee)
    {
        super(id, jobs, jobseeker);
        this.setAdminFee(adminFee);
    }

    @Override
    public PaymentType getPaymentType() 
    { 
        return PAYMENT_TYPE; 
    }
    
    public int getAdminFee()
    {
        return adminFee;
    }
    
    public void setAdminFee(int adminFee){
        this.adminFee = adminFee;
    }
    @Override
    public void setTotalFee(){
        for (Job job: getJobs()){
            if (adminFee > 0){
                super.totalFee = job.getFee() - getAdminFee();
            }else {
                super.totalFee = job.getFee();
            }
        }
    }

    @Override
    public String toString(){
        SimpleDateFormat formatedDate = new SimpleDateFormat("dd-MMMM-yyyy");
        String date = formatedDate.format(getDate().getTime());
        String res = "";
        for (Job job: getJobs()){
            if (adminFee != 0){
                res.concat("id = " + getId() +  "\nJob = " + job.getName() + "\nDate = " + date + "\nJob Seeker = "
                        + getJobseeker().getName() + "\nAdmin Fee = " + adminFee + "\nTotal Fee = " + getTotalFee() + "\nStatus = "
                        + getInvoiceStatus() + "\nPayment = " + PAYMENT_TYPE);
            }else {
                res.concat("Id = " + getId() + "\nJob = " + job.getName() + "\nDate = " + date + "\nJob Seeker = "
                        + getJobseeker().getName()+ "\nTotal Fee = " + getTotalFee() + "\nStatus = " + getInvoiceStatus()
                        + "\nPayment = " + PAYMENT_TYPE);
            }
        }
        return res;
    }
}