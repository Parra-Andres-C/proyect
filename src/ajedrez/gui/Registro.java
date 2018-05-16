/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez.gui;
import ajedrez.Info.*;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author Parra G
 */
public class Registro extends JFrame{
    //****PRUEBA DE GUI PARA REGISTRO(VIEJO, NO SIRVE, NO BORRAR)****
    private JTextField textField;
    private JLabel label;
    private JButton submit;
        
    public Registro(){
        field();
        setTitle("registro");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    private void field() {
        JPanel panel = new JPanel();
        getContentPane().add(panel);
        
        label = new JLabel("ingrese los siguientes datos");
        panel.add(label);
        
        JLabel  label2 = new JLabel("nombre: ");
        panel.add(label2);
        
        textField = new JTextField();
        textField.setPreferredSize(new Dimension(150, 30));
        panel.add(textField);
        
        submit = new JButton("submit");
        
        panel.add(submit);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
        @Override
        public void run(){
            new Registro().setVisible(true);
        }
    });
    }
}
