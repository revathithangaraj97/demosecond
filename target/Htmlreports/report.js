$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Revathi T/Desktop/software testing/Automation/Eclipseworkspace/Cucumberexample/src/test/resources/features/login.feature");
formatter.feature({
  "line": 1,
  "name": "To test login functionality",
  "description": "",
  "id": "to-test-login-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "check login is successfully with valid credential",
  "description": "",
  "id": "to-test-login-functionality;check-login-is-successfully-with-valid-credential",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "User is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "User enter username and password",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "Clicks on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "User navigated to home page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "Loginsteps.user_enter_username_and_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Loginsteps.clicks_on_the_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Loginsteps.user_navigated_to_home_page()"
});
formatter.result({
  "status": "skipped"
});
});