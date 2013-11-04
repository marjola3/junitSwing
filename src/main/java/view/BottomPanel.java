package view;

import javax.swing.*;

/**
 * User: Mariola
 * Date: 04.11.13
 */
public class BottomPanel extends JPanel {
    private JButton generateBtn;
    private JButton cancelBtn;

    public BottomPanel() {
        generateBtn = new JButton("Generate");
        cancelBtn = new JButton("Cancel");
        add(generateBtn);
        add(cancelBtn);
    }

    public JButton getGenerateBtn(){
        return generateBtn;
    }

    public JButton getCancelBtn(){
        return cancelBtn;
    }
}
