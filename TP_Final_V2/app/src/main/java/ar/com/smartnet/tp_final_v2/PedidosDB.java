package ar.com.smartnet.tp_final_v2;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

/**
 * Created by leo on 25/11/2016.
 */

public class PedidosDB {

    static class PedidosDbHelper extends SQLiteOpenHelper {

        private static final String DATABASE_NAME = "pedidos.db";
        private static final int DATABASE_VERSION = 1;
        private static final String SQL_CREATE_TABLA_PEDIDOS =
                "CREATE TABLE Pedidos (" +
                        "id INTEGER PRYMARY KEY," +
                        "nombre TEXT," +
                        "domicilio TEXT" +
                        "telefono TEXT" +
                        "codigo TEXT" +
                        "descripcion TEXT" +
                        "cantidad INTEGER" +
                        "importe INTEGER" +
                        ")";

        public PedidosDbHelper(Context context) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL(SQL_CREATE_TABLA_PEDIDOS);
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            // No hay que hacer nada aquí de momento ...
        }
    }

    private static PedidosDbHelper helper;
/*
    public static ArrayList<Pedido> loadNotas(Context context) {
        ArrayList<Pedido> resultado = new ArrayList<>();

        if (helper == null) {
            helper = new PedidosDbHelper(context);
        }
        SQLiteDatabase db = helper.getReadableDatabase();

        String[] columnas = {"id", "titulo", "texto"};
        Cursor c = db.query("Notas", columnas, null, null, null, null, null, null);
        if (c != null && c.getCount() > 0) {
            while (c.moveToNext()) {
                long id = c.getLong(c.getColumnIndexOrThrow("id"));
                String titulo = c.getString(c.getColumnIndexOrThrow("titulo"));
                String texto = c.getString(c.getColumnIndexOrThrow("texto"));
                //resultado.add(new Pedido(titulo, texto));

                ArrayList<Articulo> articulos = new ArrayList<>() ;

                articulos.add(new Articulo("cod1", "articulo 1", 2.0f, 12.20f ));
                articulos.add(new Articulo("cod3", "articulo 3", 2.0f, 15.20f ));
                resultado.add(new Pedido( new Cliente( 1 , "Leo Casales", "R.de Escalada", "223 4-213264"), fecha ) ) ;

            }
        }
        if (c != null) {
            c.close();
        }
        db.close();

        return resultado;
    }
*/
}
