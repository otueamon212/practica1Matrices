package Paquete;
import java.util.Scanner;

public class Menu {
    public int mostrarMenu(){
        System.out.println("Elije la opcion que deseas\n");
        System.out.println("1.Calcular Matrices Enteros.\n");
        System.out.println("2. Calcular Matrices con puntos decimales\n");
        System.out.println("3. Calcular Matrices con puntos decimales precisos\n");
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }
    public int mostrarFuncion(){
        System.out.println(". Binarias(se usan las 2 matrices)\n");
        System.out.println("1. Suma de Matrices\n");
        System.out.println("2. Resta de Matrices\n");
        System.out.println("3. Multiplicacion de matrices\n");
        System.out.println("Unarias(se usa la primera matriz)\n");
        System.out.println("4. Transpuesta de una matriz\n");
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }
}
