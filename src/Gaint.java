

public class Gaint extends Star{
	public enum gaintness{SUPER_GAINT,GAINT,SUB_GAINT};
	public String getCelestialClass() {
		return ("Gaint Star");
	}
	public Gaint(String commonName, String constellationDesignation,spectralType spec,double appMagnitude, double absMagnitude,double distFromSun,String[] planets,gaintness gt){
		super(constellationDesignation,Star.spectralType.K,appMagnitude, absMagnitude, distFromSun, planets);
		this.commonName = commonName;
		//this.gaintness = gaintness;
	}

	public String getFactualSummary() {
		return "Common Name: "+commonName+ super.getFactualSummary() +"\nSpectral Type : "+Star.spectralType.K+ "\nGaintness : " + gaintness.GAINT + "\n";
	}
}
