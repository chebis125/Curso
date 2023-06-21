package Ejercicio2;

public class Ejercicio2{
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.nombre = "Sebastian";
        cliente.edad = 21;
        cliente.telefono = 123456;
        cliente.credito = 40000;

        System.out.println("Cliente");
        System.out.println("Nombre: " + cliente.nombre);
        System.out.println("Edad: " + cliente.edad);
        System.out.println("Teléfono: " + cliente.telefono);
        System.out.println("Crédito: " + cliente.credito);

        Trabajador trabajador = new Trabajador();
        trabajador.nombre = "Daniel";
        trabajador.edad = 25;
        trabajador.telefono = 8411526;
        trabajador.salario = 800000;

        System.out.println("\nTrabajador");
        System.out.println("Nombre: " + trabajador.nombre);
        System.out.println("Edad: " + trabajador.edad);
        System.out.println("Teléfono: " + trabajador.telefono);
        System.out.println("Salario: " + trabajador.salario);


    }
}

class Persona{
    int edad;
    String nombre;
    int telefono;
}

class Cliente extends Persona{
    int credito;
}

class Trabajador extends Persona{
    int salario;
}