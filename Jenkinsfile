pipeline {
  agent any
  stages {
    stage('hdnano') {
      agent any
      environment {
        hdnano = 'hdnano'
      }
      steps {
        git(url: 'https://github.com/hdnano/login.git', branch: 'mastes')
      }
    }

  }
}