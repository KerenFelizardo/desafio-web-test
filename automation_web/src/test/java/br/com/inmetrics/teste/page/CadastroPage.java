package br.com.inmetrics.teste.page;

import java.util.Random;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.com.inmetrics.teste.support.Hooks;

public class CadastroPage {
	
	public void clicarCadastrar() throws InterruptedException {
		Hooks.driver.findElement(By.xpath("/html/body/div/div[2]/div/form/div[7]/a")).click();
	}
	
	public void realizarCadastro(String senha, String senhaConfrimacao) throws InterruptedException {
		String nomeUsuario = gerarUsuario();
		Hooks.driver.findElement(By.name("username")).sendKeys(nomeUsuario);
		Hooks.driver.findElement(By.name("pass")).sendKeys(senha);
		Hooks.driver.findElement(By.name("confirmpass")).sendKeys(senhaConfrimacao);
		Hooks.driver.findElement(By.className("login100-form-btn")).click();
		realizarLogin(nomeUsuario, senha);
	}
	
	public void preencherCadastroDivergente() throws InterruptedException{
		Hooks.driver.findElement(By.name("username")).sendKeys(gerarUsuario());
		Hooks.driver.findElement(By.name("pass")).sendKeys("5555");
		Hooks.driver.findElement(By.name("confirmpass")).sendKeys("5554");
		Hooks.driver.findElement(By.className("login100-form-btn")).click();
	}
	
	public void realizarLogin(String nomeUsuario, String senha) throws InterruptedException {
		Hooks.driver.findElement(By.name("username")).sendKeys(nomeUsuario);
		Hooks.driver.findElement(By.name("pass")).sendKeys(senha);
		Hooks.driver.findElement(By.className("login100-form-btn")).click();
	}
	
	public void validarLogin() throws InterruptedException {
		Assert.assertTrue("Botão sair não encontrado",
				Hooks.driver.findElements(By.className("nav-item")).get(2).getText().equals("SAIR"));	
	}
	
	public void clicaCadastrarDados() throws InterruptedException{
		Hooks.driver.findElement(By.className("login100-form-btn")).click();
	}
	
	public void validaSenhaDivergente() throws InterruptedException{
		Assert.assertTrue("Não encontrou resultado para senhas que não combinam", Hooks.driver.findElements(By.className("txt1")).get(1).getText().contains("Senhas não combinam"));
	}
	
	public void validarConfirmarSenha() throws InterruptedException{
		Assert.assertEquals("Confirme a senha", Hooks.driver.findElements(By.className("txt1")).get(2).getText());
	}
	
	public String gerarUsuario() throws InterruptedException {

		int i, nrAleatorioVogal, nrAleatorioConsoante;

		String vogal[] = { "a", "e", "i", "o", "u", }, consoante[] = { "b", "c", "d", "f", "g", "h",
				"j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "w", "x", "y", "z" };
		String resultado = "", nome = "";

		Random random = new Random();

		for (i = 0; i <= 10; i++) {
			nrAleatorioVogal = 0 + random.nextInt(4);
			nrAleatorioConsoante = 0 + random.nextInt(19);
			resultado = vogal[nrAleatorioVogal] + consoante[nrAleatorioConsoante];
			nome = nome + resultado;
		}
		return nome;
	}
}
