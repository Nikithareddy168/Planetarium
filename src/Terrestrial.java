
public class Terrestrial extends Planet{
	boolean hasIceCaps;

	public String getCelestialClass() {
		return ("Terrestrial Planets");
	}

	public Terrestrial(String commonName, AstroUnit distFromSun, EarthDay siderealDay, EarthDay orbitalPeriod,
			boolean hasRings, int numOfSatellites, String[] threeBigSatellites, boolean hasIceCaps,MicroSunUnit relativeMassInMS,EarthMassUnit relativeMassInEM) {
		super(distFromSun, siderealDay, orbitalPeriod, numOfSatellites, threeBigSatellites, hasRings,relativeMassInMS,relativeMassInEM);
		this.hasIceCaps = hasIceCaps;
		this.commonName = commonName;
	}

	public String getFactualSummary() {
		return "Common Name : "+ commonName +"\nCelestial Classifications : "+getCelestialClass()+super.getFactualSummary() + "\nHas IceCaps? : " + hasIceCaps + "\n";
	}
}
