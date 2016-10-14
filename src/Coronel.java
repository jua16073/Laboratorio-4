/*
	@author: Rodrigo Juarez (16073)
	@Proposito: Laboratorio 4
	@Date: 14-10-2016
	Coronel.java
*/

// CC2006, Lab 4
// Una clase para representar a los Coroneles.

public class Coronel extends Teniente {
	
	/*
	 * @see Militar#getSalario()
	 * Calcula el salario del Coronel
	 */
    public double getSalario() {
        return super.getSalario() + 5000.0;      // Q45,000.00 / anio
    }
    
    /*
     * Imprime "Presenten Armas!"
     */
    public void ejecutaOrdenManiobra() {
        System.out.println("Presenten Armas!");
    }
}