package app.model;

import app.entity.Gamer;
import app.utils.Variables;

public class AppMinModel {

    public double calcWin(Gamer gamer) {
        return (gamer.getRate() * Variables.rateMin/ 100);
    }
}