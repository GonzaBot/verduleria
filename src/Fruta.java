public class Fruta extends Producto{
    private int peso;
    private String color;

    public Fruta(String nombre, double precio, int peso, String color) {
        super(nombre, precio);
        this.peso = peso;
        this.color = color;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Fruta{" +
                "peso=" + peso +
                ", color='" + color + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
