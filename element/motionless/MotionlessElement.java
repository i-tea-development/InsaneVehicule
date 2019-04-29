package insanevehicles.element.motionless;

import insanevehicles.element.Element;
import insanevehicles.element.Permeability;

/**
 * The Class MotionlessElement.
 *
 * @author Promo AI Cesi La Rochelle
 * @version 0.2
 */

abstract class MotionlessElement extends Element {

    /**
     * Instantiates a new motionless element.
     *
     * @param sprite
     *            the sprite
     * @param permeability
     *            the permeability
     */
    MotionlessElement(final char sprite, final Permeability permeability) {
        super(sprite, permeability);
    }

}
