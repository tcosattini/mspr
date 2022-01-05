
node{
	stage('Git fetch'){		
		  url: 'https://github.com/tcosattini/mspr',
	
	  }
	stage('Build'){
		sh 'mvn clean package'
	  }
	stage('SSH push server'){
		sh 'mvn clean package'
	  }
	}

