

public class Gaint extends Star{
	public enum gaintness{SUPER_GAINT,GAINT,SUB_GAINT};
	public gaintness gaintDegree;
	public gaintness getGaintDegree() {
		return gaintDegree;
	}
	public void setGaintDegree(gaintness gaintDegree) {
		this.gaintDegree = gaintDegree;
	}
	public String getCelestialClass() {
		return ("Gaint Star");
	}
	public Gaint(String commonName, String constellationDesignation,spectralType spec,double appMagnitude, double absMagnitude,LYUnit distFromSun,String[] planets,gaintness gaintDegree,SolarMassUnit relativeMassInSM){
		super(constellationDesignation,spec,appMagnitude, absMagnitude, distFromSun, planets,relativeMassInSM);
		this.commonName = commonName;
		this.gaintDegree = gaintDegree;
	}

	public String getFactualSummary() {
		return "Common Name: "+commonName+ super.getFactualSummary() +"\nSpectral Type : "+getSpecType()+ "\nGaintness : " + getGaintDegree() + "\n";
	}
}
