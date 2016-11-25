package ar.com.smartnet.tp_final_v2;

/**
 * Created by leo on 25/11/2016.
 */

public class Articulo {
    private String Codigo ;
    private float cantidad ;
    private float importe ;

    public Articulo(String codigo, float cantidad, float importe) {
        Codigo = codigo;
        this.cantidad = cantidad;
        this.importe = importe;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String codigo) {
        Codigo = codigo;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public float getImporte() {
        return importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }
}
