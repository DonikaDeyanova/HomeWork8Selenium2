$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/fundtransfer.feature");
formatter.feature({
  "name": "Shop Pragmatic BackEnd",
  "description": "  As a admin,\n  I want to login on the page and click to the \"Customers\" menu and to the \"Design\" menu, to see if they are expanded.\n  I want to check if the sub menus in the \"Design\" menu are gonna be open correctly.",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login to the page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the login page of the admin area",
  "keyword": "Given "
});
formatter.match({
  "location": "DashboardPageTest.userIsOnTheLoginPageOfTheAdminArea()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters valid username and password",
  "keyword": "When "
});
formatter.match({
  "location": "DashboardPageTest.userEntersValidUsernameAndPassword()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clicks on the login button",
  "keyword": "And "
});
formatter.match({
  "location": "DashboardPageTest.clicksOnTheLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is successfully logged in to the admin page",
  "keyword": "Then "
});
formatter.match({
  "location": "DashboardPageTest.userIsSuccessfullyLoggedInToTheAdminPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Check the \"Customers\" menu",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is successfully logged in to the admin page",
  "keyword": "Given "
});
formatter.match({
  "location": "DashboardPageTest.userIsSuccessfullyLoggedInToTheAdminPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on the \"Customers\" menu",
  "keyword": "When "
});
formatter.match({
  "location": "DashboardPageTest.userClicksOnTheCustomersMenu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The options in the \"Customers\" menu are expanded",
  "keyword": "Then "
});
formatter.match({
  "location": "DashboardPageTest.theOptionsInTheCustomersMenuAreExpanded()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Check the \"Design\" menu",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is successfully logged in to the admin page",
  "keyword": "Given "
});
formatter.match({
  "location": "DashboardPageTest.userIsSuccessfullyLoggedInToTheAdminPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on the \"Design\" menu",
  "keyword": "When "
});
formatter.match({
  "location": "DashboardPageTest.userClicksOnTheDesignMenu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The options in the \"Design\" menu are expanded",
  "keyword": "Then "
});
formatter.match({
  "location": "DashboardPageTest.theOptionsInTheDesignMenuAreExpanded()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Check the menus in the \"Design\" menu",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is successfully logged in to the admin page",
  "keyword": "Given "
});
formatter.match({
  "location": "DashboardPageTest.userIsSuccessfullyLoggedInToTheAdminPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on the \"Design\" menu",
  "keyword": "When "
});
formatter.match({
  "location": "DashboardPageTest.userClicksOnTheDesignMenu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clicks on all options in the \"Design\" menu",
  "keyword": "When "
});
formatter.match({
  "location": "DashboardPageTest.clicksOnAllOptionsInTheDesignMenu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "All sub menus in the \"Design\" menu are successfully loaded",
  "keyword": "Then "
});
formatter.match({
  "location": "DashboardPageTest.allSubMenusInTheDesignMenuAreSuccessfullyLoaded()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: expected [Layouts] but found []\r\n\tat org.testng.Assert.fail(Assert.java:96)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:776)\r\n\tat org.testng.Assert.assertEqualsImpl(Assert.java:137)\r\n\tat org.testng.Assert.assertEquals(Assert.java:118)\r\n\tat org.testng.Assert.assertEquals(Assert.java:453)\r\n\tat org.testng.Assert.assertEquals(Assert.java:463)\r\n\tat DashboardPage.verifyPresenceOfLayoutsSubMenu(DashboardPage.java:103)\r\n\tat DashboardPageTest.allSubMenusInTheDesignMenuAreSuccessfullyLoaded(DashboardPageTest.java:55)\r\n\tat ✽.All sub menus in the \"Design\" menu are successfully loaded(src/test/resources/fundtransfer.feature:30)\r\n",
  "status": "failed"
});
});