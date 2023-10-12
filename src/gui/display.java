package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;

public class display extends JFrame {
	
	JFrame d;
	JButton boton1;
	JButton boton2;	
	JButton boton3;	
	JButton boton4;
	JButton boton5;
	JButton boton6;
	JButton boton7;
	JButton boton8;
	JButton boton9;
	JButton boton10;
	JButton boton11;
	JButton boton12;
	JButton boton13;
	
	
	JTextField texto1;
    JTextField texto2;
    JLabel resultado;
    JProgressBar progreso;
    
    String numeroActual = "";
    boolean segundonumero = false;
    char operacion = ' ';
    
	public display() {
		d= new JFrame();
		boton1 = new JButton();
		boton2 = new JButton();		
		boton3 = new JButton();		
		boton4 = new JButton();
		boton5 = new JButton();
		boton6 = new JButton();
		boton7 = new JButton();
		boton8 = new JButton();
		boton9 = new JButton();
		boton10 = new JButton();
		boton11 = new JButton();
		boton12 = new JButton();
		boton13 = new JButton();

		
		texto1 = new JTextField();
        texto2 = new JTextField();
        resultado = new JLabel();
        progreso = new JProgressBar();
        
		d.setVisible(true);
		d.setBounds(400, 400, 450, 700);
		d.setLayout(null);
		d.setTitle("Calculadora");
		d.getContentPane().setBackground(Color.gray);
		
		
		Font fuente = new Font("Arial", Font.PLAIN, 20);
		boton1.setFont(fuente);
		boton2.setFont(fuente);
		resultado.setFont(fuente);
		texto1.setFont(fuente);
		texto2.setFont(fuente);
		boton1.setBounds(100, 500, 100, 50);
		boton1.setText("+");
        boton2.setBounds(220, 500, 100, 50);
        boton2.setText("-");
        texto1.setBounds(100, 100, 100, 30);
        texto2.setBounds(220, 100, 100, 30);
        resultado.setBounds(100, 150, 200, 30);
        progreso.setBounds(20, 20, 350, 50);
        progreso.setStringPainted(true);
        
        boton3.setFont(fuente);
        boton3.setBounds(100, 420, 100, 50);
        boton3.setText("1");
        boton4.setFont(fuente);
        boton4.setBounds(220, 420, 100, 50);
        boton4.setText("2");
        
        boton5.setFont(fuente);
        boton5.setBounds(100, 360, 100, 50);
        boton5.setText("3");
        boton6.setFont(fuente);
        boton6.setBounds(220, 360, 100, 50);
        boton6.setText("4");
        
        boton7.setFont(fuente);
        boton7.setBounds(100, 300, 100, 50);
        boton7.setText("5");
        boton8.setFont(fuente);
        boton8.setBounds(220, 300, 100, 50);
        boton8.setText("6");
        
        boton9.setFont(fuente);
        boton9.setBounds(100, 240, 100, 50);
        boton9.setText("7");
        boton10.setFont(fuente);
        boton10.setBounds(220, 240, 100, 50);
        boton10.setText("8");
        
        boton11.setFont(fuente);
        boton11.setBounds(100, 180, 100, 50);
        boton11.setText("9");
        boton12.setFont(fuente);
        boton12.setBounds(220, 180, 100, 50);
        boton12.setText("0");
        
        boton13.setFont(fuente);
        boton13.setBounds(145, 560, 150, 50);
        boton13.setText("=");
        
       
		
        boton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if (!segundonumero) {
                    segundonumero = true;
                    numeroActual = "";
                    operacion = '+';
                }
            	            	
            }
        });
        
                
        boton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if (!segundonumero) {
                    segundonumero = true;
                    numeroActual = "";
                    operacion = '-';
                }
            	            	
            }
        });
        
        boton13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
            	Thread barra = new Thread() {
            	    public void run() {
            	        int i;
            	        for (i = 0; i <= 100; i++) {
            	            progreso.setValue(i);

            	            try {
            	                Thread.sleep(3);
            	            } catch (InterruptedException e1) {
            	                e1.printStackTrace();
            	            }
            	        }
            	
            	try {
                    double num1 = Double.parseDouble(texto1.getText());
                    double num2 = Double.parseDouble(texto2.getText());
                    double resultado1=0;
                    
                    if(operacion=='+') {
                    	resultado1=num1+num2;
                    }else if(operacion=='-') {
                    	resultado1=num1-num2;
                    }

                    resultado.setText("Resultado: " + resultado1);
                } catch (NumberFormatException excepcion) {
                    resultado.setText("Introduce un número válido en ambos campos");
                }
            	    
            	    }
            	};
            	barra.start();

            }
        });
       
        ActionListener numeroListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	JButton source = (JButton) e.getSource();
                String numero = source.getText();
                numeroActual += numero;
                if (!segundonumero) {
                    texto1.setText(numeroActual);
                } else {
                    texto2.setText(numeroActual);
                }
            	
            }
        };

        boton3.addActionListener(numeroListener);
        boton4.addActionListener(numeroListener);
        boton5.addActionListener(numeroListener);
        boton6.addActionListener(numeroListener);
        boton7.addActionListener(numeroListener);
        boton8.addActionListener(numeroListener);
        boton9.addActionListener(numeroListener);
        boton10.addActionListener(numeroListener);
        boton11.addActionListener(numeroListener);
        boton12.addActionListener(numeroListener);
        
        
		
		d.add(boton1);
		d.add(boton2);
		d.add(texto1);
        d.add(texto2);
        d.add(resultado);
        d.add(progreso);
        d.add(boton3);
        d.add(boton4);
        d.add(boton5);
        d.add(boton6);
        d.add(boton7);
        d.add(boton8);
        d.add(boton9);
        d.add(boton10);
        d.add(boton11);
        d.add(boton12);
        d.add(boton13);        
	}
	public static void main(String[] args) {
        new display();
    }
}



/*
Thread barra = new Thread() {
    public void run() {
        int i;
        for (i = 0; i <= 100; i++) {
            progreso.setValue(i);

            try {
                Thread.sleep(3);
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
        }
        
        
        
    }
};
barra.start();
*/
