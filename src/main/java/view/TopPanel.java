package view;

import javax.swing.*;
import java.awt.*;

/**
 * User: Mariola
 * Date: 04.11.13
 */
public class TopPanel extends JPanel{
    private JTextArea textArea;

    public TopPanel(){
        textArea = new JTextArea(20, 25);
        textArea.setFont(new Font("Arial", Font.PLAIN, 14));
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane);
    }

    public JTextArea getTextArea(){
        return textArea;
    }
}
