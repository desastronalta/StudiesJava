package getSet;

public class exFutebol {
	private String nomeTime;
	public void setTime(String meuTime) {
		nomeTime = meuTime;
	}
	public String getTime() {
		return nomeTime;
	}
	public void mostraTime() {
		System.out.printf("Seu time do coração é %s\n", getTime());
	}
}