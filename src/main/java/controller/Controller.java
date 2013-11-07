package controller;

import database.ActorDao;
import model.Actor;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * User: Mariola
 * Date: 04.11.13
 */
public class Controller {
    private JTextArea textArea;
    private JButton generateBtn;
    private JButton cancelBtn;

    class GenerateBtnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            List<Actor> listOfActor = ActorDao.getAllActors();
            for (Actor actor : listOfActor) {
               textArea.append(actor.getActorPersonalData() + "\n");
            }
        }
    }

    private void generateNumbers() {
        Random random = new Random();

        ArrayList<Integer> listOfNumbers = new ArrayList<Integer>();

        for (int i = 0; i < 100; i++){
            listOfNumbers.add(random.nextInt(1000));
        }

        int i = 1;
        for (Integer number : listOfNumbers){
            String text = String.format("%d.  %d", i, number);
            textArea.append(text + "\n");
            i++;
        }
    }

    class CancelBtnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

    public void setTextArea(JTextArea textArea){
        this.textArea = textArea;
    }

    public void setGenerateBtn(JButton generateBtn){
        this.generateBtn = generateBtn;
        this.generateBtn.addActionListener(new GenerateBtnListener());
    }

    public void setCancelBtn(JButton cancelBtn){
        this.cancelBtn = cancelBtn;
        this.cancelBtn.addActionListener(new CancelBtnListener());
    }
}
