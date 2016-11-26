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
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final int NUEVO_PEDIDO = 0;
    public static final int EDITA_PEDIDO = 1;

    private ListView lista_pedidos ;
    private PedidosAdapter adapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new PedidosAdapter() ;

        lista_pedidos = (ListView) findViewById(R.id.lista_pedidos) ;
        lista_pedidos.setAdapter( adapter );

        lista_pedidos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int pos, long id) {
                Context context = getApplicationContext();
                CharSequence text = "Hello toast!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

                onEditaPedido(pos);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode) {
            case NUEVO_PEDIDO:
            case EDITA_PEDIDO:
                if (resultCode == RESULT_OK) {
                    adapter.notifyDataSetChanged();
                }
                break;
            default:
                super.onActivityResult(requestCode, resultCode, data);
        }
    }

    private void onEditaPedido(int pos) {
        Intent intent = new Intent(this, EditaPedidoActivity.class);
        intent.putExtra("pos", pos);
        startActivityForResult(intent, EDITA_PEDIDO);

    }

    public void onNuevoPedido(View view) {

        Intent intent = new Intent(this, EditaPedidoActivity.class);
        startActivityForResult(intent, NUEVO_PEDIDO);

    }


    private class PedidosAdapter extends ArrayAdapter<Pedido> {
        PedidosAdapter() {
            super(MainActivity.this, R.layout.item_lista_pedidos, ListaPedidos.get( ) );

        }

        @NonNull
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View result = convertView ;
            if (result == null) {
                LayoutInflater inflater = getLayoutInflater();
                result = inflater.inflate(R.layout.item_lista_pedidos, parent, false);
            }
            Pedido pedido = getItem(position);
            TextView titulo = (TextView) result.findViewById(R.id.titulo) ;
            titulo.setText(
                    pedido.getCliente().toString() + "  $ " +
                    (String) String.valueOf(pedido.getImporteTotal())
            ) ;
            TextView resumen = (TextView) result.findViewById(R.id.resumen);
            resumen.setText( pedido.Resumen() ) ;
                    //(String) String.valueOf(pedido.getImporteTotal())) ;//.replace("\n", " "));
            return result ;
        }
    }
}
