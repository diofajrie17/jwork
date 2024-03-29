package diofajrie.jwork;

/**
 * Write a description of class Bonus here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bonus
{
    // instance variables - replace the example below with your own
    private int id;
    private String referralCode;
    private int extraFee;
    private int minTotalFee;
    private boolean active;

    /**
     * Constructor for objects of class Bonus
     */
    public Bonus(int id, String referralCode, int extraFee, int minTotalFee, boolean active)
    {
        this.id = id;
        this.referralCode = referralCode;
        this.extraFee = extraFee;
        this.minTotalFee = minTotalFee;
        this.active = active;
    }

    public int getId()
    {
        return id;
    }
    
    public String getReferralCode()
    {
        return referralCode;
    }
    
    public int getExtraFee()
    {
        return extraFee;
    }
    
    public int getMinTotalFee()
    {
        return minTotalFee;
    }
    
    public boolean getActive()
    {
        return active;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setReferralCode(String referralCode)
    {
        this.referralCode = referralCode;
    }
    
    public void setExtraFee(int extraFee)
    {
        this.extraFee = extraFee;
    }
    
    public void setMinTotalFee(int minTotalFee)
    {
        this.minTotalFee = minTotalFee;
    }
    
    public void setActive(boolean active)
    {
        this.active = active;
    }

    @Override
    public String toString(){
        return "\nId = " + getId() + "\nReferral Code = " + getReferralCode() + "\nExtra Fee = " + getExtraFee() + "\nMin Total Fee= " + getMinTotalFee() + "\nActive Status =  " + getActive();
    }
    
    /*public void printData(){
        System.out.println("\n======Invoice======\n"+
            "ID            = "+id +"\n"+
            "Referral Code = "+referralCode +"\n"+
            "Extra Fee     = "+extraFee+"\n"+
            "Min Fee       = "+minTotalFee);
    }
    */
}
