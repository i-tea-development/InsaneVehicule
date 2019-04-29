package insanevehicles.element.motionless;

import insanevehicles.element.Permeability;

/**
 * <h1>The Class Tree.</h1>
 *
 * @author Promo AI Cesi La Rochelle
 * @version 0.2
 */

class Tree extends MotionlessElement {

    /** The Constant SPRITE. */
    private static final char SPRITE = '^';

    /**
     * Instantiates a new tree.
     */
    Tree() {
        super(SPRITE, Permeability.BLOCKING);
    }
}
