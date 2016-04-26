package br.com.cheype.torcidometro.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.cheype.torcidometro.model.Banda;

@Named
@RequestScoped
public class BandaController {
	private Banda banda;

	public Banda getBanda() {
		return banda;
	}

	public void setBanda(Banda banda) {
		this.banda = banda;
	}
	
	public void salvar (){
		System.out.println("Teste salvar banda");
	}
}
