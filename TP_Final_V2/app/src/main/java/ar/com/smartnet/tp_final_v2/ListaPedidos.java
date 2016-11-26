package ar.com.smartnet.tp_final_v2;

import android.content.Context;
import android.content.pm.PermissionInfo;

import java.util.ArrayList;

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

    public static void nueva(int id, Cliente cliente, ArrayList<Articulo> articulos) {
        Pedido pedido = new Pedido(id, cliente, articulos);
        pedidos.add( pedido );
    }

    public static void modifica(int id, Cliente cliente, float importe ) {
        Pedido pedido = pedidos.get( id );
        pedido.setCliente( cliente );
        pedido.setImporteTotal( importe );
    }

    public static ArrayList<Pedido> loadPedidos() {
        ArrayList<Pedido> resultado = new ArrayList<>() ;
        ArrayList<Articulo> articulos = new ArrayList<>() ;

        articulos.add(new Articulo("cod1", "articulo 1", 2.0f, 12.20f ));
        articulos.add(new Articulo("cod3", "articulo 3", 2.0f, 15.20f ));
        resultado.add(new Pedido( 1 , new Cliente( 1 , "Leo Casales", "R.de Escalada", "223 4-213264"), articulos ) ) ;

        ArrayList<Articulo> articulos2 = new ArrayList<>() ;
        articulos2.add(new Articulo("cod2", "teclado USB", 2.0f, 12.20f ));
        articulos2.add(new Articulo("cod4", "mouse USB", 1.0f, 9.20f ));
        resultado.add(new Pedido( 2 , new Cliente( 2 , "Tizi Casales", "Mar del Plata", "470-1520" ), articulos2  ) ) ;

        return resultado ;
    }

    public static Pedido getPedido(int pos){
        return pedidos.get(pos);
    }
}
