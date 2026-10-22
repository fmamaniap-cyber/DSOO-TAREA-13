public class Main {
    public static void main(String[] args) {
        // La direccion se crea fuera del estudiante: agregacion.
        Direccion direccionCompartida = new Direccion(
                "Av. Los Incas 123", "Arequipa", "Arequipa", "Peru");
        Estudiante estudiante1 = new Estudiante(1, "María Quispe", direccionCompartida);

        // La direccion se crea dentro del constructor del estudiante: composicion.
        Estudiante estudiante2 = new Estudiante(
                2, "José Flores", "Calle Lima 456", "Arequipa", "Arequipa", "Peru");

        System.out.println("ESTUDIANTE 1 (AGREGACION)");
        estudiante1.mostrarDatos();

        System.out.println("\\nESTUDIANTE 2 (COMPOSICION)");
        estudiante2.mostrarDatos();
    }
}
