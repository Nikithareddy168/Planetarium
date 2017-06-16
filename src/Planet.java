

public abstract class Planet extends AstroEntity {
	
	protected double distFromSun;
	protected double siderealDay;
	protected double orbitalPeriod;
	protected int numOfSatellites;
	protected String[] threeBigSatellites;
	protected boolean hasRings;

	public String retSatellNames() {
		String satellites = "";
		if (this.numOfSatellites > 0)
			for (int i = 0; i < threeBigSatellites.length; i++) {
				satellites = satellites + threeBigSatellites[i] + " ";
			}
		return satellites;
	}

	public Planet(double distFromSun, double siderealDay, double orbitalPeriod, int numOfSatellites,
			String[] threeBigSatellites, boolean hasRings) {
		super();
		this.distFromSun = distFromSun;
		this.siderealDay = siderealDay;
		this.orbitalPeriod = orbitalPeriod;
		this.numOfSatellites = numOfSatellites;
		this.threeBigSatellites = threeBigSatellites;
		this.hasRings = hasRings;
	}
	@Override

	public String getFactualSummary() {
		return /*"Common Name : " + this.commonName + "\nCelestial Classification : " + this.getCelestialClass()
				+ */"\nDistance From Sun :" + distFromSun + "\nSideRealDay : " + siderealDay + "\nOrbitalPeriod : "
				+ orbitalPeriod + "\nHas rings : " + hasRings + "\n NumOfSatellites : " + numOfSatellites + "\nSatelliteNames : " + this.retSatellNames()
				+ "\n";

	}



}