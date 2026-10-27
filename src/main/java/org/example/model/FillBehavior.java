package org.example.model;

import java.awt.*;
import java.awt.geom.RectangularShape;

public enum FillBehavior {
    FILL{
        @Override
        public void draw(Graphics2D g2, RectangularShape s){
            g2.fill(s);
        }
    },
    NOFILL {
        @Override
        public void draw(Graphics2D g2, RectangularShape s) {
            g2.draw(s);
        }
    };
    public abstract void draw(Graphics2D g2, RectangularShape s);
}
