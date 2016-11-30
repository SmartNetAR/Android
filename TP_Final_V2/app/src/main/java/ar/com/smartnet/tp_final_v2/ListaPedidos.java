package ar.com.smartnet.tp_final_v2;

import android.content.Context;
import android.content.pm.PermissionInfo;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by leo on 25/11/2016.
 */

public class ListaPedidos {
    private static ArrayList<Pedido> pedidos ;

    public static ArrayList<Pedido> get() {
        if (pedidos == null ) {
            pedidos = loadPedidos();
        }

        return pedidos ;
    }

    public static void nuevo(Cliente cliente, Date fecha ) {
        Pedido pedido = new Pedido( cliente, fecha ) ;
        pedidos.add( pedido );
    }

    public static void modifica( int id, Cliente cliente, Date fecha ) {
        Pedido pedido = pedidos.get( id );
        pedido.setCliente( cliente );
        pedido.setFecha( fecha );
    }


    public static ArrayList<Pedido> loadPedidos() {
        Date fecha = new Date() ;
        Cliente cliente ;
        Pedido pedido ;
        ArrayList<Pedido> resultado = new ArrayList<>() ;

        cliente = new Cliente( 1 , "Leo Casales", "R.de Escalada", "223 4-213264" ) ;
        pedido = new Pedido( cliente, fecha ) ;
        pedido.addArticulo( new ArticuloPedido( 1, "cod10", 10f, 100f, 1 ));
        pedido.addArticulo( new ArticuloPedido( 2, "cod11", 5f, 200f, 1 ));
        resultado.add ( pedido ) ;

        cliente = new Cliente( 1 , "Tiziano Casales", "R.de Escalada", "470-1520" ) ;
        pedido = new Pedido( cliente, fecha ) ;
        pedido.addArticulo( new ArticuloPedido( 1, "cod12", 2f, 120f, 2 ));
        pedido.addArticulo( new ArticuloPedido( 2, "cod20", 2f, 600f, 2 ));
        resultado.add ( pedido ) ;

        return resultado ;
    }


    public static Pedido getPedido(int pos){
        return pedidos.get(pos);
    }
}
