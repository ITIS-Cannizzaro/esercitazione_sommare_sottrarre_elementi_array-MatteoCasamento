import java.util.Scanner;
public class Casamento 
{
	static double sommapari = 0;
	static double diffdispari = 0;
	static double[] array = new double[4];
	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		for(int i = 0; i < array.length; i++)
		{
			System.out.println("inserire un valore intero");
			array[i] = in.nextInt();
		}
		System.out.println("selezionare l'esercizio che si preferisce");
		System.out.println("1- sommare gli elementi dell'array con indice pari");
		System.out.println("2- sommare gli elementi dell'array con indice dispari");
		System.out.println("dato un array di interi realizza un array inverso");
		int scelta = in.nextInt();
		switch(scelta)
		{
		case 1:
			sommadeipari(array);
			System.out.println("la somma degli elementi con indice pari è " + sommapari + ";");
			break;
		case 2:
			differenzadeidispari(array);
			System.out.println("la differenza degli elementi con indice dispari è " + diffdispari + ";");
			break;
		case 3:
			ordineinverso();
			break;
		}
	}

	static double sommadeipari(double[]a)
	{
		for(int i = 0; i < array.length; i++)
		{
			if(i % 2 == 0)
			{
				sommapari += array[i];
			}
		}
		return sommapari;
	}

	static double differenzadeidispari(double[]a) 
	{
		for(int i = 0; i < array.length; i++)
		{
			if(i % 2 != 0)
			{
				diffdispari -= array[i];
			}
		}
		return diffdispari;
	}

	static void ordineinverso() 
	{
		
	}
	



}