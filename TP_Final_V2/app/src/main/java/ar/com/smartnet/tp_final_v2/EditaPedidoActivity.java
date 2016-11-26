package ar.com.smartnet.tp_final_v2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuInflater;
import android.widget.EditText;
import android.widget.ListView;

public class EditaPedidoActivity extends AppCompatActivity {

    private EditText edit_cliente ;
    private EditText edit_codigo ;
    private EditText edit_cantidad ;
    private EditText edit_importe ;
    private ListView lista_pedido ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState) ;
        setContentView(R.layout.activity_edita_pedido) ;

        edit_cliente = (EditText) findViewById(R.id.editCliente) ;
        edit_codigo = (EditText) findViewById(R.id.editCodigo) ;
        edit_cantidad = (EditText) findViewById(R.id.editCantidad) ;
        edit_importe = (EditText) findViewById(R.id.editImporte) ;
        lista_pedido = (ListView) findViewById(R.id.lista_pedidos) ;

    }
}
