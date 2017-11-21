package com.company;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Main {

    public static void main(String[] args) {

        JMenuBar menuBar;
        JMenu menu;
        JMenuItem menuItemAbout, menuItemExit;

        menuBar = new JMenuBar();

        menu = new JMenu("File");
        menu.setMnemonic(KeyEvent.VK_F);

        menuBar.add(menu);

        // a group of Menu items
        menuItemAbout = new JMenuItem("About");
        menuItemAbout.setMnemonic(KeyEvent.VK_A);   // shortcut alt+A
        menu.add(menuItemAbout);

        menuItemExit = new JMenuItem("Exit");
        menuItemExit.setMnemonic(KeyEvent.VK_X);
        menu.add(menuItemExit);

	    // write your code here
        GUIForm form = new GUIForm();
        JFrame frame = new JFrame("Your window name");
        frame.setContentPane(form.getPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setJMenuBar(menuBar);

        frame.pack();
        frame.setVisible(true);



        menuItemAbout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                About dialog = new About();
                dialog.pack();
                dialog.setVisible(true);

            }
        });

        menuItemExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.exit(0);


            }
        });

        form.getSubmitButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    int variable1 = Integer.parseInt(form.getVariable1().
                            getText().toString());
                    int variable2 = Integer.parseInt(form.getVariable2().
                            getText().toString());

                    form.setAnswer(""+variable1*variable2);
                }
            });


    }
}
