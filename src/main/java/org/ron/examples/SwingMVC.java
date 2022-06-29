package org.ron.examples;

import javax.swing.*;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.awt.*;
import java.util.Random;

public class SwingMVC {

    public static void main(String[] args) {
        SwingMVC swingMVC = new SwingMVC();
        swingMVC.method1();
    }

    private void method1() {
        JButton button = new JButton("Hello World");
        button.addActionListener(e -> System.out.println("HW button clicked"));

        JTable table = new JTable(new MyTableModel());
        JScrollPane scrollPane = new JScrollPane(table);

        JFrame frame = new JFrame();
        frame.setLayout(new BorderLayout(10, 10));
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(button, BorderLayout.SOUTH);
        frame.setSize(200, 200);
        frame.setVisible(true);
    }

    private class MyTableModel implements TableModel {

        private Random random = new Random();

        @Override
        public int getRowCount() {
            return 10000000;
        }

        @Override
        public int getColumnCount() {
            return 10;
        }

        @Override
        public String getColumnName(int columnIndex) {
            return "Col:" + columnIndex;
        }

        @Override
        public Class<?> getColumnClass(int columnIndex) {
            return String.class;
        }

        @Override
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return false;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            System.out.println("getValueAt() r=" + rowIndex + ", c=" + columnIndex);
            return "r=" + rowIndex + " c=" + columnIndex + " : " + random.nextInt(10);
        }

        @Override
        public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

        }

        @Override
        public void addTableModelListener(TableModelListener l) {

        }

        @Override
        public void removeTableModelListener(TableModelListener l) {

        }
    }
}
