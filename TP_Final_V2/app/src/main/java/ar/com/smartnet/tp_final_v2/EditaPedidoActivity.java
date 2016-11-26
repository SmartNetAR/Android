package ar.com.smartnet.tp_final_v2;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class EditaPedidoActivity extends AppCompatActivity {

    private EditText edit_cliente ;
    private EditText edit_codigo ;
    private EditText edit_cantidad ;
    private EditText edit_importe ;
    private Button btn_add ;
    private ListView lista_pedido ;
    private ArrayList<Articulo> articulos ;
    private ArticulosAdapter adapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState) ;
        setContentView(R.layout.activity_edita_pedido) ;

        edit_cliente = (EditText) findViewById(R.id.editCliente) ;
        edit_codigo = (EditText) findViewById(R.id.editCodigo) ;
        edit_cantidad = (EditText) findViewById(R.id.editCantidad) ;
        edit_importe = (EditText) findViewById(R.id.editImporte) ;
        lista_pedido = (ListView) findViewById(R.id.lista_pedidos) ;
        lista_pedido.setAdapter( adapter );
        btn_add = (Button) findViewById(R.id.btnAdd) ;
        articulos = new ArrayList<>() ;

    }


    public void OnAddArticulo (View view) {
        articulos.add(new Articulo(
                edit_codigo.toString(),
                "descripcion",
                Float.valueOf(edit_cantidad.toString()),
                Float.valueOf(edit_importe.toString())
        ));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.edita_pedido_options, menu);
        return true;
    }


    private class ArticulosAdapter extends ArrayAdapter<Articulo> {
        ArticulosAdapter() {
            super(EditaPedidoActivity.this, R.layout.item_lista_edita_pedido, articulos);

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

            TextView titulo = (TextView) result.findViewById(R.id.titulo) ;
            /*titulo.setText(
                    pedido.getCliente().toString() + "  $ " +
                            (String) String.valueOf(pedido.getImporteTotal())
            ) ;
            */
            titulo.setText( articulo.getDescripcion().toString() );
            TextView resumen = (TextView) result.findViewById(R.id.resumen);
            resumen.setText( String.valueOf( articulo.getCantidad()) ) ;
            //(String) String.valueOf(pedido.getImporteTotal())) ;//.replace("\n", " "));
            return result ;
        }
    }

    /*
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.guardar:
                String titulo =  edit_titulo.getText().toString();
                String texto =  edit_texto.getText().toString();
                if (pos != -1) {
                    ListaNotas.modifica(pos, titulo, texto);
                }else {
                    ListaNotas.nueva(titulo, texto);
                }
                setResult(RESULT_OK);
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    */
}
