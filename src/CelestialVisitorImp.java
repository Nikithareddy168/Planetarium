	import java.text.ParseException;
	import java.text.SimpleDateFormat;
	import java.util.Date;

	public class CelestialVisitorImp extends AstroEntity implements CelestialVisitor {
		Date lastAppearedOn;
		Date nextAppearsOn;
		boolean isPredictable;
		@Override

		public Date lastAppearedOn() {
			// TODO Auto-generated method stub
			return lastAppearedOn;
		}
		@Override
		public Date nextAppearsOn() {
			// TODO Auto-generated method stub
			return nextAppearsOn;
		}
		@Override
		public String getCelestialClass() {
			// TODO Auto-generated method stub
			return ("Celestial Visitor");
		}
		@Override
		public boolean isPredictable() {
			// TODO Auto-generated method stub
			return isPredictable;
		}
		public String getFactualSummary() {
			SimpleDateFormat s3 = new SimpleDateFormat("dd/MM/yyyy");
			return "Common Name: "+commonName+"\nCelestial Classification : "+getCelestialClass()+super.getFactualSummary() + "\nLast appered on;" + s3.format(lastAppearedOn()) + "\nNext appears on: "
					+ s3.format(nextAppearsOn()) + "\nIs Predictable:" + isPredictable() +"\n";
		}
		public CelestialVisitorImp(String name, String lastAppearedOn, String nextAppearsOn, boolean isPredictable) throws ParseException {
			this.commonName = name;
			SimpleDateFormat s3 = new SimpleDateFormat("dd/MM/yyyy");
			Date date3 = s3.parse(lastAppearedOn);
			this.lastAppearedOn = date3;
			date3 = s3.parse(nextAppearsOn);
			this.nextAppearsOn = date3;
			this.isPredictable = isPredictable;
		}
	}
