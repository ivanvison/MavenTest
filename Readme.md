Thank you for getting to this point. This repository was created for a training related to Maven. How to use the project managmenet and build management tool for Java Frameworks.

## Topics Covered
- Why Maven? (mvnrepository.com)
	- Central Repo to get dependencies
	- Mantaining common structure across the organization
	- Flexibility
	- Plugins
- Terminologies
	- ArtifactID
	- GroupID
	- archetype:generate
- Creating a Maven Project with Eclipse
	- Note: Artifact ID maven-archetype-quickstart
- POM.XML File and dependencies
- Surefire Plugin
- mvn commands
	- Clean (clears previously ran test cases)
	- Compile (check syntax errors)
	- Test
- Maven expects 'test' keyword at the end of each file
- Integration TestNG and Maven
- Profiling (mvn test -PNAME)

## **Prerequisites (in this case):**
- Java JDK
- Maven folder unzipped
- Proper setup for System variables environment
- Eclipse IDE

## **Usage**
You can clone the project. Open a terminal and go to the project folder.

Use the following commands for test:
- `mvn test` to run all available tests
- `mvn test -PRegression` to run the profile that holds tests for Regression testing
- `mvn test -PSmoke` to run the profile that holds tests for Smoke testing