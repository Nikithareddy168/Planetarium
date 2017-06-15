
public class Terrestrial extends Planet{
		protected boolean[]  hasIceCaps = {false,false,true,true};
		String[] terrestrial = new String[5];
		String factsOfTerrestrial = "";
		
		@Override
		public String getFactualSummary() 
		{
			 String[] name= {"Mercury","Venus","Earth","Mars"};
			 double[] distFromSun = {0.39, 0.72, 1.0, 1.524};
			 double[] siderealDate = {58.65, 243.1 ,1.0, 1.026};
			 double[] orbitalPeriod = {87.97, 224.7, 365.256, 687.0};
			 int[] noOfSatellites = {0,0,1,2};
			 boolean[] hasRings = {false,false,false,false};
			//String[] largestSatellites = {};
			
			for(int i=0; i < 4; i++)
			{
				terrestrial[i] = "Name = "+name[i]+"\n Celestial Classification = "+getCelestialClass()+"\n Distance from Sun = "+distFromSun[i]+" AU"+"\n sidereal Date = "+siderealDate[i]+"\n Orbital Period = "+orbitalPeriod[i]+" \n hasRings = "+hasRings[i]+"\n Number of satillites = "+noOfSatellites[i]+"\n";
				factsOfTerrestrial = factsOfTerrestrial + terrestrial[i];
			}
			
			return factsOfTerrestrial;
		}

		@Override
		public String getCelestialClass() {
			// TODO Auto-generated method stub
		
			return "Terrestrial Planet";
			
		}
		
	/*	public Terrestrial()
		{
			super();
		}
*/
	

}
