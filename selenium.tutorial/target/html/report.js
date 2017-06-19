$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Cart.feature");
formatter.feature({
  "line": 1,
  "name": "Manage Cart",
  "description": "",
  "id": "manage-cart",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "User can add a product to Cart",
  "description": "",
  "id": "manage-cart;user-can-add-a-product-to-cart",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am on \"iPhone 5\" product details page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "there are \"0\" items in the cart",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "I click on \"Add to cart\" link",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click on \"Go to Checkout\" button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I see \"iPhone 5\" is added to the cart",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I see there is \"1\" item in the cart",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "iPhone 5",
      "offset": 9
    }
  ],
  "location": "SearchProductSteps.i_am_on_product_details_page(String)"
});
formatter.result({
  "duration": 4828718300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0",
      "offset": 11
    }
  ],
  "location": "CartSteps.there_are_items_in_the_cart(String)"
});
formatter.result({
  "duration": 243111500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Add to cart",
      "offset": 12
    }
  ],
  "location": "CartSteps.i_click_on_link(String)"
});
formatter.result({
  "duration": 557043500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Go to Checkout",
      "offset": 12
    }
  ],
  "location": "CartSteps.i_click_on_button(String)"
});
formatter.result({
  "duration": 6246471000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "iPhone 5",
      "offset": 7
    }
  ],
  "location": "CartSteps.i_see_is_added_to_the_cart(String)"
});
formatter.result({
  "duration": 410795900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 16
    }
  ],
  "location": "CartSteps.i_see_there_is_item_in_the_cart(String)"
});
formatter.result({
  "duration": 77774100,
  "status": "passed"
});
formatter.uri("SearchProduct.feature");
formatter.feature({
  "line": 1,
  "name": "Search for a Product",
  "description": "",
  "id": "search-for-a-product",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "User can search for items",
  "description": "",
  "id": "search-for-a-product;user-can-search-for-items",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@skip"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on the homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I search for \"\u003cproduct\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I see \"\u003cproduct\u003e\" in search results",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "search-for-a-product;user-can-search-for-items;",
  "rows": [
    {
      "cells": [
        "product"
      ],
      "line": 10,
      "id": "search-for-a-product;user-can-search-for-items;;1"
    },
    {
      "cells": [
        "iPhone 5"
      ],
      "line": 11,
      "id": "search-for-a-product;user-can-search-for-items;;2"
    },
    {
      "cells": [
        "Magic Mouse"
      ],
      "line": 12,
      "id": "search-for-a-product;user-can-search-for-items;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "User can search for items",
  "description": "",
  "id": "search-for-a-product;user-can-search-for-items;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@skip"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on the homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I search for \"iPhone 5\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I see \"iPhone 5\" in search results",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "SearchProductSteps.i_am_on_the_homepage()"
});
formatter.result({
  "duration": 4318614400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "iPhone 5",
      "offset": 14
    }
  ],
  "location": "SearchProductSteps.i_search_for(String)"
});
formatter.result({
  "duration": 709656900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "iPhone 5",
      "offset": 7
    }
  ],
  "location": "SearchProductSteps.i_see_in_search_results(String)"
});
formatter.result({
  "duration": 4145305000,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "User can search for items",
  "description": "",
  "id": "search-for-a-product;user-can-search-for-items;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@skip"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on the homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I search for \"Magic Mouse\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I see \"Magic Mouse\" in search results",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "SearchProductSteps.i_am_on_the_homepage()"
});
formatter.result({
  "duration": 4202462700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Magic Mouse",
      "offset": 14
    }
  ],
  "location": "SearchProductSteps.i_search_for(String)"
});
formatter.result({
  "duration": 539838500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Magic Mouse",
      "offset": 7
    }
  ],
  "location": "SearchProductSteps.i_see_in_search_results(String)"
});
formatter.result({
  "duration": 3152888500,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "User searches for an item that doesn\u0027t exist",
  "description": "",
  "id": "search-for-a-product;user-searches-for-an-item-that-doesn\u0027t-exist",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@skip"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "I am on the homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "I search for \"Samsung\"",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "I see \"Sorry, but nothing matched your search criteria. Please try again with some different keywords.\" message displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchProductSteps.i_am_on_the_homepage()"
});
formatter.result({
  "duration": 6406304900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Samsung",
      "offset": 14
    }
  ],
  "location": "SearchProductSteps.i_search_for(String)"
});
formatter.result({
  "duration": 1181242900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sorry, but nothing matched your search criteria. Please try again with some different keywords.",
      "offset": 7
    }
  ],
  "location": "SearchProductSteps.i_see_message_displayed(String)"
});
formatter.result({
  "duration": 4250118800,
  "status": "passed"
});
});