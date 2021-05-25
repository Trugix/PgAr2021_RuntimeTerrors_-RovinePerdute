import it.unibs.fp.mylib.*;

import javax.xml.crypto.Data;

public class Main
{
	private static final String BENVENUTO = "\n\nBenvenuto, programma dei Runtime Terrors\n";
	private static final String[] SCELTE = {"PgAr_Map_5.xml", "PgAr_Map_12.xml", "PgAr_Map_50.xml", "PgAr_Map_200.xml", "PgAr_Map_2000.xml", "PgAr_Map_10000.xml"};
	private static final String SCELTA = "Scelta file";
	
	public static void main(String[] args)
	{
		int scelta;
		System.out.println(BENVENUTO);
		MyMenu menu = new MyMenu(SCELTA, SCELTE);
		scelta = menu.scegli();
		switch (scelta)
		{
			case 1:
				Reader.readInput(SCELTE[0]);
				break;
			case 2:
				Reader.readInput(SCELTE[1]);
				break;
			case 3:
				Reader.readInput(SCELTE[2]);
				break;
			case 4:
				Reader.readInput(SCELTE[3]);
				break;
			case 5:
				Reader.readInput(SCELTE[4]);
				break;
			case 6:
				Reader.readInput(SCELTE[5]);
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
