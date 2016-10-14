/*
	@author: Rodrigo Juarez (16073)
	@Proposito: Laboratorio 4
	@Date: 14-10-2016
	Soldado.java
*/
public class DriverEjercito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Soldado soldadito= new Soldado();
		Teniente ten= new Teniente();
		System.out.println("Datos de soldado");
		System.out.println("Dias de vacaciones "+soldadito.getDiasVacaciones());
		System.out.println("Salario "+ soldadito.getSalario());
		System.out.println("Horas "+ soldadito.getHoras());
		System.out.println(soldadito.recibeOrden());
		
	}

}
