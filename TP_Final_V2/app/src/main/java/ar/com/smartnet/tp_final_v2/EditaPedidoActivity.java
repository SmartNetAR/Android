package ar.com.smartnet.tp_final_v2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edita_pedido);

        edit_cliente = (EditText) findViewById(R.id.txtCliente) ;
        edit_codigo = (EditText) findViewById(R.id.txtCodigo) ;
        edit_cantidad = (EditText) findViewById(R.id.txtCantidad) ;
        edit_codigo = (EditText) findViewById(R.id.txtCodigo) ;
        btn_cliente = (Button) findViewById(R.id.btnCliente) ;
        btn_agregar = (Button) findViewById(R.id.btnAgregar) ;
        lista_articulos_pedido = (ListView) findViewById(R.id.lista_articulos_pedido) ;


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
}
