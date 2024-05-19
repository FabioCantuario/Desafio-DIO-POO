package smartphone.reprodutormusical;

public class ITunes implements ReprodutorMusical {
	
	public void tocar() {
		System.out.println("REPRODUZINDO MÚSICA");
	}
	
	public void pausar() {
		System.out.println("PAUSANDO MÚSICA");
	}
	
	public String selecionarMusica(String musica) {
		return null;
	}

}
