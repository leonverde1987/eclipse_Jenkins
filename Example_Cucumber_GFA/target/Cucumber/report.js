$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:features/TestUno.feature");
formatter.feature({
  "name": "prueba de un escenario",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Buscar GFA en chrome",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Que ingrese al navegador",
  "keyword": "Given "
});
formatter.match({
  "location": "Test_one.given()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Ingreso GFA en el campo buscar",
  "keyword": "And "
});
formatter.match({
  "location": "Test_one.and()"
});
formatter.result({
  "status": "passed"
});
});