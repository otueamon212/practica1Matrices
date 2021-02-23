package Paquete;
public class Validaciones
{
    public static boolean ValidarCuadricula(int r1, int r2, int c1, int c2)
    {
        if((r1 == r2) && (c1 == c2))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static boolean validarMultiplicabilidad(int c1, int r2)
    {
        if(c1 == r2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
