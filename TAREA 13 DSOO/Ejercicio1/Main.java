import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Gerente gerente = new Gerente("Carlos Ramos", "987654321", 3500);
        Concesionario concesionario = new Concesionario("Autos del Sur", gerente);

        // Datos iniciales: 3 autos y 2 vendedores, como en el ejemplo del tema.
        concesionario.agregarAuto(new Auto("Toyota", "Yaris", 2022));
        concesionario.agregarAuto(new Auto("Kia", "Rio", 2023));
        concesionario.agregarAuto(new Auto("Hyundai", "Accent", 2021));
        concesionario.agregarVendedor(new Vendedor("Ana Torres", "912345678", 5));
        concesionario.agregarVendedor(new Vendedor("Luis Pérez", "923456789", 3));

        int opcion;
        do {
            System.out.println("=== MENU DEL CONCESIONARIO ===");
            System.out.println("1. Mostrar estado del concesionario");
            System.out.println("2. Agregar auto");
            System.out.println("3. Agregar vendedor");
            System.out.println("4. Registrar venta de un vendedor");
            System.out.println("0. Salir");
            System.out.print("Elija una opcion: ");

            while (!teclado.hasNextInt()) {
                System.out.print("Ingrese un numero: ");
                teclado.next();
            }
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                    concesionario.mostrarEstado();
                    break;
                case 2:
                    System.out.print("Marca: ");
                    String marca = teclado.nextLine();
                    System.out.print("Modelo: ");
                    String modelo = teclado.nextLine();
                    System.out.print("Año: ");
                    int anio = leerEntero(teclado);
                    teclado.nextLine();
                    concesionario.agregarAuto(new Auto(marca, modelo, anio));
                    System.out.println("Auto agregado.\\n");
                    break;
                case 3:
                    System.out.print("Nombre del vendedor: ");
                    String nombre = teclado.nextLine();
                    System.out.print("Telefono: ");
                    String telefono = teclado.nextLine();
                    System.out.print("Ventas realizadas: ");
                    int ventas = leerEntero(teclado);
                    teclado.nextLine();
                    concesionario.agregarVendedor(new Vendedor(nombre, telefono, ventas));
                    System.out.println("Vendedor agregado.\\n");
                    break;
                case 4:
                    if (concesionario.cantidadVendedores() == 0) {
                        System.out.println("No hay vendedores registrados.\\n");
                    } else {
                        concesionario.mostrarVendedores();
                        System.out.print("Numero del vendedor que realizo la venta: ");
                        int numero = leerEntero(teclado);
                        teclado.nextLine();
                        concesionario.registrarVenta(numero);
                        System.out.println();
                    }
                    break;
                case 0:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opcion no valida.\\n");
            }
        } while (opcion != 0);

        teclado.close();
    }

    private static int leerEntero(Scanner teclado) {
        while (!teclado.hasNextInt()) {
            System.out.print("Ingrese un numero entero: ");
            teclado.next();
        }
        return teclado.nextInt();
    }
}
