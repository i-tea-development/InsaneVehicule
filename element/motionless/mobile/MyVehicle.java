package insanevehicles.element.mobile;

import insanevehicles.Road;
import insanevehicles.element.Permeability;

/**
 * The Class MyVehicle.
 *
 * @author Promo AI Cesi La Rochelle
 * @version 0.2
 */

public class MyVehicle extends Mobile {

    /** The Constant SPRITE. */
    private static final char SPRITE = 'H';

    /**
     * Instantiates a new my vehicle.
     *
     * @param x
     *            the x
     * @param y
     *            the y
     * @param road
     *            the road
     */
    public MyVehicle(final int x, final int y, final Road road) {
        super(x, y, SPRITE, road, Permeability.BLOCKING);
    }
}
