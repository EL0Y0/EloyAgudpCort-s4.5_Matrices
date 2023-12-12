/**
 * programa que cree una matriz de tamaño NxM (tamaño introducido por teclado) e
 * introduzca en ella NxM valores (también introducidos por teclado). Luego deberá recorrer la
 * matriz y al final mostrar por pantalla cuántos valores son mayores que cero, cuántos son
 * menores que cero y cuántos son igual a cero.
 * @author Eloy Agudo Cortés
 */

public class Matrices3 {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("Ingrese el número de filas:");
        int N = Integer.parseInt(System.console().readLine());
        System.out.println("");
        System.out.println("Ingrese el número de columnas:");
        int M = Integer.parseInt(System.console().readLine());
        System.out.println("");
        int[][] matriz = new int[N][M];
        System.out.println("Ingresa los valores de la matriz:");
        for (int filas = 0; filas < N; filas++) {
            for (int columnas = 0; columnas < M; columnas++) {
                System.out.println("Matriz[" + filas + "][" + columnas + "]: ");
                matriz[filas][columnas] = Integer.parseInt(System.console().readLine());
            }
        }
        int mayorQue0 = 0;
        int menorQue0 = 0;
        int igualQue0 = 0;
        for (int filas = 0; filas < N; filas++) {
            for (int columnas = 0; columnas < M; columnas++) {
                if (matriz[filas][columnas] > 0) {
                    mayorQue0++;
                } else if (matriz[filas][columnas] < 0) {
                    menorQue0++;
                } else if (matriz[filas][columnas] == 0) {
                    igualQue0++;
                }
            }
        }
        System.out.println("");
        System.out.println("");
        System.out.println("Valores mayores que 0: " + mayorQue0);
        System.out.println("Valores menores que 0: " + menorQue0);
        System.out.println("Valores iguales a 0: " + igualQue0);
    }
}
