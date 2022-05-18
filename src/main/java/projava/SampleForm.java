package projava;

import javax.swing.*;
import java.util.Locale;

public class SampleForm {

    public static void main(String[] args) {
        JFrame frame = new JFrame("test");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        final JTextField text1 = new JTextField();
        frame.add("North", text1);

        final JTextField text2 = new JTextField();
        frame.add("South", text2);

        JButton button = new JButton("大文字");
        frame.add(button);

        JButton button2 = new JButton("小文字");
        frame.add("East", button2);

        button.addActionListener(ae ->
                text2.setText(text1.getText().toUpperCase()));

        button2.addActionListener(ae ->
                text1.setText(text2.getText().toLowerCase()));

        frame.setVisible(true);
    }
}
