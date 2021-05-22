import java.util.ArrayList;

public class City
{
	private String nome;
	private int id;
	private Posizione posizione;
	private ArrayList <Integer> percorsi = new ArrayList<>();
	
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
}
