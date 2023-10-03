package vehiculos;
import java.util.ArrayList;

public class Pais {
    private String nombre;
    public int carrosVendidos;
    private static ArrayList<Pais> paises = new ArrayList<>();

    public Pais (String nombre){
        this.nombre = nombre;
        paises.add(this);
    }
    public Pais (){}

    public String getNombre() {
        return nombre;
    }

    public int getCarrosVendidos() {
        return carrosVendidos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCarrosVendidos(int carrosVendidos) {
        this.carrosVendidos = carrosVendidos;
    }
    public static Pais paisMasVendedor(){
        int masVendedor = 0;
        Pais pais = null;
        for (Pais p: paises){
            if (p.getCarrosVendidos() > masVendedor){
                masVendedor = p.getCarrosVendidos();
                pais = p;
            }
        }
        return pais;
    }
}
