package controller;

import model.TV;

public class GerenciamentoTV {

	public static void main(String[] args) {
		TV t1 = new TV();
		t1.setFabricante("Samsung");
		t1.setModelo("50RU7100");
		t1.setTamanhoTela(50);
		t1.setLocalizacao("sala");
		t1.setLigada(true);
		t1.setVolume(50);
		t1.setCanal(10);
		
//		t1.caracteristicas();
//		System.out.println(t1.situacaoTV());
//		System.out.println(t1.ligarTV());
//		System.out.println(t1.desligarTV());
//		System.out.println(t1.mudarCanal(21));
//		System.out.println(t1.aumentarVolume(30));
//		System.out.println(t1.diminuirVolume(30));
	}

}
