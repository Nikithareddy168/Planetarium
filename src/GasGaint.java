
public class GasGaint extends Planet{
	boolean hasCloudBelts;
	public String getCelestialClass() {
		return ("Gas Giants");
	}
	public GasGaint(String commonName, AstroUnit distFromSun, EarthDay siderealDay, EarthDay orbitalPeriod,
			boolean hasRings, int numOfSatellites, String[] threeBigSatellites, boolean hasCloudBelts,MicroSunUnit relativeMassInMS,EarthMassUnit relativeMassInEM) {
		super(distFromSun, siderealDay, orbitalPeriod, numOfSatellites, threeBigSatellites, hasRings,relativeMassInMS,relativeMassInEM);
		this.hasCloudBelts = hasCloudBelts;
		this.commonName = commonName;
	}

	

	public String getFactualSummary() {

		return "Common Name :"+commonName+super.getFactualSummary() + "\nHas Cloud Belts: " + hasCloudBelts +"\n";

	}
}
