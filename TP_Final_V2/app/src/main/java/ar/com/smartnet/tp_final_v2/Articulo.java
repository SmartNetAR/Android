package ar.com.smartnet.tp_final_v2;

/**
 * Created by leo on 25/11/2016.
 */

public class Articulo {
    private String codigo ;
    private String descripcion ;
    private float cantidad ;
    private float importe ;

    public Articulo(String codigo, String descripcion, float cantidad, float importe) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.importe = importe;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

    @Override
    public String toString() {
        return  descripcion + '\'' +
                " = " + cantidad +
                ',';
    }
}
