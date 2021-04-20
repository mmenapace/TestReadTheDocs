package java;

import java.vehicle;

public class car implements vehicle {


    @Override
    public String makesound() {
        return "BRUM";
    }

    @Override
    public int nOfWheels() {
        return 4;
    }
}
