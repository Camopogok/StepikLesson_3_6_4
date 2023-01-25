import javax.swing.*;
import java.awt.*;

public class Main {
    JFrame frame = new JFrame("Кнопка");
    JButton button = new JButton();
    String text;
    static int count = 0;
    public Main () {
        frame.setSize(500, 500);
        frame.setLocation(400,200);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());
        text = "Количество кликов: " + count;
        button.setText(text);
        frame.add(button);
        button.addActionListener(actionEvent -> {
            count++;
            text = "Количество кликов: " + count;
            button.setText(text);
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}
