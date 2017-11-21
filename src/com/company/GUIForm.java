package com.company;

import javax.swing.*;

public class GUIForm {


    private JTextField variable1;
    private JTextField variable2;
    private JButton submitButton;
    private JPanel panel;
    private JLabel answer;

    public JTextField getVariable1() {
        return variable1;
    }

    public JTextField getVariable2() {
        return variable2;
    }

    public JButton getSubmitButton() {
        return submitButton;
    }

    public void setAnswer(String answer) {
        this.answer.setText(answer);
    }

    public JPanel getPanel() {
        return panel;
    }


}
