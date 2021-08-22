pipeline {
  agent none
  stages {
    stage('evaluacion2') {
      agent any
      environment {
        hdnano = 'hdnano'
      }
      steps {
        writeFile(file: 'login', text: 'prueba')
      }
    }

  }
}