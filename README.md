
## 极客时间
[使用Spring Security搭建一套基于JWT的OAuth 2.0架构](https://time.geekbang.org/column/article/264179?utm_campaign=geektime_search&utm_content=geektime_search&utm_medium=geektime_search&utm_source=geektime_search&utm_term=geektime_search)


OAuth2.0是一种授权协议，相当于你将自己在某个服务的指定数据等权限，授权给了第三方另一个服务

Q：为什么不直接提供用户名和密码给三方服务呢？

A：安全问题

使用步骤：

1. 在三方系统操作登录，跳转到资源服务对应的授权平台
2. 用户点击授权
3. 授权平台重定向回三方系统页面，并携带授权码
4. 三方服务后端通过授权码，调用授权服务获取到对应的access_token
5. 三方服务后端通过access_token获取到已经被授权的数据

Q：为什么需要授权码中转一次

A：access_token非常重要，不能暴露给前端浏览器，只能后端系统交互使用

access_token中的内容，可以使用jwt的方式

同时access_token有过期时间，可以通过 refresh_token刷新