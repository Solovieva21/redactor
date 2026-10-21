package org.example.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import org.example.controller.Controller;

public class MyPanel extends JPanel{
    Controller controller;
    public JButton bRect;
    public JButton bEllipse;


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        if(controller != null && controller.curShape != null){
            g2.draw(controller.curShape);
        }
    }

    public MyPanel(Controller controller) {
        this.controller = controller;
        bRect = new JButton("Прямоугольник");
        bEllipse = new JButton("Эллипс");
        add(bRect);
        add(bEllipse);

        bRect.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.setRectangle();
            }
        });
        bEllipse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.setEllipse();
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
            }
        });
    }
}








