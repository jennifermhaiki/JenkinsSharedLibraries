def call(String stageName){
  
  if ("${stageName}" == "Build")
     {
       sh "echo building the application with Maven"
       //sh "mvn clean package"
     }
  else if ("${stageName}" == "SonarQube Report")
     {
       sh "echo performing code test with sonarqube"
       //sh "mvn clean sonar:sonar"
     }
  else if ("${stageName}" == "Upload Into Nexus")
     {
       sh "echo packing up to Nexus"
       //sh "mvn clean deploy"
     }
  else if ("${stageName}" == "Deoploy to Tomcat")
     {
       sh "echo deploying to Tomcat"
       
     }
}
