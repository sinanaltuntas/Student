$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/main.feature");
formatter.feature({
  "name": "Main",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user opens the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "trendyol.stepdefinitions.LoginStepDefinitions.use_opens_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he enters the credentials",
  "keyword": "When "
});
formatter.match({
  "location": "trendyol.stepdefinitions.LoginStepDefinitions.he_enters_the_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "trendyol.stepdefinitions.LoginStepDefinitions.able_to_login()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Searching computer",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Wip"
    }
  ]
});
formatter.step({
  "name": "Go to searchbar",
  "keyword": "Given "
});
formatter.match({
  "location": "trendyol.stepdefinitions.MainStepDefinitions.go_to_searchbar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Write \"bilgisayar\"",
  "keyword": "When "
});
formatter.match({
  "location": "trendyol.stepdefinitions.MainStepDefinitions.write(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should see product list page",
  "keyword": "And "
});
formatter.match({
  "location": "trendyol.stepdefinitions.MainStepDefinitions.user_should_see_product_list_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select any product",
  "keyword": "And "
});
formatter.match({
  "location": "trendyol.stepdefinitions.ProductListStepDefinitions.select_any_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click Add to Basket",
  "keyword": "And "
});
formatter.match({
  "location": "trendyol.stepdefinitions.ProductDetailStepDefinitions.user_click_Add_to_Basket()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});