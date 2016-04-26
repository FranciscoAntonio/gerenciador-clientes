package br.com.cheype.torcidometro.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Evento {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private String local;
	private String data;
	private String hora;
	
	//@Column(nullable = false)
	@ManyToMany(mappedBy = "eventos")
	private List<Banda> bandas;
	
	@OneToMany(mappedBy = "evento")
	private List<Ingresso> ingressos;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public List<Banda> getBandas() {
		return bandas;
	}
	public void setBandas(List<Banda> bandas) {
		this.bandas = bandas;
	}
	public List<Ingresso> getIngressos() {
		return ingressos;
	}
	public void setIngressos(List<Ingresso> ingressos) {
		this.ingressos = ingressos;
	}

	
}
