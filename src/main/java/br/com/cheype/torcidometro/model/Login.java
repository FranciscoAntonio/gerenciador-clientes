package br.com.cheype.torcidometro.model;

import javax.persistence.*;

@Entity
public class Login {
	@Id
	@GeneratedValue
	private Integer id;
	
	private String usuario;
	private String senha;
	private Integer nivel;
	
	@OneToOne
	private Ingresso ingresso;
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Integer getNivel() {
		return nivel;
	}
	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}
	public Ingresso getIngresso() {
		return ingresso;
	}
	public void setIngresso(Ingresso ingresso) {
		this.ingresso = ingresso;
	}
	
	
}
