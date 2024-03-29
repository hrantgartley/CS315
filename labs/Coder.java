/* 
 * Grant Hartley
 * CS 315 - GUI Programming
 * 2024/02/19
 * Desc: This program creates a graphical user interface (GUI) for encoding and decoding text using FlowLayout.
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Button;
import java.awt.FlowLayout;

public class Coder implements ActionListener {
    private JFrame frame;
    private JLabel label;
    private JTextField textFieldOne;
    private JTextField textFieldTwo;
    private Button encodeButton;
    private Button decodeButton;
    private Button clear;

    /**
     * This class represents a Coder object that creates a graphical user interface
     * (GUI) for encoding and decoding text.
     * It contains methods to initialize and display the GUI components.
     */
    public Coder() {
        frame = new JFrame("JTextField Demo");
        label = new JLabel("Enter a message to decode/encode:");
        textFieldOne = new JTextField(20);
        textFieldTwo = new JTextField(20);
        encodeButton = new Button("Encode");
        decodeButton = new Button("Decode");
        clear = new Button("Clear");

        frame.setLayout(new FlowLayout());

        frame.add(label);
        frame.add(textFieldOne);
        frame.add(textFieldTwo);
        frame.add(encodeButton);
        frame.add(decodeButton);
        frame.add(clear);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    /**
     * The main method is the entry point of the program.
     * It creates an instance of the Coder class and calls its run method.
     *
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coder demo = new Coder();
        demo.run();
    }

    /**
     * Performs the appropriate action based on the event triggered.
     * If the encode button is pressed, it encodes the text in the textField by
     * incrementing each character by 1.
     * If the decode button is pressed, it decodes the text in the textField2 by
     * decrementing each character by 1.
     * If the clear button is pressed, it clears the text in both text fields.
     *
     * @param ae the ActionEvent object representing the event that occurred
     */
    public void actionPerformed(ActionEvent ae) {
        // check if encode button was pressed
        if (ae.getSource() == encodeButton) {
            StringBuilder text = new StringBuilder(textFieldOne.getText());
            String encoded = "";
            for (int i = 0; i < text.length(); i++) {
                char c = text.charAt(i);
                c += 1;
                encoded += c;
            }
            textFieldTwo.setText(encoded);
            System.out.println("Encoded Text: " + encoded);
        } else if (ae.getSource() == decodeButton) {
            String text = textFieldTwo.getText();
            String decoded = "";
            for (int i = 0; i < text.length(); i++) {
                char c = text.charAt(i);
                c -= 1;
                decoded += c;
            }
            textFieldOne.setText(decoded);
            System.out.println("Encoded Text: " + decoded);
        } else if (ae.getSource() == clear) {
            textFieldOne.setText("");
            textFieldTwo.setText("");
            System.out.println("Clear pressed");
        } else {
            label.setText("Invalid Event");
        }
    }

    /**
     * Registers action listeners for the text fields and buttons.
     */
    public void run() {
        textFieldOne.addActionListener(this);
        textFieldTwo.addActionListener(this);
        encodeButton.addActionListener(this);
        decodeButton.addActionListener(this);
        clear.addActionListener(this);
    }

}
