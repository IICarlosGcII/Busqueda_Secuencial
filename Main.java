import javax.swing.*;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[], nEelementos, dato; //Instanciamos las variables junto con el arreglo correspondiente
        boolean band = false;

        nEelementos = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de elementos del arreglo: ")); //Usamos ventanas emergentes para pedir datos
        arreglo = new int[nEelementos]; //Creamos el arreglo con la cantidad N de elementos ingresados

        for (int i = 0; i < nEelementos; i++) { //Pedimos y guardamos los datos dela arreglo mediante connsola
            System.out.println("Digite los numeros del arreglo: ");
            arreglo[i] = entrada.nextInt(); //Guardamos los datos en el arreglo mediante consola
        }

        System.out.println("Digite el numero que quiere buscar: ");
        dato = entrada.nextInt(); //Numero a buscar guardado en la variable dato

        int i = 0; //Iniciamos el iterador del while
        while (i < nEelementos && band == false) { //Hacemos la logica, si i es menor a nElemetos y band es falso
            if (arreglo[i] == dato) {//Se pregunta, el dato del arreglo es igual al dato ingresado?
                band = true; //Band es verdadro, salimos del while
            }
            i++; //Iteramos mas 1 para que siga avanzando hasta ser el maximo menor que el numero de elementos, nElementos
        }

        if (band == false) { //Si band es falso, quiere decirq que no encontro el dato pedido
            System.out.println("El numero no se encuentra en el arreglo: ");

        } else { //Caso contrario es verdadero, o sea si encontro el dato pedido en la posicion i-1 debido a que el while aumenta una pos
            System.out.println("El numero ha sido encontrado en la posicion: " + (i - 1));
        }
    }
}
