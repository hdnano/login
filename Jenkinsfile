pipeline {
  agent none
  stages {
    stage('evaluacion2') {
      agent any
      environment {
        hdnano = 'hdnano'
      }
      steps {
        git(url: 'https://github.com/hdnano/login.git', branch: 'master', changelog: true)
        echo 'carga con exito'
      }
    }

  }
}