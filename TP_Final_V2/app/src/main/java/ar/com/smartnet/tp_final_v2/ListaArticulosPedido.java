package ar.com.smartnet.tp_final_v2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 * Created by leo on 26/11/2016.
 */

public class ListaArticulosPedido {
    private static ArrayList<ArticuloPedido> articulosPedido ;

    public static ArrayList<ArticuloPedido> get() {

        if (articulosPedido == null ) {
            articulosPedido = loadArticulosPedido();
        }

        return articulosPedido ;
    }

    public static void nuevo( int id, String codigo, float cantidad, float importe, int idPedido ) {
        ArticuloPedido articuloPedido = new ArticuloPedido( id, codigo, cantidad, importe, idPedido ) ;
        articulosPedido.add( articuloPedido );
    }

    /*public static void modifica( int id, Cliente cliente, Date fecha ) {
        Pedido pedido = pedidos.get( id );
        pedido.setCliente( cliente );
        pedido.setFecha( fecha );
    }
    */


    public static ArrayList<ArticuloPedido> loadArticulosPedido() {
        ArticuloPedido articulosPedido ;
        ArrayList<ArticuloPedido> resultado = new ArrayList<>() ;

        articulosPedido = new ArticuloPedido( 1, "cod10", 10f, 100f, 1 );
        resultado.add ( articulosPedido ) ;
        articulosPedido = new ArticuloPedido( 2, "cod20", 2f, 50f, 1 );
        resultado.add ( articulosPedido ) ;
        articulosPedido = new ArticuloPedido( 3, "cod16", 10f, 700f, 1 );
        resultado.add ( articulosPedido ) ;

        return resultado ;
    }


    public static ArticuloPedido getArticulo(int pos){
        return articulosPedido.get(pos);
    }
}