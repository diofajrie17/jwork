
/**
 * 
 *
 * @author (Dio Fajrie Fadlullah)
 * @version (25.03.2021)
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
