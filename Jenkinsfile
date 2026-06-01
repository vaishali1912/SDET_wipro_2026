pipeline {
    agent any
 
    tools {
        maven 'Maven3'
    }
 
    stages {
 
        stage('Checkout') {
            steps {
                git branch: 'master',
                    url: 'https://github.com/vaishali1912/SDET_wipro_2026'
            }
        }
 
        stage('Build') {
            steps {
                dir('Cucumber_BDD') {
                    bat 'mvn clean'
                }
            }
        }
 
        stage('Compile') {
            steps {
                dir('Cucumber_BDD') {
                    bat 'mvn compile'
                }
            }
        }
 
        stage('Test') {
            steps {
                dir('Cucumber_BDD') {
                    bat 'mvn test'
                }
            }
        }
 
        stage('Package') {
            steps {
                dir('Cucumber_BDD') {
                    bat 'mvn package'
                }
            }
        }
    }
 
    post {
        success {
            echo 'Build Successful'
        }
 
        failure {
            echo 'Build Failed'
        }
    }
}
 
