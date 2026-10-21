package org.example.controller;

import org.example.model.*;
import org.example.view.*;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.Point;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RectangularShape;

public class Controller {
    MyPanel myPanel;
    MyFrame myFrame;
    Point2D[] points;
    public RectangularShape curShape;

    public Controller() {
        points = new Point2D[2];
        myPanel = new MyPanel(this);
        myFrame = new MyFrame(myPanel);
        curShape = new Rectangle2D.Double();
    }

    public void mousePressed(Point point) {
        points[0] = point;
    }

    public void setRectangle() {
        curShape = new Rectangle2D.Double();
    }

    public void setEllipse() {
        curShape = new Ellipse2D.Double();
    }

    public void mouseDragged(Point point) {
        points[1] = point;
        if (curShape != null && points[0] != null && points[1] != null) {
            curShape.setFrameFromDiagonal(points[0], points[1]);
        }
        myPanel.repaint();
    }
}


