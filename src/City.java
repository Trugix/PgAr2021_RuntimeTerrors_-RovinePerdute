import java.util.ArrayList;

public class City
{
	private String nome;
	private int id;
	private Posizione posizione;
	private ArrayList <Integer> percorsi = new ArrayList<>();
	private ArrayList <City> vicini = new ArrayList<>();
	private double distMin = Integer.MAX_VALUE;
	private City prevCity = null;
	
	public City(String nome, int id, Posizione posizione, ArrayList<Integer> percorsi)
	{
		this.nome = nome;
		this.id = id;
		this.posizione = posizione;
		this.percorsi = percorsi;
	}

	public City()
	{
		this.nome = "-1";
		this.id = -1;
		this.posizione = new Posizione(-1,-1,-1);
		this.percorsi = new ArrayList<>(this);
	}
	
	public String getNome()
	{
		return nome;
	}
	
	public int getId()
	{
		return id;
	}
	
	public Posizione getPosizione()
	{
		return posizione;
	}
	
	public ArrayList<Integer> getPercorsi()
	{
		return percorsi;
	}
	
	public ArrayList<City> getVicini()
	{
		return vicini;
	}
	
	public City getPrevCity()
	{
		return prevCity;
	}
	
	public double getDistMin()
	{
		return distMin;
	}
	
	public void setDistMin(double distMin)
	{
		this.distMin = distMin;
	}
	
	public void setPrevCity(City prevCity)
	{
		this.prevCity = prevCity;
	}
	
	public void stampaCity()
	{
		System.out.println("\nId: "+this.id);
		System.out.println("Nome: "+this.nome);
		System.out.println("x : "+this.posizione.getX());
		System.out.println("y : "+this.posizione.getY());
		System.out.println("z : "+this.posizione.getZ());
		System.out.print("Percorsi: ");
		for (Integer p: percorsi)
		{
			System.out.print(p+" ");
		}
		System.out.println();
	}
	
	
}
