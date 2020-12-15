package Puzzle;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.io.*;

public class GUI {

    public GUI() {
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        JLabel label = new JLabel();


        panel.setBorder(BorderFactory.createEmptyBorder(300, 300, 300, 300));
        panel.setLayout(new GridLayout(3, 3, 2, 2));
        panel.setBackground(Color.lightGray);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Poster Puzzle");
        frame.pack();
        frame.setVisible(true);
    }
}