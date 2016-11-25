package ar.com.smartnet.tp_final_v2;

import java.util.ArrayList;

/**
 * Created by leo on 24/11/2016.
 */

public class Pedido {
    private int id ;
    private Cliente cliente ;
    private static ArrayList<Articulo> articulos ;
    private float importeTotal ;

    public Pedido(int id, Cliente cliente, ArrayList<Articulo> articulos) {
        this.id = id;
        this.cliente = cliente;
        this.articulos = new ArrayList<>();
        this.articulos = articulos;
        this.importeTotal = 0f;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static ArrayList<Articulo> getArticulos() {
        return articulos;
    }

    public float getImporteTotal() {
        return importeTotal;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public static void setArticulos(ArrayList<Articulo> articulos) {
        Pedido.articulos = articulos;
    }

    public void setImporteTotal(float importeTotal) {
        this.importeTotal = importeTotal;
    }

    @Override
    public String toString() {
        return this.cliente.toString();
    }

    public String Resumen () {
        return this.articulos.toString();
    }
}
