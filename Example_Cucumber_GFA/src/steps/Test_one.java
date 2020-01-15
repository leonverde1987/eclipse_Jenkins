package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import ramas.TestOne;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;

public class Test_one extends TestOne {
  @Given("^Que ingrese al navegador$")
  public void given() throws Throwable {
	  this.abrir_Google();
  }


  @And("^Ingreso GFA en el campo buscar$")
  public void and() throws Throwable {
	  this.buscar_GFA();
	  this.cerrar_Navegador();
  }

}
