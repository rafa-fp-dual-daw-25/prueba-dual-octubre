
public class Main {
    public static void main(String[] args) {
        //Llamadas a la funciones

        letraNota(7);
        //System.out.println(letraNota(7));

        esMultiplo(9, 3);
        //System.out.println(esMultiplo(9, 3));

        factorial(5);
        //System.out.println(factorial(5));

        int[] positivos = {1, 3, 4,};
        sumarPositivos(positivos);

        double[] notas = {4.5, 7, 9, 5, 10};
        notaMaxima(notas);

    }

    /**
     * Función para que dada una letra devuelva la nota correspondiente en formato numérico
     *
     * @param nota
     * @return debe devolver en caso de 9-10: A, 7-9: B, 5-7: C, 3-5: D, 0-3: F
     */
    public static String letraNota(int nota) {

        if ((nota >= 9 && nota <= 10)) {
            return "A";
        } else if (nota >= 7 && nota < 9) {
            return "B";
        } else if (nota >= 5 && nota < 7) {
            return "C";
        } else if (nota >= 3 && nota < 5) {
            return "D";
        } else if (nota >= 0 && nota < 3) {
            return "F";
        } else {
            return "Valor incorrecto";
        }
    }


    /**
     * Función para saber si un número es multiplo de otro
     *
     * @param dividendo
     * @param divisor
     * @return Debe devolver un true en caso de dividendo sea multiplo de divisor,
     * caso contrario devolver false
     */
    public static boolean esMultiplo(int dividendo, int divisor) {
        if (dividendo % divisor == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Función para devolver el factorial de un número: !n
     *
     * @param n (int)
     * @return Tiene que devolver la suma de todos los números que están entre n y 0.
     * Ejemplo: para n=4 --> tiene que hacer la operación 4*3*2*1 y devolver 24
     */
    public static int factorial(int n) {
        int suma = n;
        for (int i = 0; i < n; i++) {
            suma *= i;
        }
        return suma;
    }

    /**
     * Función para que dado un array de números devuelva la suma de unicamente los positivos
     *
     * @param numeros (un array de int)
     * @return devuelve al suma únicamente de los números positivos. Si el array está vacío devuelve 0
     */
    public static int sumarPositivos(int[] numeros) {
        int sumaPositivos = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                sumaPositivos += numeros[i];
            }
        }
        return sumaPositivos;
    }

    /**
     * Función para dado un array de notas que devuelva unicamente la más alta
     *
     * @param notas (array double)
     * @return debe de devolver la nota máxima dentro del array
     */
    public static double notaMaxima(double[] notas) {
        double notaMax = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > notaMax) {
                notaMax = notas[i];
            }
        }
        return notaMax;
    }
}