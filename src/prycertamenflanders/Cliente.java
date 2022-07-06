package prycertamenflanders;

public class Cliente {

    private String rut;
    private String nombre;
    private int edad;

    public Cliente() {
    } 

    public Cliente(String rut, String nombre, int edad) {
        this.rut = rut;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre != ""){
            this.nombre = nombre;
        } else {
            System.out.println("Error, el campo nombre no puede estar vacio, favor ingrese un nombre valido");
        }
        if(nombre.length() >= 6){
            this.nombre = nombre;
        } else {
            //this.nombre = nombre + "-USUARIO";
            System.out.println("Error, el campo nombre debe ser mayor a 6 caracteres.");
            //System.out.println("Se agrego automaticamente " + this.nombre + " Para que puedas vender el pasaje y no te reten, hoy por tu mañana por mi :)");
        }
        
        
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Cliente{" + "rut=" + rut + ", nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    
    
}
