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
			System.out.println(p+" ");
		}
		System.out.println();
	}
	
}
