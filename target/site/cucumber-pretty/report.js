$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("shopdress.feature");
formatter.feature({
  "line": 2,
  "name": "As a User I should be able to purchase Material",
  "description": "",
  "id": "as-a-user-i-should-be-able-to-purchase-material",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Shop"
    }
  ]
});
formatter.before({
  "duration": 2177482276,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User be able to purchase Material",
  "description": "",
  "id": "as-a-user-i-should-be-able-to-purchase-material;user-be-able-to-purchase-material",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@ShopDress"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on YourLogo Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on Women Tab",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I should be able to select T-shirt",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I shoud able to purchase the Material",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStoreOrder.i_am_on_YourLogo_Home_page()"
});
formatter.result({
  "duration": 11465196867,
  "status": "passed"
});
formatter.match({
  "location": "MyStoreOrder.i_click_on_Women_Tab()"
});
formatter.result({
  "duration": 119004107369,
  "status": "passed"
});
formatter.match({
  "location": "MyStoreOrder.i_should_be_able_to_select_T_shirt()"
});
formatter.result({
  "duration": 19486,
  "status": "passed"
});
formatter.match({
  "location": "MyStoreOrder.i_shoud_able_to_purchase_the_Material()"
});
formatter.result({
  "duration": 18159,
  "status": "passed"
});
formatter.after({
  "duration": 91296176,
  "status": "passed"
});
});