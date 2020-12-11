package MyTestingProject.Modelo;

public class Tablero {
	int tablero[][];
	int horizontal;
	int vertical;
	boolean created= true;

	public Tablero(int horizontal,int vertical,boolean aleatorio, int totalMinas) {
	if(horizontal>100||vertical>100 || horizontal<2|| vertical<2 ) {
		created=false;
	    System.out.println("Tama�o invalido de tablero");
	}
	
	int size_array =horizontal*vertical;
	if(size_array>=100*100|| size_array <8) {
		
		created=false;
	    System.out.println("Tama�o invalido de tablero");
	}
	if(created==true) {
		this.horizontal=horizontal;
		this.vertical=vertical;
		
		tablero= new int[horizontal][vertical];
		
		double w=0;
		double z=0;
		int ntminas=0;
		
	
		CasillaTablero cT = new Valor();
	
		for(int j=0;j<horizontal;j++)
			for (int i=0;i<vertical;i++)
				tablero [j][i]=0;
		
		do  {  
				
				if(aleatorio==true) {
					
					w=Math.random()*horizontal;
		    		z=Math.random()*vertical;  
		       		w=(int)w;
		       		z=(int)z;
		       		if  (z!=horizontal-1 && w!=vertical-1){
		         	tablero[(int)w][(int) z ]=1;
		          	ntminas++;
		          	
		       		}
				}	
				if(aleatorio==false) {
					w= cT.getValor();
					z= cT.getValor();
					tablero[(int)w][(int) z ]=1;

				
					tablero[2][1]=1;
					tablero[3][1]=1;
					tablero[4][1]=1;
					tablero[0][1]=1;
					tablero[0][0]=1;
					tablero[1][0]=1;
					tablero[2][0]=1;
					tablero[3][0]=1;
					tablero[4][0]=1;
					
					ntminas=10+1;
					
			    }
       			
	   		}while (ntminas<=totalMinas);
	 
	}

	
	
}	
	public int [][] getTablero(){
		return tablero;
	}
	public int  getHorizontal(){
		return horizontal;
	}
	public int getVertical(){
		return vertical;
	}
	public boolean getCreated(){
		return created;
	}
		
		  
}