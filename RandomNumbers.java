import java.util.Random;

public class RandomNumbers {

    public static void main(String[] args) {
        int filas = 100;
        int columnas = 10;
        int[][] numeros = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                numeros[i][j] = randomNumber();
            }
        }
        print2DArray(numeros);
    }
    /**
     * Function name: randomNumber
     *
     * @return (int)
     *
     * Inside the function:
     * 1. generate random numbers from 0 to 99
     */
    public static int randomNumber() {
        Random rand = new Random();
        return rand.nextInt(100);
    }
    /**
     * Function name: print2DArray
     *
     * @param integers (2D array int)
     *
     * Inside the function:
     * 1. nested loop that prints a 2D array using the randomNumber function
     */
    public static void print2DArray(int[][] integers) {
        for (int i = 0; i < integers.length; i++) {
            for (int j = 0; j < integers[i].length; j++) {
                System.out.print(integers[i][j] + "\t");
            }