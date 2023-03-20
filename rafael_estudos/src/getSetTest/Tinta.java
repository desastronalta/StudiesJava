package getSetTest;
import java.util.Scanner;
public class Tinta {
	Scanner sc = new Scanner(System.in);
	private double largura;
	private double altura;
	private double tinta;
	public double area = 0;
	public double getArea() {
		return area;
	}
	public void setArea() {
		this.area = this.getAltura() * this.getLargura();
	}
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		this.largura = largura;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double quantidadeTinta() {
		System.out.println("Quantas repetições de tinta terão?");
		int quantMao = sc.nextInt();
		System.out.println("Quantos litros de tinta você possui?");
		double quantTinta = sc.nextDouble();
		this.tinta = (quantTinta * 11)/quantMao;
		
		/*valor ficticio utilizado baseado na media que 1 litro de tinta faz*/
		
		return  tinta;
	}
	public void compare() {
		if(this.getArea() > this.tinta) {
			double faltTinta = ((this.getArea()- this.tinta)/11)*3;
			System.out.printf("a quantidade de tinta nao é o suficiente são necessário %.2f\n", faltTinta);
		}
		else if(this.getArea() < this.tinta) {
			double sobraTinta = ((this.tinta- this.getArea())/11)*3;
			System.out.printf("a quantidade de tinta é o suficiente irá sobrar %.2f\n", sobraTinta);
		}
	}
	
}