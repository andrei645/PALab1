package com.code;

import javax.swing.*;
import java.awt.*;

public class App {
        public App(){
            JFrame frame = new JFrame();

            JPanel panel = new JPanel();

            panel.setBorder(BorderFactory.createEmptyBorder(300, 300, 100, 300));
            panel.setLayout(new GridLayout());
            frame.add(panel, BorderLayout.CENTER);  //add the pannel to the frame
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("Mainframe");
            frame.pack();
            frame.setVisible(true);
        }
    public static void main(String[] args) {
        new App();
    }
}
