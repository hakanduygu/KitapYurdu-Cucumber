pipeline {
  agent {
    node {
      label 'iQuality'
    }

  }
  stages {
    stage('Check POM.xml') {
      steps {
        fileExists 'pom.xml'
      }
    }

  }
}