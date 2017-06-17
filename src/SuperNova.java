import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SuperNova extends Star{
	protected enum supernovaType{I,II,III,IV,V};
	protected Date peakBrillianceDate;
	public String getCelestialClass() {
		return ("Super Nova Star");
	}
	public SuperNova(String commonName, String constellationDesignation,spectralType spec,double appMagnitude, double absMagnitude,double distFromSun,String[] planets,supernovaType snType,String peakBrillianceDate) throws ParseException{
		super(constellationDesignation,Star.spectralType.B,appMagnitude, absMagnitude, distFromSun, planets);
		this.commonName = commonName;
		SimpleDateFormat pbDateFormat = new SimpleDateFormat("mm/dd/yyyy");
		Date newDate =pbDateFormat.parse(peakBrillianceDate);
		this.peakBrillianceDate = newDate;
	}
	public String getFactualSummary() {
		SimpleDateFormat pbDateFormat = new SimpleDateFormat("mm/dd/yyyy");
		return "Common Name: "+commonName+ super.getFactualSummary() +"\nSpectral Type : "+Star.spectralType.B+"\nSupernova Type : " +SuperNova.supernovaType.II+"\npeakBrillianceDate : " + pbDateFormat.format(peakBrillianceDate)+ "\n";
	}
}
