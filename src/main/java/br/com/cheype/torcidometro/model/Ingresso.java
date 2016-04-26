package br.com.cheype.torcidometro.model;

import javax.persistence.*;

@Entity
public class Ingresso {
	@Id
	@GeneratedValue
	private Integer id;
	private Integer numeroIngresso;
	
	@ManyToOne
	@JoinColumn(name = "evento_id")
	private Evento evento;
	
	@OneToOne
	private Login login;

	public Integer getNumeroIngresso() {
		return numeroIngresso;
	}

	public void setNumeroIngresso(Integer numeroIngresso) {
		this.numeroIngresso = numeroIngresso;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}
}
