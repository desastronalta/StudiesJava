package getSetTest;

public class ProgTinta {
	public static void main(String[]args) {
		Tinta tinta = new Tinta();
		tinta.setAltura(5.48);
		tinta.setLargura(3.4);
		tinta.setArea();
		System.out.println(tinta.quantidadeTinta());
		tinta.compare();
	}
}
