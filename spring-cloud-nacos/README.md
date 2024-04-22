### 服务注册步骤
1. 引入依赖  
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>
<dependency>
    <groupId>com.alibaba.cloud</groupId>
    <artifactId>spring-cloud-starter-alibaba-nacos-discovery</artifactId>
</dependency>
```
2. 添加配置  
```yaml
spring:
  application:
    name: nacos-sample-server
  cloud:
    nacos:
      discovery:
        server-addr: 192.168.14.3:8848
        username: nacos
        password: nacos
```
3. 启动服务
```text
2024-04-19 01:53:10.310  INFO 222352 --- [           main] c.a.c.n.registry.NacosServiceRegistry    : nacos registry, DEFAULT_GROUP nacos-sample-server 192.168.5.1:8080 register finished
2024-04-19 01:53:12.268  INFO 222352 --- [           main] c.c.s.SpringCloudNacosApplication        : Started SpringCloudNacosApplication in 13.426 seconds (JVM running for 14.576)
```
根据日志可以看到服务已经注册成功
4. 