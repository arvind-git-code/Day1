import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ArrayMatchingGameGUI extends JFrame {

    private JLabel currentElementLabel;
    private JTextField guessTextField;
    private JButton submitButton;
    private String[] array1 = {"अंगूर", "खरबूजा", "कीवी", "नींबू", "मैंगो", "सेब", "केला", "चेरी", "खजूर", "एल्डरबेरी"};
    private String[] array2 = {"grape", "honeydew", "kiwi", "lemon", "mango","apple", "banana", "cherry", "date", "elderberry"};
    private int currentElementIndex = 0;
    private boolean gameWon = false;

    public ArrayMatchingGameGUI() {
        setTitle("Array Matching Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 1));

        currentElementLabel = new JLabel("Current element: " + array1[currentElementIndex]);
        guessTextField = new JTextField();
        submitButton = new JButton("Submit");

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String guess = guessTextField.getText();
                if (guess.equals(array2[currentElementIndex])) {
                    currentElementIndex++;
                    currentElementLabel.setText("Current element: " + array1[currentElementIndex]);
                    guessTextField.setText("");
                    if (currentElementIndex == array1.length) {
                        gameWon = true;
                        JOptionPane.showMessageDialog(null, "Congratulations! You've won the game.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect. Try again.");
                }
            }
        });

        add(currentElementLabel);
        add(guessTextField);
        add(submitButton);

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new ArrayMatchingGameGUI();
    }
}