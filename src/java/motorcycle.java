package java;

/**
 * class that represent motorcycle
 */
public class motorcycle implements vehicle {
    @Override
    public String makesound() {
        return null;
    }

    @Override
    public int nOfWheels() {
        return 0;
    }


    /**
     * stub method for documentation of methods and parameters
     * @param degrees degrees of wheeling, if higher than 90, bad things will happens
     */
    public void impenna(int degrees){
        if (degrees>90) System.out.println("ribaltato");
        else System.out.println("noice "+degrees+ "of wheeling !");
    }
}
