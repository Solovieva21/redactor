package org.example.view;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyPanel myPanel;
    public MyFrame(MyPanel myPanel) throws HeadlessException {
        this.myPanel = myPanel;
        add(myPanel);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
