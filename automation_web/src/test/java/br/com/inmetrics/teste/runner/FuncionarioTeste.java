package br.com.inmetrics.teste.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src\\test\\java\\br\\com\\inmetrics\\teste\\gherkins\\Funcionario.feature"},
					glue = {"br.com.inmetrics.teste.steps", "br.com.inmetrics.teste.support"})
public class FuncionarioTeste {

}
