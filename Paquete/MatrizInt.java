package Paquete;
import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Random;

public class MatrizInt extends Matriz
{
    int array[][];

    public MatrizInt(int renglones, int columnas)
    {
        super(renglones, columnas);
        array = new int[renglones][columnas];

    }
    public void iniciarMatInt()
    {
        Random gen = new Random();
        for(int i = 0; i < this.renglones; i++)
            for(int j = 0; j < this.columnas; j++)
                this.array[i][j] = (int)(gen.nextInt(10));
    }
    public void imprimirMatInt()
    {
        for(int i = 0; i < this.renglones; i++)
        {
            for (int j = 0; j < this.columnas; j++)
                System.out.println();
        }
        System.out.println();
    }
    public void imprimirMatIntG()
    {
        DecimalFormat df = new DecimalFormat("#00");
        String cadena = "";
        for(int i = 0; i < this.renglones; i++)
        {
            for(int j = 0; j < this.columnas; j++)
            {
                cadena += df.format(array[i][j]) + "\t\t";
            }
            cadena += "\n";
        }
        JOptionPane.showMessageDialog(null, cadena);
    }
}
