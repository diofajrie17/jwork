
/**
 * 
 *
 * @author (Dio Fajrie Fadlullah)
 * @version (18.03.2021)
 */
public class DatabaseJob
{
    
    private String[] listJob;

    /**
     * Constructor for objects of class DatabaseJob
     * 
     */
    public DatabaseJob()
    {
        
    }

    /**
     * fungsi yang berguna untuk menambahkan pekerjaan baru kedalam array listJob
     * @return true
     */
    public boolean addJob(Job job){
        return true;
    }
    
    /**
     * fungsi yang berguna untuk menghapus pekerjaan dari array listJob
     * @return false
     */
    public boolean removeJob(Job job){
        return false;
    }
    /**
     * Getter variable job
     * @return job
     */
    public Job getJob(Job job){
        return job;
    }
    
    /**
     * Getter array listJob
     * @return listJob[] mengembalikan array listjob
     */
    public String[] getListJob(){
        return listJob;
    }
    
}
