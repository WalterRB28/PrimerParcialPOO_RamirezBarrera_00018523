import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
public class Main {
    static ArrayList<Articulo> articulos = new ArrayList<Articulo>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        while (true) {
            System.out.println("¡Bienvenido a ElectroMart!\n" +
                    "¿Que desea hacer?\n" +
                    "1- Añadir un articulo\n" +
                    "2- Modificar el precio del articulo\n" +
                    "3- Detalles de un articulo\n" +
                    "4- Mostrar todos los articulos\n" +
                    "0- Salir del programa\n"
            );
            System.out.print("Opcion >");

            try {
                opcion = sc.nextInt();

                if (opcion == 0) {
                    return;
                }

                switch (opcion) {
                    case 1:
                        agregarArticulo();
                        break;
                    case 2:
                        modificarPrecio();
                        break;
                    case 3:
                        infoArticulo();
                        break;
                    case 4:
                        mostrarArticulos();
                        break;
                    default:
                        System.out.println("Opcion no valida dentro del rango de opciones...");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Porfavor ingrese un numero");
                sc.nextLine();
            }

        }
    }

    private static void agregarArticulo() {
        Scanner sc = new Scanner(System.in);
        String nombre;
        String modelo;
        String descripcion;
        double precio;
        System.out.println("Escriba el nombre del articulo: ");
        nombre = sc.nextLine();
        System.out.println("Escriba el modelo del articulo: ");
        modelo = sc.nextLine();
        System.out.println("Escriba una breve descrpcion del articulo: ");
        descripcion = sc.nextLine();
        System.out.println("Escriba el precio del articulo: ");
        System.out.print("$");
        precio = sc.nextDouble();

        Articulo articulo = new Articulo(nombre, modelo, descripcion, precio);
        int tipo = definirTipo();

        if (tipo == 1) {
            int RAM;
            String procesador;
            System.out.println("Ingrese la cantidad de RAM como entero: ");
            RAM = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese el nombre del procesador: ");
            procesador = sc.nextLine();

            Laptop laptop = new Laptop(articulo, RAM, procesador);

        } else if (tipo == 2) {
            int cantidadCamara;
            int almacenamientoTelefono;
            System.out.println("Ingrese la cantidad de camaras: ");
            cantidadCamara = sc.nextInt();
            System.out.println("Ingrese el almacenamiento del telefono (como numero entero): ");
            almacenamientoTelefono = sc.nextInt();

            Telefono telefono = new Telefono(articulo, cantidadCamara, almacenamientoTelefono);
        }

        articulos.add(articulo);
    }

    private static int definirTipo() {
        while (true) {
            int opcion;
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese el tipo del articulo:\n" +
                    "1- Laptop\n" +
                    "2- Telefono\n"
            );

            System.out.print("Opcion >");
            try {
                opcion = sc.nextInt();
                return opcion;
            } catch (Exception e) {
                System.out.println("Porfavor ingrese un numero");
                sc.nextLine();
            }
        }
    }

    private static void modificarPrecio() {
        Scanner sc = new Scanner(System.in);
        String nombre;
        System.out.println("Ingrese el nombre del articulo para modificar su precio");
        System.out.print("Nombre: ");
        nombre = sc.nextLine();
        for (int i = 0; i < articulos.size(); i++){
            if (Objects.equals(articulos.get(i).getNombre(), nombre)){
                double nuevoPrecio;
                System.out.println("Ingrese su nuevo precio: ");
                nuevoPrecio = sc.nextDouble();

                articulos.get(i).setPrecio(nuevoPrecio);
                return;
            }
        }
    }

    private static void infoArticulo() {
        Scanner sc = new Scanner(System.in);
        String nombre;
        System.out.println("Ingrese el nombre del articulo para modificar su precio");
        System.out.print("Nombre: ");
        nombre = sc.nextLine();
        for (int i = 0; i < articulos.size(); i++){
            if (Objects.equals(articulos.get(i).getNombre(), nombre)){
                System.out.println("Datos del producto:\n"+
                    "Nombre: "+articulos.get(i).getNombre()+"\n"+
                    "Modelo: "+articulos.get(i).getModelo()+"\n"+
                    "Descrpcion: "+articulos.get(i).getDescripcion()+"\n"+
                    "Precio: "+articulos.get(i).getPrecio()+"\n"
                );
            }
        }
    }

    private static void mostrarArticulos() {
        for (int i = 0; i < articulos.size(); i++){
                System.out.println("Datos del producto:\n"+
                        "Nombre: "+articulos.get(i).getNombre()+"\n"+
                        "Modelo: "+articulos.get(i).getModelo()+"\n"+
                        "Descrpcion: "+articulos.get(i).getDescripcion()+"\n"+
                        "Precio: "+articulos.get(i).getPrecio()+"\n"
                );
        }
    }
}