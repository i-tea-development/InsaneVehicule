package insanevehicles.element.motionless;

import insanevehicles.element.Permeability;

/**
 * The Class DitchRight.
 *
 * @author Promo AI Cesi La Rochelle
 * @version 0.2
 */

class DitchRight extends MotionlessElement {

    /** The Constant SPRITE. */
    private static final char SPRITE = '\\';

    /**
     * Instantiates a new ditchRight.
     */
    DitchRight() {
        super(SPRITE, Permeability.BLOCKING);
    }
}
