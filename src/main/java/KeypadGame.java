import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeypadGame extends JFrame implements ActionListener {
    private JTextField inputField;
    private JButton[] buttons;
    private int targetNumber;

    public KeypadGame() {
        setTitle("Keypad Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create input field
        inputField = new JTextField(10);
        add(inputField, BorderLayout.NORTH);

        // Create keypad buttons
        buttons = new JButton[10];
        JPanel keypadPanel = new JPanel(new GridLayout(4, 3));
        for (int i = 0; i < 10; i++) {
            buttons[i] = new JButton(String.valueOf(i));
            buttons[i].addActionListener(this);
            keypadPanel.add(buttons[i]);
        }
        add(keypadPanel, BorderLayout.CENTER);

        // Generate target number
        targetNumber = (int) (Math.random() * 1000);
        System.out.println("Target number: " + targetNumber);

        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        String input = inputField.getText() + button.getText();
        inputField.setText(input);

        if (Integer.parseInt(input) == targetNumber) {
            JOptionPane.showMessageDialog(this, "You win!");
        } else if (input.length() > 3) {
            JOptionPane.showMessageDialog(this, "Invalid input!");
            inputField.setText("");
        }
    }

    public static void main(String[] args) {
        new KeypadGame();
    }
}