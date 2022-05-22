Feature: Adding Item In Cart

  
  
  @S
  Scenario: Verify User added Samsung6 in cart
    
    Given launch "<URL>"
    Then Click login
    Then Enter username and password and click login
    Then Click Samsung6 hyperlink and add to cart
    Then Click Cart
    Then Verify Samsung6 added in cart
    Then Click in place order
    Then user type name and country and city and credit card number and month and year and click purchase
    Then user is able to get confarmation of purchase
