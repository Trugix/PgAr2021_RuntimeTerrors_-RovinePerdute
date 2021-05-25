import java.util.ArrayList;

public class DataProcessing
{
	private static ArrayList<City> cities = new ArrayList<>();
	private static ArrayList<City> percorsoMet = new ArrayList<>();
	private static ArrayList<City> percorsoTon = new ArrayList<>();
	private static double distMet;
	private static double distTon;
	
	public static ArrayList<City> getCities()
	{
		return cities;
	}
	
	public static double getDistMet()
	{
		return distMet;
	}
	
	public static double getDistTon()
	{
		return distTon;
	}
	
	public static ArrayList<City> getPercorsoMet()
	{
		return percorsoMet;
	}
	
	public static ArrayList<City> getPercorsoTon()
	{
		return percorsoTon;
	}
	
	public static void resetCities()
	{
		for (City c : cities)
		{
			c.setDistMin(Double.MAX_VALUE);
			c.setPrevCity(c);
			c.setNumeroCity(Integer.MAX_VALUE);
		}
	}
	
	/**
	 * calcola il percorso ottimale per i team
	 */
	public static void calcolaPercorso(boolean met)
	{
		double distanza;
		cities.get(0).setDistMin(0);
		cities.get(0).setNumeroCity(0);
		for (City p : cities)
		{
			for (City c : p.getVicini())
			{
				if (met)
					distanza = p.getPosizione().calcDistH(c.getPosizione()) + p.getDistMin(); //nuova distanza dall'origine
				else
					distanza = p.getPosizione().calcDistXY(c.getPosizione()) + p.getDistMin();
				if (distanza < c.getDistMin())  //se risulata che la nuova distanza è minore aggiorna distMin e prevCity e aggiorna il numero di città per arrivarci
				{
					c.setDistMin(distanza);
					c.setPrevCity(p);
					c.setNumeroCity(c.getPrevCity().getNumeroCity() + 1);
				}
				else if (distanza == c.getDistMin() && p.getNumeroCity() < c.getNumeroCity())   //nel caso la distanza sia la stessa controlla che il percorso passi il minor numero di città
				{
					c.setDistMin(distanza);
					c.setPrevCity(p);
					c.setNumeroCity(p.getPrevCity().getNumeroCity() + 1);
				}
			}
		}
		if (met)
			salvaPercorsoMet();
		else
			salvaPercorsoTon();
	}
	
	public static void calcolaTeamTon()
	{
		double distanza;
		cities.get(0).setDistMin(0);
		cities.get(0).setNumeroCity(0);
		for (City p : cities)
		{
			for (City c : p.getVicini())
			{
				distanza = p.getPosizione().calcDistXY(c.getPosizione()) + p.getDistMin();
				if (distanza < c.getDistMin())
				{
					c.setDistMin(distanza);
					c.setPrevCity(p);
					c.setNumeroCity(c.getPrevCity().getNumeroCity() + 1);
				}
				else if (distanza == c.getDistMin() && p.getNumeroCity() < c.getNumeroCity())
				{
					c.setDistMin(distanza);
					c.setPrevCity(p);
					c.setNumeroCity(p.getPrevCity().getNumeroCity() + 1);
				}
			}
		}
		salvaPercorsoTon();
	}
	
	public static void salvaPercorsoMet()
	{
		
		int id = cities.size() - 1;
		percorsoMet.add(cities.get(id));
		do
		{
			percorsoMet.add(cities.get(id).getPrevCity());
			id = cities.get(id).getPrevCity().getId();
		}
		while (id != 0);
		distMet = percorsoMet.get(0).getDistMin();
	}
	
	public static void salvaPercorsoTon()
	{
		
		int id = cities.size() - 1;
		percorsoTon.add(cities.get(id));
		do
		{
			percorsoTon.add(cities.get(id).getPrevCity());
			id = cities.get(id).getPrevCity().getId();
		}
		while (id != 0);
		distTon = percorsoTon.get(0).getDistMin();
	}
	
	public static void blackMagic()
	{
		for (City c : cities)
		{
			for (Integer id : c.getPercorsi())
			{
				c.getVicini().add(cities.get(id));
			}
		}
	}
}