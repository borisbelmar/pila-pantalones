import java.util.Scanner;

public class Main {

    private static int menu() {
        Scanner read = new Scanner(System.in);
        System.out.println("¿Qué deseas hacer? Seleccione una opción");
        System.out.println("1. Insertar Pantalones");
        System.out.println("2. Retirar Pantalón");
        System.out.println("3. Mostrar el primer pantalón en la pila");
        System.out.println("4. Mostrar toda la pila");
        System.out.println("5. Salir");
        System.out.print("Ingresar Opción: ");

        return read.nextInt();
    }

    private static void decor() {
        System.out.println("======================");
    }

    private static void title(String title) {
        System.out.println("======================");
        System.out.println(title);
        System.out.println("======================");
    }

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int id = 0;

        Pila pantalones = new Pila();

        boolean repetir = true;
        do {
            int option = menu();

            switch (option) {
                case 1:
                    title("1. Insertar pantalones");
                    System.out.print("Ingrese la marca del pantalón (Texto): ");
                    String marca = read.next();
                    System.out.print("Ingrese la talla del pantalón (Entero): ");
                    int talla = read.nextInt();
                    System.out.print("Ingrese el color del pantalón (Texto): ");
                    String color = read.next();
                    pantalones.push(new Pantalon(id=(id+10), marca, talla, color));
                    decor();
                    System.out.println("| " + pantalones.get().getId() + " | " + pantalones.get().getMarca() + " | " + pantalones.get().getTalla() + " | " + pantalones.get().getColor() + " |");
                    System.out.println("Pantalón añadido con éxito!");
                    decor();
                    break;
                case 2:
                    title("2. Retirar Pantalón");
                    if (pantalones.isEmpty()) {
                        title("No hay ningún pantalón en la pila");
                    } else {
                        System.out.println("Has retirado el siguiente pantalón:");
                        decor();
                        System.out.println("| " + pantalones.get().getId() + " | " + pantalones.get().getMarca() + " | " + pantalones.get().getTalla() + " | " + pantalones.get().getColor() + " |");
                        decor();
                        pantalones.pop();
                        id = id-10;
                    }
                    break;
                case 3:
                    if(pantalones.isEmpty()) {
                        title("La pila de pantalones está vacía");
                    } else {
                        title("3. Mostrar el primer pantalón en la pila");
                        System.out.println("| " + pantalones.get().getId() + " | " + pantalones.get().getMarca() + " | " + pantalones.get().getTalla() + " | " + pantalones.get().getColor() + " |");
                        decor();
                    }
                    break;
                case 4:
                    title("4. Mostrar todos los pantalones");
                    pantalones.getAll();
                    decor();
                    break;
                case 5:
                    decor();
                    System.out.println("Hasta luego!");
                    repetir = false;
            }
        } while(repetir);
    }
}
