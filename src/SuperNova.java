import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SuperNova extends Star{
	protected enum supernovaType{I,II,III,IV,V};
	public supernovaType snType;
	
	public supernovaType getSnType() {
		return snType;
	}
	public void setSnType(supernovaType snType) {
		this.snType = snType;
	}
	protected Date peakBrillianceDate;
	public String getCelestialClass() {
		return ("Super Nova Star");
	}
	public SuperNova(String commonName, String constellationDesignation,spectralType spec,double appMagnitude, double absMagnitude,LYUnit distFromSun,String[] planets,supernovaType snType,String peakBrillianceDate, SolarMassUnit relativeMassInSM) throws ParseException{
		super(constellationDesignation,spec,appMagnitude, absMagnitude, distFromSun, planets, relativeMassInSM);
		this.commonName = commonName;
		this.snType = snType;
		SimpleDateFormat pbDateFormat = new SimpleDateFormat("mm/dd/yyyy");
		Date newDate =pbDateFormat.parse(peakBrillianceDate);
		this.peakBrillianceDate = newDate;
	}
	public String getFactualSummary() {
		SimpleDateFormat pbDateFormat = new SimpleDateFormat("mm/dd/yyyy");
		return "Common Name: "+commonName+ super.getFactualSummary() +"\nSpectral Type : "+getSpecType()+"\nSupernova Type : " +getSnType()+"\npeakBrillianceDate : " + pbDateFormat.format(peakBrillianceDate)+ "\n";
	}
}
