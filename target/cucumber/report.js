$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/NewAccount.feature");
formatter.feature({
  "line": 1,
  "name": "Validate Techfios Login Functionality",
  "description": "",
  "id": "validate-techfios-login-functionality",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 7,
  "name": "",
  "description": "",
  "id": "validate-techfios-login-functionality;",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@NewAccount"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "User Enters the \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User clicks on Login button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User should be able to see the Dashboard",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User clicks on Bank and cash",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User clicks on New account",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User fill up the form Entering \"\u003caccountTitle\u003e\"and \"\u003cdescription\u003e\"and \"\u003cinitialBalance\u003e\"and \"\u003caccountNumber\u003e\"and \"\u003ccontactPerson\u003e\"and \"\u003cphone\u003e\"and \"\u003cinternetBankingUrl\u003e\" and clicks on submit",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User should be able to see Validate",
  "keyword": "Then "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "validate-techfios-login-functionality;;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "accountTitle",
        "description",
        "initialBalance",
        "accountNumber",
        "contactPerson",
        "phone",
        "internetBankingUrl"
      ],
      "line": 17,
      "id": "validate-techfios-login-functionality;;;1"
    },
    {
      "cells": [
        "demo@techfios.com",
        "abc123",
        "SRahman",
        "Saving",
        "3000",
        "123658",
        "JR",
        "123456",
        "SR@gmail.com"
      ],
      "line": 18,
      "id": "validate-techfios-login-functionality;;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 4634863000,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User is on the Login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.User_is_on_the_LoginPage()"
});
formatter.result({
  "duration": 1667692000,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "",
  "description": "",
  "id": "validate-techfios-login-functionality;;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@NewAccount"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "User Enters the \"demo@techfios.com\" and \"abc123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User clicks on Login button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User should be able to see the Dashboard",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User clicks on Bank and cash",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User clicks on New account",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User fill up the form Entering \"SRahman\"and \"Saving\"and \"3000\"and \"123658\"and \"JR\"and \"123456\"and \"SR@gmail.com\" and clicks on submit",
  "matchedColumns": [
    2,
    3,
    4,
    5,
    6,
    7,
    8
  ],
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User should be able to see Validate",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "demo@techfios.com",
      "offset": 17
    },
    {
      "val": "abc123",
      "offset": 41
    }
  ],
  "location": "StepDefinition.user_Enters_the_and(String,String)"
});
formatter.result({
  "duration": 2818128000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_Login_button()"
});
formatter.result({
  "duration": 4198989500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_should_be_able_to_see_the_Dashboard()"
});
formatter.result({
  "duration": 968935700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_Bank_and_cash()"
});
formatter.result({
  "duration": 4125834300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_New_account()"
});
formatter.result({
  "duration": 2882611100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SRahman",
      "offset": 32
    },
    {
      "val": "Saving",
      "offset": 45
    },
    {
      "val": "3000",
      "offset": 57
    },
    {
      "val": "123658",
      "offset": 67
    },
    {
      "val": "JR",
      "offset": 79
    },
    {
      "val": "123456",
      "offset": 87
    },
    {
      "val": "SR@gmail.com",
      "offset": 99
    }
  ],
  "location": "StepDefinition.user_fill_up_the_form_Entering_and_and_and_and_and_and_and_clicks_on_submit(String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 11467502600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_should_be_able_to_see_Validate()"
});
formatter.result({
  "duration": 9954400,
  "status": "passed"
});
formatter.after({
  "duration": 1122120200,
  "status": "passed"
});
});