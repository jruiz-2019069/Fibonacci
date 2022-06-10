package fibonacci;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anterior = 0, actual = 1, resultado = 0;
        int contador = 0;
        System.out.println("Ingrese el número de datos que desea visualizar en pantalla.");
        int limite = sc.nextInt();
        while (contador < limite) {
            if (contador < (limite - 1)) {
                System.out.print(anterior + ", ");
                resultado = anterior + actual;
                anterior = actual;
                actual = resultado;
            }else{
                System.out.print(anterior + ". ");
            }
            contador++;
        }
    }
}
