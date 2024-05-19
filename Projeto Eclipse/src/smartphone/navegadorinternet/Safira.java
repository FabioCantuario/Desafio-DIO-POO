package smartphone.navegadorinternet;

public class Safira implements NavegadorInternet {

	public String exibirPagina(String url) {
		return url;
	}

	public void adicionarNovaAba() {
		System.out.println("ADICIONANDO NOVA ABA");
	}

	public void atualizarPagina() {
		System.out.println("ATUALIZANDO PAGINA");
	}

}
