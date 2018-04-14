$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/Feature/Login.feature");
formatter.feature({
  "name": "Login to the Application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@TestLogin"
    }
  ]
});
formatter.scenario({
  "name": "Successful Login to the Application with Valid Credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@TestLogin"
    },
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User is on the Application login page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user enters valid user name",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user enters valid password",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user clicks on the login button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user is on the Application home page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "Logout of the Application",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@TestLogin"
    },
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "user logs out of the Application",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Message is displayed",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});