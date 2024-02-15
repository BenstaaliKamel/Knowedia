package org.example;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ModernLoginPage extends JFrame implements ActionListener {
    private JButton registerButton, loginButton;
    private JPanel togglePanel, signInPanel, signUpPanel;

    public ModernLoginPage() {
        setTitle("Styled Swing App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBackground(Color.WHITE);

        JLabel label = new JLabel("Welcome to your Knowedia");
        label.setFont(new Font("Arial", Font.BOLD, 20));
        label.setForeground(Color.BLUE);
        label.setHorizontalAlignment(SwingConstants.CENTER);

        JButton button = new JButton("Click Me");
        button.setBackground(Color.BLUE);
        button.setForeground(Color.WHITE);
        button.setFont(new Font("Arial", Font.BOLD, 16));
        button.setFocusPainted(false);

        panel.add(label, BorderLayout.CENTER);
        panel.add(button, BorderLayout.SOUTH);

        add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == registerButton) {
            CardLayout cardLayout = (CardLayout) togglePanel.getLayout();
            cardLayout.show(togglePanel, "SIGN_UP");
        } else if (e.getSource() == loginButton) {
            CardLayout cardLayout = (CardLayout) togglePanel.getLayout();
            cardLayout.show(togglePanel, "SIGN_IN");
        }
    }

}

