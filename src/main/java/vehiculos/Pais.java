package vehiculos;
import java.util.*;

public class Pais {
	
	private String nombre; 
	private int numVehiculos=0;
	private static ArrayList<Pais> listapaises = new ArrayList<Pais>();
	public Pais (String nombre) {
		this.nombre = nombre;
		listapaises.add(this);	
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void addVehiculo() {
		numVehiculos = numVehiculos + 1;
	}
	
    public static Pais paisMasVendedor(){
        Pais maxprod = listapaises.get(0);
        for (Pais pais: listapaises){
            if (maxprod.getNumVehiculos() < pais.getNumVehiculos()){
                maxprod= pais;
            }
        }
        return maxprod;
    }
}