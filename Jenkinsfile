pipeline {
    agent any	
    environment{
       PATH = "/usr/share/maven/bin:$PATH"
    }
    stages {
		stage('Build') {
            steps {
                sh 'mvn clean install'
            }
			post {
               success {
					archiveArtifacts artifacts: '**/target/demo-v1.jar'
					stash includes: '**/target/dmeo-V1.jar', name: 'apijar' 
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
