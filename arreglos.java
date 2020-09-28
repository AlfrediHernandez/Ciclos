public class arreglos{
	public static void main(String [] ar){
		int matriz[][] = new int[3][3];
		// i=filas j=columnas
		for(int i=0; i<matriz.length; i++){
			for(int j=0; j<matriz[0].length; j++){
				matriz[i][j] = (i*matriz.length) +  (j + 1);
				System.out.print(matriz[i] [j] + " ");
			}
			System.out.println("");
		}
		System.out.println("                         ");
		System.out.println("-------------------------");
		System.out.println("-  Alfredi 28-sep-2020  -");
		System.out.println("-------------------------");
	}
}