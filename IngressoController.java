package br.com.cheype.torcidometro.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.cheype.torcidometro.model.Ingresso;

@Named
@RequestScoped
public class IngressoController {
	public Ingresso ingresso;
	
	public Ingresso getIngresso() {
		return ingresso;
	}

	public void setIngresso(Ingresso ingresso) {
		this.ingresso = ingresso;
	}

	public void salvar (){
		System.out.println("Teste salvar ingresso");
	}
	
}
