# spring-boot-starter-encrypt
spring boot 数据传输加密 工具jar包开源代码，可自行适配改造

## 使用步骤
1. 打包
进入工程根目录下执行maven命令：mvn clean package -Dmaven.test.skip=true
2. 通过启动example工程：SpringBootStarterEncryptExampleApplication
3. 浏览器访问页面：http://localhost:8011/test
4. 获取数据按钮：无前端入参，后端返回加密数据
   发送数据按钮：前端json提交加密参数，后端解析并返回加密出参
