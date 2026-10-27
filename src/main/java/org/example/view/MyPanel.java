package org.example.view;

import org.example.controller.Controller;
import org.example.model.MyShape;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyPanel extends JPanel {
    JButton bRect;
    JButton bEllipse;
    Controller controller;
    JButton bFill;
    JButton bNoFill;


    public MyPanel(Controller controller) {
        this.controller = controller;

        bRect = new JButton("Прямоугольник");
        bEllipse = new JButton("Эллипс");
        bFill = new JButton("Залитый");
        bNoFill = new JButton("Контур");


        add(bRect);
        add(bEllipse);
        add(bFill);
        add(bNoFill);


        bRect.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.setRectangle();
                repaint();
            }
        });

        bEllipse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.setEllipse();
                repaint();
            }
        });
        bFill.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.setFill();
                repaint();
            }
        });
        bNoFill.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.setNoFill();
                repaint();
            }
        });

        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                controller.mousePressed(e.getPoint());
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                super.mouseDragged(e);
                controller.mouseDragged(e.getPoint());
                repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        //controller.draw(g2);
        for (MyShape s : controller.translate()) {
            s.draw(g2);
        }
    }
}