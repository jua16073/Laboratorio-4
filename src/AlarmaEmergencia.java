
public class AlarmaEmergencia extends Alarma {
	
	public void m1(){
		System.out.println("Emergencia 1");
	}
	public void m2(){
		super.m1();
		super.m2();
	}
	
	public String toString(){
		String cadena= "emergencia "+ super.toString();
		return cadena;
	}
}
