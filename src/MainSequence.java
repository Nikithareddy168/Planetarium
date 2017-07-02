
public class MainSequence extends Star{
	//double relativeMass;
	public String getCelestialClass() {
		return ("Main Sequence star");
	}
	public MainSequence(String commonName, String constellationDesignation,spectralType spec,double appMagnitude, double absMagnitude,LYUnit distFromSun,String[] planets,SolarMassUnit relativeMassInSM){
		super(constellationDesignation,spec,appMagnitude, absMagnitude, distFromSun, planets,relativeMassInSM);
		this.commonName = commonName;
		//this.relativeMass = relativeMass;
	}

	public String getFactualSummary() {
		return "Common Name: "+commonName+ super.getFactualSummary() +"\nSpectral Type : "+getSpecType()+ "\n";
	}
}
