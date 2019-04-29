package insanevehicles.element.motionless;

import insanevehicles.element.Permeability;

/**
 * The Class Obstacle.
 *
 * @author Promo AI Cesi La Rochelle
 * @version 0.2
 */

class Obstacle extends MotionlessElement {

    /** The Constant SPRITE. */
    private static final char SPRITE = 'X';

    /**
     * Instantiates a new obstacle.
     */
    Obstacle() {
        super(SPRITE, Permeability.BLOCKING);
    }
}