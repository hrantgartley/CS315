
/* 
 * Grant Hartley
 * CS-315
 * Lab 5
 * Description: This program creates a simple stopwatch using Java Swing and the Calendar class.
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.awt.FlowLayout;

import javax.swing.*;

public class StopWatch implements ActionListener {
    JLabel jlab;
    Calendar startTime;
    private boolean isRunning = false;
    private long elapsedTime;

    StopWatch() {
        JFrame jfrm = new JFrame("StopWatch");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(220, 200);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton jbtnUp = new JButton("Start");
        JButton jbtnDown = new JButton("Stop");
        jbtnUp.addActionListener(this);
        jbtnDown.addActionListener(this);
        jfrm.add(jbtnUp);
        jfrm.add(jbtnDown);
        jlab = new JLabel("Press a button.");
        jfrm.add(jlab);
        jfrm.setVisible(true);
    }

    /**
     * This method is called when an action event occurs.
     * It handles the logic for starting and stopping a stopwatch.
     * 
     * @param e the action event that triggered the method
     */
    public void actionPerformed(ActionEvent e) {
        e = (ActionEvent) e;
        if (e.getActionCommand().equals("Start")) {
            if (!isRunning) {
                startTime = Calendar.getInstance();
                startTime.setTimeInMillis(System.currentTimeMillis());
                isRunning = true;
            }
        } else {
            if (isRunning) {
                elapsedTime = System.currentTimeMillis() - startTime.getTimeInMillis();
                isRunning = false;
                jlab.setText("Elapsed Time: " + formatElapsedTime(elapsedTime));
            }
        }
        updateLabel();
    }

    /**
     * Updates the label text based on the current state of the stopwatch.
     * If the stopwatch is running, the label will display the elapsed time.
     * If the stopwatch is stopped, the label will display the time when it was
     * stopped.
     */
    private void updateLabel() {
        if (isRunning) {
            jlab.setText("Stopwatch is Running...");
        } else {
            jlab.setText("Time Stopped: " + formatElapsedTime(elapsedTime));
        }
    }

    /**
     * Formats the elapsed time in milliseconds into a string representation.
     *
     * @param elapsedTime the elapsed time in milliseconds
     * @return the formatted string representation of the elapsed time
     */
    private String formatElapsedTime(long elapsedTime) {
        long seconds = elapsedTime / 1000;
        long milliseconds = elapsedTime % 1000;
        return String.format("%02d:%03d", seconds, milliseconds);
    }

    /**
     * Resets the stopwatch by setting the isRunning flag to false,
     * the elapsedTime to 0, and updating the text of the jlab label.
     */
    @SuppressWarnings("unused")
    private void reset() {
        isRunning = false;
        elapsedTime = 0;
        jlab.setText("Press a button.");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new StopWatch();
            }
        });
    }
}
