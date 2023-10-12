package CursoATS.Graficas.interfaces;

import javax.swing.*;
import java.awt.event.*;

public class Ventana extends JFrame{
    private JPanel panel;
    private JButton boton;
    private JLabel saludo;
    private JTextArea areaTexto;
    private JTextField cajaTexto;


    public Ventana(){
        setBounds(50,50,500,500);
        setTitle("Eventos");
        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private void iniciarComponentes() {
        colocarPanel();
        //colocarEtiqueta();
        colocarCajaTexto();
        colocarAreaTexto();
        //colocarBoton();
    }

    private void colocarPanel(){
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);
    }

    private void colocarEtiqueta(){
        JLabel etiqueta = new JLabel("Ingrese su nombre");
        etiqueta.setBounds(30,10,200,30);
        panel.add(etiqueta);
    }

    private void colocarCajaTexto(){
        cajaTexto =new JTextField();
        cajaTexto.setBounds(20,30,150,30);
        panel.add(cajaTexto);

        eventosDelTeclado();

    }


    private void colocarAreaTexto(){
        areaTexto = new JTextArea();
        areaTexto.setBounds(230,30,200,300);
        panel.add(areaTexto);
    }

    private void eventosDelTeclado(){
        KeyListener eventoTeclado = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                //areaTexto.append("keyTyped\n");
            }
            @Override
            public void keyPressed(KeyEvent e) {
                //areaTexto.append("keyPressed\n");
            }
            @Override
            public void keyReleased(KeyEvent e) {
                //areaTexto.append("keyReleased\n");
                if(e.getKeyChar() =='p'){
                    areaTexto.append("Letra p\n");
                }
                if(e.getKeyChar() =='\n'){
                    areaTexto.append("Enter\n");
                }
                if(e.getKeyChar() ==' '){
                    areaTexto.append("Espacio\n");
                }
            }
        };
        cajaTexto.addKeyListener(eventoTeclado);
    }





    private void colocarBoton() {
        boton = new JButton("Pulsa aqui!");
        boton.setBounds(150, 350, 150, 40);
        panel.add(boton);
        //eventoOyenteDeAccion();
        //eventoOyenteDeRaton();
    }


    private void eventoOyenteDeRaton(){
        //agregando oyente de Raton - mouseListener
        MouseListener oyenteDeRaton = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                areaTexto.append("mouseClicked\n");
            }
            @Override
            public void mousePressed(MouseEvent e) {
                areaTexto.append("mousePressed\n");
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                areaTexto.append("mouseReleased\n");
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                areaTexto.append("mouseEntered\n");
            }
            @Override
            public void mouseExited(MouseEvent e) {
                areaTexto.append("mouseExited\n");
            }
        };

        boton.addMouseListener(oyenteDeRaton);


    }

    private void eventoOyenteDeAccion(){
        ActionListener oyenteDeAccion = new  ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                saludo.setText("Hola "+cajaTexto.getText());
            }
        };
        boton.addActionListener(oyenteDeAccion);
    }
}
