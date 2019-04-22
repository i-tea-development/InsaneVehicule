package insanevehicles.element;

/**
 * The Class Element.
 *
 * @author Promo AI Cesi La Rochelle
 * @version 0.1
 */

public abstract class Element {

    /** The sprite. */
    private char sprite;

    /**
     * Instantiates a new element.
     *
     * @param sprite
     *            the sprite
     */
    public Element(final char sprite) {
        this.setSprite(sprite);
    }

    /**
     * Gets the sprite.
     *
     * @return the sprite
     */
    public final char getSprite() {
        return this.sprite;
    }

    /**
     * Sets the sprite.
     *
     * @param sprite
     *            the new sprite
     */
    private void setSprite(final char sprite) {
        this.sprite = sprite;
    }

}
