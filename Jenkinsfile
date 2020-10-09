pipeline{
    
    agent any
    
    tools {
        maven 'Maven'
    }

    stages {
        stage("test") {
            steps {
                sh "mvn test"
            }
        }

        stage("quality") {
            steps {
                sh "mvn sonar:sonar -Dsonar.host.url=http://sonarqube:9000/"
            }
        }

        stage("build") {
            
            when {
                branch "main"
            }
            steps {
                sh "mvn package -DskipTests"
                script {
                    docker.build "learnwithvinod/hello-world"
                }
            }
        }
    }
}