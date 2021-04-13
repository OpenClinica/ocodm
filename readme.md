# OpenClinica ODM

## Adding a new field

Make your update in the following files:
* OpenClinica-ToODM1-3-0-OC3-0.xsd
* OpenClinica-ODM1-3-0-OC3-0-foundation.xsd

## Pushing Updates & Compiling

To compile, run a "**mvn clean install**".

Push to JFrog:
* Login to the OpenClinica artifactory at: https://openclinica.jfrog.io/
* Upload the new JAR under "libs-release/org/akaza/openclinica/odm/openclinica-odm/"

