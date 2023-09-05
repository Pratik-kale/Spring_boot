pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Check out the source code from GitHub
                checkout scm
            }
        }

        stage('Build and Test') {
            steps {
                // Build the Spring Boot application
                sh 'mvn clean package'
                
                // Run unit tests
                sh 'mvn test'
            }
        }

        stage('Deploy to Dev') {
            steps {
                // Deploy to the development environment
                sh 'mvn spring-boot:run'
            }
        }
    }
}

