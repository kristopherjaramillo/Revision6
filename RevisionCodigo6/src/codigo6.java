import java.util.Scanner; // se llama al scanner para que pueda funcionar lo de abajo


// este código crea un array con números aleatorios de entre 20 y 400, después de eso el usario debe elegir 
// cuáles serán los multiplos que se van a resaltar, pueden ser los multiplos de 5 o 7, una vez elegida la opción en la consola
// se mostraran los números resaltados
public class codigo6 {

    public static void main(String[] args) {
        // se empieza con un array de enterors
        int[] n = new int[20];
        
        // el array se va a llenar de numeros random de entre 20 y 400
        for (int i = 0; i < 20; i++) {
            n[i] = (int)(Math.random() * 381) + 20;
            System.out.print(n[i] + " "); // Mostrar los números generados
        }

        // se le pide al usario que elija una de las opciones
        System.out.println("\n¿Qué números quiere resaltar?");
        System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
        
        // se usa el scanner para leer la información
        Scanner scanner = new Scanner(System.in);
        int opcion = Integer.parseInt(scanner.nextLine());
        // se determina el múltiplo en base a la opción que se eligió
        int multiplo = (opcion == 1) ? 5 : 7;

        // recorre todo el array y marca los multiplos segun la opción elegida 
        for (int e : n) {
            if (e % multiplo == 0) {
                System.out.print("[" + e + "] "); // se resaltan los multiplos de 5 o 7
            } else {
                System.out.print(e + " "); // imprime el número normal si no es multiplo
        }
        
        scanner.close(); // para finalizar se cierra el scanner
    }
  }
}
