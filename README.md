##Testing Project For Entrata

###Description
-This particular project is build and testing framework 
for Homepage,ResidentPay and SignUp page.

###Technology Stack
-Java
-Selenium
-TestNg

###Included in pom.xml for maven dependency
-Selenium
-TestNG

###Build Automation Tools
-Maven

###Supported Platforms
-Web Application

###Links
- Home Page Link - https://www.entrata.com/
- Signup Page Link - https://www.entrata.com/sign-in
- Resident Pay Link- https://www.entrata.com/products/residentpay

###configuration
- Change fields value in config.properties file with respective current user type.

###Building and Running
```shell
mvn compile
mvn test
```

| Pages Covered | Test cases                  | Description                                                 | Pass/Fail |
|---------------|-----------------------------|-------------------------------------------------------------|-----------|
| HomePage      | homePageTitleTest           | In this test we are validating the title of homepage.       | Passed    | 
| HomePage      | validateLogoTest            | In this test we are validating the logo of homepage.        | Passed    |
| HomePage      | homePageSaleNoTest          | In this test we are validating the sales no of homepage.    | Passed    |
| HomePage      | homePageUrlTest             | In this test we are validating the url of page of homepage. | Passed    |
| Resident Pay  | residentPayScheduleDemoTest | In this test we are validating the form on resident pay.    | Passed    |
| SignUp        | signUpTest                  | In this test we are validating the signup functionality.    | Passed    |
