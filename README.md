flipkart-bdd-appium/



├── src/
│   ├── main/
│   └── test/
│       ├── java/
│       │   ├── pageobjects/
│       │   │   ├── LoginPage.java
│       │   │   ├── HomePage.java
│       │   │   └── ProductPage.java
│       │   ├── stepdefinitions/
│       │   │   └── FlipkartSteps.java
│       │   └── runner/
│       │       └── TestRunner.java
│       └── resources/
│           └── features/
│               └── Flipkart.feature
├── env.json
├── pom.xml
# 



How to Run:
Start Appium server:


appium --use-plugins=element-wait --allow-cors

Run with Maven:


mvn test
