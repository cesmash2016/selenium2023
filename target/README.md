# selenium2023


### How to run test 

`mvn clean test`

### hOW TO RUN INDIVIDUAL FEATURE FILE 
`mvn clean test -Dcucumber.features="path/to/the/file.feature"`

To run by tag 
`mvn clean test -Dcucumber.filter.tags="@TagName"`