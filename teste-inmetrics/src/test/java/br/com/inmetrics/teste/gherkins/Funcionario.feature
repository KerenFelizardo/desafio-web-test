@funcionario
Feature: Funcionario - validar registros de funcionarios
	Eu como usuario do site inmrobo
	Quero poder cadastrar e editar e excluir um funcionario
	Para que eu possa manipular os registros dos funcionarios no site
	
	@cadastrar_funcionario
	Scenario: Validar cadastro do funcionario
		Given preencher os dados do funcionario
		When cadastrar o funcionario
		Then validar funcionario cadastrado
		
	@editar_funcionario
	Scenario: Validar edicao dados do funcionario
		Given editar dados do funcionario
		When enviar os dados editados
		Then validar dados editados
		
	@excluir_funcionario
	Scenario: Validar exclusao funcionario
		Given preencher os dados para o login
		And realizar login
		When excluir funcionario
		Then validar exclusao funcionario
	
