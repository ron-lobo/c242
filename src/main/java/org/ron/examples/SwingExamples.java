package org.ron.examples;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingExamples {

    public static void main(String[] args) {
        SwingExamples swingExamples = new SwingExamples();
        swingExamples.simpleButton();
    }

    private void simpleButton() {
        JFrame frame = new JFrame();
        JButton button = new JButton("Hello World");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("HW button clicked");
            }
        });
        frame.setLayout(new FlowLayout());
        frame.add(button);
        frame.setSize(200, 200);
        frame.setVisible(true);
    }
}
