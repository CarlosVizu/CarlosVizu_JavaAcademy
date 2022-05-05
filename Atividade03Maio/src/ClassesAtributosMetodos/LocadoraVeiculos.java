package ClassesAtributosMetodos;
import ClassesAtributosMetodos.Moto;
import java.util.Scanner;

public class LocadoraVeiculos {
	public static void main(String [] args) {
		
		Moto moto = new Moto();
		
		System.out.println("Bem vindo ao cadastro de novas motos, insira os dados da sua moto abaixo: ");
		
		Scanner leitura = new Scanner(System.in);
		System.out.println("Insira a marca de sua moto: ");
		moto.marca  = leitura.nextLine();
		
		System.out.println("Insira o modelo de sua moto: ");
		moto.modelo = leitura.nextLine();
		
		System.out.println("Insira as cilindradas de sua moto: ");
		moto.cilindradas = leitura.nextLine();
		
		moto.setDados(moto.marca, moto.modelo, moto.cilindradas);
		moto.showDados();
	}
}
