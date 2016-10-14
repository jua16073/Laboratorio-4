/*
	@author: Rodrigo Juarez (16073)
	@Proposito: Laboratorio 4
	@Date: 14-10-2016
	Alarma.java
*/
public class Alarma extends Timbre {
	
	/*
	 * @see Timbre#m1()
	 * Imprime "alarma 1"
	 */
	public void m1() {
		System.out.println("alarma 1");
	}
	 
	/*
	 * @see Timbre#m2()
	 * Imprime la clase m1 de la clase padre
	 */
	public void m2() {
		super.m1();
	}
	 
	/*
	 * @see Timbre#toString()
	 * Concatena el toString del padre y lo regresa
	 */
	public String toString() {
		return super.toString() + "…" + super.toString();
	}
}
