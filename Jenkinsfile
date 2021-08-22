pipeline {
  agent none
  stages {
    stage('evaluacion2') {
      agent any
      environment {
        hdnano = 'hdnano'
      }
      steps {
        writeFile(file: 'C:\\Windows\\System32\\config\\systemprofile\\AppData\\Local\\Jenkins\\.jenkins\\workspace', text: 'evaluacion')
      }
    }

  }
}