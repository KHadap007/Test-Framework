## Testing Project For Entrata

### Description
- This particular project is build and testing framework 
for Homepage,ResidentPay and SignUp page.

### Technology Stack
- Java (17)
- Selenium
- TestNg

### Included in pom.xml for maven dependency
- Selenium
- TestNG

### Build Automation Tools
- Maven
- Github

### Supported Platforms
- Web Application

### Links
- Home Page Link - https://www.entrata.com/
- Signup Page Link - https://www.entrata.com/sign-in
- Resident Pay Link- https://www.entrata.com/products/residentpay

### Configuration
- Change fields value in config.properties file with respective current user type.
- Change Path in TestBase.java(21 line) file for current config.properties path
- Change path in TestBase.java (34 and 37 line) for current browser path according which browser is used.

### Building and Running
```shell
mvn compile
mvn test
```
### Test cases

| Pages Covered | Test cases                  | Description                                                 | Pass/Fail |
|---------------|-----------------------------|-------------------------------------------------------------|-----------|
| HomePage      | homePageTitleTest           | In this test we are validating the title of homepage.       | Passed    | 
| HomePage      | validateLogoTest            | In this test we are validating the logo of homepage.        | Passed    |
| HomePage      | homePageSaleNoTest          | In this test we are validating the sales no of homepage.    | Passed    |
| HomePage      | homePageUrlTest             | In this test we are validating the url of page of homepage. | Passed    |
| Resident Pay  | residentPayScheduleDemoTest | In this test we are validating the form on resident pay.    | Failed    |
| SignUp        | signUpTest                  | In this test we are validating the signup functionality.    | Passed    |
