
package modelo;

public class Ventas {
    int id;
    int idCliente;
    int idVendedor;
    String Serie;
    String Fecha;
    double monto;
    String estado;

    public Ventas() {
    }

    public Ventas(int id, int idCliente, int idVendedor, String Serie, String Fecha, double monto, String estado) {
        this.id = id;
        this.idCliente = idCliente;
        this.idVendedor = idVendedor;
        this.Serie = Serie;
        this.Fecha = Fecha;
        this.monto = monto;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    public String getSerie() {
        return Serie;
    }

    public void setSerie(String Serie) {
        this.Serie = Serie;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
