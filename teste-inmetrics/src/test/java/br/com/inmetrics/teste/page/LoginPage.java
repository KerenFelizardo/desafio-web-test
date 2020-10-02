package br.com.inmetrics.teste.page;

import org.junit.Assert;
import org.openqa.selenium.By;

import br.com.inmetrics.teste.support.Hooks;

public class LoginPage {
	
	public void preencherLogin(String nomeUsuario, String senha) throws InterruptedException {
		Hooks.driver.findElement(By.name("username")).sendKeys(nomeUsuario);
		Hooks.driver.findElement(By.name("pass")).sendKeys(senha);
	}
	
	public void clickEntre() throws InterruptedException {
		Hooks.driver.findElement(By.className("login100-form-btn")).click();
	}
	
	public void validaLoginInvalido() throws InterruptedException {
		Assert.assertTrue("Não encontrou mensagem de erro para login inválido", Hooks.driver
				.findElement(By.className("container-message")).getText().contains("ERRO! Usuário ou Senha inválidos"));
	}
	
}
