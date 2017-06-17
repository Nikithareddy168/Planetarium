
public class GasGaint extends Planet{
	boolean hasCloudBelts;
	public String getCelestialClass() {
		return ("Gas Giants");
	}
	public GasGaint(String commonName, double distFromSun, double siderealDay, double orbitalPeriod,
			boolean hasRings, int numOfSatellites, String[] threeBigSatellites, boolean hasCloudBelts) {
		super(distFromSun, siderealDay, orbitalPeriod, numOfSatellites, threeBigSatellites, hasRings);
		this.hasCloudBelts = hasCloudBelts;
		this.commonName = commonName;
	}

	

	public String getFactualSummary() {

		return "Common Name :"+commonName+super.getFactualSummary() + "Has Cloud Belts: " + hasCloudBelts +"\n";

	}
}
