package insanevehicles;

/**
 * The Class InsaneVehicles.
 *
 * @author Promo AI Cesi La Rochelle
 * @version 0.1
 */

public abstract class InsaneVehicles {

    /**
     * The main method.
     *
     * @param args
     *            the arguments
     */
    public static void main(final String[] args) {
        final InsaneVehiclesGames insaneVehiclesGame = new InsaneVehiclesGames();
        insaneVehiclesGame.play();
    }
}
