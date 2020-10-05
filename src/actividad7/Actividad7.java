package actividad7;
import java.util.Scanner;

public class Actividad7 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
       int valor;
        System.out.println("Ingresa un Numero");
        valor = input.nextInt();
        while (true) {
            if (valor > 0) {
                System.out.println("Números primos:");
                for (int I = 2; I <= valor; I++) {
                    int serie = 2;
                    boolean PrimoTrue = true;
                    while (PrimoTrue && serie < I) {
                    if (I % serie == 0) { PrimoTrue = false; } else { serie++; } }
                    if (PrimoTrue) {System.out.print(I + ", ");} }
                {break; }}
        else { System.out.println("Número incorrecto, ingresa otro.");}
        }
        int numero1 = 0;
        int numero2 = 1;
        int temp;
        int limite = 50000;
        System.out.println(" ");
        System.out.println("Sucesión de Fibonacci:");
        System.out.print(numero1 + ", ");
        while(numero2 + numero1 <= valor){
            temp = numero1;
            numero1 = numero2;
            numero2 = temp + numero1;
            System.out.print(numero2 +", ");}}}