package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class display extends JFrame {
	
	JFrame d;
	JButton boton1;
	JButton boton2;
	JTextField texto1;
    JTextField texto2;
    JLabel resultado;
	
	public display() {
		d= new JFrame();
		boton1 = new JButton();
		boton2 = new JButton();
		texto1 = new JTextField();
        texto2 = new JTextField();
        resultado = new JLabel();
        
		d.setVisible(true);
		d.setBounds(400, 400, 400, 400);
		d.setLayout(null);
		d.setTitle("Calculadora");
		d.getContentPane().setBackground(Color.gray);
		
		
		Font fuente = new Font("Arial", Font.PLAIN, 24);
		boton1.setFont(fuente);
		boton2.setFont(fuente);
		resultado.setFont(fuente);
		texto1.setFont(fuente);
		texto2.setFont(fuente);
		boton1.setBounds(100, 300, 100, 50);
		boton1.setText("+");
        boton2.setBounds(220, 300, 100, 50);
        boton2.setText("-");
        texto1.setBounds(100, 100, 100, 30);
        texto2.setBounds(220, 100, 100, 30);
        resultado.setBounds(100, 150, 200, 30);
		
		
        boton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
            	String textoEntrada1 = texto1.getText();
            	String textoEntrada2 = texto2.getText();
            	double num1= Double.parseDouble(textoEntrada1);
            	double num2= Double.parseDouble(textoEntrada2);
            	double resultado1 = num1+num2;
            	
            	resultado.setText("Resultado: " + resultado1);
            	
            }
        });
        
        
        boton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
            	String textoEntrada1 = texto1.getText();
            	String textoEntrada2 = texto2.getText();
            	double num1= Double.parseDouble(textoEntrada1);
            	double num2= Double.parseDouble(textoEntrada2);
            	double resultado2 = num1-num2;
            	
            	resultado.setText("Resultado: " + resultado2);
            	
            }
        });
        
        
		
		
		
		d.add(boton1);
		d.add(boton2);
		d.add(texto1);
        d.add(texto2);
        d.add(resultado);
	}
	public static void main(String[] args) {
        new display();
    }
}

