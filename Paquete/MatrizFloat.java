package Paquete;
import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Random;

public class MatrizFloat extends Matriz
{
    float array[][];

    public MatrizFloat(int renglones, int columnas)
    {
        super(renglones, columnas);
        array = new float[renglones][columnas];

    }
    public void iniciarMatFloat()
    {
        DecimalFormat deci = new DecimalFormat("#.00");
        Random gen = new Random();
        for(int i = 0; i < this.renglones; i++)
            for(int j = 0; j < this.columnas; j++)
                this.array[i][j] = Float.parseFloat(deci.format((gen.nextFloat()*(10-0))));
    }
    public void imprimirMatFloat()
    {
        for(int i = 0; i < this.renglones; i++) {
            for (int j = 0; j < this.columnas; j++){
                System.out.print("["+this.array[i][j]+"]");
            }
            System.out.println("");
        }
    }
}
