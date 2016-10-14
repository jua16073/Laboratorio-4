/*	@author: Rodrigo Juarez (16073)
	@Proposito: Laboratorio 4
	@Date: 14-10-2016
	AlarmaEmergencia.java
*/
public class AlarmaEmergencia extends Alarma {
	
	/*
	 * @see Alarma#m1()
	 * Imprime "Emergencia 1"
	 */
	public void m1(){
		System.out.println("Emergencia 1");
	}
	
	/*
	 * @see Alarma#m2()
	 * llama a los metodos m1 y m2 de la clase padre
	 */
	public void m2(){
		super.m1();
		super.m2();
	}
	
	/*
	 * @see Alarma#toString()
	 * concatena "emergenia " con el toString de la clase padre
	 * @return cadena
	 */
	public String toString(){
		String cadena= "emergencia "+ super.toString();
		return cadena;
	}
}
