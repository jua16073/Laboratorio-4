
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
