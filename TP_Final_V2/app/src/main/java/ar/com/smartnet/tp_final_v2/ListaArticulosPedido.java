package ar.com.smartnet.tp_final_v2;

import java.util.ArrayList;

/**
 * Created by leo on 26/11/2016.
 */

public class ListaArticulosPedido {
    private static ArrayList<Articulo> articulos ;

    public static ArrayList<Articulo> get() {
        if (articulos == null ) {
            articulos = loadArticulos();
        }
        return articulos ;
    }

    public static void nuevo(String codigo, String descripcion, float cantidad, float importe) {
        Articulo articulo = new Articulo(codigo, descripcion, cantidad, importe) ;
        articulos.add( articulo );
    }

    public static void modifica(int id, String codigo, String descripcion, float cantidad, float importe ) {
        Articulo articulo = articulos.get( id );
        articulo.setCodigo( codigo );
        articulo.setDescripcion( descripcion );
        articulo.setCantidad( cantidad );
        articulo.setImporte( importe );

    }

    public static ArrayList<Articulo> loadArticulos() {
        ArrayList<Articulo> resultado = new ArrayList<>() ;
        /*
        ArrayList<Articulo> articulos = new ArrayList<>() ;

        articulos.add(new Articulo("cod1", "articulo 1", 2.0f, 12.20f ));
        articulos.add(new Articulo("cod3", "articulo 3", 2.0f, 15.20f ));
        resultado.add(new Pedido( 1 , new Cliente( 1 , "Leo Casales", "R.de Escalada", "223 4-213264"), articulos ) ) ;

        ArrayList<Articulo> articulos2 = new ArrayList<>() ;
        articulos2.add(new Articulo("cod2", "teclado USB", 2.0f, 12.20f ));
        articulos2.add(new Articulo("cod4", "mouse USB", 1.0f, 9.20f ));
        resultado.add(new Pedido( 2 , new Cliente( 2 , "Tizi Casales", "Mar del Plata", "470-1520" ), articulos2  ) ) ;
        */

        return resultado ;
    }
}
