pipeline {
    
    agent { label 'master' }
    triggers {
        pollSCM 'H/1 * * * *'
    }
    stages {
	   
        stage ('Checkout') {
          steps {
            git 'https://github.com/wilfredwilly/Java-HelloWorld-Sample.git'
          }
        }
        stage('Build') {
            
             steps {
               
               sh '/opt/apache-maven-3.5.3/bin/mvn clean package'
                junit '**/target/surefire-reports/TEST-*.xml'
				archiveArtifacts artifacts: '**/target/*.war', fingerprint: true
            }
        }
        stage('deploy') {
            steps {
            pushToCloudFoundry(
               target: 'api.app-cloudfoundry.com',
               organization: 'techm_dev',
               cloudSpace: 'dev',
               credentialsId: 'b7c24062-6ea4-4876-89a1-96b3c2b430b2',
               selfSigned: 'true',
               manifestChoice: [ // optional... defaults to manifestFile: manifest.yml
        command: 'cf push /var/lib/jenkins/workspace/wilfred/manifest.yml'
    ]
                                )
                  }
                         }  

            }
          }
