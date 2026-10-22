public class Vendedor {
    private String nombre;
    private String telefono;
    private int ventas;

    public Vendedor(String nombre, String telefono, int ventas) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.ventas = ventas;
    }

    public String getNombre() {
        return nombre;
    }

    public void registrarVenta() {
        ventas++;
        System.out.println("Venta registrada para " + nombre + ".");
    }

    public void mostrarDatos() {
        System.out.println("Vendedor: " + nombre + ", teléfono: " + telefono
                + ", ventas: " + ventas);
    }
}
