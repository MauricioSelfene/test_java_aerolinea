package prycertamenflanders;

public class Pasaje {

    private int numeroVuelo;
    private String destino;
    private int numeroAsiento;
    private char letraAsiento;
    private String tipoTicket;
    private int precio;
    private boolean validarCliente;
    private int descuentoTerceraEdad;
    
    private Cliente cliente;

    public Pasaje() {
    
        cliente = new Cliente();
    
    }

    public Pasaje(int numeroVuelo, String destino, int numeroAsiento, char letraAsiento, String tipoTicket, int precio, boolean validarCliente, int descuentoTerceraEdad, Cliente cliente) {
        this.numeroVuelo = numeroVuelo;
        this.destino = destino;
        this.numeroAsiento = numeroAsiento;
        this.letraAsiento = letraAsiento;
        this.tipoTicket = tipoTicket;
        this.precio = precio;
        this.validarCliente = validarCliente;
        this.descuentoTerceraEdad = descuentoTerceraEdad;
        this.cliente = cliente;
    }

    public int getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(int numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public char getLetraAsiento() {
        return letraAsiento;
    }

    public void setLetraAsiento(char letraAsiento) {
        this.letraAsiento = letraAsiento;
    }

    public String isTipoTicket() {
        return tipoTicket;
    }

    public void setTipoTicket(String tipoTicket) {
        
        if(tipoTicket == "E" || tipoTicket == "T"){
            this.tipoTicket = tipoTicket;
        } else {
            this.tipoTicket = "E";
            System.out.println("Error, debe al momento de ingresar un ticket seleccionar si es de tipo Ejecutivo o Turista");
            System.out.println("Por defecto el ticket quedo como ejecutivo, considere esto por los pagos y servicios asociados");
        }
        
        
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        if(precio > 1){
            this.precio = precio;
        } else {
            this.precio = 100000;
            System.out.println("Error, el precio debe ser positivo y mayor a 0");
            System.out.println("Para mantener el precio, por defecto quedara en $100000 correspondiente a ejecutivo");
        }
    }

    public boolean isValidarCliente() {
        return validarCliente;
    }

    public void setValidarCliente(boolean validarCliente) {
        this.validarCliente = validarCliente;
    }

    public int getDescuentoTerceraEdad() {
        return descuentoTerceraEdad;
    }

    public void setDescuentoTerceraEdad(int descuentoTerceraEdad) {
        this.descuentoTerceraEdad = descuentoTerceraEdad;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Pasaje{" + "numeroVuelo=" + numeroVuelo + ", destino=" + destino + ", numeroAsiento=" + numeroAsiento + ", letraAsiento=" + letraAsiento + ", tipoTicket=" + tipoTicket + ", precio=" + precio + ", validarCliente=" + validarCliente + ", descuentoTerceraEdad=" + descuentoTerceraEdad + ", cliente=" + cliente + '}';
    }
    
    //Método customer mostrarPasaje
    public void mostrarPasaje(){
        
        String ticket = this.tipoTicket;
        
        if(ticket == "E"){
            ticket = "EJECUTIVO";
        }
        if(ticket == "T"){
            ticket = "TURISTA";
        }

        System.out.println("BIENVENIDO");
        System.out.println("---------------TICKET AÉREO-----------------");
        System.out.println("--------------------------------------------");
        System.out.println(cliente.getNombre() + "  " + ticket + "  " + this.getNumeroAsiento()+ "-" +this.getLetraAsiento() + "  " + this.getDestino() + "  " + this.getPrecio());
        System.out.println("--------------------------------------------");

    }
    
    public void validarCliente(String rutConsulta, int numeroVueloConsulta){
        
        if(rutConsulta.equals(cliente.getRut()) && numeroVueloConsulta == numeroVuelo ){
            System.out.println("Datos validados, Cliente " + cliente.getNombre() + " Coresponde a RUT asociado a vuelo" );
        } else {
            System.out.println("Datos no corresponden a cliente ni RUT");
        }
        
    }
    
    public void validarDescuentoTerceraEdad(String rutCliente) {
        
        
        String ticket = this.tipoTicket;
        
        if(ticket == "E"){
            ticket = "EJECUTIVO";
        }
        if(ticket == "T"){
            ticket = "TURISTA";
        }
        
        if(this.cliente.getEdad() >= 65) {
            System.out.println("El adulto mayor de edad: " + this.cliente.getEdad() + " Años");
            System.out.println("Actualizando precios.");
            System.out.println("Actualizando precios..");
            System.out.println("Actualizando precios...");
            
            //restamos el 15 %
            int precioDescuento = this.precio;

            precioDescuento = (precioDescuento * 15) / 100;
            
            System.out.println("Descuento: $" + precioDescuento);
            
            int totalNormal = this.precio;
            int totalDescuento = totalNormal - precioDescuento;
            
            System.out.println("---------------TICKET AÉREO-----------------");
            System.out.println("--------------------------------------------");
            System.out.println(cliente.getNombre() + "  " + ticket + "  " + this.getNumeroAsiento()+ "-" +this.getLetraAsiento() + "  " + this.getDestino() + "  " + totalDescuento);
            System.out.println("--------------------------------------------");
        
        } else {
            System.out.println("Pasajo sin descuento por tercera edad.");
        }
    }
    
    public void obtenerDescuentoMaximo(String tipoTicketDescuento){
        
        //Total universal
        int total = this.precio;
 
        //ejecutiva
        int descuentoEjecutiva = (total * 3) / 100;
        int totalDescuentoEjecutiva = total - descuentoEjecutiva;
        
        if(tipoTicketDescuento == "E"){
            System.out.println("Tiene un Descuento asociado a clase Ejecutiva, descuento de: $" + descuentoEjecutiva + " Total a pagar " + totalDescuentoEjecutiva);
            System.out.println("HASTA LA PROXIMA.");
        }
        
        //turista
        int descuentoTurista = (total * 7) / 100;
        int totalDescuentoTurista = total - descuentoTurista;
        
        if(tipoTicketDescuento == "T"){
            System.out.println("Tiene un Descuento asociado a clase Turista, descuento de: $" + descuentoTurista + " Total a pagar " + totalDescuentoTurista);
            System.out.println("HASTA LA PROXIMA.");
        }

        
    }
    
    
}


