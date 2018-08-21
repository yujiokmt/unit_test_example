pipeline {
    agent any
    tools {
        maven 'M3'
    }
    stages {
        stage ('Initialize') {
            steps {
                sh 'mvn clean'
            }
        }

        stage ('Build') {
            steps {
                sh 'mvn compile'
            }
        }

        stage ('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage ('Package') {
            steps {
                sh 'mvn package'
            }
        }
    }
}