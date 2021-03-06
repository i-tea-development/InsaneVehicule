package insanevehicles.element.motionless;

import insanevehicles.element.Permeability;

/**
 * The Class Ditch.
 *
 * @author Promo AI Cesi La Rochelle
 * @version 0.2
 */

class Ditch extends MotionlessElement {

    /** The Constant SPRITE. */
    private static final char SPRITE = '|';

    /**
     * Instantiates a new ditch.
     */
    Ditch() {
        super(SPRITE, Permeability.BLOCKING);
    }
}