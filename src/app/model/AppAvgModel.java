package app.model;

import app.entity.Gamer;
import app.utils.Variables;

public class AppAvgModel extends AppMinModel {

    @Override
    public double calcWin(Gamer gamer) {
        return ((gamer.getRate() * Variables.rateMin / 100)
                - (gamer.getRate() * Variables.taxMin / 100));
    }
}
