package enunciado2;

import javax.swing.JOptionPane;

public class Enunciado2 {

    public static boolean esMayuscula(String s) {
        return s.equals(s.toUpperCase());
    }

    public static void main(String[] args) {

        String a;
        boolean sw = false;//swiche para controlar la cantidad de frases
        int contC = 0;
        int contI = 0;
        int contD = 0;
        int contE = 0;
        int contN = 0;
        int contT = 0;
        int j, k = 0;
        int cantEntradas;

        

        while (sw == false) {//este while controla que se deba ingresar números y no permite salir hasta lograrlo.
            try {//captura el error si el dato ingresado no es número
                int b = 0;
                int cant = Integer.parseInt(a = JOptionPane.showInputDialog("Ingrese la cantidad de frases"));
                if (b == 0) {//control para imprimir la cantidad de entradas
                    System.out.println("Entradas:" + cant);
                    b++;
                }

                int simil = 0;//contador para comparar cantidad de veces la letra E por ser la única que se repite
                for (int i = 1; i <= cant; i++) {
                    boolean paso1 = false;//Swiche controla ingreso de cantidad de caracteres correcta

                    while (paso1 == false) {//Control para ingresar una frase correctamente
                        String frase = JOptionPane.showInputDialog("Ingrese la frase " + i);
                        System.out.println(frase);
                        if (frase.length() < 1 || frase.length() > 1000) {
                            paso1 = false;
                            JOptionPane.showMessageDialog(null, "Los caracteres deben estar entre '1' y 1000'");
                        } else {
//aca va el algoritmo que analiza la frase y la compara
//-----------------------------------------------------------------------------------------------

                            if (esMayuscula(frase) == false) {
                                JOptionPane.showMessageDialog(null, "Caracteres deben ser MAYUSCULA");
                            } else {
                                //Busca la palabra 'C' en la cadena y la cuenta
                                String C = "C";
                                for (int m = 0; m < C.length(); m++) {
                                    char pos1 = C.charAt(m);//posiciona el caracter recorrido en el ciclo 
                                    for (int x = 0; x < frase.length(); x++) {
                                        char letra = frase.charAt(x);
                                        if (letra == pos1) {
                                            contC++;//almacena cantidad de repeticiones
                                        }
                                    }
                                }
                                //Busca la palabra 'I' en la cadena y la cuenta
                                String I = "I";
                                for (int m = 0; m < I.length(); m++) {
                                    char pos1 = I.charAt(m);
                                    for (int x = 0; x < frase.length(); x++) {
                                        char letra = frase.charAt(x);
                                        if (letra == pos1) {
                                            contI++;
                                        }
                                    }
                                }
                                //Busca la palabra 'D' en la cadena y la cuenta
                                String D = "D";
                                for (int m = 0; m < D.length(); m++) {
                                    char pos1 = D.charAt(m);
                                    for (int x = 0; x < frase.length(); x++) {
                                        char letra = frase.charAt(x);
                                        if (letra == pos1) {
                                            contD++;
                                        }
                                    }
                                }
                                //Busca la palabra 'E' en la cadena y la cuenta
                                String E = "E";
                                for (int m = 0; m < E.length(); m++) {
                                    char pos1 = E.charAt(m);
                                    for (int x = 0; x < frase.length(); x++) {
                                        char letra = frase.charAt(x);
                                        if (letra == pos1) {
                                            contE++;
                                        }
                                    }
                                }
                                //Busca la palabra 'N' en la cadena y la cuenta
                                String N = "N";
                                for (int m = 0; m < N.length(); m++) {
                                    char pos1 = N.charAt(m);
                                    for (int x = 0; x < frase.length(); x++) {
                                        char letra = frase.charAt(x);
                                        if (letra == pos1) {
                                            contN++;
                                        }
                                    }
                                }
                                //Busca la palabra 'T' en la cadena y la cuenta
                                String T = "T";
                                for (int m = 0; m < T.length(); m++) {
                                    char pos1 = T.charAt(m);
                                    for (int x = 0; x < frase.length(); x++) {
                                        char letra = frase.charAt(x);
                                        if (letra == pos1) {
                                            contT++;
                                        }
                                    }
                                }
                                paso1 = true;
                            }
//-----------------------------------------------------------------------------------------------
//Aca finaliza el altoritmo que analiza la frase y la compara                           
                        }
                    }//fin de cada frase

                    int contadores[] = {contC, contI, contD, contE, contN, contT};//acumulo los contadores
//reviso cual es el menor
                    int menor = 9999;
                    for (int x = 0; x < contadores.length; x++) {
                        if (menor > contadores[x]) {
                            menor = contadores[x];
                        }
                    }

//contar la cantidad de similitudes en la palabra
                    if ((menor * 2) <= contE) {
                        simil = menor;
                    }

                    j = simil;
                    k = j - k;

                    System.out.println(i + ":" + k);
                    k = j;

                    sw = true;
                }

                //System.out.println("Entradas" + cant);
                cantEntradas = cant;
            } catch (Exception e) {
                sw = false;
                JOptionPane.showMessageDialog(null, "Debe ingresar un valor numérico");
            } finally {
                //System.out.println("Entradas:"+cant);
            }
        }
    }
}
