Feature: Convertor
  Simple convertor for currencies

  @mytag
  Scenario: Converting two currencies
    Given firstCurrency is 10 EUR
    And rate is 1.1329
    When firstCurrency is enter
    Then the result should be 11.33 USD
