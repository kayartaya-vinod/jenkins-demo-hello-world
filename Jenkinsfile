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
                sh "mvn sonar:sonar -Dsonar.host.url=http://localhost:9000/"
            }
        }

        stage("build") {
            steps {
                sh "mvn package -DskipTests"
            }
        }
        stage("docker-image") {
            steps {
                script {
                    docker.build "learnwithvinod/hello-world"
                }
            }
        }
    }
}