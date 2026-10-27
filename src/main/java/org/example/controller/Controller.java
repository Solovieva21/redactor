package org.example.controller;

import org.example.model.FillBehavior;
import org.example.model.Model;
import org.example.model.MyShape;
import org.example.view.MyFrame;
import org.example.view.MyPanel;

import java.awt.*;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

public class Controller {
    MyPanel myPanel;
    MyFrame myFrame;
    Point2D[] points;
    MyShape currentShape;
    Model model;

    public Controller() {
        points = new Point2D[2];
        myPanel = new MyPanel(this);
        myFrame = new MyFrame(myPanel);
        currentShape = new MyShape(new Rectangle2D.Double());
        model = new Model(currentShape);
    }

    public void mousePressed(Point point) {
        points[0] = point;
        model.addShape();
    }

    public void mouseDragged(Point point) {
        points[1] = point;
        model.setFrame(points);
    }

    public void setRectangle() {
        currentShape.setRectangle2D();
        model.setShape(currentShape);
    }

    public void setEllipse() {
        currentShape.setEllipse2D();
        model.setShape(currentShape);
    }
    public ArrayList<MyShape> translate(){
        return model.getShapes();
    }

    public void setFill() {
            currentShape.setFillBehavior(FillBehavior.FILL);
        }
       public void setNoFill(){
            currentShape.setFillBehavior(FillBehavior.NOFILL);
    }
}