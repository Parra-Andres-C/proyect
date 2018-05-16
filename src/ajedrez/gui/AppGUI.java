/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez.gui;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author Parra G
 */
public class AppGUI extends JFrame{
    
    /*
    private JButton buttonCounter, buttonReset;
    private JLabel labelCounter;
    
    private int counter = 0; 
    
    public AppGUI(){
        createView();
        setTitle("click me");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setResizable(false);
        
    }

    private void createView() {
        JPanel panel = new JPanel();
        getContentPane().add(panel);
        
        labelCounter = new JLabel();
        panel.add(labelCounter);
        updateCounter();    
        
        buttonCounter = new JButton("click me");
        buttonCounter.addActionListener(
                new ButtonCounterActionListener()                 
                );
        panel.add(buttonCounter);
        
        buttonReset = new JButton("reset");
        buttonReset.addActionListener(
                new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        counter = 0;
                        updateCounter();
                    }
            });
        panel.add(buttonReset);
    }

    private void updateCounter() {
        labelCounter.setText("Clicked " + counter + " times");
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
        @Override
        public void run(){
            new AppGUI().setVisible(true);
        }
    });
    }

    private class ButtonCounterActionListener implements ActionListener {
        @Override
                    public void actionPerformed(ActionEvent e) {
                        counter++;
                        updateCounter();
                    }
    }
    */
    private JButton buttonMenu, buttonRegistry;
    private JLabel labelReference;
    public AppGUI(){
        AppExec();
        setTitle("prueba menus");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    private void AppExec() {
        JPanel panel = new JPanel();
        getContentPane().add(panel);
        
        
        buttonMenu = new JButton("Menus");
        buttonMenu.addActionListener(
            new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                        //Reference("Menus");
                        Menu s = new Menu();
                        
                    }
            });
        panel.add(buttonMenu);
        
        buttonRegistry = new JButton("Registro");
        buttonRegistry.addActionListener(
            new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                        //Reference("Registro");
                        dispose();
                        RegistroFrame s = new RegistroFrame();
                        s.setVisible(true);
                    }
            });
        panel.add(buttonRegistry);
        
        labelReference = new JLabel();
        panel.add(labelReference);
        Reference("vacio");
        
    }
    public void Reference(String text){
        labelReference.setText(text);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
        @Override
        public void run(){
            new AppGUI().setVisible(true);
        }
    });
    }
}
