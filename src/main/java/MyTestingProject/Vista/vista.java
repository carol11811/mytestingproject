package MyTestingProject.Vista;

import java.util.Scanner;
public class vista implements vistaI{
	Scanner leer = new Scanner (System.in);
	@Override
	public int getHorizontal() {
		int horizontal;
		System.out.println("  Ingresa valor tablero horizontal, valor m�ximo 999, valor m�nimo 3");
		horizontal=leer.nextInt();
		return horizontal;
	}

	@Override
	public int getVertical() {
		int vertical;
		System.out.println("  Ingresa valor tablero vertical, valor m�ximo 999,valor m�nimo 3");
		vertical=leer.nextInt();
		return vertical;
	}

	@Override
	public int getPosX() {
		int horizontal;
		System.out.println("Fila: ");
		horizontal=leer.nextInt();
		return horizontal;
	}

	@Override
	public int getPosY() {
		int vertical;
		System.out.println(" Columna:");
		vertical=leer.nextInt();
		return vertical;
	}

	@Override
	public boolean getAleatorio() {
		// TODO Auto-generated method stub
		return true;
	}
	
	
	


}
