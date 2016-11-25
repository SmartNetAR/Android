package ar.com.smartnet.tp_final_v2;

import java.util.ArrayList;

/**
 * Created by leo on 24/11/2016.
 */

public class Pedido {
    private int id ;
    private String cliente ;
    private static ArrayList<Articulo> articulos ;
    private float importeTotal ;

    public Pedido(int id, String cliente) {
        this.id = id;
        this.cliente = cliente;
        this.importeTotal = 0;
    }

    public String getCliente() {
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

    public void setCliente(String cliente) {
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
        return cliente;
    }
}
