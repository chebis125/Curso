package Ejercicio1;

public class Ejercicio {
    public static void main(String[] args) {

        Persona Opersona = new Persona();
        Opersona.setEdad(20);
        Opersona.setNombre("Sebastian Martinez");
        Opersona.setTelefono(315794741);
        System.out.println("El se llama " + Opersona.getNombre() + " tiene " + Opersona.getEdad() + " años y su numero de telefono es: " + Opersona.getTelefono());
    }
}

class Persona{
    private int edad;
    private String nombre;
    private long telefono;

    public void setEdad (int edad){
        this.edad = edad;
    }

    public void setNombre (String nombre){
        this.nombre = nombre;
    }

    public void setTelefono (long telefono){
        this.telefono = telefono;
    }

    public int getEdad(){
        return this.edad;
    }

    public String getNombre(){
        return this.nombre;
    }

    public long getTelefono(){
        return this.telefono;
    }
}
