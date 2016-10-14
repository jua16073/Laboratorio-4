
public class Soldado extends Militar{
	
	public double getSalario(){
		double salario= super.getSalario()-10000;
		return salario;
	}
	
	public int getHoras(){
		int horas= super.getHoras()*2;
		return horas;
	}
	
	public int getDiasVacaciones(){
		int vacas= (super.getDiasVacaciones()/2);
		return vacas;
	}
	
	public String recibeOrden(){
		String cadena= "Ordene mi General";
		return cadena;
	}
	
}