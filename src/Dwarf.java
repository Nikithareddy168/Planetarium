
public class Dwarf extends Planet{
	boolean hasIrregularShape;
	
	public String getCelestialClass() {
		return ("Dwarf Planets");
	}

	public Dwarf(String commonName, AstroUnit distFromSun, EarthDay siderealDay, EarthDay orbitalPeriod,
			boolean hasRings, int numOfSatellites, String[] threeBigSatellites, boolean hasIrregularShape,MicroSunUnit relativeMassInMS,EarthMassUnit relativeMassInEM) {
			super(distFromSun, siderealDay, orbitalPeriod, numOfSatellites, threeBigSatellites, hasRings,relativeMassInMS,relativeMassInEM);
			this.hasIrregularShape = hasIrregularShape;
			this.commonName = commonName;
	}

	public String getFactualSummary() {
			return "Common Name : "+commonName+super.getFactualSummary() + "Has Irregular Shape: " + hasIrregularShape +"\n";
	}
}
