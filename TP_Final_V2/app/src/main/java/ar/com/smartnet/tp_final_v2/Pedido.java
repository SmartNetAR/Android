package ar.com.smartnet.tp_final_v2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 * Created by leo on 24/11/2016.
 */

public class Pedido {
    private int id ;
    private Date fecha ;
    private Cliente cliente ;
    private ArrayList<ArticuloPedido> articulosPedido ;
    private float importeTotal ;

    public Pedido(Cliente cliente, Date fecha) {
        this.fecha = fecha ;
        this.cliente = cliente;
        this.importeTotal = 0f;
        this.articulosPedido = new ArrayList<>() ;
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public ArrayList<ArticuloPedido> getArticulos( int id ) {
        return articulosPedido;

    }

    public float getImporteTotal() {
        return importeTotal;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    public void addArticulo ( ArticuloPedido articuloPedido) {
        this.articulosPedido.add( articuloPedido );

    }

    public void setImporteTotal(float importeTotal) {
        this.importeTotal = importeTotal;
    }

    @Override
    public String toString() {
        return this.cliente.toString();
    }

    public String Resumen () {
        String resultado ;

        if ( this.articulosPedido == null) {
            resultado = "resumen del pedido";
        } else {
            resultado = this.articulosPedido.toString();
        }
        return  resultado ;
    }
}
