$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/Mobilepurchase.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@mobile"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user launches flipkart application",
  "keyword": "Given "
});
formatter.match({
  "location": "MobilePurchseSteps.user_launches_flipkart_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user login by entering crendentials",
  "keyword": "And "
});
formatter.match({
  "location": "MobilePurchseSteps.user_login_by_entering_crendentials()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Mobile purchase",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@mobile"
    },
    {
      "name": "@one"
    }
  ]
});
formatter.step({
  "name": "user search mobile",
  "keyword": "When "
});
formatter.match({
  "location": "MobilePurchseSteps.user_search_mobile()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on the mobile name",
  "keyword": "And "
});
formatter.match({
  "location": "MobilePurchseSteps.user_click_on_the_mobile_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on add to cart",
  "keyword": "Then "
});
formatter.match({
  "location": "MobilePurchseSteps.user_click_on_add_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("src/test/resources/Features/Tvpurchase.feature");
formatter.feature({
  "name": "Tv Purchase",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tv"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user launces the flipkart appctn",
  "keyword": "Given "
});
formatter.match({
  "location": "Tvpurchase.user_launces_the_flipkart_appctn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user login by enter valid credentials",
  "keyword": "And "
});
formatter.match({
  "location": "Tvpurchase.user_login_by_enter_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Tv purchase",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tv"
    },
    {
      "name": "@one"
    },
    {
      "name": "@dim"
    }
  ]
});
formatter.step({
  "name": "user search the Tv",
  "keyword": "When "
});
formatter.match({
  "location": "Tvpurchase.user_search_the_Tv()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on the Tv name",
  "keyword": "And "
});
formatter.match({
  "location": "Tvpurchase.user_click_on_the_Tv_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on add tocart",
  "keyword": "Then "
});
formatter.match({
  "location": "Tvpurchase.user_click_on_add_tocart()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});