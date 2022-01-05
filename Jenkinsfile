
node{
	stage('Git fetch'){
		git credentialsId: 'tcosattini', 
		  url: 'https://github.com/tcosattini/mspr',
			branch: "${params.gitBranch}"
	  }
	stage('Build'){
		sh 'mvn clean package'
	  }
	stage('SSH push server'){
		sh 'mvn clean package'
	  }
	}

