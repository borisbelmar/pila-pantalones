public class Pantalon {

    private int id;
    private String marca;
    private int talla;
    private String color;
    private int cantidad;

    public Pantalon(int id, String marca, int talla, String color, int cantidad) {
        this.id = id;
        this.marca = marca;
        this.talla = talla;
        this.color = color;
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
