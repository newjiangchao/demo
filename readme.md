# 接口测试实现

> 结合TestNG使用SpringBoot实现接口测试需求。

### 测试执行demo

```
mvn clean test -Dspring.profiles.active=test -Dsurefire.suiteXmlFiles=src/test/java/com/example/demo/SequenceTest.xml
```

### 测试报告查看

```
1. 可以直接创建allure服务查看
allure serve allure-results

2. 生成html后查看
allure generate allure-results -o report
```

### Jenkins安装

```
1. rpm包下载地址：
https://mirrors.tuna.tsinghua.edu.cn/jenkins/redhat-stable/

2. 安装 epel-release
yum -y install epel-release

3. 安装 daemonize
yum -y install daemonize

4. 安装jenkins
rpm -ivh /root/jenkins-2.303.1-1.1.noarch.rpm

5. 开启端口访问防火墙设置
https://www.jianshu.com/p/c379469d7134

```

### 参考
```
https://repo.maven.apache.org/maven2/io/qameta/allure/allure-commandline/
https://docs.qameta.io/allure/#_testng
https://www.cnblogs.com/sueyyyy/p/13721976.html
https://blog.51cto.com/wujianwei/2492354
https://blog.csdn.net/qq_39722422/article/details/108796646
```