public class Nperecedero extends Producto{
    private int contenido;
    private int cantidad;

    public Nperecedero(String nombre, double precio, int contenido, int cantidad) {
        super(nombre, precio);
        this.contenido = contenido;
        this.cantidad = cantidad;
    }

    public int getContenido() {
        return contenido;
    }

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Nperecedero{" +
                "contenido=" + contenido +
                ", cantidad=" + cantidad +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
