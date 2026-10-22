public class Auto {
    private String marca;
    private String modelo;
    private int anio;

    public Auto(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public String getMarca() {
        return marca;
    }

    public void mostrarDatos() {
        System.out.println("Marca: " + marca + ", modelo: " + modelo + ", año: " + anio);
    }
}
