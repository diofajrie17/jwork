package diofajrie.jwork;
/**
 * Write a description of class EwalletPayment here.
 *
 * @author (Dio Fajrie Fadlullah)
 * @version (22.04.2021)
 */
import java.util.ArrayList;

public class DatabaseJob
{
    private static ArrayList<Job> JOB_DATABASE = new ArrayList<Job>();
    private static int lastId = 0;


    /**
     * boolean untuk menambah pekerjaan
     * @return nilai yang berbeda
     */
    public static boolean addJob(Job job){
        JOB_DATABASE.add(job);
        lastId = job.getId();
        return true;
    }

    /**
     * boolean untuk menghapus pekerjaan
     * @return nilai yang berbeda
     */
    public static boolean removeJob(int id) throws JobNotFoundException{
        try{
            for (Job job : JOB_DATABASE) {
                if (id == job.getId()) {
                    JOB_DATABASE.remove(id);
                    return true;
                }
            }
        }
        catch (Exception e) {
            throw new JobNotFoundException(id);
        }
        return false;
    }

    /**
     * Sebuah getter untuk mendapatkan data Job
     * @return nilai kosong
     */
    public static ArrayList<Job> getJobDatabase()
    {
        return JOB_DATABASE;
    }

    public static int getLastId()
    {
        return lastId;
    }

    public static Job getJobById(int id) throws JobNotFoundException {
        Job temp = null;

        try{
            for (int i = 0; i < JOB_DATABASE.size(); i++) {
                if (id == JOB_DATABASE.get(i).getId()) {
                    temp = JOB_DATABASE.get(i);
                }
            }
        }
        catch (Exception e){
            throw new JobNotFoundException(id);
        }
        return temp;
    }

    public static ArrayList<Job> getJobByRecruiter(int recruiterId) {
        ArrayList<Job> temp = null;
        for (Job job : JOB_DATABASE) {
            if (recruiterId == job.getRecruiter().getId()) {
                if (temp == null) {
                    temp = new ArrayList<Job>();
                }
                temp.add(job);
            }
        }
        return temp;
    }

    public static ArrayList<Job> getJobByCategory(JobCategory category){
        ArrayList<Job> temp = new ArrayList<Job>();
        for (Job job : JOB_DATABASE) {
            if (category == job.getCategory()) {
                temp.add(job);
            } else {
                return null;
            }
        }
        return temp;
    }
}