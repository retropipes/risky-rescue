package com.puttysoftware.images;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.Icon;

public class BufferedImageIcon extends BufferedImage implements Icon {
    // Fields
    private static final int DEFAULT_TYPE = BufferedImage.TYPE_INT_ARGB;

    // Constructors
    /**
     * Creates a BufferedImageIcon based on a BufferedImage object.
     *
     * @param bi
     */
    public BufferedImageIcon(final BufferedImage bi) {
        super(bi.getWidth(), bi.getHeight(), BufferedImageIcon.DEFAULT_TYPE);
        for (int x = 0; x < bi.getWidth(); x++) {
            for (int y = 0; y < bi.getHeight(); y++) {
                this.setRGB(x, y, bi.getRGB(x, y));
            }
        }
    }

    /**
     * Paints the BufferedImageIcon, using the given Graphics, on the given
     * Component at the given x, y location.
     *
     * @param c
     * @param g
     * @param x
     * @param y
     */
    @Override
    public void paintIcon(final Component c, final Graphics g, final int x,
            final int y) {
        g.drawImage(this, x, y, c);
    }

    /**
     * @return the width of this BufferedImageIcon, in pixels
     */
    @Override
    public int getIconWidth() {
        return this.getWidth();
    }

    /**
     * @return the height of this BufferedImageIcon, in pixels
     */
    @Override
    public int getIconHeight() {
        return this.getHeight();
    }
}