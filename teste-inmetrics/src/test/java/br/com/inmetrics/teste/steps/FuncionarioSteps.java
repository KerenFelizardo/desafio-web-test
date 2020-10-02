package br.com.inmetrics.teste.steps;

import br.com.inmetrics.teste.page.FuncionarioPage;
import br.com.inmetrics.teste.page.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FuncionarioSteps {
	LoginPage login = new LoginPage();
	FuncionarioPage funcionario = new FuncionarioPage();

	@Given("preencher os dados do funcionario")
	public void preencher_os_dados_do_funcionario() throws InterruptedException {
		login.preencherLogin("testeteste2444", "1234");
		login.clickEntre();
	}

	@When("cadastrar o funcionario")
	public void cadastrar_o_funcionario() throws InterruptedException {
		funcionario.clickFuncionario();
		funcionario.preencherRegistroFuncionario();
	}

	@Then("validar funcionario cadastrado")
	public void validar_funcionario_cadastrado() throws InterruptedException {
		funcionario.validaCadastroFuncionario();
	}

	@Given("editar dados do funcionario")
	public void editar_dados_do_funcionario() throws InterruptedException {
		login.preencherLogin("testeteste2444", "1234");
		login.clickEntre();
		funcionario.clickEditar();
	}

	@When("enviar os dados editados")
	public void enviar_os_dados_editados() throws InterruptedException {
		funcionario.alterarRegistro();
	}

	@Then("validar dados editados")
	public void validar_dados_editados() {
		funcionario.validaCadastroAlterado();
	}

	@When("excluir funcionario")
	public void excluir_funcionario() {
		funcionario.excluirFuncionario();
	}

	@Then("validar exclusao funcionario")
	public void validar_exclusao_funcionario() {
		funcionario.validaExclusaoFuncionario();
	}
}
