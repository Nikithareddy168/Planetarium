
public class Planetarium {

	public static void main(String[] args) {
		Terrestrial mercury = new Terrestrial("Mercury", 0.39, 58.65, 87.97, false, 0, null, false);
		System.out.println(mercury.getFactualSummary());
	}

}
