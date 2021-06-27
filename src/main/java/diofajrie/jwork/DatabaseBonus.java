package diofajrie.jwork;

/**
 * Write a description of class EwalletPayment here.
 *
 * @author (Dio Fajrie Fadlullah)
 * @version (22.04.2021)
 */
import java.util.ArrayList;

public class DatabaseBonus {
    private static ArrayList<Bonus> BONUS_DATABASE = new ArrayList<Bonus>();
    private static int lastId = 0;

    public static ArrayList<Bonus> getBonusDatabase(){
        return BONUS_DATABASE;
    }

    public static int getLastId(){
        return lastId;
    }

    public static Bonus getBonusById(int id) throws BonusNotFoundException {
        Bonus temp = null;
        try {
            for (Bonus bonus : BONUS_DATABASE) {
                if (id == bonus.getId()) {
                    temp = bonus;
                }
            }
        }
        catch (Exception e){
            throw new BonusNotFoundException(id);
        }
        return temp;
    }

    public static Bonus getBonusByReferralCode(String referralCode){
        Bonus temp = null;
        for (Bonus bonus : BONUS_DATABASE) {
            if (referralCode.equals(bonus.getReferralCode())) {
                temp = bonus;
            }
        }
        return temp;
    }

    public static boolean addBonus(Bonus bonus) throws ReferralCodeAlreadyExistsException {
        for(Bonus bonuses : BONUS_DATABASE) {
            if(bonuses.getReferralCode() == bonus.getReferralCode()) {
                throw new ReferralCodeAlreadyExistsException(bonus);
            }
        }

        BONUS_DATABASE.add(bonus);
        lastId = bonus.getId();
        return true;
    }

    public static boolean activateBonus(int id){
        boolean temp = false;
        for (Bonus bonus : BONUS_DATABASE) {
            if (id == bonus.getId()) {
                bonus.setActive(true);
                temp = true;
            }
        }
        return temp;
    }

    public static boolean deactivateBonus(int id){
        boolean temp = false;
        for (Bonus bonus : BONUS_DATABASE) {
            if (id == bonus.getId()) {
                bonus.setActive(false);
                temp = true;
            }
        }
        return temp;
    }

    public static boolean removeBonus(int id) throws RecruiterNotFoundException{
        try{
            for (Bonus bonus : BONUS_DATABASE) {
                if (bonus.getId() == id) {
                    BONUS_DATABASE.remove(bonus);
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