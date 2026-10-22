import java.util.ArrayList;

public class Concesionario {
    private String empresa;
    private Gerente gerente;
    private ArrayList<Vendedor> vendedores;
    private ArrayList<Auto> autos;

    public Concesionario(String empresa, Gerente gerente) {
        this.empresa = empresa;
        this.gerente = gerente;
        vendedores = new ArrayList<>();
        autos = new ArrayList<>();
    }

    public void agregarVendedor(Vendedor vendedor) {
        vendedores.add(vendedor);
    }

    public void mostrarVendedores() {
        for (int i = 0; i < vendedores.size(); i++) {
            System.out.println((i + 1) + ". " + vendedores.get(i).getNombre());
        }
    }

    public void registrarVenta(int numero) {
        if (numero >= 1 && numero <= vendedores.size()) {
            vendedores.get(numero - 1).registrarVenta();
        } else {
            System.out.println("Numero de vendedor no valido.");
        }
    }

    public int cantidadVendedores() {
        return vendedores.size();
    }

    public void agregarAuto(Auto auto) {
        autos.add(auto);
    }

    public void mostrarEstado() {
        System.out.println("\\n===== " + empresa + " =====");
        gerente.mostrarDatos();

        System.out.println("\\nVendedores:");
        if (vendedores.isEmpty()) {
            System.out.println("No hay vendedores registrados.");
        } else {
            for (Vendedor vendedor : vendedores) {
                vendedor.mostrarDatos();
            }
        }

        System.out.println("\\nAutos:");
        if (autos.isEmpty()) {
            System.out.println("No hay autos registrados.");
        } else {
            for (Auto auto : autos) {
                auto.mostrarDatos();
            }
        }
        System.out.println("========================\\n");
    }
}
