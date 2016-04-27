package br.com.cheype.torcidometro.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.cheype.torcidometro.model.Evento;

@Named
@RequestScoped
public class EventoController {
	private Evento evento;

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	public void salvar (){
		System.out.println("Teste salvar evento");
	}
	
}
