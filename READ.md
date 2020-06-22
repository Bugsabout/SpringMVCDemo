.md文件常用语法
*斜体文本*
**加粗文本**
~~删除文本~~
> 文本内容 
* 无符号列表
1. 有符号列表
2. 项目2
```java
public Test(){
    public static void main(){
    }
}
```

[链接测试](http://www.baidu.com)


#学习Java框架后设计的一种通用型SpringMVC模板

## 一、功能描述


##二、开发环境


## 三、项目结构简介


### 1.mybatis-generator逆向工程

* ***介绍*** ：

    mybatis逆向工程用于以数据库为基础，反向生成dao层接口文件，entity层实体文件和mapper层映射文件。
    生成后的文件与spring框架结合后能够快速构建项目框架。本Demo主要使用了maven的mybatis-generator插件来生成文件
    
* ***主要配置文件*** ：

    主要介绍一下使用mybatis结合项目的一些必要配置
    
    1.pom包
    
    ```java
        <!--引入mybatis-->
        <dependency>
            <groupId>org.mybatis</groupId>
            <artifactId>mybatis</artifactId>
            <version>3.4.5</version>
        </dependency>
        <!--引入mybatis和spring-->
        <dependency>
            <groupId>org.mybatis</groupId>
            <artifactId>mybatis-spring</artifactId>
            <version>1.3.1</version>
        </dependency>
    ```
    2.maven插件
    
    ```java
            <plugins>
                <plugin>
                    <groupId>org.mybatis.generator</groupId>
                    <artifactId>mybatis-generator-maven-plugin</artifactId>
                    <version>1.3.2</version>
                    <configuration>
                        <!--配置文件的位置-->
                        <configurationFile>src/main/resources/mybatis-generatorConfig.xml</configurationFile>
                        <verbose>true</verbose>
                        <overwrite>true</overwrite>
                    </configuration>
                    <executions>
                        <execution>
                            <id>Generate MyBatis Artifacts</id>
                            <goals>
                                <goal>generate</goal>
                            </goals>
                        </execution>
                    </executions>
                    <dependencies>
                        <dependency>
                            <groupId>org.mybatis.generator</groupId>
                            <artifactId>mybatis-generator-core</artifactId>
                            <version>1.3.2</version>
                        </dependency>
                        <dependency>
                            <groupId>mysql</groupId>
                            <artifactId>mysql-connector-java</artifactId>
                            <version>5.1.43</version>
                        </dependency>
                    </dependencies>
                </plugin>
            </plugins>
    ```
    
    ***PS***：一定要注意这个插件的位置，它在pom文件中的
    
    ```java
    <build></build>
    ```
    
  下，和
  
  ```java
  <pluginManagement></pluginManagement>
  ```
  
    处于同一层次，
    并且用户在使用这个插件生成文件时 *一定要*添加以上代码才能在maven的插件下看见generator插件。同时，在真正启动项目时一定要
    注释掉这段代码，或者另起一个项目，将它专门用来生成文件更好。
    
    3..配置文件
    
    配置文件的的详细解释可能到路径下文件中查看
    
    ```java
    resources/mybatis-generatoConfig.xml
    ```
    
    该配置文件主要讲解了需要配置数据库的信息，生成的文件和对应文件夹位置

* ***注意事项*** ：

    ①mybatis的逆向生成还是应该单独作为一个项目比较好，新人注意在运行本项目时注释插件代码
    
    ②
    
### 2.Spring框架



### 3.mybatis框架

* ***介绍***

    平时访问数据库的时候，我们都是使用了JDBC驱动，需要自己创建工厂，链接以及声明语句，所有的连接都需要自己去写SQL，
    进行Connection，Statement，ResultSet等声明的辅助类。这样的访问方式会有会有繁琐和重复的代码，
    
* ***配置信息***
    
    1.pom包导入
    
    ```java
            <!--引入mybatis-->
            <dependency>
                <groupId>org.mybatis</groupId>
                <artifactId>mybatis</artifactId>
                <version>3.4.5</version>
            </dependency>
            <!--引入mybatis和spring-->
            <dependency>
                <groupId>org.mybatis</groupId>
                <artifactId>mybatis-spring</artifactId>
                <version>1.3.1</version>
            </dependency>
    ```
    
    2.配置文件
    
     ①方式1：mybatisConfig.xml     
        
     位置：resources/mybatisConfig.xml
        
     具体的配置和作用可以参看mybatisConfig.xml中添加的注解，这个文件主要用于指定各个作用型文件的位置和数据库的信息
    
    *PS*：文件创建好后不是直接就会作用的，需要在web.xml中设定项目启动时加载才能生效
    
    ②方式2：applicationContext.xml中代理管理mybatis的配置信息
    
    






## 四、测试DEMO


## 五、作者列表


## 六、更新链接


## 七、历史版本


## 八、联系方式

