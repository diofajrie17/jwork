import java.util.ArrayList;

/**
 * Write a description of class DatabaseRecruiter here.
 *
 * @author Dio Fajrie Fadlullah
 * @version  01 Maret 2021
 */
public class DatabaseRecruiter
{
    private static ArrayList<Recruiter> RECRUITER_DATABASE = new ArrayList<Recruiter>();
    private static int lastId = 0;

    public static ArrayList<Recruiter> getRecruiterDatabase(){
        return RECRUITER_DATABASE;
    }

    public static int getLastId()
    {
        return lastId;
    }

    public static Recruiter getRecruiterById(int id) throws RecruiterNotFoundException {
        Recruiter temp = null;

        try{
            for (Recruiter element : RECRUITER_DATABASE) {
                if (element.getId() == id) {
                    temp = element;
                    return temp;
                }
            }
        }
        catch (Exception e){
            throw new RecruiterNotFoundException(id);
        }
        return temp;
    }

    public static boolean addRecruiter(Recruiter recruiter)
    {
        return true;
    }

    public static boolean removeRecruiter(int id) throws RecruiterNotFoundException {
        try{
            for (Recruiter element : RECRUITER_DATABASE) {
                if (element.getId() == id) {
                    RECRUITER_DATABASE.remove(element);
                    return true;
                }
            }
        }
        catch (Exception e){
            throw new RecruiterNotFoundException(id);
        }
        return false;
    }
}