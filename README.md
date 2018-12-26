# springboot 的启动方式
    class ZdApplication 里面有详情讲解

# spring 模式注解
  * 模式注解是一种声明在应用程序中扮演组件'角色'的注解。
   example：springfaramewor 中的 @Repository 标注在任何类上 用来扮演仓储角色的模式注解
   example：springfaramewor 中的 @Component spring容器托管的通用组件，凡是被此注解标注的类，
   都会作为spring容器扫描的候选对象。同理，凡是被@Componentb标注的注解 也会被 spring视为
   要扫描的候选对象
    
  * 几个常用的注解：
   @Repository 数据仓储模式注解
   @Component 通用的组件模式注解
   @Service 服务模式注解 (其实你要是用@Component 也没问题 从语义上表明，也是一种习惯吧!)
   @Controller web控制模式注解
   @Configuration 配置类模式注解
    
# 装配方式
  * spring xml装配
    
   激活注解驱动特性
   <context:annotation-configuration/>
   扫描@Component派生的类 注册成spring托管的bean
   <context:component-scan base-package="com.xxx.xxx.xxx"/>

  * java config的方式
   @ComponentScan 扫描
   @ComponentScan(basePackages="com.xxx.xxx.xxx")
   public class SpringConfigureation{
    
   }
    
# 自定义模式注解的特性

   * @Component '派生性'
     example:自定义一个注解
     
     - @Component
        - @Repository
            - @MyOneCustomAnnotation
   - 这里解释一下这个派生性:  @Component 衍生出来的 其他模式注解 都具有了被spring容器作为扫描的候选对象
   可以进入其他注解看一下 里面存在 @Component注解
   
   * @Component '层次性'
       example:自定义一个注解
        - @Component
           - @Repository
               - @MyTwoCustomAnnotation
                   - @MyTwoCustomAnnotation
   
   - 这里的层次性：注解作用会按照顺序一次传递
   
# @Enable模块装配
   * @Enable 是一个多种注解的集合组成了一个功能模块
   
   - 注解实现
   实现点：
   注解里面@Import 你的配置类
   
   - 接口实现       
   注解里面@Import 你的selector 类 执行的顺序是 selector -> configuration      
   
   两者的区别在于 ：
   第一种已经定死了具体的实现，第二种 比较灵活 根据入参可以switch 你的实现方式
   
# @Profile 配置方式
   * 配置方式实现
      观看package包 service 的 calculateService实现
      动态配置决定了调用那个服务
      
   * 基于编程方式的实现- @ConditionalOnSystemProperty
   
   springboot 的规约：约定大于配置 简化配置 实现自动装配
   
   底层的装配技术：
   - spring模式注解
   - spring @Enable模块
   - spring条件装配模块
   - spring工厂加载机制
        - 实现类 : SpringFactoriesLoader
        - 配置文件 : META-INF/spring.factories

# @EnableAutoConfiguration 自动装配  springboot的自动装配
   执行顺寻 先去执行: OnSystemPropertyCondition 里面包含了条件装配的信息 查看是否可以装配
   再去执行 SelectorHelloWorldConfiguration 选择 注册的bean实例
   配置信息来自于:META-INF/spring.factories
   
# @Conditional 注解 条件装配 派生了@Profile 底层实现 interface Condition 编程方式

    



  
       
        
  
    
    

    

    