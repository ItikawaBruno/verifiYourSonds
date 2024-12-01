package br.com.Alura.SoundsON.principal;

import java.text.DecimalFormat;

import br.com.Alura.SoundsON.Classes.Audio;
import br.com.Alura.SoundsON.Classes.Musica;
import br.com.Alura.SoundsON.Classes.PodCast;

public class SoundsON {

	public static void main(String[] args) {
		
		DecimalFormat fP = new DecimalFormat("#.##%");
		Audio audio = new Audio();
		Musica musica = new Musica();
		PodCast podCast = new PodCast();
		
		musica.setTitulo("Imagine");
		musica.setDuracao(5.34);
		musica.setCurtidas(4000);
		musica.setCurtidas(2100);
		musica.setTotalDeReproducoes(300);
		musica.setVisualizacaoCompleta(200);
		musica.setClassificacao(5783);
		System.out.println("Total de minutos Escutados da musica "+musica.getTitulo()+" foi de: "+musica.totalEmMinutos()+".");
		System.out.println("Total de Curtidas: "+musica.getCurtidas());
		System.out.println("Total de Reproducoes: "+musica.getTotalDeReproducoes());
		System.out.println("Porcentagem das pessoas que escutaram até o fim: "+fP.format(musica.porcentagemAssitiuTudo()));
		musica.classifcado();
		
	}

}
