package ar.com.smartnet.tp_final_v2;

import android.content.Context;
import android.content.pm.PermissionInfo;

import java.util.ArrayList;

/**
 * Created by leo on 25/11/2016.
 */

public class ListaPedidos {
    private static ArrayList<Pedido> pedidos ;

    public static ArrayList<Pedido> get () {
        if (pedidos == null ) {
            pedidos = loadPedidos();
        }
        return pedidos ;
    }

    public static void nueva(int id, Cliente cliente) {
        Pedido pedido = new Pedido(id, cliente);
        pedidos.add( pedido );
    }

    public static void modifica(int id, Cliente cliente, float importe ) {
        Pedido pedido = pedidos.get( id );
        pedido.setCliente( cliente );
        pedido.setImporteTotal( importe );
    }

    public static ArrayList<Pedido> loadPedidos() {
        ArrayList<Pedido> resultado = new ArrayList<>() ;

        resultado.add(new Pedido(1, new Cliente(1, "leo", "R. de Escalada" , "223-4213264") )  ); ;
        resultado.add(new Pedido(2, new Cliente(2, "dai", "Necochea" , "223-5239845") )  ); ;

        return resultado ;
    }
}
