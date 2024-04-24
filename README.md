### SpringCloud组件示例

关于微服务的定义
> 微服务架构风格是一种将单机应用程序开发为一组小型服务的方法，每个小服务运行在自己的进程中，并以轻量级的机制来进行通信。
> 这些服务围绕着业务能力所建立，并且由完全自动化的部署机构独立部署，这些服务的集中管理只有最低限度，
> 可以用不同的编程语言编写并使用不同的数据库存储技术。

#### skywalking 添加vm options

`-javaagent:C:\Users\Desktop\tool\skywalking-agent\skywalking-agent.jar -Dskywalking.agent.service_name=sleuth-service-a -Dskywalking.collector.backend_service=192.168.5.135:11800 -Dskywalking.logging.file_name=sleuth-service-a-api.log`