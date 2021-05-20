package diofajrie.jwork;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JWork {

    public static void main(String[] args) throws RecruiterNotFoundException {

        Location loc1 = new Location("Jawa Barat", "Depok", "UI");
        Location loc2 = new Location("Sumatera Barat", "Padang", "UNP");
        Location loc3 = new Location("Jawa Barat", "Bogor", "IPB");

        DatabaseRecruiter.addRecruiter(new Recruiter(1, "Albert", "albert@gmail.com", "09018084", loc1));
        DatabaseRecruiter.addRecruiter(new Recruiter(2, "Dimas", "dimas@gmail.com", "09018085", loc2));
        DatabaseRecruiter.addRecruiter(new Recruiter(3, "Budi", "budi@gmail.com", "09018086", loc3));


        DatabaseJob.addJob(new Job(1,"Senior Programmer", DatabaseRecruiter.getRecruiterById(1),1000000,JobCategory.BackEnd));
        DatabaseJob.addJob(new Job(2,"Junior Programmer", DatabaseRecruiter.getRecruiterById(2),1000000,JobCategory.BackEnd));
        DatabaseJob.addJob(new Job(3,"Junior FullStack Developer", DatabaseRecruiter.getRecruiterById(3),1000000,JobCategory.WebDeveloper));
        DatabaseJob.addJob(new Job(4,"Senio FullStack Developer", DatabaseRecruiter.getRecruiterById(1),1300000,JobCategory.WebDeveloper));

        SpringApplication.run(JWork.class, args);
    }

}