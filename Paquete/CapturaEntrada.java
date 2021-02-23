package Paquete;
import java.util.Scanner;

public class CapturaEntrada
{
    public static int capturarEntero(String msg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print(""+msg+":");
        return(sc.nextInt());
    }
}
