package org.example.controller;

import org.example.model.*;
import org.example.view.*;
import java.awt.geom.Point2D;
import java.awt.Point;

public class Controller {
    Cat cat;
    Dog dog;
    MyPanel myPanel;
    MyFrame myFrame;
    SpeakBehavior curAnimal;
    Point2D[] points;

    public Controller() {
        points = new Point2D[2];
        cat = new Cat("Bars");
        dog = new Dog("Rio");
        curAnimal = cat;
        myPanel = new MyPanel(this);
        myFrame = new MyFrame(myPanel);
    }

    public void setCat() {
        curAnimal = cat;
    }

    public void setDog() {
        curAnimal = dog;
    }

    public String setSpeak() {
        return curAnimal.speak();
    }

    public void mousePressed(Point point) {
        points[0] = point;
    }

    public void mouseDragged(Point point) {
        points[1] = point;
    }
}

