package Paquete;
public class OperacionesMatrices
{
    public static MatrizInt transpornerMatInt(MatrizInt m1)
    {
        MatrizInt matTransp = new MatrizInt(m1.getColumnas(), m1.getRenglones());
        for(int i = 0; i < m1.renglones; i++)
        {
            for(int j = 0; j < m1.columnas; j++)
            {
                matTransp.array[j][i] = m1.array[i][j];
            }
        }
        return matTransp;
    }

    public static MatrizInt sumarMatInt(MatrizInt m1, MatrizInt m2)
    {
        MatrizInt matResult = new MatrizInt(m1.getRenglones(), m2.getColumnas());
        for(int i = 0; i < matResult.array.length; i++)
        {
            for(int j = 0; j < matResult.array[i].length; j++)
            {
                matResult.array[i][j] = m1.array[i][j] + m2.array[i][j];
            }
        }
        return matResult;
    }
    public static MatrizInt restarMatInt(MatrizInt m1, MatrizInt m2)
    {
        MatrizInt matResult = new MatrizInt(m1.getRenglones(), m2.getColumnas());
        for(int i = 0; i < matResult.array.length; i++)
        {
            for(int j = 0; j < matResult.array[i].length; j++)
            {
                matResult.array[i][j] = m1.array[i][j] - m2.array[i][j];
            }
        }
        return matResult;
    }
    public static MatrizInt multiplicarMatInt(MatrizInt m1, MatrizInt m2)
    {
        MatrizInt matResult = new MatrizInt(m1.getRenglones(), m2.getColumnas());
        for(int i = 0; i < matResult.array.length; i++)
        {
            for(int j = 0; j < matResult.array[i].length; i++)
            {
                for(int k = 0; k < m1.array[0].length; k++)
                {
                    matResult.array[i][j] += m1.array[i][j] * m2.array[k][j];
                }
            }
        }
        return matResult;
    }

    public static MatrizFloat transpornerMatFloat(MatrizFloat m3)
    {
        MatrizFloat matTransp = new MatrizFloat(m3.getColumnas(), m3.getRenglones());
        for(int i = 0; i < m3.renglones; i++)
        {
            for(int j = 0; j < m3.columnas; j++)
            {
                matTransp.array[j][i] = m3.array[i][j];
            }
        }
        return matTransp;
    }

    public static MatrizFloat sumarMatFloat(MatrizFloat m3, MatrizFloat m4)
    {
        MatrizFloat matResult = new MatrizFloat(m3.getRenglones(), m4.getColumnas());
        for(int i = 0; i < matResult.array.length; i++)
        {
            for(int j = 0; j < matResult.array[i].length; j++)
            {
                matResult.array[i][j] = m3.array[i][j] + m4.array[i][j];
            }
        }
        return matResult;
    }
    public static MatrizFloat restarMatFloat(MatrizFloat m3, MatrizFloat m4)
    {
        MatrizFloat matResult = new MatrizFloat(m3.getRenglones(), m4.getColumnas());
        for(int i = 0; i < matResult.array.length; i++)
        {
            for(int j = 0; j < matResult.array[i].length; j++)
            {
                matResult.array[i][j] = m3.array[i][j] - m4.array[i][j];
            }
        }
        return matResult;
    }
    public static MatrizFloat multiplicarMatFloat(MatrizFloat m3, MatrizFloat m4)
    {
        MatrizFloat matResult = new MatrizFloat(m3.getRenglones(), m4.getColumnas());
        for(int i = 0; i < matResult.array.length; i++)
        {
            for(int j = 0; j < matResult.array[i].length; i++)
            {
                for(int k = 0; k < m3.array[0].length; k++)
                {
                    matResult.array[i][j] += m3.array[i][j] * m4.array[k][j];
                }
            }
        }
        return matResult;
    }

    public static MatrizDouble transpornerMatDouble(MatrizDouble m5)
    {
        MatrizDouble matTransp = new MatrizDouble(m5.getColumnas(), m5.getRenglones());
        for(int i = 0; i < m5.renglones; i++)
        {
            for(int j = 0; j < m5.columnas; j++)
            {
                matTransp.array[j][i] = m5.array[i][j];
            }
        }
        return matTransp;
    }

    public static MatrizDouble sumarMatDouble(MatrizDouble m5, MatrizDouble m6)
    {
        MatrizDouble matResult = new MatrizDouble(m5.getRenglones(), m6.getColumnas());
        for(int i = 0; i < matResult.array.length; i++)
        {
            for(int j = 0; j < matResult.array[i].length; j++)
            {
                matResult.array[i][j] = m5.array[i][j] + m6.array[i][j];
            }
        }
        return matResult;
    }
    public static MatrizDouble restarMatDouble(MatrizDouble m5, MatrizDouble m6)
    {
        MatrizDouble matResult = new MatrizDouble(m5.getRenglones(), m6.getColumnas());
        for(int i = 0; i < matResult.array.length; i++)
        {
            for(int j = 0; j < matResult.array[i].length; j++)
            {
                matResult.array[i][j] = m5.array[i][j] - m6.array[i][j];
            }
        }
        return matResult;
    }
    public static MatrizDouble multiplicarMatDouble(MatrizInt m5, MatrizInt m6)
    {
        MatrizDouble matResult = new MatrizDouble(m5.getRenglones(), m6.getColumnas());
        for(int i = 0; i < matResult.array.length; i++)
        {
            for(int j = 0; j < matResult.array[i].length; i++)
            {
                for(int k = 0; k < m5.array[0].length; k++)
                {
                    matResult.array[i][j] += m5.array[i][j] * m6.array[k][j];
                }
            }
        }
        return matResult;
    }

}
