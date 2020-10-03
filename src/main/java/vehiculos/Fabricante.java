<<<<<<< HEAD
package vehiculos;
import java.util.ArrayList;

public class Fabricante {
	
	private String nombre;
	private Pais pais;
	private int numVehiculos=0;
	private static ArrayList<Fabricante> numfabric = new ArrayList<Fabricante>();
	public Fabricante(String nombre, Pais pais) {
		this.nombre=nombre;
		this.pais=pais;
		numfabric.add(this);
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Pais getPais() {
		return pais;
	}
	
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	public int getNumVehiculos() {
		return numVehiculos;
	}
	public void addVehiculo() {
		numVehiculos ++;
		this.pais.addVehiculo();
	}
	
	public static Fabricante fabricaMayorVentas() {
        Fabricante mayorp = Fabricante.numfabric.get(0);
        for (Fabricante fabricante: numfabric){
            if(mayorp.getNumVehiculos() < fabricante.getNumVehiculos()){
                mayorp = fabricante;
            }
        }
        return mayorp;
	}
}   

			


=======
package vehiculos;
import java.util.ArrayList;

public class Fabricante {
	
	private String nombre;
	private Pais pais;
	private int numVehiculos=0;
	private static ArrayList<Fabricante> numfabric = new ArrayList<Fabricante>();
	public Fabricante(String nombre, Pais pais) {
		this.nombre=nombre;
		this.pais=pais;
		numfabric.add(this);
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getPais() {
		return pais;
	}
	
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	public void getNumVehiculos() {
		return numVehiculos;
	}
	public void addVehiculo() {
		numVehiculos ++;
		this.pais.addVehiculo();
	}
	
	public static Fabricante fabricaMayorVentas() {
        Fabricante mayorp = Fabricante.numfabric.get(0);
        for (Fabricante fabricante: numfabric){
            if(mayorp.getNumVehiculos() < fabricante.getNumVehiculos()){
                mayorp = fabricante;
            }
        }
        return mayorp;
	}
}   

			


>>>>>>> 093a50ce61d7e493ac4d3ef2bfefbeae5fe77d5b
