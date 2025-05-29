import java.util.Scanner;

public class IceCream {
    public static void main(String[] args) {
        
        //Vamos a hacer un programa que haga un pedido online por cada helado ordenado, vamos a escoger cuantas bolas de helado le pondremos y sus sabores.

        //Ejemplo de como debe mostrarse en la terminal:
        /* 
            ¿Cuántas bolas de helado quieres?: 3

            ¡Perfecto! Ahora escoge de que sabor quieres cada helado: 
                0. Chocolate
                1. Fresa
                2. Vainilla

            ¡Gracias por tu orden! Has pedido los siguientes sabores:
                0. Chocolate
                1. Fresa
                2. Vainilla
            
            ¿Es correcto? presiona intro para continuar

            ¡Listo, tenemos tu orden! Acércate al mostrador y Robotina te entregará tu helado
        */

        // La cantidad y los sabores escoge el usuario

        //Los índices 0, 1 y 2 (y los que sean) no lo escribirá el usuario, saldrá automáticamente según la cantidad de bolas de helado que haya escogido el usuario. Primero saldrá 0. y esperará a que el usuario escriba el primer sabor y después del "enter" aparecerá el 1. para que el usuario escriba el segundo sabor y así sucesivamente.

        //Has de usar un array para almacenar los sabores de helado y un bucle para imprimirlos.

        //Mira en el ejemplo los saltos de línea que has de tener.

        String[] flavour = {"Chocolate", "Fresa", "Vainilla"};
        System.out.print("¿Cuántas bolas de helado quieres?: ");
        Scanner scanner = new Scanner(System.in);
        int cantidad = scanner.nextInt();
        scanner.nextLine();
        System.out.println("\n¡Perfecto! Ahora escoge de qué sabor quieres cada helado:");
        for (int i = 0; i < flavour.length; i++) {
            System.out.println("    " + i + ". " + flavour[i]);
        }
        String[] order = new String[cantidad];
        for (int i = 0; i < cantidad; i++) {
            int eleccion = -1;
            do {
                System.out.print(i + ". ");
                String input = scanner.nextLine();
                try {
                    eleccion = Integer.parseInt(input);
                    if (eleccion < 0 || eleccion >= flavour.length) {
                        System.out.println("Por favor ingresa un número válido entre 0 y " + (flavour.length - 1));
                        eleccion = -1;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Eso no es un número válido. Intenta de nuevo.");
                    eleccion = -1;
                }
            } while (eleccion == -1);
            order[i] = flavour[eleccion];
        }
        System.out.println("\n¡Gracias por tu orden! Has pedido los siguientes sabores:");
        for (int i = 0; i < cantidad; i++) {
            System.out.println("    " + i + ". " + order[i]);
        }
        System.out.println("\n¿Es correcto? presiona intro para continuar");
        scanner.nextLine();
        System.out.println("\n¡Listo, tenemos tu orden! Acércate al mostrador y Robotina te entregará tu helado");
        scanner.close();
    }
} 
