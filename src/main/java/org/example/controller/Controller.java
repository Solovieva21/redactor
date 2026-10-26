package org.example.controller;

import org.example.model.MyShape;
import org.example.view.MyFrame;
import org.example.view.MyPanel;

import java.awt.*;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class Controller {
    MyPanel myPanel;
    MyFrame myFrame;
    Point2D[] points;
    MyShape currentShape;

    public Controller() {
        points = new Point2D[2];
        myPanel = new MyPanel(this);
        myFrame = new MyFrame(myPanel);
        currentShape = new MyShape(new Rectangle2D.Double());
    }

    public void mousePressed(Point point) {
        points[0] = point;
    }

    public void mouseDragged(Point point) {
        points[1] = point;
    }

    public void setRectangle() {
        currentShape.setRectangle2D();
        points[0] = null;
        points[1] = null;
    }

    public void setEllipse() {
        currentShape.setEllipse2D();
        points[0] = null;
        points[1] = null;
    }

    public void draw(Graphics2D g2) {
        if (points[0] != null && points[1] != null) {
            currentShape.setFrameFromDiagonal(points[0], points[1]);
            currentShape.draw(g2);
        }
    }
}