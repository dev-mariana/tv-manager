package model;

public class TV {
	private String fabricante;
	private String modelo;
	private int tamanhoTela;
	private String localizacao;
	private boolean ligada;
	private int volume;
	private int canal;
	
	public TV() {
		super();
	}

	public TV(String fabricante, String modelo, int tamanhoTela, String localizacao, boolean ligada, int volume, int canal) {
		super();
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.tamanhoTela = tamanhoTela;
		this.localizacao = localizacao;
		this.ligada = ligada;
		this.volume = volume;
		this.canal = canal;
	}

	public TV(String fabricante, String modelo, int tamanhoTela, String localizacao) {
		super();
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.tamanhoTela = tamanhoTela;
		this.localizacao = localizacao;
		this.ligada = false;
		this.volume = 0;
		this.canal = 0;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getTamanhoTela() {
		return tamanhoTela;
	}

	public void setTamanhoTela(int tamanhoTela) {
		this.tamanhoTela = tamanhoTela;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public boolean isLigada() {
		return ligada;
	}

	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}
	
	public void caracteristicas() {
		System.out.println("-------- TV --------");
		System.out.println("Fabricante: " + this.fabricante);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Tamanho da tela: " + this.tamanhoTela);
		System.out.println("Localização: " + this.localizacao);
	}
	
	public String situacaoTV() {
		if(this.ligada) {
			return "TV " + this.fabricante + " de " + this.tamanhoTela + " polegadas da " + this.localizacao 
			+ " está ligada, " + "no canal " + this.canal + " e no volume " + this.volume + ".";
		}
		
		else {
			return "TV " + this.fabricante + " de " + this.tamanhoTela + " polegadas da "
			+ this.localizacao + " está desligada.";
		}
	}
	
	public String ligarTV() {
		if(!this.ligada) {
			this.ligada = true;
			this.canal = 4;
			this.volume = 15;
			
			return "A TV " + this.fabricante + " de " + this.tamanhoTela + " polegadas da " + this.localizacao
			+ " foi ligada agora.";	
		}
		
		else {
			return "TV " + this.fabricante + " de " + this.tamanhoTela + " polegadas da " + this.localizacao 
			+ " já estava ligada, " + "no canal " + this.canal + " e no volume " + this.volume + ".";
		}
	}
	
	public String desligarTV() {
		if(this.ligada) {
			this.canal = 0;
			this.volume = 0;
			this.ligada = false;
			
			return "A TV " + this.fabricante + " de " + this.tamanhoTela + " polegadas da " + this.localizacao
			+ " foi desligada agora.";
		}
		
		else {
			return "A TV " + this.fabricante + " de " + this.tamanhoTela + " polegadas da " + this.localizacao
			+ " já estava desligada.";
		}
	}
	
	public String mudarCanal(int canal) {
		if(!this.ligada) {
			return "A TV " + this.fabricante + " de " + this.tamanhoTela + " polegadas da " + this.localizacao
			+ " está desligada! Não é possível mudar o canal.";
		}
		
		if(canal >= 1 && canal <= 70) {
			if(this.canal != canal) {
				this.canal = canal;
				
				return "A TV " + this.fabricante + " de " + this.tamanhoTela + " polegadas da " + this.localizacao
						+ " mudou para o canal " + canal + ".";	
			}
		}
		
		if(canal < 0 || canal > 70) {
			return "ERRO: Canal solicitado não existe!";
		}
		
		else {
			return "A TV " + this.fabricante + " de " + this.tamanhoTela + " polegadas da " + this.localizacao
			+ " já estava no canal " + canal + ".";   
		}
	}
	
	public String aumentarVolume(int acrescimo) {
		if(!this.ligada) {
			return "ERRO: TV " + this.fabricante + " de " + this.tamanhoTela + " polegadas da " + this.localizacao
			+ " está desligada! Não é possível aumentar o volume.";	
		}
		
		this.volume += acrescimo;
		
		if(this.volume > 50) {
			this.volume = 50;
			return "TV " + this.fabricante + " de " + this.tamanhoTela + " polegadas da " + this.localizacao
			+ " aumentou para o volume máximo, que é 50!";
		}
		
		else {
			return "TV " + this.fabricante + " de " + this.tamanhoTela + " polegadas da " + this.localizacao
			+ " aumentou o volume para " + this.volume + ".";
		}
	}
	
	public String diminuirVolume(int decrescimo) {
		if(!this.ligada) {
			return "ERRO: TV " + this.fabricante + " de " + this.tamanhoTela + " polegadas da " + this.localizacao
			+ " está desligada! Não é possível diminuir o volume.";	
		}
		
		this.volume -= decrescimo;
		
		if(this.volume < 0) {
			this.volume = 0;
			return "TV " + this.fabricante + " de " + this.tamanhoTela + " polegadas da " + this.localizacao
			+ " diminuiu o volume para 0!";
		}
		
		else {
			return "TV " + this.fabricante + " de " + this.tamanhoTela + " polegadas da " + this.localizacao
		    + " diminuiu o volume para " + this.volume + ".";
		}
	}
}