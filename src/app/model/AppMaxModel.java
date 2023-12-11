package app.model;

import app.entity.Gamer;
import app.utils.Variables;

public class AppMaxModel extends AppMinModel {
    @Override
    public double calcWin(Gamer gamer) {
        return ((gamer.getRate() * Variables.rateMax / 100)
                - ((gamer.getRate() * Variables.rateMax / 100) * Variables.taxMax / 100));
    }
}
