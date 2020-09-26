import javax.swing.JOptionPane;
public class Promedio{
	public static void main(String [] ar){
		int nota;
		String nombre;
		nombre=(JOptionPane.showInputDialog("Nombre del Alumno"));
		nota=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Nota"));
		JOptionPane.showMessageDialog(null,nombre);
		if(nota>=5){
			JOptionPane.showMessageDialog(null, "Aprobado");
		}else{
			JOptionPane.showMessageDialog(null,"Reprobado");
		}
		System.out.println("                         ");
		System.out.println("-------------------------");
		System.out.println("-  Alfredi 26-sep-2020  -");
		System.out.println("-------------------------");
	}
}