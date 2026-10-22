public class Gerente {
    private String nombre;
    private String telefono;
    private double sueldo;

    public Gerente(String nombre, String telefono, double sueldo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.sueldo = sueldo;
    }

    public void mostrarDatos() {
        System.out.println("Gerente: " + nombre + ", teléfono: " + telefono
                + ", sueldo: S/ " + sueldo);
    }
}
