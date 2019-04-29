package insanevehicles.element.motionless;

import insanevehicles.element.Permeability;

/**
 * The Class DitchLeft.
 *
 * @author Promo AI Cesi La Rochelle
 * @version 0.2
 */

class DitchLeft extends MotionlessElement {

    /** The Constant SPRITE. */
    private static final char SPRITE = '/';

    /**
     * Instantiates a new ditchLeft.
     */
    DitchLeft() {
        super(SPRITE, Permeability.BLOCKING);
    }
}
