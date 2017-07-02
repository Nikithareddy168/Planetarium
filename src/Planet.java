

public abstract class Planet extends AstroEntity {
	
	protected AstroUnit distFromSun;
	//protected AstroUnit distFromSun;
	protected EarthDay siderealDay;
	protected MicroSunUnit relativeMassInMS;
	protected EarthMassUnit relativeMassInEM;
	protected EarthDay orbitalPeriod;
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

	public Planet(AstroUnit distFromSun, EarthDay siderealDay, EarthDay orbitalPeriod, int numOfSatellites,
			String[] threeBigSatellites, boolean hasRings,MicroSunUnit relativeMassInMS,EarthMassUnit relativeMassInEM) {
		super();
		this.distFromSun = distFromSun;
		this.siderealDay = siderealDay;
		this.orbitalPeriod = orbitalPeriod;
		this.numOfSatellites = numOfSatellites;
		this.threeBigSatellites = threeBigSatellites;
		this.hasRings = hasRings;
		this.relativeMassInMS = relativeMassInMS;
		this.relativeMassInEM = relativeMassInEM;
	}
	@Override

	public String getFactualSummary() {
		return  "\nDistance From Sun :" + distFromSun.toAU +distFromSun.getType()+ "\nSideReal Day : " + siderealDay.toEarthDaySD +siderealDay.type+ "\nOrbital Period : "
				+ orbitalPeriod.toEarthDayOP +orbitalPeriod.type+ "\nHas rings? : " + hasRings + "\nNumber Of Satellites : " + numOfSatellites + "\nSatellite Names : " + this.retSatellNames()
				+"\nRelative Mass : "+relativeMassInMS.toMicroSun+relativeMassInMS.type+" = "+relativeMassInEM.toEarthMass+relativeMassInEM.type;

	}



}