import java.util.Scanner;

public class Main {

    public static void printStatus(Pila pila) {
        if (pila.isEmpty()) {
            System.out.println("L=0 No hay nada en la pila");
        } else {
            System.out.println("L=" + pila.length() + " " + pila.get().getId());
        }
    }

    public static int menu() {
        Scanner read = new Scanner(System.in);
        System.out.println("¿Qué deseas hacer? Seleccione una opción");
        System.out.println("1. Insertar Pantalones");
        System.out.println("2. Retirar Pantalón");
        System.out.println("3. Mostrar el primer pantalón en la pila");
        System.out.println("4. Mostrar toda la pila");
        System.out.print("Ingresar Opción: ");

        int option = read.nextInt();
        read.close();
        return option;
    }

    public static int repetir() {
        Scanner read = new Scanner(System.in);
        System.out.println("¿Deseas realizar otra acción?");
        System.out.println("1. Si");
        System.out.println("2. No");
        System.out.print("Ingresa la opción: ");
        int eleccion = read.nextInt();
        read.close();
        return eleccion;
    }

    public static void decor() {
        System.out.println("======================");
    }

    public static void title(String title) {
        System.out.println("======================");
        System.out.println(title);
        System.out.println("======================");
    }

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int id = 0;
        int option;

        Pila pantalones = new Pila();

        decor();
        printStatus(pantalones);
        decor();

        option = menu();

        switch (option) {
            case 1:
                title("1. Insertar pantalones");
                System.out.print("Ingrese la marca del pantalón (Texto): ");
                String marca = read.next();
                System.out.print("Ingrese la talla del pantalón (Entero): ");
                int talla = read.nextInt();
                System.out.print("Ingrese el color del pantalón (Texto): ");
                String color = read.next();
                pantalones.push(new Pantalon(id+10, marca, talla, color));
                System.out.println("Objeto añadido con éxito!");
                decor();
                break;
            case 2:
                title("2. Retirar Pantalón");
                if (pantalones.isEmpty()) {
                    System.out.println("No hay ningún pantalón en la pila");
                } else {
                    System.out.println("Has retirado el siguiente pantalón:");
                    decor();
                    System.out.println("ID = " + pantalones.get().getId());
                    System.out.println("Marca = " + pantalones.get().getMarca());
                    System.out.println("Talla = " + pantalones.get().getTalla());
                    System.out.println("Color = " + pantalones.get().getColor());
                    decor();
                    pantalones.pop();
                }
                break;
            case 3:
                title("3. Mostrar el primer pantalón en la pila");
                System.out.println("ID = " + pantalones.get().getId());
                System.out.println("Marca = " + pantalones.get().getMarca());
                System.out.println("Talla = " + pantalones.get().getTalla());
                System.out.println("Color = " + pantalones.get().getColor());
                decor();
                break;
            case 4:
                title("4. Mostrar todos los pantalones");
                pantalones.getAll();
                decor();
                break;
        }

        printStatus(pantalones);
        decor();
        repetir();
    }
}
