package getSet;
import java.util.Scanner;
public class torcida {
	public static void main(String[]args) {
		String time;
		exFutebol torcida = new exFutebol();
		Scanner input = new Scanner(System.in);
		
		System.out.println("qual time você torce");
		time = input.nextLine();
		torcida.setTime(time);
		torcida.mostraTime();
		input.close();
	}
}
