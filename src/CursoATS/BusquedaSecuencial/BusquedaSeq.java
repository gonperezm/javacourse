package CursoATS.BusquedaSecuencial;

import javax.swing.*;

public class BusquedaSeq {
    public static void main(String[] args) {
        int tabla[] = {4, 1, 5, 3, 2};
        int dato;
        boolean band = false;

        dato = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero a buscar: "));


        int i = 0;
        while (i < 5 && band == false) ;
        if (tabla[i] == dato) {
            band = true;
        }
            i++;
        if(band == false){
            Integer.parseInt(JOptionPane.showInputDialog("el numero no se encuentra en el array: "));
        }
        else{
            Integer.parseInt(JOptionPane.showInputDialog("el numeor ha sido encontrado en la posicion: " + (i-1)));
        }
    }
}
