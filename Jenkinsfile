node{
  stage('SCM Checkout'){
  git 'https://github.com/benod44/SpringMongoMapping'
  }
  
  stage('Compile-Package'){
 def mvnHome =   tool name: '', type: 'maven'
    sh "${mvnHome}"
  }
}
