package br.com.cheype.torcidometro.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.cheype.torcidometro.model.Login;

@Named
@RequestScoped
public class LoginController {

	public Login login;
	
	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public void salvar (){
		System.out.println("Teste salvar login");
	}
	
}
