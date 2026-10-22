public class Estudiante {
    private int numLista;
    private String nombre;
    private Direccion domicilio;

    // Agregacion: la direccion se recibe desde fuera y puede compartirse.
    public Estudiante(int num, String nom, Direccion dir) {
        numLista = num;
        nombre = nom;
        domicilio = dir;
    }

    // Composicion: el estudiante crea su propia direccion.
    public Estudiante(int num, String nom, String calle,
                      String ciudad, String region, String pais) {
        numLista = num;
        nombre = nom;
        domicilio = new Direccion(calle, ciudad, region, pais);
    }

    public void mostrarDatos() {
        System.out.println("Numero de lista: " + numLista);
        System.out.println("Nombre: " + nombre);
        System.out.print("Domicilio: ");
        domicilio.mostrarDatos();
    }
}
