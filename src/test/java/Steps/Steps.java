package Steps;

import Elementos.Elementos;
import Metodos.Metodos;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {

	Metodos m = new Metodos();
	Elementos e = new Elementos();
	
	@Given("^que o usuario acesse a URL \"([^\"]*)\"$")
	public void que_o_usuario_acesse_a_URL(String url) throws Throwable {
		m.executarNavegador(url, "abrindo navegador");

	}

	@Given("^preenche o campo \"([^\"]*)\"$")
	public void preenche_o_campo(String arg1) throws Throwable {
		m.pausa(3000, "pausa");
		m.click(e.getBtnPopup(), "fechando a Popup");
		m.preencher(e.getCampoCpf(), "43012595201", "preenchendo o campo cpf");
	}

	@Given("^clico no botao \"([^\"]*)\"$")
	public void clico_no_botao(String arg1) throws Throwable {
		m.click(e.getBtnAbrirConta(), arg1);
	}

	@When("^o usuario preencher o formulario$")
	public void o_usuario_preencher_o_formulario() throws Throwable {
		m.pausa(3000, "pausa");
		m.preencher(e.getCampoNome(), "Murilo Fábio Almeida", "preenchendo o campo Nome");
		m.preencher(e.getCampoCelular(), "67982446531", "preenchendo o campo Celular");
		m.preencher(e.getCampoData(), "11041990", "preenchendo o campo Data");
		m.preencher(e.getCampoEmail(), "murilofabioalmeida@proxion.com.br", "preenchendo o campo Email");

	}
	
	@When("^preencher o campo nome \"([^\"]*)\"$")
	public void preencher_o_campo_nome(String nome) throws Throwable {
	    m.preencher(e.getCampoNome(), nome, "Preenchendo o campo nome");
	}

	@When("^preencher o campo celular \"([^\"]*)\"$")
	public void preencher_o_campo_celular(String celular) throws Throwable {
	   m.preencher(e.getCampoCelular(), celular, "Preenchendo o campo celular");
	}

	@When("^preencher o campo data \"([^\"]*)\"$")
	public void preencher_o_campo_data(String data) throws Throwable {
	    m.preencher(e.getCampoData(), data, "Preenchendo o campo data");
	}

	@When("^preencher o campo email \"([^\"]*)\"$")
	public void preencher_o_campo_email(String email) throws Throwable {
	   m.preencher(e.getCampoEmail(), email, "Preenchendo o campo email");
	}



	@When("^selecionar o botao \"([^\"]*)\"$")
	public void selecionar_o_botao(String arg1) throws Throwable {
		m.pausa(3000, "pausa");
		m.click(e.getBtntermodeuso(), "Validando os termos de uso");
		m.pausa(3000, "pausa");
		m.click(e.getBtnProximo(), "Selecionando o botão proximo");
	}

	@When("^tirar uma Printscrin da tela$")
	public void tirar_uma_Printscrin_da_tela() throws Throwable {
		m.pausa(3000, "pausa");
		String print = "evidencia banco neon";
		m.screnShoot("./evidencia/" + print + ".png");
	}

	@Then("^Valido o texto \"([^\"]*)\"$")
	public void valido_o_texto(String arg1) throws Throwable {
		m.pausa(3000, "pausa");
		m.fecharNavegador("fechando o navegador");
	}
	
	

}
