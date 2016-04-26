package br.com.cheype.torcidometro.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Banda {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String nome;
	private Integer torcida;
	
	@ManyToMany
	@JoinTable(name = "banda_evento")
	private List<Evento> eventos;

	@Column(length = 30, nullable = false)
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getTorcida() {
		return torcida;
	}

	public void setTorcida(Integer torcida) {
		this.torcida = torcida;
	}

	public List<Evento> getEventos() {
		return eventos;
	}

	public void setEventos(List<Evento> eventos) {
		this.eventos = eventos;
	}
}
