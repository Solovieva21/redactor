package org.example.view;

import javax.swing.*;
import java.awt.event.*;
import org.example.controller.Controller;

public class MyPanel extends JPanel{
    Controller controller;
    public JButton b1;
    public JButton b2;
    public JButton b3;
    public JTextField t1;


    public MyPanel(Controller controller) {
        this.controller = controller;
        b1 = new JButton("Кот");
        b2 = new JButton("Собака");
        b3 = new JButton("Говорить");
        t1 = new JTextField("                  ");
        add(b1);
        add(b2);
        add(b3);
        add(t1);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.setCat();
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.setDog();
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SetText(controller.setSpeak());
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

    public void SetText(String text){
        t1.setText(text);
    }


}
