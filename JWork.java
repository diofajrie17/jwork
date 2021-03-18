
/**
 * Write a description of class JWork here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class JWork
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class JWork
     */
    public JWork()
    {
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    
    
    public static void main(String[] args){
        Location loc1 = new Location("Sumbar", "Bukittinggi", "Dingin");
        Recruiter albert = new Recruiter(1, "Albert", "albert@gmail.com", "09018084", loc1);
        Job sales = new Job(3, "Andi", albert, 2000000, "Sales");
        Jobseeker budi = new Jobseeker(2, "Budi", "budi@gmail.com", "budi123", "2 Januari 2020");
        Invoice invc1 = new Invoice(4, 3, "2 Juni 2020", 2000000, budi);
        
        budi.printData();
        loc1.printData();
        albert.printData();
        
        
    }
}
