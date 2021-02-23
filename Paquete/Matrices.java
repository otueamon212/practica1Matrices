package Paquete;
public class Matrices
{
    public static void main(String args[])
    {
        int renglones1=0,columnas1=0;
        int renglones2=0,columnas2=0;
        boolean fi,ff,fd;
        Menu men = new Menu();
        int respuesta1,respuesta2;
        respuesta1 = men.mostrarMenu();
        switch (respuesta1){
            //enteros
            case 1:
                MatrizInt m1 = new MatrizInt(CapturaEntrada.capturarEntero("Numero renglones"), CapturaEntrada.capturarEntero("Numero columnas"));
                MatrizInt m2 = new MatrizInt(CapturaEntrada.capturarEntero("Numero renglones"), CapturaEntrada.capturarEntero("Numero columnas"));
                m1.iniciarMatInt();
                System.out.println("Matriz 1: ");
                m1.imprimirMatInt();
                m2.iniciarMatInt();
                System.out.println("Matriz 2: ");
                m2.imprimirMatIntG();
                renglones1 = m1.getRenglones();
                renglones2 = m2.getRenglones();
                columnas1 = m1.getColumnas();
                columnas2 = m2.getColumnas();
                fi = true;
                break;
            //flotante
            case 2:
                MatrizFloat m3 = new MatrizFloat(CapturaEntrada.capturarEntero("Numero renglones"), CapturaEntrada.capturarEntero("Numero columnas"));
                MatrizFloat m4 = new MatrizFloat(CapturaEntrada.capturarEntero("Numero renglones"), CapturaEntrada.capturarEntero("Numero columnas"));
                m3.iniciarMatFloat();
                System.out.println("Matriz 1: ");
                m3.imprimirMatFloat();
                m4.iniciarMatFloat();
                System.out.println("Matriz 2: ");
                m4.imprimirMatFloat();
                renglones1 = m3.getRenglones();
                renglones2 = m3.getRenglones();
                columnas1 = m4.getColumnas();
                columnas2 = m4.getColumnas();
                ff = true;
                break;
            //doble
            case 3:
                MatrizDouble m5 = new MatrizDouble(CapturaEntrada.capturarEntero("Numero renglones"), CapturaEntrada.capturarEntero("Numero columnas"));
                MatrizDouble m6 = new MatrizDouble(CapturaEntrada.capturarEntero("Numero renglones"), CapturaEntrada.capturarEntero("Numero columnas"));
                m5.iniciarMatDouble();
                System.out.println("Matriz 1: ");
                m5.imprimirMatDouble();
                m6.iniciarMatDouble();
                System.out.println("Matriz 2: ");
                m6.imprimirMatDouble();
                renglones1 = m5.getRenglones();
                renglones2 = m5.getRenglones();
                columnas1 = m6.getColumnas();
                columnas2 = m6.getColumnas();
                fd = true;
                break;
        }
        MatrizInt m1;
        MatrizInt m2;
        MatrizFloat m3;
        MatrizFloat m4;
        MatrizDouble m5;
        MatrizDouble m6;
        MatrizInt m7;
        MatrizFloat m8;
        MatrizDouble m9;
        respuesta2 = men.mostrarFuncion();
        switch (respuesta2){
            case 1:
                switch (respuesta1){
                    case 1:
                        //Suma de matrices
                        if(Validaciones.ValidarCuadricula(renglones1,renglones2, columnas1,columnas2)) {
                            m7 = new MatrizInt(m1.getRenglones(), m1.getColumnas());
                            m7 = OperacionesMatrices.sumarMatInt(m1, m2);
                            System.out.println("Matriz 3 = Matriz * Matriz 2");
                            m7.imprimirMatInt();
                            m7.imprimirMatIntG();
                        }
                        else System.out.println("No son sumables/restables");
                        break;
                    case 2:
                        if(Validaciones.ValidarCuadricula(renglones1,renglones2, columnas1,columnas2)) {
                            m8 = new MatrizFloat(m3.getRenglones(), m3.getColumnas());
                            m8 = OperacionesMatrices.sumarMatFloat(m3, m4);
                            System.out.println("Matriz 3 = Matriz * Matriz 2");
                            m8.imprimirMatFloat();
                        }
                        else System.out.println("No son sumables/restables");
                        break;
                    case 3:
                        if(Validaciones.ValidarCuadricula(renglones1,renglones2, columnas1,columnas2))
                        {
                            m9 = new MatrizDouble(m5.getRenglones(), m6.getColumnas());
                            m9 = OperacionesMatrices.sumarMatDouble(m5, m6);
                            System.out.println("Matriz 3 = Matriz * Matriz 2");
                            m9.imprimirMatDouble();
                            m9.imprimirMatDouble();
                        }
                        else System.out.println("No son sumables/restables");
                        break;
                }
                break;
            //resta de matrices
            case 2:
                switch (respuesta1){
                    case 1:
                        if(Validaciones.ValidarCuadricula(renglones1,renglones2, columnas1,columnas2)) {
                            m7 = new MatrizInt(m1.getRenglones(), m1.getColumnas());
                            m7 = OperacionesMatrices.restarMatInt(m1, m2);
                            System.out.println("Matriz 3 = Matriz * Matriz 2");
                            m7.imprimirMatInt();
                            m7.imprimirMatIntG();
                        }
                        else System.out.println("No son sumables/restables");
                        break;
                    case 2:
                        if(Validaciones.ValidarCuadricula(renglones1,renglones2, columnas1,columnas2)) {
                            m8 = new MatrizFloat(m3.getRenglones(), m3.getColumnas());
                            m8 = OperacionesMatrices.restarMatFloat(m3, m4);
                            System.out.println("Matriz 3 = Matriz * Matriz 2");
                            m8.imprimirMatFloat();
                        }
                        else System.out.println("No son sumables/restables");
                        break;
                    case 3:
                        if(Validaciones.ValidarCuadricula(renglones1,renglones2, columnas1,columnas2)) {
                        m9 = new MatrizDouble(m5.getRenglones(), m6.getColumnas());
                        m9 = OperacionesMatrices.restarMatDouble(m5, m6);
                        System.out.println("Matriz 3 = Matriz * Matriz 2");
                        m9.imprimirMatDouble();
                        m9.imprimirMatDouble();
                    }
                    else System.out.println("No son sumables/restables");
                        break;
                }
                break;
            //multiplicacion de matrices
            case 3:
                switch (respuesta1){
                    case 1:
                        if(Validaciones.validarMultiplicabilidad(columnas1, renglones2)) {
                            m7 = new MatrizInt(m1.getRenglones(), m1.getColumnas());
                            m7 = OperacionesMatrices.multiplicarMatInt(m1, m2);
                            System.out.println("Matriz 3 = Matriz * Matriz 2");
                            m7.imprimirMatInt();
                            m7.imprimirMatIntG();
                        }
                        else System.out.println("No son sumables/restables");
                        break;
                    case 2:
                        if(Validaciones.validarMultiplicabilidad(columnas1, renglones2)) {
                            m8 = new MatrizFloat(m3.getRenglones(), m3.getColumnas());
                            m8 = OperacionesMatrices.multiplicarMatFloat(m3, m4);
                            System.out.println("Matriz 3 = Matriz * Matriz 2");
                            m8.imprimirMatFloat();
                        }
                        else System.out.println("No son sumables/restables");
                        break;
                    case 3:
                        if(Validaciones.validarMultiplicabilidad(columnas1, renglones2)) {
                            m9 = new MatrizDouble(m5.getRenglones(), m6.getColumnas());
                            m9 = OperacionesMatrices.multiplicarMatDouble(m5, m6);
                            System.out.println("Matriz 3 = Matriz * Matriz 2");
                            m9.imprimirMatDouble();
                            m9.imprimirMatDouble();
                        }
                        else System.out.println("No son sumables/restables");
                        break;
                }
                break;
            //Traspuesta
            case 4:
                switch (respuesta1){
                    case 1:
                        m7 = OperacionesMatrices.transpornerMatInt(m1);
                        System.out.println("Traspuesta Matriz 1: ");
                        m7.imprimirMatIntG();
                        break;
                    case 2:
                        m8 = OperacionesMatrices.transpornerMatFloat(m3);
                        System.out.println("Traspuesta Matriz 1: ");
                        m8.imprimirMatFloat();
                        break;
                    case 3:
                        m9 = OperacionesMatrices.transpornerMatDouble(m5);
                        System.out.println("Traspuesta Matriz 1: ");
                        m9.imprimirMatDouble();
                        break;
                }
                break;
        }
    }

}
