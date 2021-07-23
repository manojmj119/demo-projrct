pipeline{
    agent any
    stages{
   
      stage('Test'){
          steps{
          sh 'mvn test'
          }
      }
      stage('Build'){
          steps{
          sh 'mvn install'
          }
      }
      stage('Deploy'){
          steps{
          sh 'mvn deploy'
          }
      }
         stage('Tool version Check') {
            steps {
                echo "Hello, Maven"
                sh "mvn --version"
            }
        }
            
    stage('SonarQube Analysis') {
      environment {
        SCANNER_HOME = tool 'sonarnexus4.6.2'
        ORGANIZATION = "nexus-pipeline-2021"
        PROJECT_NAME = "nexus-pipeline-2021"
      }
      steps {
        withSonarQubeEnv('sonarnexus') {
            sh '''$SCANNER_HOME/bin/sonar-scanner -Dsonar.organization=$ORGANIZATION \
            -Dsonar.projectKey=$PROJECT_NAME \
            -Dsonar.sources=.'''
        }
      }
    }
       


 
       
        stage('Stage 2') {
            steps {
                echo 'Stage2 Hello world!'  
                echo  'Stage2 $date'
               
            }
           
        }
       
       
        stage('Stage 3') {
            steps {
                echo 'Welcome to Stage3 '  
                echo  'Stage3 '
            }
           
        }          
    }


         
}





