package br.com.inmetrics.teste.page;

import org.junit.Assert;
import org.openqa.selenium.By;

import br.com.inmetrics.teste.support.Hooks;

public class FuncionarioPage {
	
	public void clickFuncionario() throws InterruptedException{
		Hooks.driver.findElements(By.className("nav-item")).get(1).click();
	}
	
	public void preencherRegistroFuncionario() throws InterruptedException{
		Hooks.driver.findElement(By.id("inputNome")).sendKeys("Usuario Teste");
		Hooks.driver.findElement(By.id("cpf")).sendKeys("759.950.610-11");
		Hooks.driver.findElement(By.id("slctSexo")).sendKeys("Masculino");
		Hooks.driver.findElement(By.id("inputAdmissao")).sendKeys("20/05/2015");
		Hooks.driver.findElement(By.id("inputCargo")).sendKeys("TI");
		Hooks.driver.findElement(By.id("dinheiro")).sendKeys("10.000,00");
		Hooks.driver.findElement(By.id("clt")).click();
		Hooks.driver.findElement(By.className("cadastrar-form-btn")).click();
	}
	
	public void validaCadastroFuncionario() throws InterruptedException{
		Assert.assertTrue("Não encontrou mensagem para cadasro com sucesso", Hooks.driver
				.findElement(By.className("container-message")).getText().contains("SUCESSO! Usuário cadastrado com sucesso"));
	}
	
	public void clickEditar() {
		Hooks.driver.findElement(By.xpath("//*[@id=\"tabela\"]/tbody/tr[1]/td[6]/a[2]/button/span")).click();
	}
	
	public void alterarRegistro() throws InterruptedException {
		CadastroPage cadastro = new CadastroPage();
		Hooks.driver.findElement(By.id("inputNome")).clear();
		Hooks.driver.findElement(By.id("inputNome")).sendKeys(cadastro.gerarUsuario());
		Hooks.driver.findElement(By.className("cadastrar-form-btn")).click();
	}
	
	public void validaCadastroAlterado() {
		Assert.assertTrue("Não encontrou mensagem para alteração do cadastro", Hooks.driver
				.findElement(By.className("container-message")).getText().contains("SUCESSO! Informações atualizadas com sucesso"));
	}
	
	public void excluirFuncionario() {
		Hooks.driver.findElement(By.id("delete-btn")).click();
	}
	
	public void validaExclusaoFuncionario() {
		Assert.assertTrue("Não encontrou mensagem para exclusão do cadastro", Hooks.driver
				.findElement(By.className("container-message")).getText().contains("SUCESSO! Funcionário removido com sucesso"));
	
	}
}
