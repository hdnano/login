pipeline {
  agent none
  stages {
    stage('evaluacion2') {
      agent any
      environment {
        hdnano = 'hdnano'
      }
      steps {
        git 'https://github.com/hdnano/login.git'
      }
    }

  }
}