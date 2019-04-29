package insanevehicles;

import java.io.IOException;

/**
 * The Class InsaneVehicles.
 *
 * @author Promo AI Cesi La Rochelle
 * @version 0.2
 */

public abstract class InsaneVehicles {

    /**
     * The main method.
     *
     * @param args
     *            the arguments
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    public static void main(final String[] args) throws IOException {
        final InsaneVehiclesGames insaneVehiclesGame = new InsaneVehiclesGames();
        insaneVehiclesGame.play();
    }
}

