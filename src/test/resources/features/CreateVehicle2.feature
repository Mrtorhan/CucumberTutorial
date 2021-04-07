@create_car
Feature: Create a vehicle

  As a user, I want to be able to create vehicles

  Scenario: Create a vehicle
    Given user is on the landing page
    When user logs in with "storemanager85" and "UserUser123" credentials
    Then user navigates to "Fleet" and "Vehicles"
    And user clicks on create car button
    Then user enter vehicles information
        |License Plate|Driver|Location       |Model Year|Color|
        |test_plates  |SDET  |Washington D.C.|2020      |Black|
        |Java  |Tester  |McLean, VA|2019      |Red|
