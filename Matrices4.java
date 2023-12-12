/**
 * programa para almacenar las notas de 4 alumnos (llamados “Alumno
 * 1”, “Alumno 2”, etc.) y 5 asignaturas. El usuario introducirá las notas por teclado y luego el
 * programa mostrará la nota mínima, máxima y media de cada alumno.
 * @author Eloy Agudo Cortés
 * 
 */

public class Matrices4 {
    public static void main(String[] args) {
        double[][] notas = new double[4][5];
        for (int filas = 0; filas < 4; filas++) {
            System.out.println("Ingresa las notas de Alumno " + (filas + 1) + ":");
            for (int columnas = 0; columnas < 5; columnas++) {
                System.out.print("Asignatura " + (columnas + 1) + ": ");
                notas[filas][columnas] = Double.parseDouble(System.console().readLine());
            }
        }
        for (int filas = 0; filas < 4; filas++) {
            double notaMinima = notas[filas][0];
            double notaMaxima = notas[filas][0];
            double suma = 0;
            for (int columnas = 0; columnas <  5; columnas++) {
                double nota = notas[filas][columnas];
                if (nota<notaMinima) {
                    notaMinima = nota;
                }
                suma = nota + suma;
            }
            double media = suma / 5;
            System.out.println("Nota mínima de Alumno " + (filas + 1) + ": " + notaMinima);
            System.out.println("Nota máxima de Alumno " + (filas + 1) + ": " + notaMaxima);
            System.out.println("Media de Alumno " + (filas + 1) + ": " + media);
            System.out.println();
        }
    }
}
