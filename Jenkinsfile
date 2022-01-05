try{
	node{
    stage('Git Checkout'){
		git credentialsId: 'github', 
		    url: 'https://github.com/testinfected/hamcrest-matchers',
			branch: "${params.gitBranch}"
	  }
	  stage('Maven Build'){
		sh 'mvn clean package'
	  }
}
catch(error){
  slackSend channel: '#devops-2',
				  color: 'danger',
				  message: "Job -  ${env.JOB_NAME}, Failed, Build URL is ${env.BUILD_URL}"
   error 'Something wrong'
}
