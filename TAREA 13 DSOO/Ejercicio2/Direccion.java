public class Direccion {
    private String calle;
    private String ciudad;
    private String region;
    private String pais;

    public Direccion() {
        this("Sin calle", "Sin ciudad", "Sin region", "Sin pais");
    }

    public Direccion(String calle, String ciudad, String region, String pais) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.region = region;
        this.pais = pais;
    }

    public void mostrarDatos() {
        System.out.println(calle + ", " + ciudad + ", " + region + ", " + pais);
    }
}
