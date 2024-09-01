//package CSC273.CSC273_CTA2;

import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class BankAccountGUI {

    private JFrame frame;
    private JPanel panel;
    private JLabel balanceLabel;
    private double balance = 0.0;

    public BankAccountGUI() {
        //init frame
        frame = new JFrame("Account Balance");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 250);
        //init panel and layout
        panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2));
        balanceLabel = new JLabel("Balance: ");
        panel.add(balanceLabel);

        //create buttons
        JButton enterBalanceButton = new JButton("Enter Balance");
        JButton getBalanceButton = new JButton("Get Balance");
        JButton addFundsButton = new JButton("Add Funds");
        JButton withdrawFundsButton = new JButton("Withdraw Funds");

        //add buttons to panel
        panel.add(enterBalanceButton);
        panel.add(getBalanceButton);
        //spacing
        panel.add(new JLabel());
        panel.add(addFundsButton);
        panel.add(withdrawFundsButton);

        //action listener for set balance button
        enterBalanceButton.addActionListener((ActionEvent e) -> {
            String input = JOptionPane.showInputDialog("Enter your balance:");
            balance = Double.parseDouble(input);
            balanceLabel.setText("Balance: $" + balance);
        });
        //action listener for get balance button
        getBalanceButton.addActionListener((ActionEvent e) -> {
            balanceLabel.setText("Balance: $" + balance);
        });
        //action listener for addfunds button
        addFundsButton.addActionListener((ActionEvent e) -> {
            String input = JOptionPane.showInputDialog("Enter amount of funds to add:");
            balance += Double.parseDouble(input);
            balanceLabel.setText("Balance: $" + balance);
        });
        //action listener for withdraw funds button
        withdrawFundsButton.addActionListener((ActionEvent e) -> {
            String input = JOptionPane.showInputDialog("Enter amount of funds to withdraw:");
            balance -= Double.parseDouble(input);
            balanceLabel.setText("Balance: $" + balance);
        });
        //add panel to frame and set visible
        frame.add(panel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new BankAccountGUI();
    }
}
