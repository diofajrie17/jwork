package diofajrie.jwork;
/**
 * Write a description of class EwalletPayment here.
 *
 * @author (Dio Fajrie Fadlullah)
 * @version (22.04.2021)
 */
public enum JobCategory
{
   WebDeveloper("Web Developer"), 
   FrontEnd("FrontEnd"),
   BackEnd("BackEnd"), 
   UI("UI"), 
   UX("UX"), 
   Devops("Devops"),
   DataScientist("DataScientist"), 
   DataAnalys("DataAnalys");
   private String category;
   JobCategory(String category){
        this.category=category;
    }
    public String toString(){
        return category;
    }
   
}
