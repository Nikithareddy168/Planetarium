
public abstract class Star extends AstroEntity{
	protected String constellationDesignation;
	public enum spectralType{O,B,A,F,G,K,M};
	public spectralType specType;
	

	
	public spectralType getSpecType() {
		return specType;
	}
	public void setSpecType(spectralType specType) {
		this.specType = specType;
	}
	protected double appMagnitude;
	protected double absMagnitude;
	
	protected SolarMassUnit relativeMassInSM;
	protected LYUnit distFromSun;
	protected String[] planets;
	public String retPlanetNames() {
		String allSunPlanets = "";
			for (int i = 0; i < this.planets.length; i++) {
				allSunPlanets = allSunPlanets + planets[i] + " ";
			}
		return allSunPlanets;
	}
	public Star(String constellationDesignation, spectralType specType, double appMagnitude, double absMagnitude,LYUnit distFromSun, String[] planets,SolarMassUnit relativeMassInSM) {
		super();
		this.constellationDesignation = constellationDesignation;
		this.appMagnitude = appMagnitude;
		this.absMagnitude = absMagnitude;
		this.relativeMassInSM = relativeMassInSM;
		this.planets = planets;
		this.distFromSun=distFromSun;
		this.specType = specType;
	}
	public String getFactualSummary() {
		return  "\nConstellation Designation :" + constellationDesignation + "\nApparent Magnitude : " + appMagnitude + "\nAbsolute Magnitude : "
				+ absMagnitude +"\nDistance from Sun: "+distFromSun.toLY+distFromSun.type+ "\nPlanets : "+ retPlanetNames()+"\nRelative Mass : "+relativeMassInSM.toSolarMass+relativeMassInSM.type;

	}
}
