public class Pantalon {

    private int id;
    private String marca;
    private int talla;
    private String color;

    public Pantalon(int id, String marca, int talla, String color) {
        this.id = id;
        this.marca = marca;
        this.talla = talla;
        this.color = color;
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

}
