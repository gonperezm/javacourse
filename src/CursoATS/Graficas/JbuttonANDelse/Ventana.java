package CursoATS.Graficas.JbuttonANDelse;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    public JPanel panel;
    public Ventana(){

        setDefaultCloseOperation(EXIT_ON_CLOSE); // cerrar ventana con X=exit
        setTitle("El mejor titutlo"); // titutlo de la ventana
        this.setSize(500,500); //Establecemos el tamaño de la ventana
        //setLocation(100,200); // posicion inicial de al ventana
        //setBounds(500,200,500,500); //setSize+setLocation
        setLocationRelativeTo(null); //metodo para CENTRAR ventana
        //getContentPane().setBackground(Color.blue); //setear color
        setMinimumSize(new Dimension(200,200)); //minimi size
        iniciarComponentes();
    }
    private void iniciarComponentes(){
        colocarPaneles();
        //colocarEtiquetas();
        //colocarBotones();
        //colocarRadioBotones();
        //colocarCajaTexto();
        //colocarAreaTexto();
        //colocarCasillasDeVerificacion();
        //colocarListasDesplegables();

    }


    private void colocarListasDesplegables(){
        String [] paises = {"Argentina", "Peru", "Colombia", "Paraguay"};
        JComboBox listaDesplegable1 = new JComboBox(paises);
        listaDesplegable1.setBounds(20,20,200,30);
        listaDesplegable1.addItem("Brasil"); //agregar a la lista
        listaDesplegable1.setSelectedItem("Colombia"); //seleccionar el primer objeto visto


        panel.add(listaDesplegable1);
    }

    private void colocarCasillasDeVerificacion(){

    }
    private void colocarAreaTexto(){
        JTextArea areaTexto = new JTextArea();
        areaTexto.setBounds(20,20,300,200);
        areaTexto.setText("Hola escriba aqui el texto...");
        areaTexto.append("\nEscribe por aqui...");//añade mas texto al area de texto.
        areaTexto.setEditable(true);

        System.out.println("El texto es : " + areaTexto.getText());
        panel.add(areaTexto);
    }
    private void colocarRadioBotones(){
        JRadioButton radioBoton1 = new JRadioButton("Opcion 1", true);
        radioBoton1.setBounds(50,100,200,50);
        radioBoton1.setEnabled(true);
        radioBoton1.setText("programacion");
        radioBoton1.setFont(new Font("arial",3,20));
        panel.add(radioBoton1);
        JRadioButton radioBoton2 = new JRadioButton("Opcion 2", false);
        radioBoton2.setBounds(50,150,100,50);
        panel.add(radioBoton2);
        JRadioButton radioBoton3 = new JRadioButton("Opcion 3", false);
        radioBoton3.setBounds(50,200,100,50);
        panel.add(radioBoton3);

        ButtonGroup grupoRadioBotones = new ButtonGroup();
        grupoRadioBotones.add(radioBoton1);
        grupoRadioBotones.add(radioBoton2);
        grupoRadioBotones.add(radioBoton3);
    }
    private void colocarCajaTexto(){
        JTextField cajaTexto = new JTextField();
        cajaTexto.setBounds(50,50,200,30);
        cajaTexto.setText("Hola ...");
        System.out.println("Texto en la caja" + cajaTexto.getText());
        panel.add(cajaTexto);
    }
    private void colocarBotones(){
        //boton 1 - boton de texto
        JButton boton1 = new JButton();
        boton1.setText("Click");//establece el texto del boton
        boton1.setBounds(100,100,100,40);
        boton1.setEnabled(true);//habilitado o desabilitado
        boton1.setMnemonic('a'); //alt + letra para q haga click tipo atajo
        boton1.setForeground(Color.blue);//color de la letra del boton
        boton1.setFont(new Font("arial",3,20));//caracteristicas de la fuetne del boton
        panel.add(boton1);

        //boton 2 - boton de imagen
        JButton boton2 = new JButton();
        boton2.setBounds(100,200,100,40);
        //boton2.setOpaque(true); // si es q tu version ajva no te permite cambiar fondo
        ImageIcon clickAqui = new ImageIcon("botonClick.png");
        boton2.setIcon(new ImageIcon(clickAqui.getImage().getScaledInstance(boton2.getWidth(),boton2.getHeight(),Image.SCALE_SMOOTH)));
        //boton2.setBackground(Color.BLUE); //establecemos el color de fondod del boton
        panel.add(boton2);

        //boton3 . botones de bordes
        JButton boton3 = new JButton();
        boton3.setBounds(100,300,110,50);
        boton3.setBorder(BorderFactory.createLineBorder(Color.green,4, false));
        panel.add(boton3);

    }
    private void colocarPaneles(){
        panel = new JPanel(); //Creacion de un panel
        this.getContentPane().add(panel);//agregamos el panel en la ventana
        //panel.setBackground(Color.green);
        panel.setLayout(null);//Desactivando el diseño
    }
    private void colocarEtiquetas(){
        JLabel etiqueta = new JLabel("Hola", SwingConstants.CENTER); //creamos una etiqueta y centramos

        //etiqueta.setText("Hola");//establecemos el texto de la etiqueta
        //etiqueta.setHorizontalAlignment(SwingConstants.CENTER);//centrar.
        etiqueta.setBounds(10,10,100,40); //necesita setear el layout a NULL

        etiqueta.setForeground(Color.white); //color de la letra de la etiqueta
        etiqueta.setBackground(Color.black);//cambiar el color de la etiqueta
        etiqueta.setOpaque(true);//dando permiso de pintar fondo etiqueta
        etiqueta.setFont(new Font("cooper black",Font.BOLD,30));//establecemos la fuente del texto, en el parametro 2, podes cambiarlo por 0 1 2 3.. para bold plaid, italic o ocmbinado
        panel.add(etiqueta); //agregar etiqueta al panel

        //etiqueta 2 - etiqueta tipo imagen
        ImageIcon imagen = new ImageIcon("balonMundial.jpg");
        JLabel etiqueta2 = new JLabel();
        etiqueta2.setBounds(10,80,300,200);
        etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(),etiqueta2.getHeight(),Image.SCALE_SMOOTH)));
        panel.add(etiqueta2);
    }
}
