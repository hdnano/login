pipeline {
  agent none
  stages {
    stage('evaluacion2') {
      agent any
      environment {
        hdnano = 'hdnano'
      }
      steps {
        git(url: 'https://github.com/hdnano/login.git', changelog: true, poll: true)
      }
    }

  }
}