
public class Terrestrial extends Planet{
	boolean hasIceCaps;

	public String getCelestialClass() {
		return ("Terrestrial Planets");
	}

	public Terrestrial(String commonName, double distFromSun, double siderealDay, double orbitalPeriod,
			boolean hasRings, int numOfSatellites, String[] threeBigSatellites, boolean hasIceCaps) {
		super(distFromSun, siderealDay, orbitalPeriod, numOfSatellites, threeBigSatellites, hasRings);
		this.hasIceCaps = hasIceCaps;
		this.commonName = commonName;
	}

	public String getFactualSummary() {
		return "Common Name : "+ commonName +"\nCelestial Classifications : "+getCelestialClass()+super.getFactualSummary() + "Has IceCaps? : " + hasIceCaps + "\n";
	}
}
