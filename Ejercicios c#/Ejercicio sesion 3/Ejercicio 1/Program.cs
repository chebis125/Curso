// See https://aka.ms/new-console-template for more information

Cliente cliente1 = new Cliente("Johan Sebastian Martinez Pulido",3145647,"Cra 5 sur #4-50", "martinez@gmail.com", true);

Console.WriteLine(cliente1);

public struct Cliente
{
    public Cliente(String nombre, int telefono, String direccion, String email, bool nuevo )
    {
        Nombre = nombre;
        Telefono = telefono;
        Direccion = direccion;
        Email = email;
        Nuevo = nuevo;

    }
    public String Nombre { get; set; }
    public int Telefono { get; set;}
    public String Direccion { get; set; }
    public String Email { get; set; }
    public bool Nuevo { get; set;}

    public override string ToString() => $"{Nombre} tiene el numero {Telefono} su direccion es {Direccion}, su email {Email} y actualemente {(Nuevo ? "es un nuevo cliente" : "no es un nuevo cliente")}.";
}
