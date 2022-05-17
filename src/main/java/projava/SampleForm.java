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

        frame.setVisible(true);
    }
}
