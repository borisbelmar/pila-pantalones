public class Pila {
    // Creamos la clase nodo donde almacenaremos los registros
    private class Nodo {
        private Pantalon pantalon;
        private Nodo siguiente = null;

        public Nodo(Pantalon pantalon) {
            this.pantalon = pantalon;
        }
    }

    // Variable usada para medir la longitud
    private int length = 0;

    // Creamos el nodo cabeza, cima o Top Of Stack el cual es null en una pila vacía
    private Nodo tos = null;

    // Implementamos el método Apilar (Push)
    public void push(Pantalon pantalon) {
        Nodo nodo = new Nodo(pantalon); // Instanciamos el nodo
        nodo.siguiente = tos; // Ponemos al nodo recién creado apuntando a tos (Desplazandolo)
        tos = nodo; // Reemplazamos tos por el nodo creado (El nuevo tos)
        length++;
    }

    // Implementamos el método Desapilar (Pop)
    public void pop() {
        if(tos != null) { // Comprobamos que la pila no esté vacía
            Nodo delete = tos; // Creamos un nodo temporal y le asignamos el valor actual de TOS
            tos = tos.siguiente; // Le asignamos a TOS el nodo siguiente en la pila
            delete.siguiente = null; // Eliminamos el puntero del nodo temporal
            length--;
        }
    }

    // Implementamos el método obtener
    public Pantalon get() {
        if (tos == null) {
            return null; // Si el Top of Stack es null, entonces retornamos null
        } else {
            return tos.pantalon; // En el caso contrario, devolvemos el elemento almacenado en el nodo
        }
    }

    // Creamos método getAll

    public void getAll() {
        if(tos == null) {
            System.out.println("No hay pantalones que mostrar en la pila");
        } else {
            Nodo puntero = tos;
            System.out.println("| ID | Marca | Talla | Color |");
            System.out.println("| " + puntero.pantalon.getId() + " | " + puntero.pantalon.getMarca() + " | " + puntero.pantalon.getTalla() + " | " + puntero.pantalon.getColor() + " |");
            while(puntero.siguiente != null) {
                puntero = puntero.siguiente;
                System.out.println("| " + puntero.pantalon.getId() + " | " + puntero.pantalon.getMarca() + " | " + puntero.pantalon.getTalla() + " | " + puntero.pantalon.getColor() + " |");
            }
        }
    }

    // Implementamos el método longitud
    public int length() {
        return length;
    }

    // Implementamos el método para saber si la pila está vacía
    public boolean isEmpty() {
        return tos == null;
    }
}
