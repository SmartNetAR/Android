package ar.com.smartnet.tp_final_v2;

/**
 * Created by leo on 25/11/2016.
 */

public class Cliente {
    private int Id ;
    private String Nombre ;
    private String Domicilio ;
    private String Telefono ;

    public Cliente(int id, String nombre, String domicilio, String telefono) {
        Id = id;
        Nombre = nombre;
        Domicilio = domicilio;
        Telefono = telefono;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public void setDomicilio(String domicilio) {
        Domicilio = domicilio;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

}
