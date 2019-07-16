node {
   def mvnHome
   def workspace = pwd()
   stage('Preparation') { // for display purposes
      // Get some code from a GitHub repository
      git 'https://github.com/maopanpan/test-jenkins-demo.git'
      // Get the Maven tool.
      // ** NOTE: This 'M3' Maven tool must be configured
      // ** in the global configuration.
      mvnHome = tool 'M3'
   }
   stage('Build') {
      // Run the maven build
      if (isUnix()) {
         sh "'${mvnHome}/bin/mvn' -Dmaven.test.failure.ignore clean package"

      } else {
         bat(/"${mvnHome}\bin\mvn" -Dmaven.test.failure.ignore clean package/)
      }
   }
   stage('Deploy') {
      sh "'/scripts/deploy.sh' ${workspace}\target deploy"
   }
}
