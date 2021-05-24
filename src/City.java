import java.util.ArrayList;

public class City
{
	private String nome;
	private int id;
	private Posizione posizione;
	private ArrayList <Integer> percorsi = new ArrayList<>();
	private ArrayList <City> vicini = new ArrayList<>();
	private double distMin = Double.MAX_VALUE;
	private City prevCity = this;
	private int numeroCity = Integer.MAX_VALUE;
	
	public int getNumeroCity()
	{
		return numeroCity;
	}
	
	public void setNumeroCity(int numeroCity)
	{
		this.numeroCity = numeroCity;
	}
	
	public City(String nome, int id, Posizione posizione, ArrayList<Integer> percorsi)
	{
		this.nome = nome;
		this.id = id;
		this.posizione = posizione;
		this.percorsi = percorsi;
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
	
}
