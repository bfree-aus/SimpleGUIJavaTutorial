package com.company;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
	// write your code here
        GUIForm form = new GUIForm();
        JFrame frame = new JFrame("Your window name");
        frame.setContentPane(form.getPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


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
        //commit


    }
}
