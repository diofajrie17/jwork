package diofajrie.jwork.controller;

import java.util.ArrayList;
import diofajrie.jwork.*;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/bonus")
@RestController
public class BonusController {
    @RequestMapping("")
    public ArrayList<Bonus> getAllBonus() {
        return DatabaseBonus.getBonusDatabase();
    }

    @RequestMapping("/bonus/{referralCode}")
    public Bonus getBonusByReferralCode(@PathVariable String referralCode){
        Bonus bonus = null;
        bonus = DatabaseBonus.getBonusByRefferalCode(referralCode);
        return bonus;
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public Bonus addBonus(
            @RequestParam(value = "referralCode") String referralCode,
            @RequestParam(value = "extraFee") int extraFee,
            @RequestParam(value = "minTotalFee") int minTotalFee,
            @RequestParam(value = "active") boolean active

    ) throws ReferralCodeAlreadyExistsException {
        Bonus bonus = new Bonus(DatabaseBonus.getLastId() + 1, referralCode, extraFee, minTotalFee, active);
        try {
            DatabaseBonus.addBonus(bonus);
        } catch (ReferralCodeAlreadyExistsException e) {
            e.getMessage();
            return null;
        }
        return bonus;
    }
}
