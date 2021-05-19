package diofajrie.jwork;
import java.util.Calendar;
import java.util.regex.*;
import java.util.GregorianCalendar;
import java.text.*;

/**
 * 
 *
 * @author (Dio Fajrie Fadlullah)
 * @version (18.03.2021)
 */
public class Jobseeker
{
    // instance variables - replace the example below with your own
    private int id;
    private String name;
    private String email;
    private String password;
    public Calendar joinDate;

    /**
     * Constructor for objects of class Jobseeker
     * @param id merupakan id dari Jobseeker terkait
     * @param name merupakan nama dari Jobseeker terkait
     * @param email merupakan email dari Jobseeker terkait
     * @param password merupakan password dari Jobseeker terkait
     * @param joinDate merupakan joinDate dari Jobseeker terkait
     */
    public Jobseeker(int id, String name, String email, String password, Calendar joinDate)
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.joinDate = joinDate;
    }

    public Jobseeker(int id, String name, String email, String password, int year, int month, int dayOfMonth)
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.joinDate = new GregorianCalendar(year, month, dayOfMonth);
    }

    public Jobseeker(int id, String name, String email, String password)
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }
    
    /**
     * Getter variable id
     * @return id dari objek Jobseeker terkait
     */
    public int getId()
    {
        return id;
    }
    
    /**
     * Getter variable name
     * @return name dari objek Jobseeker terkait
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Getter variable email
     * @return email dari objek Jobseeker terkait
     */
    public String getEmail()
    {
        return email;
    }
    
    /**
     * Getter variable password
     * @return password dari objek Jobseeker terkait
     */
    public String getPassword()
    {
        return password;
    }
    
    /**
     * Getter variable joinDate
     * @return joinDate dari objek Jobseeker terkait
     */
    public Calendar getJoinDate()
    {
        return joinDate;
    }
    
    /**
     * Setter id
     * mengassign nilai id baru pada objek Jobseeker
     */
    public void setId(int id) {
        this.id = id;
    }
    
    /**
     * Setter name
     * mengassign nilai name baru pada objek Jobseeker
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Setter email
     * mengassign nilai email baru pada objek Jobseeker
     */
    public void setEmail(String email){
        String regex = "^(?!.([.])\1)[^.][a-zA-Z0-9.&~]+@[^-. ][a-zA-Z0-9-.&*~]+(?:\\.[a-zA-Z0-9-]+)*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if(matcher.matches()){
            this.email = email;
        }
        else{
            this.email = "";
        }
    }
    
    /**
     * Setter password
     * mengassign nilai password baru pada objek Jobseeker
     */
    public void setPassword(String password) {
        String regex = "^(?=.[a-z])(?=.[A-Z])(?=.*\\d)[a-zA-Z\\d]{6,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        if(matcher.matches()){
            this.password = password;
        }
        else{
            this.password = "";
        }
    }
    
    /**
     * Setter joinDate
     * mengassign nilai joinDate baru pada objek Jobseeker
     */
    public void setJoinDate(Calendar joinDate) {
        this.joinDate = joinDate;
    }
    
    public void setJoinDate(int year, int month, int dayOfMonth) {
        this.joinDate = new GregorianCalendar(year, month, dayOfMonth);
    }

    public String toString() {
        if (this.joinDate == null) {
            return "Id = " + getId() + "\nNama = " + getName() + "\nEmail = " + getEmail() + "\nPassword = "
                    + getPassword();
        } else {
            SimpleDateFormat formattedDate = new SimpleDateFormat("dd-MMMM-yyyy");
            String date = formattedDate.format(getJoinDate().getTime());
            return "Id = " + getId() + "\nNama = " + getName() + "\nEmail = " + getEmail() + "\nPassword = "
                    + getPassword() + "\nJoin Date = " + date;
        }

    }
    
    /*
    /**
     * fungsi untuk melakukan print data ke layar
    

    public void printData(){
        System.out.println(getName());
    }
    */
}
