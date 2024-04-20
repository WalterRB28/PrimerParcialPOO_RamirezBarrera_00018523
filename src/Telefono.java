public class Telefono extends Articulo implements ArticuloCalcPrecDesc{
    private int cantidadCamara;
    private int almacenamientoTelefono;

    public Telefono(Articulo articulo, int cantidadCamara, int almacenamientoTelefono){
        super(articulo);
        this.cantidadCamara = cantidadCamara;
        this.almacenamientoTelefono = almacenamientoTelefono;
    }

    public int getCantidadCamara() {
        return cantidadCamara;
    }

    public void setCantidadCamara(int cantidadCamara) {
        this.cantidadCamara = cantidadCamara;
    }

    public int getAlmacenamientoTelefono() {
        return almacenamientoTelefono;
    }

    public void setAlmacenamientoTelefono(int almacenamientoTelefono) {
        this.almacenamientoTelefono = almacenamientoTelefono;
    }

    @Override
    public double obtenerPrecio(double precio) {
        return this.precio;
    }

    @Override
    public void descripcionArticulo() {
        System.out.println("Nombre: "+super.getNombre()
                + "Modelo: "+super.getModelo()
                + "Descrpcion: "+super.getDescripcion()
                + "Precio: "+super.getPrecio()
                + "Cantidad de Camaras: "+this.getCantidadCamara()
                + "Almacenamiento del Telefono: "+this.getAlmacenamientoTelefono());

    }
}
