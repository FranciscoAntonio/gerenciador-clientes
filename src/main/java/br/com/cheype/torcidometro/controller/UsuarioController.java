package br.com.cheype.torcidometro.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.cheype.torcidometro.model.Usuario;

@Named
@RequestScoped
public class UsuarioController {
	public Usuario usuario;
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public void salvar (){
		System.out.println("Teste salvar usuario");
	}
	
}
