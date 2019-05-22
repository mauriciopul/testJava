package enunciado1;

import javax.swing.JOptionPane;

public class Enunciado1 {

    public static void main(String[] args) {

        String text = JOptionPane.showInputDialog("", null);
        String caracter = text.trim();                          //eliminamos caracteres en blanco al inicio y final
        String[] arrayCaracter = caracter.split(" ");
        int suma = 0;
        for (int i = 0; i < arrayCaracter.length; i++) {
            suma += funcionTry(arrayCaracter[i]);
        }
        System.out.println("suma: " + suma);
    }

    public static int funcionTry(String a) {
        try {
            Long num = Long.parseLong(a);       //capturamos el dato
        } catch (Exception e) {
            return 0;
        }
        return Integer.parseInt(a);
    }
}
