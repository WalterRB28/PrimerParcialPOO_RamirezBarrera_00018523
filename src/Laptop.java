public class Laptop extends Articulo{
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


}
