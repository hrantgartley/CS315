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
    private JTextField textField;
    private JTextField textField2;
    private Button encodeButton;
    private Button decodeButton;
    private Button clear;

    public Coder() {
        frame = new JFrame("JTextField Demo");
        label = new JLabel("Enter your name: ");
        textField = new JTextField(20);
        textField2 = new JTextField(20);
        encodeButton = new Button("Encode");
        decodeButton = new Button("Decode");
        clear = new Button("Clear");

        frame.setLayout(new FlowLayout());

        frame.add(label);
        frame.add(textField);
        frame.add(textField2);
        frame.add(encodeButton);
        frame.add(decodeButton);
        frame.add(clear);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Coder demo = new Coder();
        demo.run();
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand().equals("One")) {
            label.setText("Enter pressed in text field 1: " + textField.getText());
        } else {
            label.setText("Enter pressed in text field 2: " + textField2.getText());
        }
    }

    public void run() {
        textField.addActionListener(this);
        textField2.addActionListener(this);
    }

}
