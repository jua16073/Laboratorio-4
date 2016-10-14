/*
	@author: Rodrigo Juarez (16073)
	@Proposito: Laboratorio 4
	@Date: 14-10-2016
	General.java
*/


// CC2006, Lab 4
// Una clase para representar a los Generales.

public class General extends Militar {
	
	/*
	 * @see Militar#getDiasVacaciones()
	 * @return dias de vacaciones
	 */
    public int getDiasVacaciones() {
        return super.getDiasVacaciones() + 5;           // 3 semanas de vacaciones
    }

    /*
     * @see Militar#getFormularioVacaciones()
     * @return "rosado"
     */
    public String getFormularioVacaciones() {
        return "rosado";
    }
    
    /*
     * Imprime "Llevaremos tres divisiones a la frontera!" 
     */
    public void planificaEstrategia() {
        System.out.println("Llevaremos tres divisiones a la frontera!");
    }
}