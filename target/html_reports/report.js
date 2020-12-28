$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User able to login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Wip"
    }
  ]
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
});