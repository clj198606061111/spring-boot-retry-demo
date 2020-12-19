# spring-boot-retry-demo
spring-boot-retry-demo

## 概述
程序执行过程中总会遇到一些意想不到的情况，比如网络闪断，
下游服务短时间不可用等场景，需要上游服务发起重试。
`spring-retry`通过注解方式让方法在抛出异常的时候自动发起重试，
避免对业务代码的入侵来达到重试目的。 

## @Retryable 

重试注解，加在 **接口方法** 或者 **实现类方法** 上。

```java
@Retryable(value = Exception.class, maxAttempts = 3, backoff = @Backoff(delay = 2000, multiplier = 1.5))
int add(int a);
```

或者

```java
@Retryable(value = Exception.class, maxAttempts = 3, backoff = @Backoff(delay = 2000, multiplier = 1.5))
public int add(int a) {
    ...
    方法的业务逻辑
    ...
}
```