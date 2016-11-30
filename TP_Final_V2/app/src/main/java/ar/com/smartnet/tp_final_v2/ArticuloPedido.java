package ar.com.smartnet.tp_final_v2;

/**
 * Created by leo on 28/11/2016.
 */

public class ArticuloPedido {
    private int Id ;
    private String codigo ;
    private float cantidad ;
    private float importe;
    private int IdPedido ;

    public ArticuloPedido(int id, String codigo, float cantidad, float importe, int idPedido) {
        Id = id;
        this.codigo = codigo ;
        this.cantidad = cantidad;
        this.importe = importe;
        IdPedido = idPedido;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    public int getIdPedido() {
        return IdPedido;
    }

    public void setIdPedido(int idPedido) {
        IdPedido = idPedido;
    }

    @Override
    public String toString() {
        return "ArticuloPedido{" +
                "Id=" + Id +
                ", cantidad=" + cantidad +
                ", importe=" + importe +
                ", IdPedido=" + IdPedido +
                '}';
    }
}


