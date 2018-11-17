package unab.dev.appmayasoft;

public class Solicitud {
    String titulo,descripcion, monto,valor,categoria,porcentaje,diasPlazo;

    public Solicitud(String titulo, String descripcion, String monto, String valor, String categoria, String porcentaje, String diasPlazo) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.monto = monto;
        this.valor = valor;
        this.categoria = categoria;
        this.porcentaje = porcentaje;
        this.diasPlazo = diasPlazo;
    }

    public Solicitud() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(String porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getDiasPlazo() {
        return diasPlazo;
    }

    public void setDiasPlazo(String diasPlazo) {
        this.diasPlazo = diasPlazo;
    }
}
