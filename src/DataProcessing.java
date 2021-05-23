import java.util.ArrayList;

public class DataProcessing
{
	private static ArrayList<City> cities = new ArrayList<>();
	
	public static ArrayList<City> getCities()
	{
		return cities;
	}
	
	public static void out ()
	{
		for (City c:cities)
		{
			c.stampaCity();
		}
	}

/*	public static City searchCity(int idCercato)
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
	}*/
}
