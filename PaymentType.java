
/**
 * Enumeration class PaymentType - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public enum PaymentType
{
    BankPayment("BankPayment"),
    EwalletPayment("EwalletPayment");
    private String type;
    PaymentType(String type){
        this.type=type;
    }
    public String toString(){
        return type;
    }
}
