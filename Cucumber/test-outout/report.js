$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/151508/eclipse-workspace/Cucumber/src/test/java/Features/login.feature");
formatter.feature({
  "line": 1,
  "name": "GW Login",
  "description": "",
  "id": "gw-login",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 3,
      "value": "#Scenario: login"
    },
    {
      "line": 4,
      "value": "#"
    },
    {
      "line": 5,
      "value": "#Given  user is available in login page"
    },
    {
      "line": 6,
      "value": "#When title of login page is jenkins"
    },
    {
      "line": 7,
      "value": "#Then user enters \"vikashvarma94\" and \"vikash@94\""
    },
    {
      "line": 8,
      "value": "#Then user clicks on login button"
    },
    {
      "line": 9,
      "value": "#Then user is on homepage"
    },
    {
      "line": 10,
      "value": "#Then close the browser"
    }
  ],
  "line": 12,
  "name": "login",
  "description": "",
  "id": "gw-login;login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 14,
  "name": "user is available in login page",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "title of login page is jenkins",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "user enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "user is on homepage",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 21,
  "name": "",
  "description": "",
  "id": "gw-login;login;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 22,
      "id": "gw-login;login;;1"
    },
    {
      "cells": [
        "vikashvarma94",
        "vikash@94"
      ],
      "line": 23,
      "id": "gw-login;login;;2"
    },
    {
      "cells": [
        "Test",
        "Test"
      ],
      "line": 24,
      "id": "gw-login;login;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 23,
  "name": "login",
  "description": "",
  "id": "gw-login;login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 14,
  "name": "user is available in login page",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "title of login page is jenkins",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "user enters \"vikashvarma94\" and \"vikash@94\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "user is on homepage",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "loginstepdefinition.user_is_available_in_login_page()"
});
formatter.result({
  "duration": 7193650600,
  "status": "passed"
});
formatter.match({
  "location": "loginstepdefinition.title_of_login_page_is_jenkins()"
});
formatter.result({
  "duration": 20912200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "vikashvarma94",
      "offset": 13
    },
    {
      "val": "vikash@94",
      "offset": 33
    }
  ],
  "location": "loginstepdefinition.user_enters_username_and_password(String,String)"
});
formatter.result({
  "duration": 215798900,
  "status": "passed"
});
formatter.match({
  "location": "loginstepdefinition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 743693600,
  "status": "passed"
});
formatter.match({
  "location": "loginstepdefinition.user_is_on_homepage()"
});
formatter.result({
  "duration": 10773700,
  "status": "passed"
});
formatter.match({
  "location": "loginstepdefinition.close_the_browser()"
});
formatter.result({
  "duration": 4316703600,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "login",
  "description": "",
  "id": "gw-login;login;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 14,
  "name": "user is available in login page",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "title of login page is jenkins",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "user enters \"Test\" and \"Test\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "user is on homepage",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "loginstepdefinition.user_is_available_in_login_page()"
});
formatter.result({
  "duration": 5840759700,
  "status": "passed"
});
formatter.match({
  "location": "loginstepdefinition.title_of_login_page_is_jenkins()"
});
formatter.result({
  "duration": 8214600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test",
      "offset": 13
    },
    {
      "val": "Test",
      "offset": 24
    }
  ],
  "location": "loginstepdefinition.user_enters_username_and_password(String,String)"
});
formatter.result({
  "duration": 140080200,
  "status": "passed"
});
formatter.match({
  "location": "loginstepdefinition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 294902100,
  "status": "passed"
});
formatter.match({
  "location": "loginstepdefinition.user_is_on_homepage()"
});
formatter.result({
  "duration": 5446400,
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[Sign in] [Jenkins]\u003e but was:\u003c[Dashboard] [Jenkins]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:117)\r\n\tat org.junit.Assert.assertEquals(Assert.java:146)\r\n\tat Stepdefinitions.loginstepdefinition.user_is_on_homepage(loginstepdefinition.java:42)\r\n\tat ✽.Then user is on homepage(C:/Users/151508/eclipse-workspace/Cucumber/src/test/java/Features/login.feature:18)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "loginstepdefinition.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});