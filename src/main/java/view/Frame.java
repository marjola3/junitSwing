package view;

import controller.Controller;

import javax.swing.*;
import java.awt.*;

/**
 * User: Mariola
 * Date: 04.11.13
 */
public class Frame extends JFrame{

    public Frame(){
        setupFrame();
        intializeComponent();
    }

    public void setupFrame(){
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ignored) {
        } catch (InstantiationException ignored) {
        } catch (IllegalAccessException ignored) {
        } catch (UnsupportedLookAndFeelException ignored) {
        }

        setSize(300, 500);
        setLocationRelativeTo(null);
        setTitle("Actors");
    }

    public void intializeComponent(){
        Controller controller = new Controller();

        TopPanel topPanel = new TopPanel();
        BottomPanel bottomPanel = new BottomPanel();

        add(topPanel, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);

        controller.setTextArea(topPanel.getTextArea());
        controller.setGenerateBtn(bottomPanel.getGenerateBtn());
        controller.setCancelBtn(bottomPanel.getCancelBtn());
    }
}
