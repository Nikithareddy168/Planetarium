import java.util.Date;

public abstract interface CelestialVisitor {
		public abstract  Date lastAppearedOn();
		public abstract  Date nextAppearsOn();
		public abstract  boolean isPredictable();
}
