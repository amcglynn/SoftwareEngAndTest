# Ex 1 - JUnit Test Lifecycle
Write a test file containing three tests that print out a unique string. The file must also contain methods that use the following JUnit annotations, @BeforeClass, @Before, @After and @AfterClass, all of which must print out a unique string.

---

# Ex 2 - Test Timeouts
Write a unit test that fails if there is a slow method or endless task. 
The EndlessTask class can be used to test this.
EndlessTask.java is under the ie.gmit.softwareeng.week2.ex2 src package.

---

# Ex 3 - Testing Exceptions
Create a new class called RequestValidator that has to validate a Request object. If a field in the Request object does 
not meet the requirements, listed below, an InvalidRequestException must be thrown. 

**Request requirements:**
First name and last name must contain only characters and should have a minimum length of 1 and a maximum length of 100. 

Write various unit tests which test that exceptions are thrown when invalid Requests are validated.

---
# Ex 4 - TDD
Your task is to create a utility method that will reverse the words in a string. You need to develop the
code using Test Driven Development and should write your tests before starting to code the utility.

The input string of "Hello from GMIT" would result in the method returning "GMIT from Hello"

The utility should be robust enough to handle various types of user input.
