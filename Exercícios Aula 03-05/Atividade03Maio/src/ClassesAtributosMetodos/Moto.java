package ClassesAtributosMetodos;

public class Moto {
		String marca;
		String modelo;
		String cilindradas;
		
	public void showDados() {
		System.out.println("A moto é da marca: "+ marca +", modelo: " + modelo + " e tem " + cilindradas + " cilindradas.");		
	}
	public void setDados(String marcaMoto, String modeloMoto, String cilindradasMoto) {
		marca = marcaMoto;
		modelo = modeloMoto;
		cilindradas = cilindradasMoto;		
	}
	
}
