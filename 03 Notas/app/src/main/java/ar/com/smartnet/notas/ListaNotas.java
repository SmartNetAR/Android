package ar.com.smartnet.notas;

import android.content.Context;

import java.util.ArrayList;

/**
 * Created by leo on 21/11/2016.
 */

public class ListaNotas {
    private static ArrayList<Nota> notas;

    public static ArrayList<Nota> get(Context context) {
        if (notas == null) {
            notas = NotasDB.loadNotas(context);
        }
        return notas;
    }

    public static void nueva(String titulo, String texto) {
        Nota nota = new Nota(titulo, texto);
        notas.add(nota);
    }

    public static void modifica(int pos, String titulo, String texto) {
        Nota nota = notas.get(pos);
        nota.setTitulo(titulo);
        nota.setTexto(texto);
    }

    public static Nota getNota(int pos){
        return notas.get(pos);
    }
}
