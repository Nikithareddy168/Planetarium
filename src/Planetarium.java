
public class Planetarium {

	public static void main(String[] args) {
		Terrestrial mercury = new Terrestrial("Mercury", 0.39, 58.65, 87.97, false, 0, null, false);
		System.out.println(mercury.getFactualSummary());
		Terrestrial venus = new Terrestrial("Venus", 0.72, 243.1, 224.7, false, 0, null, false);
		System.out.println(venus.getFactualSummary());
		String[] earthBigSat = {"Moon"};
		Terrestrial earth = new Terrestrial("Earth", 1.0, 1.0, 365.256, false, 1, earthBigSat, true);
		System.out.println(earth.getFactualSummary());
		String[] marsBigSat = {"Phobos","Deimos"};
		Terrestrial mars = new Terrestrial("Mars", 1.524, 1.026, 687.0, false, 2, marsBigSat, true);
		System.out.println(mars.getFactualSummary());
		String[] plutoBigSat = {"Charon", "Nix", "Hydra"};
		Dwarf pluto = new Dwarf("Pluto", 39.53,6.386,90800,false,3, plutoBigSat, true);
		System.out.println(pluto.getFactualSummary());
		String[] jupiterBigSat = {"Ganymede", "Callisto", "Io"};
		GasGaint Jupiter = new GasGaint("Jupiter", 5.203, 0.41, 4332.71, true, 67, jupiterBigSat, true);
		System.out.println(Jupiter.getFactualSummary());
		String[] saturnBigSat = {"Titan", "Rhea", "Iapetus" };
		GasGaint Saturn = new GasGaint("Saturn",9.54, 0.426, 10759.5, true, 3, saturnBigSat, true);
		System.out.println(Saturn.getFactualSummary());
		String[] uranusBigSat = {"Titania", "Oberon", "Umbriel"};
		GasGaint Uranus = new GasGaint("Uranus",19.9, 0.717, 30685.0, true, 3, uranusBigSat, true);
		System.out.println(Uranus.getFactualSummary());
		String[] neptuneBigSat = {"Triton", "Proteus", "Nereid"};
		GasGaint Neptune = new GasGaint("Neptune",30.06, 0.671, 60190.0, true, 3, neptuneBigSat, true);
		System.out.println(Neptune.getFactualSummary());
	}

}
