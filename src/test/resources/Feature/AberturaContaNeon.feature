
@tag
Feature: Abertura de conta neon

  @pessoaneon
  Scenario: Fluxo do formulario de abertura banco neon
	Given que o usuario acesse a URL "https://neon.com.br/"
	And preenche o campo "Digite seu CPF"
	And clico no botao "Abra sua conta"
	When o usuario preencher o formulario
	And selecionar o botao "proximo"
	And tirar uma Printscrin da tela 
	Then Valido o texto "estamos quase lá"	


	@neonteste
  Scenario Outline: conta pessoa Fisica
  Given que o usuario acesse a URL "https://neon.com.br/"
	And preenche o campo "Digite seu CPF"
	And clico no botao "Abra sua conta"
  When preencher o campo nome "<nome>"
  When preencher o campo celular "<celular>"
  When preencher o campo data "<data>"
  When preencher o campo email "<email>"
  And selecionar o botao "proximo"
	And tirar uma Printscrin da tela 
	Then Valido o texto "estamos quase lá"
   
   Examples:
					| nome           |    celular     |    email                                     |      data         |  
					| Matheus Mendes |    66999332456 |  	thomas_luiz_ribeiro@crbrandao.com.br       |  		11041990		 |
