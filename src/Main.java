import it.unibs.fp.mylib.*;

import javax.xml.crypto.Data;

public class Main
{
	public static void main(String[] args)
	{
		String [] scelte = {"PgAr_Map_5.xml","PgAr_Map_12.xml","PgAr_Map_50.xml","PgAr_Map_200.xml","PgAr_Map_2000.xml","PgAr_Map_10000.xml"};
		int scelta;
		System.out.println("Benvenuto, programma dei Runtime Terrors");
		MyMenu menu= new MyMenu("Scelta file" ,scelte);
		scelta=menu.scegli();
		switch(scelta)
		{
			case 1:
				Reader.readInput("PgAr_Map_5.xml");
				break;
			case 2:
				Reader.readInput("PgAr_Map_12.xml");
				break;
			case 3:
				Reader.readInput("PgAr_Map_50.xml");
				break;
			case 4:
				Reader.readInput("PgAr_Map_200.xml");
				break;
			case 5:
				Reader.readInput("PgAr_Map_2000.xml");
				break;
			case 6:
				Reader.readInput("PgAr_Map_10000.xml");
				break;
			case 0:
				System.exit(0);
				break;
		}
		DataProcessing.calcolaTeamMet(); //team H
		DataProcessing.resetCities();
		DataProcessing.calcolaTeamTon();
		Writer.writeOutput();
	}
}
