pipeline {
    agent any
    environment {
        M2_HOME = '/usr/share/maven'
    }
    stages {
        stage('Build') { 
            steps {
                sh '$M2_HOME/bin/mvn -B -DskipTests clean package' 
            }
        }
    }
}
