@login
Feature: Login - validar login no site inmrobo
	Como futuro usuario do site inmrobo
	Quero validar o login no site 
	Para que eu possa ter acesso
	
	@login_valido
	Scenario: Validar login com sucesso
		Given preencher os dados para o login
		When realizar login
		Then validar login com sucesso
		
	@login_invalido
	Scenario: Validar os campos com valores invalidos
		Given preencher os dados de forma invalida para login
		When selecionar entrar
		Then validar que o login e invalido
		 