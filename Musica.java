package br.com.Alura.SoundsON.Classes;

import br.com.Alura.SoundsON.Interface.Reproduzivel;

public class Musica extends Audio implements Reproduzivel {

	@Override
	public int curtir() {
		int totCurtidas=0; 
		totCurtidas+= getCurtidas();
		return totCurtidas;
	}

	@Override
	public int reproduzir() {
		int totReproducao=0;
		totReproducao+=getTotalDeReproducoes();
		return totReproducao;
	}

	@Override
	public double classificar() {
		if(getClassificacao()>=5000) {
			return 5;
		}else if(getClassificacao()>=2000) {
			return 4;
		}else if(getClassificacao()>=1500) {
			return 3;
		}else {
			return 1;
		}
	}
	
	public void classifcado() {
		if(classificar()==5) {
			System.out.println("Está no top 5 do mundo.");
		}else if(classificar()==4) {
			System.out.println("Melhores musicas do momento.");
		}else {
			System.out.println("Uma ótima escolha para hoje.");
		}
	}
	
}
