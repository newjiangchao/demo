pipeline {
    agent any

    stages {
        stage("Build") {
            steps {
                sh "mvn clean test -Dspring.profiles.active=test -Dsurefire.suiteXmlFiles=src/test/java/com/example/demo/SequenceTest.xml"
                sh "printenv"  // 将环境变量打印到控制台
            }
        }
    }
}