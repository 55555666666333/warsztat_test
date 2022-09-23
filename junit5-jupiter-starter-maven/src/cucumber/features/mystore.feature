Feature: Add new adress on my store

  Scenario Outline: Add a new user adress using https://mystore-testlab.coderslab.pl/index.php?controller=addresses
    Given An url https://mystore-testlab.coderslab.pl/index.php?controller=addresses opened in browser
    And clicked button create a new adress
    When <Adress> <Zip> and <City> get filled to form
    And Save Button clicked
    Then a new Adress is submitted
    And Save screenshot
    And Quit browser
    Examples:
      |Adress      | Zip    | City       |
      |Ul.Mokotowska| 02-508 | Warszawa   |

Feature: Adding a product to the basket

  Scenario Outline: Add a product to the basket using https://mystore-testlab.coderslab.pl/index.php
    Given  An url https://mystore-testlab.coderslab.pl/index.php opened in browser
    And clicked button search our catalog
    When <Sweater> get filled to the line search our catalog
    And Search Button clicked
    Examples:
      | Sweater                      |
      |  Hummingbird Printed Sweater |
