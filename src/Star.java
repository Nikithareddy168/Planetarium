
public abstract class Star extends AstroEntity{
	protected String constellationDesignation;
	public enum spectralType{O,B,A,F,G,K,M};
	protected double appMagnitude;
	protected double absMagnitude;
	protected double distFromSun;
	protected String[] planets;
	public String retPlanetNames() {
		String allSunPlanets = "";
			for (int i = 0; i < this.planets.length; i++) {
				allSunPlanets = allSunPlanets + planets[i] + " ";
			}
		return allSunPlanets;
	}
	public Star(String constellationDesignation, spectralType spec, double appMagnitude, double absMagnitude,double distFromSun, String[] planets) {
		super();
		this.constellationDesignation = constellationDesignation;
		this.appMagnitude = appMagnitude;
		this.absMagnitude = absMagnitude;
		this.planets = planets;
		this.distFromSun=distFromSun;
		//this.spec = spec;
	}
	public String getFactualSummary() {
		return  "\nConstellation Designation :" + constellationDesignation + "\nApparent Magnitude : " + appMagnitude + "\nAbsolute Magnitude : "
				+ absMagnitude +"\nDistance from Sun: "+distFromSun+" Light years"+ "\nPlanets : "+ retPlanetNames();

	}
}
