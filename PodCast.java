package br.com.Alura.SoundsON.Classes;

import br.com.Alura.SoundsON.Interface.Reproduzivel;

public class PodCast extends Audio implements Reproduzivel {

	
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
		if(getClassificacao()>=5000 || curtir()>=3000) {
			return 5;
		}else if(getClassificacao()>=2000 || curtir()>=2000) {
			return 4;
		}else if(getClassificacao()>=1500 || curtir()>=1000) {
			return 3;
		}else {
			return 1;
		}
	}
	
	
	
	
}
