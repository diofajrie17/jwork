
/**
 * 
 *
 * @author (Dio Fajrie Fadlullah)
 * @version (25.03.2021)
 */
public class Location
{
    // instance variables - replace the example below with your own
    private String province;
    private String city;
    private String description;
    /**
     * Constructor for objects of class Location
     * @param province provinsi dari lokasi
     * @param city kota dari lokasi
     * @param description deskripsi atau alamat detail dari lokasi
     */
    public Location(String province, String city, String description)
    {
        this.province = province;
        this.city = city;
        this.description = description;
    }
    
    /**
     * Getter variable province
     * @return province dari objek Location terkait
     */
    public String getProvince(){
        return province;
    }
    
    /**
     * Getter variable city
     * @return city dari objek Location terkait
     */
    public String getCity(){
        return city;
    }
    
    /**
     * Getter variable description
     * @return description dari objek Location terkait
     */
    public String getDescription(){
        return description;
    }
    
    /**
     * Setter province
     * mengassign nilai province baru pada objek Location
     */
    public void setProvince(String province){
        this.province = province;
    }
    
    /**
     * Setter city
     * mengassign nilai city baru pada objek Location
     */
    public void setCity(String city){
        this.city = city;
    }
    
    /**
     * Setter description
     * mengassign nilai description baru pada objek Location
     */
    public void setDescription(String description){
        this.description = description;
    }
    
    
    /**
     * return string untuk melakukan print data ke layar
     */
    public String toString(){
        return String.format("Province = %s \nCity = %s \nDescription = %s", province, city, description);
    }
}
