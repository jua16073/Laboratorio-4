/*
	@author: Rodrigo Juarez (16073)
	@Proposito: Laboratorio 4
	@Date: 14-10-2016
	Militar.java
*/


// CC2006, Lab 4
// Una clase para representar a los militares en general.

public class Militar {
	
	/*
	 * Horas de trabajo de un militar
	 * @return 40
	 */
    public int getHoras() {
        return 40;           // trabaja 40 horas / semana
    }
    
    /*
     * Salario de un militar
     * @return 40000.0
     */
    public double getSalario() {
        return 40000.0;      // Q40,000.00 / anio
    }
    
    /*
     * Dias de vacaciones de un militar
     * @return 10
     */
    public int getDiasVacaciones() {
        return 10;           // 2 semanas de vacaciones pagadas
    }

    
    /*
     * Formulario de Vacaciones
     * @return "amarillo"
     */
    public String getFormularioVacaciones() {
        return "amarillo";     // use el formulario amarillo
    }
    
}
