pipeline {
  agent none
  stages {
    stage('evaluacion 2') {
      steps {
        sleep 2
        archiveArtifacts(artifacts: 'login', allowEmptyArchive: true, caseSensitive: true, defaultExcludes: true)
      }
    }

  }
}