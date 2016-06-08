import java.util.HashSet;
import java.util.Set;

class Town {
	private String name;
	private String country;
	private int population;

	public Town(String name, String country, int population) {
		super();
		this.name = name;
		this.country = country;
		this.population = population;
	}

	public Town() {
		this("", "", 0);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public void towns() {
		Set<String> town = new HashSet<String>();
		town.add("Sofia");
		town.add("Varna");
		town.add("Burgas");
		town.add("Plovdiv");
		town.add("Stara Zagora");
		System.out.println(town);
		boolean contain = town.contains("Varna");
		System.out.println(contain);
		town.remove("Varnas");
		System.out.println(town);
	}
}

public class Main {

	public static void main(String[] args) {
		Town varna = new Town("Varna", "Bulgaria", 330000);
		varna.towns();
	}
}
