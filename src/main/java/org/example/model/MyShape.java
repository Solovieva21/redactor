package org.example.model;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RectangularShape;

public class MyShape {
    RectangularShape shape;
    Color color ;
    FillBehavior fillBehavior;

    public MyShape(RectangularShape shape) {
        this.shape = shape;
        this.fillBehavior = FillBehavior.NOFILL;
    }
    public void setFillBehavior(FillBehavior fillBehavior){
        this.fillBehavior = fillBehavior;
    }

    public void setShape(RectangularShape shape) {
        this.shape = shape;
    }
    public void setColor(Color color){
        this.color = color;
    }

    public void draw(Graphics2D g2) {
        Paint paint = g2.getPaint();
        if(color != null){
            g2.setColor(color);
        }
        fillBehavior.draw(g2, shape);
        g2.setPaint(paint);
    }

    public void setFrameFromDiagonal(Point2D point, Point2D point1) {
        shape.setFrameFromDiagonal(point, point1);
    }

    public void setRectangle2D() {
        shape = new Rectangle2D.Double();
    }

    public void setEllipse2D() {
        shape = new Ellipse2D.Double();
    }
    public MyShape clone(){
        MyShape shapeClone = new MyShape((RectangularShape) shape.clone());
        shapeClone.color = color;
        shapeClone.fillBehavior = fillBehavior;
        return shapeClone;
    }
}