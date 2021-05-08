import java.util.GregorianCalendar;

/**
 * Write a description of class EwalletPayment here.
 *
 * @author (Dio Fajrie Fadlullah)
 * @version (22.04.2021)
 */
public class JWork
{

    
    
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
        /*Location loc1 = new Location("Jawa Barat", "Depok", "UI");
        Recruiter albert = new Recruiter(1, "Albert", "albert@gmail.com", "09018084", loc1);
        Job job1 = new Job(3, "Programer", albert, 2000000, JobCategory.WebDeveloper);
        job1.printData();*/
        
        //PT 3
        /*Job job2 = new Job(4, "Designer", albert, 3000000, JobCategory.UI);
        Jobseeker andi = new Jobseeker(20, "Andi", "Andi@gmail.com", "andi123", "17 Januari 2020");
        Invoice invc1 = new Invoice(100, job2.getId(), "2/03/2020", job2.getFee(), andi, PaymentType.BankPayment, InvoiceStatus.Ongoing);
        invc1.printData();*/
        
        //CS 4
        /*Location loc1 = new Location("Jawa Barat", "Depok", "UI");
        Recruiter albert = new Recruiter(1, "Albert", "albert@gmail.com", "09018084", loc1);
        Jobseeker andi = new Jobseeker(20, "Andi", "Andi@gmail.com", "andi123", 17-02-2020);
        Bonus bonus1 = new Bonus(25, "Mantap", 10000, 30000, true);
        Bonus bonus2 = new Bonus(26, "Mantap", 20000, 13000, true);
        Job job2 = new Job(4, "Designer", albert, 22000, JobCategory.UI);
        EwalletPayment e1 = new EwalletPayment(31, job2, "01/02/2021", andi, InvoiceStatus.Ongoing);
        EwalletPayment e2 = new EwalletPayment(32, job2, "01/02/2021", andi, bonus1, InvoiceStatus.Ongoing);
        EwalletPayment e3 = new EwalletPayment(33, job2, "01/02/2021", andi, bonus2, InvoiceStatus.Ongoing);
        */
        /*e1.printData();
        e2.printData();
        e3.printData();*/
        
        
        //PT 4
        /*BankPayment b1 = new BankPayment(31, job2, "01/02/2021", andi, InvoiceStatus.Finished);
        BankPayment b2 = new BankPayment(31, job2, "01/02/2021", andi, InvoiceStatus.Finished,200);
        
        b1.printData();
        b2.printData();
        */
        /*Location loc1 = new Location("Jawa Barat", "Depok", "UI");
        Recruiter albert = new Recruiter(1, "Albert", "albert@gmail.com", "09018084", loc1);*/
        //CS 5
        /*Jobseeker jobseeker1 = new Jobseeker(1, "Dio", "dio@ui.ac.id", "dio123", new GregorianCalendar(2010, 6, 12));
        Jobseeker jobseeker2 = new Jobseeker(2, "Ricky", "ricky@ui.ac.id", "ricky123", 2010, 1, 7);
        Jobseeker jobseeker3 = new Jobseeker(3, "Diaz ", "diaz@ui.ac.id", "diaz123");
        System.out.println(jobseeker1.toString());
        System.out.println(jobseeker2.toString());
        System.out.println(jobseeker3.toString()); */
        
        
        /*Job job2 = new Job(4, "Designer", albert, 3000000, JobCategory.UI);*/
        //PT 5
        /*BankPayment b2 = new BankPayment(31, job2, jobseeker1, InvoiceStatus.Finished,200);
        EwalletPayment e1 = new EwalletPayment(31, job2, jobseeker1, InvoiceStatus.Ongoing);
        System.out.println(e1.toString());
        System.out.println(b2.toString());*/

        //CS Modul 6
        /*Location loc1 = new Location("Jawa Barat", "Depok", "UI");

        DatabaseRecruiter.addRecruiter(new Recruiter(1, "Albert", "albert@gmail.com", "09018084", loc1));
        DatabaseJobseeker.addJobseeker(new Jobseeker(1, "Dio", "dio@ui.ac.id", "dio123"));
        DatabaseJobseeker.addJobseeker(new Jobseeker(2, "Dio", "dio@ui.ac.id", "dio123"));
        DatabaseJobseeker.addJobseeker(new Jobseeker(3, "Eben", "eben@ui.ac.id", "eben123"));
        System.out.println(DatabaseJobseeker.getJobseekerDatabase());
        System.out.println("\n=====================Jobseeker Database====================\n");
        System.out.println(DatabaseJobseeker.getJobseekerDatabase());

        DatabaseJob.addJob(new Job(1,"Senior Programmer", DatabaseRecruiter.getRecruiterById(1),1000000,JobCategory.BackEnd));
        DatabaseJob.addJob(new Job(2,"Junior Programmer", DatabaseRecruiter.getRecruiterById(1),1000000,JobCategory.BackEnd));
        DatabaseJob.addJob(new Job(3,"FullStack Developer", DatabaseRecruiter.getRecruiterById(1),1000000,JobCategory.WebDeveloper));
        System.out.println(DatabaseJob.getJobByCategory(JobCategory.BackEnd));
        System.out.println(DatabaseJob.getJobByCategory(JobCategory.WebDeveloper));
        System.out.println("\n=====================Job Database By Category====================\n");
        System.out.println(DatabaseJob.getJobByCategory(JobCategory.BackEnd));
        System.out.println(DatabaseJob.getJobByCategory(JobCategory.WebDeveloper));*/

        //CS Modul 7
        /*DatabaseBonus.addBonus(new Bonus(1,"Mantap" ,500000 ,1000000 ,false ));
        DatabaseBonus.addBonus(new Bonus(2,"Mantap" ,200000 ,500000 ,true ));
        for (Bonus i : DatabaseBonus.getBonusDatabase()){
            System.out.println("\n=====================Invoice====================\n");
            System.out.println(i);
        }

        DatabaseJob.addJob(new Job(1,"Senior Programmer", DatabaseRecruiter.getRecruiterById(1),1200000,JobCategory.BackEnd));
        DatabaseJob.addJob(new Job(2,"Junior Programmer", DatabaseRecruiter.getRecruiterById(1),700000,JobCategory.BackEnd));
        for (Job i : DatabaseJob.getJobDatabase()){
            System.out.println("\n===================== Job ====================\n");
            System.out.println(i);
        }
         */


        //CS MODUL 8
        System.out.println("=========Error===============");
        try {
            DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "Dio",
                    "dio.fajrie@ui.ac.id", "Dio123", 2021, 05, 4));
        } catch (EmailAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }
        try {
            DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "Dio",
                    "dio.fajrie@ui.ac.id", "Dio123", 2021, 04, 21));
        } catch (EmailAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }
        try {
            DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "Zidan",
                    "zidan@ui.ac.id", "zidan123", 2021, 03, 6));
        } catch (EmailAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }
        try {
            DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "Salman",
                    "salman@ui.ac.id", "salman123", 2021, 03, 6));
        } catch (EmailAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }

        try {
            DatabaseBonus.addBonus(new Bonus(101, "ggwp", 200000, 500000, false));
        } catch (ReferralCodeAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }
        try {
            DatabaseBonus.addBonus(new Bonus(101, "ggwp", 200000, 500000, true));
        } catch (ReferralCodeAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("=========Database JobSeeker============");
        System.out.println(DatabaseJobseeker.getDatabaseJobseeker());

        System.out.println("=========Database Bonus===============");
        System.out.println(DatabaseBonus.getBonusDatabase());


        System.out.println("\n ========== Invoice ==========");
        System.out.println(DatabaseInvoice.getInvoiceDatabase());

        try {
            DatabaseInvoice.getInvoiceById(69);
        } catch (InvoiceNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
