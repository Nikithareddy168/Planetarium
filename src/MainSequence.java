
public class MainSequence extends Star{
	double relativeMass;
	public String getCelestialClass() {
		return ("Main Sequence Star");
	}
	public MainSequence(String commonName, String constellationDesignation,spectralType spec,double appMagnitude, double absMagnitude,double distFromSun,String[] planets,double relativeMass){
		super(constellationDesignation,Star.spectralType.G,appMagnitude, absMagnitude, distFromSun, planets);
		this.commonName = commonName;
		this.relativeMass = relativeMass;
	}

	public String getFactualSummary() {
		return "Common Name: "+commonName+ super.getFactualSummary() +"\nSpectral Type : "+Star.spectralType.G+"\nRelative Mass : " + relativeMass + "\n";
	}
}
