package Paquete;
import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Random;

public class MatrizDouble extends Matriz
{
    double array[][];

    public MatrizDouble(int renglones, int columnas)
    {
        super(renglones, columnas);
        array = new double[renglones][columnas];

    }
    public void iniciarMatDouble()
    {
        DecimalFormat deci = new DecimalFormat("#.000000");
        Random gen = new Random();
        for(int i = 0; i < this.renglones; i++)
            for(int j = 0; j < this.columnas; j++)
                this.array[i][j] = Double.parseDouble(deci.format((gen.nextFloat()*(10-0))));
    }
    public void imprimirMatDouble()
    {
        for(int i = 0; i < this.renglones; i++) {
            for (int j = 0; j < this.columnas; j++){
                System.out.print("["+this.array[i][j]+"]");
            }
            System.out.println("");
        }
    }
}
