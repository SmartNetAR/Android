package ar.com.smartnet.tp_final_v2;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/*
TODO:LISTA ARTICULOS

 */

public class EditaPedidoActivity extends AppCompatActivity {

    private int pos = -1 ;
    private EditText edit_cliente ;
    private EditText edit_codigo ;
    private EditText edit_cantidad ;
    private EditText edit_importe ;
    private Button btn_cliente ;
    private Button btn_agregar ;
    private ListView lista_articulos_pedido ;
    private ArticulosPedidosAdapter adapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edita_pedido);

        adapter = new ArticulosPedidosAdapter() ;

        edit_cliente = (EditText) findViewById(R.id.txtCliente) ;
        edit_codigo = (EditText) findViewById(R.id.txtCodigo) ;
        edit_cantidad = (EditText) findViewById(R.id.txtCantidad) ;
        edit_importe = (EditText) findViewById(R.id.txtImporte) ;
        btn_cliente = (Button) findViewById(R.id.btnCliente) ;
        btn_agregar = (Button) findViewById(R.id.btnAgregar) ;
        lista_articulos_pedido = (ListView) findViewById(R.id.lista_articulos_pedido) ;
        lista_articulos_pedido.setAdapter( adapter );


        Intent intent = getIntent();
        pos = intent.getIntExtra("pos", -1);
        if (pos != -1){
            Pedido pedido = ListaPedidos.getPedido(pos) ;
            edit_cliente.setText(pedido.getCliente().toString()) ;
            edit_codigo.setText(pedido.getArticulos().toString()) ;

            /*edit_titulo.setText(nota.getTitulo());
            edit_texto.setText(nota.getTexto());
            */
        }
    }

    private class ArticulosPedidosAdapter extends ArrayAdapter<Articulo> {
        ArticulosPedidosAdapter() {
            super(EditaPedidoActivity.this, R.layout.item_lista_edita_pedido, ListaArticulosPedido.get() );

        }

        @NonNull
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View result = convertView ;
            if (result == null) {
                LayoutInflater inflater = getLayoutInflater();
                result = inflater.inflate(R.layout.item_lista_edita_pedido, parent, false);
            }
            Articulo articulo = getItem(position);
            /*TextView titulo = (TextView) result.findViewById(R.id.titulo) ;
            titulo.setText(
                    pedido.getCliente().toString() + "  $ " +
                            (String) String.valueOf(pedido.getImporteTotal())
            ) ;
            TextView resumen = (TextView) result.findViewById(R.id.resumen);
            resumen.setText( pedido.Resumen() ) ;
            //(String) String.valueOf(pedido.getImporteTotal())) ;//.replace("\n", " "));
            */
            return result ;
        }
    }
}
