public class Articulo {
    protected String nombre;
    protected String modelo;
    protected String descripcion;
    protected double precio;


    public Articulo(){
        nombre = "";
        modelo = "";
        descripcion = "";
        precio = 0;
    }
    public Articulo(String nombre, String modelo, String descripcion, double precio) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public Articulo(Articulo articulo){
        nombre = articulo.nombre;
        modelo = articulo.modelo;
        descripcion = articulo.descripcion;
        precio = articulo.precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
