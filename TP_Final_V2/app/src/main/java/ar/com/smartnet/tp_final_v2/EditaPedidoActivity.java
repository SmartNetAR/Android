package ar.com.smartnet.tp_final_v2;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/*
TODO:LISTA ARTICULOS

 */

public class EditaPedidoActivity extends AppCompatActivity {

    private int pos = -1 ;
    private Pedido pedido ;
    private EditText edit_cliente ;
    private EditText edit_codigo ;
    private EditText edit_cantidad ;
    private EditText edit_importe ;
    private EditText edit_descripcion ;
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
        edit_descripcion = (EditText) findViewById(R.id.txtDescripcion) ;
        btn_cliente = (Button) findViewById(R.id.btnCliente) ;
        btn_agregar = (Button) findViewById(R.id.btnAgregar) ;
        lista_articulos_pedido = (ListView) findViewById(R.id.lista_articulos_pedido) ;
        lista_articulos_pedido.setAdapter( adapter );

        lista_articulos_pedido.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int pos, long id) {
                Context context = getApplicationContext();
                /*CharSequence text = "Hello toast!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
                */

                onEditaArticuloPedido(pos);
            }


        });

        Intent intent = getIntent();
        pos = intent.getIntExtra("pos", -1);
        if (pos != -1){
            pedido = ListaPedidos.getPedido(pos) ;
            edit_cliente.setText(pedido.getCliente().toString()) ;
            //edit_codigo.setText(pedido.getArticulos().toString()) ;

            /*edit_titulo.setText(nota.getTitulo());
            edit_texto.setText(nota.getTexto());
            */
        }
    }

    public void onAgregarArticulo(View view) {
        ListaArticulosPedido.nuevo(
                1,
                edit_codigo.getText().toString(),
                Float.valueOf( edit_cantidad.getText().toString() ) ,
                Float.valueOf( edit_importe.getText().toString() ) ,
                1
                );
        /*ListaArticulosPedido.nuevo(
                edit_codigo.getText().toString() ,
                edit_descripcion.getText().toString() ,
                Float.valueOf( edit_cantidad.getText().toString() ) ,
                Float.valueOf( edit_importe.getText().toString() )
        );
        */
                /*
                edit_codigo.toString() ,
                "una descripcion" ,
                Float.valueOf(edit_cantidad.toString()) ,
                Float.valueOf(edit_importe.toString())
        );
        */
        adapter.notifyDataSetChanged();
    }

    private void onEditaArticuloPedido(int pos) {
        ArticuloPedido articulo ;
        //articulo = pedido.getArticulos().get(pos) ;
        //edit_codigo.setText( articulo.getCodigo().toString() );
        //edit_cantidad.setText( String.valueOf( articulo.getCantidad() ) );
        //edit_importe.setText( String.valueOf( articulo.getImporte() ) );


    }

    private class ArticulosPedidosAdapter extends ArrayAdapter<ArticuloPedido> {
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
            ArticuloPedido articulo = getItem(position);
            TextView titulo = (TextView) result.findViewById(R.id.titulo) ;
            titulo.setText(
                    articulo.getCodigo() + "  $ " +
                            (String) String.valueOf(articulo.getImporte())
            ) ;
            TextView resumen = (TextView) result.findViewById(R.id.resumen);
            resumen.setText( String.valueOf(articulo.getCantidad()) ) ;
            //(String) String.valueOf(pedido.getImporteTotal())) ;//.replace("\n", " "));

            return result ;
        }
    }
}
