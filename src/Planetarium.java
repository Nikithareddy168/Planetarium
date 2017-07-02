import java.text.ParseException;

public class Planetarium {

	public static void main(String[] args) throws ParseException  {
		AstroUnit mercuryAU = new AstroUnit(0.39);
		EarthDay mercuryED = new EarthDay(58.65,87.97);
		MicroSunUnit mercuryMS = new MicroSunUnit(0.166);
		EarthMassUnit mercuryEM = new EarthMassUnit(0.6);
		Terrestrial mercury = new Terrestrial("Mercury", mercuryAU, mercuryED, mercuryED, false, 0, null, false,mercuryMS,mercuryEM);
		
		AstroUnit venusAU = new AstroUnit(0.72);
		EarthDay venusED = new EarthDay(243.1,224.7);
		MicroSunUnit venusMS = new MicroSunUnit(2.447);
		EarthMassUnit venusEM = new EarthMassUnit(0.82);
		Terrestrial venus = new Terrestrial("Venus",venusAU, venusED, venusED, false, 0, null, false,venusMS,venusEM);
		
		AstroUnit earthAU = new AstroUnit(0.1);
		EarthDay earthED = new EarthDay(1.0,365.256);
		MicroSunUnit earthMS = new MicroSunUnit(3.003);
		EarthMassUnit earthEM = new EarthMassUnit(1);
		String[] earthBigSat = {"Moon"};
		Terrestrial earth = new Terrestrial("Earth",earthAU,earthED, earthED, false, 1, earthBigSat, true,earthMS,earthEM);
		
		AstroUnit marsAU = new AstroUnit(1.524);
		EarthDay marsED = new EarthDay(1.026,687.0);
		MicroSunUnit marsMS = new MicroSunUnit(0.3227);
		EarthMassUnit marsEM = new EarthMassUnit(0.11);
		String[] marsBigSat = {"Phobos","Deimos"};
		Terrestrial mars = new Terrestrial("Mars",marsAU, marsED, marsED, false, 2, marsBigSat, true,marsMS,marsEM);
		
		AstroUnit plutoAU = new AstroUnit(39.53);
		EarthDay plutoED = new EarthDay(6.386,90800);
		MicroSunUnit plutoMS = new MicroSunUnit(0.00740);
		EarthMassUnit plutoEM = new EarthMassUnit(0.0022);
		String[] plutoBigSat = {"Charon", "Nix", "Hydra"};
		Dwarf pluto = new Dwarf("Pluto",plutoAU,plutoED,plutoED,false,3, plutoBigSat, true,plutoMS,plutoEM);
		
		AstroUnit jupiterAU = new AstroUnit(5.203);
		EarthDay jupiterED = new EarthDay(0.41,4332.71);
		MicroSunUnit jupiterMS = new MicroSunUnit(954.792);
		EarthMassUnit jupiterEM = new EarthMassUnit(317.8);
		String[] jupiterBigSat = {"Ganymede", "Callisto", "Io"};
		GasGaint Jupiter = new GasGaint("Jupiter", jupiterAU,jupiterED, jupiterED, true, 67, jupiterBigSat, true,jupiterMS,jupiterEM);
		
		AstroUnit saturnAU = new AstroUnit(9.54);
		EarthDay saturnED = new EarthDay(0.426,10759.5);
		MicroSunUnit saturnMS = new MicroSunUnit(285.866);
		EarthMassUnit saturnEM = new EarthMassUnit(95.2);
		String[] saturnBigSat = {"Titan", "Rhea", "Iapetus" };
		GasGaint Saturn = new GasGaint("Saturn",saturnAU,saturnED,saturnED, true, 3, saturnBigSat, true,saturnMS,saturnEM);
		
		AstroUnit uranusAU = new AstroUnit(19.9);
		EarthDay uranusED = new EarthDay(0.717,30685.0);
		MicroSunUnit uranusMS = new MicroSunUnit(43.662);
		EarthMassUnit uranusEM = new EarthMassUnit(14.6);
		String[] uranusBigSat = {"Titania", "Oberon", "Umbriel"};
		GasGaint Uranus = new GasGaint("Uranus",uranusAU, uranusED, uranusED, true, 3, uranusBigSat, true,uranusMS,uranusEM);
		
		AstroUnit neptuneAU = new AstroUnit(30.06);
		EarthDay neptuneED = new EarthDay(0.671,60190.0);
		MicroSunUnit neptuneMS = new MicroSunUnit(51.514);
		EarthMassUnit neptuneEM = new EarthMassUnit(17.2);
		String[] neptuneBigSat = {"Triton", "Proteus", "Nereid"};
		GasGaint Neptune = new GasGaint("Neptune",neptuneAU, neptuneED, neptuneED, true, 3, neptuneBigSat, true,neptuneMS,neptuneEM);
		
		LYUnit sunLY = new LYUnit(0.0);
		SolarMassUnit sunSM = new SolarMassUnit(1);
		String[] sunPlanets = {"Mercury", "Venus", "Earth", "Mars","Jupiter","Saturn","Uranus","Neptune","Pluto"};
		MainSequence sun = new MainSequence("Sun", "Our Sun",Star.spectralType.G,-26.75,4.82,sunLY,sunPlanets,sunSM);
		
		LYUnit arcturusLY = new LYUnit(37.0);
		SolarMassUnit arcturusSM = new SolarMassUnit(1.1);
		String[] arcturusPlanets = {};
		Gaint arcturus = new Gaint("Arcturus", "Alpha Bootis",Star.spectralType.K,-0.04,-0.3,arcturusLY	,arcturusPlanets,Gaint.gaintness.GAINT,arcturusSM);
		
		LYUnit sanduleakLY = new LYUnit(163000.0);
		SolarMassUnit sanduleakSM = new SolarMassUnit(20);
		String[] sanduleakPlanets = {};
		SuperNova sanduleak = new SuperNova("Sanduleak", "Supernova 1987A",Star.spectralType.B,2.9,-15.6,sanduleakLY,sanduleakPlanets,SuperNova.supernovaType.II,"05/20/1987",sanduleakSM);

		CelestialVisitorImp halleycommet = new CelestialVisitorImp("Halley's commet", "01/01/1986", "01/01/2061", true);
		CelestialVisitorImp geminids = new CelestialVisitorImp("Geminids", "12/13/2016", "12/13/2017", true);
		
		AstroEntity[] astroEntitiesList= {mercury,venus,earth,mars,pluto,Jupiter,Saturn,Uranus,Neptune,sun,arcturus,sanduleak,halleycommet,geminids};
		for(AstroEntity eachEntity:astroEntitiesList){
			System.out.println(eachEntity.getFactualSummary());
			System.out.println();

		}
		
	}

}
