
	node{
    stage('Git Checkout'){
		git credentialsId: 'github', 
		    url: 'https://github.com/tcosattini/mspr',
			branch: "${params.gitBranch}"
	  }
	  stage('Maven Build'){
		sh 'mvn clean package'
	  }}

