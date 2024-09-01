//package CSC273.CSC273_CTA2;

import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class BankAccountGUI {

    private JFrame frame;
    private JPanel panel;
    private JLabel balanceLabel;
    private final double balance = 0.0;

    public BankAccountGUI() {
        frame = new JFrame("Account Balance");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        balanceLabel = new JLabel("Balance: ");
        panel.add(balanceLabel);
        JButton getBalanceButton = new JButton("Get Balance");
        JButton addFundsButton = new JButton("Add Funds");
        JButton withdrawFundsButton = new JButton("Withdraw Funds");

        panel.add(new JLabel());
        panel.add(getBalanceButton);
        panel.add(addFundsButton);
        panel.add(withdrawFundsButton);

        getBalanceButton.addActionListener((ActionEvent e) -> {
            balanceLabel.setText("Balance: $" + balance);
        });

        frame.add(panel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new BankAccountGUI();
    }
}
