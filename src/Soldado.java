/*
	@author: Rodrigo Juarez (16073)
	@Proposito: Laboratorio 4
	@Date: 14-10-2016
	Soldado.java
*/
public class Soldado extends Militar{
	
	/*
	 * @see Militar#getSalario()
	 * Calcula el salario del soldado con el salario de la clase padre
	 * @return salario
	 */
	public double getSalario(){
		double salario= super.getSalario()-10000;
		return salario;
	}
	/*
	 * @see Militar#getHoras()
	 * Calcula las horas de trabajo del soldado con las horas de la clase padre
	 * @return horas
	 */
	public int getHoras(){
		int horas= super.getHoras()*2;
		return horas;
	}
	
	/*
	 * @see Militar#getDiasVacaciones()
	 * Calcula los dias de vecaciones del soldado con los de la clase padre
	 * @return vacas
	 */
	public int getDiasVacaciones(){
		int vacas= (super.getDiasVacaciones()/2);
		return vacas;
	}
	
	/*
	 * @see Militar#recibeOrden()
	 * Regresa un string
	 * @return cadena
	 */
	public String recibeOrden(){
		String cadena= "Ordene mi General";
		return cadena;
	}
	
}