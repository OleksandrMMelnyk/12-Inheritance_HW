/*Виграш залежить від числа, що випало:
 a) Менше 3, виграш - базовий функціонал, дорівнює 125% ставки.
 b) Від 3 до 7, включно, виграш дорівнює 125% ставки за вирахуванням 5% збору від ставки.
 c) більше 7, виграш дорівнює подвійній ставці за вирахуванням 10% збору від виграшу до відрахування.
Реалізуйте функціонал розрахунку виграшу, використовуючи успадкування.*/


package app.controller;

import app.entity.Gamer;
import app.model.AppAvgModel;
import app.model.AppMaxModel;
import app.model.AppMinModel;
import app.utils.Random;
import app.utils.Rounder;
import app.utils.Variables;
import app.view.AppView;

public class AppController {

    private final AppView view = new AppView();

    public void getPayment() {
        double data = view.getData();
        int randomNumber = Random.randomValue();
        String output;

        Gamer gamerRate = getAmount(data);

        if (randomNumber < Variables.numberMin) {
            AppMinModel model = new AppMinModel();
            String winAmount = Rounder.roundValue(model.calcWin(gamerRate));
            output = "-----------------------------" +
                    "\nCONGRATULATIONS!!!" +
                    "\nYOUR NUMBER: " + randomNumber +
                    "\nYOU GET: " + winAmount + " " + Variables.CURRENCY + ".";
            view.getOutput(output);

        } else if (randomNumber <= Variables.numberMax) {
            AppAvgModel model = new AppAvgModel();
            String winAmount = Rounder.roundValue(model.calcWin(gamerRate));
            output = "-----------------------------" +
                    "\nCONGRATULATIONS!!!" +
                    "\nYOUR NUMBER: " + randomNumber +
                    "\nYOU GET: " + winAmount + " " + Variables.CURRENCY + ".";
            view.getOutput(output);

        } else {
            AppMaxModel model = new AppMaxModel();
            String winAmount = Rounder.roundValue(model.calcWin(gamerRate));
            output = "-----------------------------" +
                    "\nCONGRATULATIONS!!!" +
                    "\nYOUR NUMBER: " + randomNumber +
                    "\nYOU GET: " + winAmount + " " + Variables.CURRENCY + ".";
            view.getOutput(output);
        }
    }

    private Gamer getAmount(double data) {
        return new Gamer(data);
    }
}
