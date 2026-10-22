public class Main {
    public static void main(String[] args) {
        //agregacion.
        Direccion direccionCompartida = new Direccion(
                "Av. Los Incas 123", "Arequipa", "Arequipa", "Peru");
        Estudiante estudiante1 = new Estudiante(1, "María Quispe", direccionCompartida);

        // composicion
        Estudiante estudiante2 = new Estudiante(
                2, "José Flores", "Calle Lima 456", "Arequipa", "Arequipa", "Peru");

        System.out.println("ESTUDIANTE 1 (AGREGACION)");
        estudiante1.mostrarDatos();

        System.out.println("\\nESTUDIANTE 2 (COMPOSICION)");
        estudiante2.mostrarDatos();
    }
}
