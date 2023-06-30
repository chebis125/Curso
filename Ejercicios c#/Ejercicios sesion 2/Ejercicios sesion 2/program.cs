using System;

namespace Ejercicios_sesion_2;
 internal class program
{
    static void Main(string[] args)
    {

        String nombre;
        String apellido;
        int edad;
        String pregunta;

        Console.WriteLine("Escribe tu nombre!: ");
        nombre = Console.ReadLine();

        Console.WriteLine("Escribe tu apellido!: ");
        apellido = Console.ReadLine();

        Console.WriteLine("Escribe tu edad: ");
        edad = Convert.ToInt32(Console.ReadLine());

        Console.WriteLine("¿Sabe programar? (Sí/No):");
        pregunta = Console.ReadLine();
        Console.WriteLine("Hola, " + nombre + " " + apellido + ". " + "Tienes " + edad + " años. Y " + pregunta + " sabes programar");

    }
}



