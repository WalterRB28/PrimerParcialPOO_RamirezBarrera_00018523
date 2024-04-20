public class Laptop extends Articulo implements ArticuloCalcPrecDesc{
    private int ramLaptop;
    private String procesadorLaptop;

    public Laptop(Articulo articulo, int ramLaptop, String procesadorLaptop){
        super(articulo);
        this.ramLaptop = ramLaptop;
        this.procesadorLaptop = procesadorLaptop;
    }

    public int getRamLaptop() {
        return ramLaptop;
    }

    public void setRamLaptop(int ramLaptop) {
        this.ramLaptop = ramLaptop;
    }

    public String getProcesadorLaptop() {
        return procesadorLaptop;
    }

    public void setProcesadorLaptop(String procesadorLaptop) {
        this.procesadorLaptop = procesadorLaptop;
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
            + "RAM: "+this.getRamLaptop()
            + "Procesador: "+this.getProcesadorLaptop());
    }
}
