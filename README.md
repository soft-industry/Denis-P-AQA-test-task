To start writing new tests you first need to clone this project, then you can add new scenarios to feature file in resources directory using existing steps or add new steps to step definition file;

To run tests you need to execute mvn clean verify, then report will be generated at target/site/serenity/index.html locally or deployed at gitlab pages https://test13595704.gitlab.io/Soft-Industry-example/ as last step of CI

What was refactored:
configurations and files that are not used are removed;</br>
files and directories renamed to be more understandable;</br> 
in pom file distributionManagement block removed as artifact isn't uploaded anywhere;