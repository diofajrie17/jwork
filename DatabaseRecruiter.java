
/**
 * Write a description of class DatabaseRecruiter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DatabaseRecruiter
{
    private String[] listRecruiter;

    /**
     * Constructor for objects of class DatabaseRecruiter
     */
    public DatabaseRecruiter()
    {
        
    }

    public boolean addRecruiter(Recruiter recruiter)
    {
        return true;
    }
    
    public boolean removeRecruiter(Recruiter recruiter)
    {
        return true;
    }
    
    public String getRecruiter(int index){
        return listRecruiter[index];
    }
    
    public String[] getListRecruiter(){
        return listRecruiter;
    }
    
    public void setRecruiter(int index, String recruiter){
        listRecruiter[index] = recruiter;
    }
    
}
