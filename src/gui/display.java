package gui;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class display extends JFrame {
	
	/**
	 * 
	 */

	private static final long serialVersionUID = 1L;
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
	JButton boton14;
	Image backgroundImage;
	JPanel panel;
	
	JTextField texto1;
    JTextField texto2;
    JLabel resultado;
    JProgressBar progreso;
    
    
    String numeroActual = "";
    boolean campoActivo = false;
    char operacion = ' ';
    private JButton dividir;
    private JButton borrar;
    private JButton coma;
   
    
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
		boton14 = new JButton();
		

		texto1 = new JTextField();
        texto2 = new JTextField();
        resultado = new JLabel();
        progreso = new JProgressBar();
        
		d.setVisible(true);
		d.setBounds(400, 400, 450, 700);
		d.getContentPane().setLayout(null);
		d.setTitle("Calculadora");
		
		
		dividir = new JButton("%");
        dividir.setFont(new Font("Arial", Font.ITALIC, 20));
        dividir.setBounds(302, 360, 100, 50);
        d.getContentPane().add(dividir);
   

        borrar = new JButton("C");
        borrar.setFont(new Font("Arial", Font.ITALIC, 20));
        borrar.setBounds(302, 300, 100, 50);
        d.getContentPane().add(borrar);
        
        coma = new JButton(",");
        coma.setFont(new Font("Arial", Font.ITALIC, 20));
        coma.setBounds(302, 240, 100, 50);
        d.getContentPane().add(coma);	
		
		Font fuente = new Font("Arial", Font.ITALIC, 20);
		boton1.setFont(fuente);
		boton2.setFont(fuente);
		resultado.setFont(fuente);
		texto1.setFont(fuente);
		texto2.setFont(fuente);
		boton1.setBounds(51, 500, 100, 50);
		boton1.setText("+");
        boton2.setBounds(170, 500, 100, 50);
        boton2.setText("-");
        boton14.setText("x");
        boton14.setBounds(302, 420, 100, 50);
        boton14.setFont(fuente);
        texto1.setBounds(51, 100, 100, 30);
        texto2.setBounds(170, 100, 100, 30);
        resultado.setBounds(51, 140, 200, 30);
        progreso.setBounds(20, 20, 350, 50);
        progreso.setStringPainted(true);
        
        boton3.setFont(fuente);
        boton3.setBounds(51, 420, 100, 50);
        boton3.setText("1");
        boton4.setFont(fuente);
        boton4.setBounds(170, 420, 100, 50);
        boton4.setText("2");
        
        boton5.setFont(fuente);
        boton5.setBounds(51, 360, 100, 50);
        boton5.setText("3");
        boton6.setFont(fuente);
        boton6.setBounds(170, 360, 100, 50);
        boton6.setText("4");
        
        boton7.setFont(fuente);
        boton7.setBounds(51, 300, 100, 50);
        boton7.setText("5");
        boton8.setFont(fuente);
        boton8.setBounds(170, 300, 100, 50);
        boton8.setText("6");
        
        boton9.setFont(fuente);
        boton9.setBounds(51, 240, 100, 50);
        boton9.setText("7");
        boton10.setFont(fuente);
        boton10.setBounds(170, 240, 100, 50);
        boton10.setText("8");
        
        boton11.setFont(fuente);
        boton11.setBounds(51, 180, 100, 50);
        boton11.setText("9");
        boton12.setFont(fuente);
        boton12.setBounds(170, 180, 100, 50);
        boton12.setText("0");
        
        boton13.setFont(fuente);
        boton13.setBounds(85, 560, 150, 50);
        boton13.setText("=");
        
        
        
		
        boton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if (!campoActivo) {
                    campoActivo = true;
                    numeroActual = "";
                    operacion = '+';
                }
            	            	
            }
        });
        
        boton14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if (!campoActivo) {
                    campoActivo = true;
                    numeroActual = "";
                    operacion = '*';
                }            	            	
            }
        });
                
        boton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if (!campoActivo) {
                    campoActivo = true;
                    numeroActual = "";
                    operacion = '-';
                }            	            	
            }
        });
        
        dividir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if (!campoActivo) {
                    campoActivo = true;
                    numeroActual = "";
                    operacion = '%';
                }            	            	
            }
        });
        
        borrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
            		campoActivo=false;        	
            		texto1.setText("");
            		texto2.setText("");
            		numeroActual = "";
	                operacion = ' ';
	               
            }
        });
        
        coma.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
            		texto1.setText(numeroActual+",");
            		texto2.setText(",");

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
            	                Thread.sleep(2);
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
                    }else if(operacion=='*') {
                    	resultado1=num1*num2;
                    }else if(operacion=='%') {
                    	resultado1=num1/num2;
                    }

                    resultado.setText("Resultado: " + resultado1);
                } catch (NumberFormatException excepcion) {
                    JOptionPane.showMessageDialog(null, "Introduce un numero carajote");
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
                if (!campoActivo) {
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
        
        
		
		d.getContentPane().add(boton1);
		d.getContentPane().add(boton2);
		d.getContentPane().add(texto1);
        d.getContentPane().add(texto2);
        d.getContentPane().add(resultado);
        d.getContentPane().add(progreso);
        d.getContentPane().add(boton3);
        d.getContentPane().add(boton4);
        d.getContentPane().add(boton5);
        d.getContentPane().add(boton6);
        d.getContentPane().add(boton7);
        d.getContentPane().add(boton8);
        d.getContentPane().add(boton9);
        d.getContentPane().add(boton10);
        d.getContentPane().add(boton11);
        d.getContentPane().add(boton12);
        d.getContentPane().add(boton13);
        d.getContentPane().add(boton14);
        
        
  
        
        
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\mario\\OneDrive\\Tarea1\\img\\maldivas.jpg"));
        lblNewLabel.setBounds(0, 0, 436, 653);
        d.getContentPane().add(lblNewLabel);
        
        
        

	}
	
	
	public static void main(String[] args) {
        new display();
    }
}




