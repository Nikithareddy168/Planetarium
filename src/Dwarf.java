
public class Dwarf extends Planet{
	boolean hasIrregularShape;
	
	public String getCelestialClass() {
		return ("Dwarf Planets");
	}

	public Dwarf(String commonName, double distFromSun, double siderealDay, double orbitalPeriod,
			boolean hasRings, int numOfSatellites, String[] threeBigSatellites, boolean hasIrregularShape) {
			super(distFromSun, siderealDay, orbitalPeriod, numOfSatellites, threeBigSatellites, hasRings);
			this.hasIrregularShape = hasIrregularShape;
			this.commonName = commonName;
	}

	public String getFactualSummary() {
			return "Common Name : "+commonName+super.getFactualSummary() + "HasIrregularShape: " + hasIrregularShape +"\n";
	}
}
