package MyTestingProject.Vista;

import java.util.Scanner;
public class vista implements vistaI{
	Scanner leer = new Scanner (System.in);
	@Override
	public int getHorizontal() {
		int horizontal;
		System.out.println("  Ingresa tama�o tablero horizontal, valor m�ximo 999, valor m�nimo 3");
		horizontal=leer.nextInt();
		return horizontal;
	}

	@Override
	public int getVertical() {
		int vertical;
		System.out.println("  Ingresa tama�o tablero vertical, valor m�ximo 999,valor m�nimo 3");
		vertical=leer.nextInt();
		return vertical;
	}
	

}
