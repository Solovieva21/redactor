package org.example.model;
import java.awt.geom.Point2D;
import java.util.ArrayList;

public class Model {
    public MyShape currentShape;
    public ArrayList<MyShape> list;

    public Model(MyShape shape){
        this.currentShape = shape;
        this.list = new ArrayList<>();
    }
    public void addShape(){
    currentShape = currentShape.clone();
    list.add(currentShape);
    }
    public void setFrame(Point2D[] points){
    currentShape.setFrameFromDiagonal(points[0], points[1]);
    }
    public ArrayList<MyShape> getShapes(){
    return list;
    }
    public void setShape(MyShape shape){
    this.currentShape = shape;
    }
}