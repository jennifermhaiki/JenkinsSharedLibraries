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
  else if ("${StageName}" == "Deoploy to Tomcat")
     {
       sh "echo deploying to Tomcat"
       //deploy adapters: [tomcat9(credentialsId: '35895ddc-28e7-4a5c-8085-5fa7e6d89457', path: '', url: 'http://http://54.184.60.63:9000/')], contextPath: null, war: 'target/*.war'
     }
}
