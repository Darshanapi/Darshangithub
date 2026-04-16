pipeline{
	agent any
	
	stages{
		
		stage('Build'){
			steps{
				bat 'mvn clean complile'
			}
		}
		
		stage('Run Tests'){
			steps{
				bat 'mvn test -DsuiteXmlFile=testng.xml'
			}
		}
	}
}