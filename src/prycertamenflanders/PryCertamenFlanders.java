package prycertamenflanders;

public class PryCertamenFlanders {

    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente();
        
        cliente1.setNombre("PETER FONDA");
        cliente1.setRut("18239772-5");
        cliente1.setEdad(70);
        
        //entidades debil
        Pasaje pasaje1 = new Pasaje();
        pasaje1.setCliente(cliente1);
        pasaje1.setDescuentoTerceraEdad(0);
        pasaje1.setDestino("MIAMI");
        pasaje1.setLetraAsiento('A');
        pasaje1.setNumeroAsiento(24);
        pasaje1.setNumeroVuelo(145);
        pasaje1.setPrecio(100000);
        pasaje1.setTipoTicket("E"); 
        pasaje1.setValidarCliente(true);
        
        System.out.println(pasaje1.toString());
        System.out.println("Pasajero: " + pasaje1.getCliente().getNombre());
        
        
        pasaje1.mostrarPasaje();
        pasaje1.validarCliente("18239772-5", 145);
        System.out.println("\n");
        pasaje1.validarDescuentoTerceraEdad("18239772-5"); 
        pasaje1.obtenerDescuentoMaximo("T");
    }
    
}
