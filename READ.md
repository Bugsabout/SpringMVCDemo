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


#学习Java框架后设计的一种通用型SpringMVC模板

##一、功能描述


##二、开发环境


##三、项目结构简介

2.mybatis

* ***介绍***

    平时访问数据库的时候，我们都是使用了JDBC，需要自己去写SQL，进行Connection，Statement，ResultSet等声明的辅助类。
    这样的访问方式会有会有繁琐和重复的代码，
    
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
        
     位置：resources/mybatiConfig.xml
        
     具体的配置和作用可以参看mybatsConfig.xml中添加的注解，这个文件主要用于指定各个作用型文件的位置和数据库的信息
    
    *PS*：文件创建好后不是直接就会作用的，需要在web.xml中设定项目启动时加载才能生效
    
    ②方式2：applicationContext.xml中代理管理mybatis的配置信息
    
    


##四、测试DEMO


##五、作者列表


##六、更新链接


##七、历史版本


##八、联系方式

