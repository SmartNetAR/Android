package ar.com.smartnet.tp_final_v2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView lista_pedidos ;
    private PedidoAdapter adapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new PedidoAdapter() ;

        lista_pedidos = (ListView) findViewById(R.id.lista_pedidos) ;
        lista_pedidos.setAdapter( adapter );
    }

    private class PedidoAdapter extends ArrayAdapter<Pedido> {
        PedidoAdapter() {
            super(MainActivity.this, R.layout.item_lista_pedidos, ListaPedidos.get( ) );

        }
    }
}
