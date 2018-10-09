# [《小吴同学的SpringBoot学习之核心技术篇》](https://github.com/WuqingVika/WqSpringBootDemo)

## 1.初遇SpringBoot

### 1.1了解个大概
> 简化Spring应用开发的一个框架；
>
> 整个Spring技术栈的一个大整合；
>
> J2EE开发的一站式解决方案；


> SpringBoot-->J2EE一站式解决方案。整个Spring技术栈的一个整合。
SpringCloud-->分布式整体解决方案
### 1.2 有何优点
![图1.1 SpringBoot优点](https://upload-images.jianshu.io/upload_images/2836779-b3155f6f0bb8b7ab.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

## 2.撸起袖子开干哟

### 2.1 环境
- Maven设置：给maven 的settings.xml配置文件的profiles标签添加
```xml
<profile>
  <id>jdk-1.8</id>
  <activation>
    <activeByDefault>true</activeByDefault>
    <jdk>1.8</jdk>
  </activation>
  <properties>
    <maven.compiler.source>1.8</maven.compiler.source>
    <maven.compiler.target>1.8</maven.compiler.target>
    <maven.compiler.compilerVersion>1.8</maven.compiler.compilerVersion>
  </properties>
</profile>
```
### 2.2 SpringBoot-01-HelloWorld
- 2.2.1 创建应用 
> （1）新建一个启动类
> （2）添加一个HelloController
> 运行主应用程序，结果如下：
> ![image.png](https://upload-images.jianshu.io/upload_images/2836779-89a7bab83bea95d9.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
- 2.2.1  简化部署
> 在01应用pom文件中添加一个插件 将应用打包成一个可执行的jar包
```xml
<profile>
  <id>jdk-1.8</id>
  <activation>
    <activeByDefault>true</activeByDefault>
    <jdk>1.8</jdk>
  </activation>
  <properties>
    <maven.compiler.source>1.8</maven.compiler.source>
    <maven.compiler.target>1.8</maven.compiler.target>
    <maven.compiler.compilerVersion>1.8</maven.compiler.compilerVersion>
  </properties>
</profile>
```
> 这里小提一笔：运行cmd,输入cd/d 粘贴刚才生成的Jar包路径，再使用java -jar Spring...【按下tab智能输入】即可运行，再访问同上面一样的效果！
![图2.2.1 打包应用](https://upload-images.jianshu.io/upload_images/2836779-97bcc93ae9e1a567.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)



💙注： 本文长期更新。此笔记纯个人学习记录整理，如有错误之处，欢迎指正！    
 