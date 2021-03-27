
/**
 * 
 *
 * @author (Dio Fajrie Fadlullah)
 * @version (25.03.2021)
 */
public class JWork
{
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    
    
    public static void main(String[] args){
        /*Location loc1 = new Location("Jawa Barat", "Depok", "UI");
        Recruiter albert = new Recruiter(1, "Albert", "albert@gmail.com", "09018084", loc1);
        Job sales = new Job(3, "Sales", albert, 2000000, "Marketing");
        Jobseeker budi = new Jobseeker(2, "Budi", "budi@gmail.com", "budi123", "2 Januari 2020");
        Invoice invc1 = new Invoice(4, 3, "2 Juni 2020", 2000000, budi);
        
        budi.printData();
        loc1.printData();
        albert.printData();
        
        Location loc2 = new Location("Sumatera Barat", "Bukittinggi", "Dingin");
        Recruiter rec1 = new Recruiter(17, "Dio Fajrie", "diofajriefadlullah17@gmail.com", "09018084", loc2);
        Job Mahasiswa = new Job(18, "Mahasiswa", rec1, 700000, "Agen Perubahan");
        Jobseeker Andi = new Jobseeker(20, "Andi", "Andi@gmail.com", "andi123", "17 Januari 2020");
        Invoice invc2 = new Invoice(14, 31, "2 Juni 2020", 2000000, Andi);
        
        System.out.println(rec1.getName());
        rec1.setName("Hizkia William Eben");
        System.out.println(rec1.getName());*/
        
        //CS 3
        Location loc1 = new Location("Jawa Barat", "Depok", "UI");
        Recruiter albert = new Recruiter(1, "Albert", "albert@gmail.com", "09018084", loc1);
        Job job1 = new Job(3, "Programer", albert, 2000000, JobCategory.WebDeveloper);
        job1.printData();
        
        //PT 3
        Job job2 = new Job(4, "Designer", albert, 3000000, JobCategory.UI);
        Jobseeker andi = new Jobseeker(20, "Andi", "Andi@gmail.com", "andi123", "17 Januari 2020");
        Invoice invc1 = new Invoice(100, job2.getId(), "2/03/2020", job2.getFee(), andi, PaymentType.BankPayment, InvoiceStatus.Ongoing);
        invc1.printData();
    }
    
}
