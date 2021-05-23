import java.util.ArrayList;

public class DataProcessing
{
	private static ArrayList<City> cities = new ArrayList<>();
	
	public static ArrayList<City> getCities()
	{
		return cities;
	}
	
	private ArrayList<ArrayList<Integer>> matH = new ArrayList<ArrayList<Integer>>();
	private ArrayList<ArrayList<Integer>> matNonH = new ArrayList<ArrayList<Integer>>();
	
	public static void calcolaTeamH()
	{
		ArrayList<City> listaCities = new ArrayList(cities);
		cities.get(0).setDistMin(0);
		double distanza;
			while (!listaCities.isEmpty())
			{
				for (City v: cities.get(listaCities.get(0).getId()).getVicini())
				{
					distanza = v.getPosizione().calcDistH(cities.get(listaCities.get(0).getId()).getPosizione());
					if (distanza < v.getDistMin() &&  cities.get(listaCities.get(0).getId()).getId() != v.getPrevCity().getId())
					{
						v.setDistMin(distanza);
						v.setPrevCity(cities.get(listaCities.get(0).getId()));
					}
				}
				listaCities.remove(0);
			}
			/*for (City v: c.getVicini())
			{
				distanza = v.getPosizione().calcDistH(c.getPosizione());
				if (distanza < v.getDistMin())
				{
					v.setDistMin(distanza);
					v.setPrevCity(c);
				}
				c.getVicini().remove(v);
			}*/
		
	}
	
	public static void stampaPercorso ()
	{
		int id = cities.size()-1;
		do
		{
			System.out.println(id+" ");
			id = cities.get(id).getPrevCity().getId();
		}
		while (id != 0);
	}
	
	public static void blackMagic ()
	{
		for (City c:cities)
		{
			for (Integer id: c.getPercorsi())
			{
				c.getVicini().add(cities.get(id));
			}
		}
	}
	
	
	public static void out ()
	{
		for (City c:cities)
		{
			c.stampaCity();
		}
	}

	public static City searchCity(int idCercato)
	{
		int left=0, right=cities.size()-1;
		int middle;
		while(left <= right)
		{
			middle = (left+right)/2;
			int id_temp = cities.get(middle).getId();
			if (id_temp < idCercato)
			{
				left=middle+1;
			}
			else if (id_temp > idCercato)
			{
				right=middle-1;
			}
			else if (id_temp == idCercato)
			{
				return cities.get(middle);
			}
		}
		return null;
	}
}
