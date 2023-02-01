pipeline {
    agent any
    stages {
		stage('Build') {
            steps {
                sh 'mvn clean install'
            }
			post {
               success {
					archiveArtifacts artifacts: '**/target/demo-0.0.1-SNAPSHOT.jar'
					stash includes: '**/target/demo-0.0.1-SNAPSHOT.jar', name: 'demo-0.0.1-SNAPSHOT' 
                   }
              }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
        
        stage('Approval') {
            steps {     
                    input('Do you want to proceed?')
				}
			}
       
        }
	}
