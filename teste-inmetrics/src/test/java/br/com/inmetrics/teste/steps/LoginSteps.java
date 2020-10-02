package br.com.inmetrics.teste.steps;

import br.com.inmetrics.teste.page.CadastroPage;
import br.com.inmetrics.teste.page.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	LoginPage login = new LoginPage();
	CadastroPage cadastro = new CadastroPage();
	@Given("preencher os dados para o login")
	public void preencher_os_dados_para_o_login() throws InterruptedException {
		login.preencherLogin("testeteste2444", "1234");
	}

	@When("realizar login")
	public void realizar_login() throws InterruptedException {
	   login.clickEntre();
	}

	@Then("validar login com sucesso")
	public void validar_login_com_sucesso() throws InterruptedException {
		cadastro.validarLogin();
	}

	@Given("preencher os dados de forma invalida para login")
	public void preencher_os_dados_de_forma_invalida_para_login() throws InterruptedException {
		login.preencherLogin("testeteste2444", "1235");
	}

	@When("selecionar entrar")
	public void selecionar_entrar() throws InterruptedException {
		login.clickEntre();
	}

	@Then("validar que o login e invalido")
	public void validar_que_o_login_e_invalido() throws InterruptedException {
		login.validaLoginInvalido();
	}
}
