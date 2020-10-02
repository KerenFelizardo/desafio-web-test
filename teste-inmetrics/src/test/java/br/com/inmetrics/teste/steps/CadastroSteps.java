package br.com.inmetrics.teste.steps;

import org.openqa.selenium.By;

import br.com.inmetrics.teste.page.CadastroPage;
import br.com.inmetrics.teste.support.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CadastroSteps {
	CadastroPage cadastro = new CadastroPage();
	@Given("informar dados para cadastro")
	public void informar_dados_para_cadastro() throws InterruptedException {
		cadastro.clicarCadastrar();
	}

	@When("finalizar o cadastro")
	public void finalizar_o_cadastro() throws InterruptedException {
		cadastro.realizarCadastro("5555", "5555");
	}

	@Then("validar cadastro com sucesso")
	public void validar_cadastro_com_sucesso() throws InterruptedException {
	    cadastro.validarLogin();
	}
	
	@Given("informar senhas divergentes")
	public void informar_senhas_divergentes() throws InterruptedException {
		cadastro.clicarCadastrar();
		cadastro.preencherCadastroDivergente();
	}

	@When("selecionar o botao cadastrar")
	public void selecionar_o_botao_cadastrar() throws InterruptedException {
		cadastro.clicaCadastrarDados();
	}

	@Then("validar mensagem de erro para o campo de senha")
	public void validar_mensagem_de_erro_para_o_campo_de_senha() throws InterruptedException {
	   cadastro.validaSenhaDivergente();
	}

	@Given("ignorar o preenchimentos dos campos")
	public void ignorar_o_preenchimentos_dos_campos() throws InterruptedException {
		cadastro.clicarCadastrar();
		cadastro.clicaCadastrarDados();
	}

	@Then("validar a nao finalizacao do cadastro")
	public void validar_mensagem_de_nao_preenchimento_para_os_campos() throws InterruptedException {
	   cadastro.validarConfirmarSenha();
	}

}
