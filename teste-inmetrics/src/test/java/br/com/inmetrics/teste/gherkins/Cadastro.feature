@cadastro
Feature: Cadastro - validar cadastro no site inmrobo
	Como futuro usuario do site inmrobo
	Quero poder cadastrar meus dados
	De modo que possa usar o site
	
	@cadastro_com_sucesso
	Scenario: Validar cadastro com sucesso
		Given informar dados para cadastro
		When finalizar o cadastro
		Then validar cadastro com sucesso
		
	@validar_campo_senha_divergente
	Scenario: Validar preenchimento da senha divergente
		Given informar senhas divergentes
		When selecionar o botao cadastrar
		Then validar mensagem de erro para o campo de senha
		
	@validar_campo_vazio
	Scenario: Validar cadastro com campos vazios
		Given ignorar o preenchimentos dos campos
		When selecionar o botao cadastrar
		Then validar a nao finalizacao do cadastro
		
				
				