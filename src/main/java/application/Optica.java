package application;

import domain.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Optica {

    private Scanner sc;
    private ArrayList<Cliente> almacenClientes;
    private ArrayList<Gafa> almacenGafas;
    private ArrayList<Optico> almacenOpticos;

    public Optica() {
        sc = new Scanner(System.in);
        almacenClientes = new ArrayList<>();
        almacenGafas = new ArrayList<>();
        almacenOpticos = new ArrayList<>();
    }

    public void ejecucion(){
        boolean salir = false;
        do {
            menu();
            String opcion = sc.nextLine();
            switch (opcion) {
                case "1":
                    crearUsuario();
                    break;
                case "2":
                    introducirGafa();
                    break;
                case "3":
                    incorporarOptico();
                    break;
                case "4":
                    buscarCliente();
                    break;
                case "5":
                    buscarGafa();
                    break;
                case "6":
                    busccarOptico();
                    break;
                case "X":
                case "x":
                    salir = true;
                    break;
            }
        } while (!salir);
    }

    public void crearUsuario (){
        System.out.println("Nombre del cliente");
        String nombreCliente = sc.nextLine();
        System.out.println("Apellido del cliente");
        String apellidoCliente = sc.nextLine();
        System.out.println("Edad del cliente");
        int edadCliente = Integer.parseInt(sc.nextLine());
        System.out.println("Dni del cliente");
        String dniCliente = sc.nextLine();
        System.out.println("Presupuesto para la compra de gafas del que dispone el cliente");
        float presupueto = Float.parseFloat(sc.nextLine());

        Cliente cliente = new Cliente(nombreCliente, apellidoCliente, edadCliente, dniCliente, presupueto);
        almacenClientes.add(cliente);
    }

    public void introducirGafa(){
        System.out.println("Referencia del modelo");
        String modelo = sc.nextLine();
        System.out.println("Color de la gafa");
        String color = sc.nextLine();
        System.out.println("Calibre de la gafa");
        int calibre = Integer.parseInt(sc.nextLine());
        System.out.println("Longitud de la varilla");
        float varilla = Float.parseFloat(sc.nextLine());
        System.out.println("Precio de la gafa");
        float precio = Float.parseFloat(sc.nextLine());

        Gafa gafa = new Gafa(modelo, color, calibre, varilla, precio);
        almacenGafas.add(gafa);
    }

    public void incorporarOptico(){
        System.out.println("Nombre del optico");
        String nombreOptico = sc.nextLine();
        System.out.println("Apellido del optico");
        String apellidoOptico = sc.nextLine();
        System.out.println("Edad del optico");
        int edadOptico = Integer.parseInt(sc.nextLine());
        System.out.println("Dni del optico");
        String dniOptico = sc.nextLine();
        System.out.println("Salario del optico");
        float salario = Float.parseFloat(sc.nextLine());

        Optico optico = new Optico(nombreOptico, apellidoOptico, edadOptico, dniOptico, salario);
        almacenOpticos.add(optico);
    }

    public void buscarCliente(){
        System.out.println("Introduzca el dni del cliente que quiera buscar");
        String dniAux = sc.nextLine();
        for (Cliente clienteAux : almacenClientes){
            if (dniAux.equals(clienteAux.getDni())){
                System.out.println(clienteAux);
            } else{
                System.out.println("No existe ningun cliente con el DNI introducido");
            }
        }
    }

    public void buscarGafa(){
        System.out.println("Introduzca el modelo de la gafa que quiera buscar");
        String modeloAux = sc.nextLine();
        for (Gafa gafaAux : almacenGafas){
            if (modeloAux.equals(gafaAux.getModelo())){
                System.out.println(gafaAux);
            } else{
                System.out.println("No existe ninguna gafa con el modelo introducido");
            }
        }
    }

    public void busccarOptico(){
        System.out.println("Introduzca el dni del optico que quiera buscar");
        String dniAux2 = sc.nextLine();
        for (Cliente opticoAux : almacenClientes){
            if (dniAux2.equals(opticoAux.getDni())){
                System.out.println(opticoAux);
            } else{
                System.out.println("No existe ningun optico con el DNI introducido");
            }
        }
    }

    public void menu (){
        System.out.println("Elija entre las diferentes opciones:\n" +
                "1. Crear un nuevo cliente\n" +
                "2. Introducir una nueva gafa\n" +
                "3. Incorporar a un nuevo optico\n" +
                "4. Buscar cliente\n" +
                "5. Buscar gafa\n" +
                "6. Buscar optico\n" +
                "x. Salir");
        System.out.println("\t\nSelecciona una opcion");
    }
}
