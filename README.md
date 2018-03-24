# Cucumber with Maven

Simple implementation of cucumber with maven.

## Steps

Follow these steps for BDD

### Prerequisites

Add Maven dependency for cucumber in POM.

```
<dependencies>
        <dependency>
            <groupId>info.cukes</groupId>
            <artifactId>cucumber-java</artifactId>
            <version>${cucumber.version}</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>info.cukes</groupId>
            <artifactId>cucumber-junit</artifactId>
            <version>${cucumber.version}</version>
            <scope>test</scope>
        </dependency>
    </dependencies>
```

### Development

All steps to be performed

- Create feature in test/resources/features directory
- Create stepdefs package under test/java
- Create Step definitions.
- Create CukeRunner class
- Implement code
- (OPTIONAL) Add maven dependency for surefire plugin for maven to find and run cucumber tests. Maven surefire plugin runs test and generate reports. It internally calls junit or other testing framework. Advantage of using surefire plugin is report generation. Apart from this it provides various features where testing framework lags. For e.g. earlier it was parallel execution which was missing in junit.
