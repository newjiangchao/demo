pipeline {
    agent any
    stages {
        stage('Test') {
            steps {
                echo "Testing..."
                sh "mvn clean test -Dspring.profiles.active=test -Dsurefire.suiteXmlFiles=src/test/java/com/example/demo/DemoApplicationTests.xml"
                sh "printenv"  // 将环境变量打印到控制台
            }
        }
    }
    post('Results') {
        always {
            allure includeProperties: false, jdk: '', results: [[path: 'allure-results']]
        }
    }
}