# OnlineExamSystem
OnlineExamSystem, Integrated Software Engineering Practice 2 course, 2019 Spring, NENU
## 一体化软件工程实践之在线考试系统  
## **开发环境介绍**
+ Java版本：1.8
+ 本地服务器：Tomcat 9.0
+ 远程服务器：阿里云
+ 前端开发工具：VS Code x64 1.35.0
+ 后端开发工具：IntelliJ IDEA 2019.1.2
+ 数据库：MySQL
+ 版本管理工具：Maven
+ 版本控制工具：Git
## **后端项目入口**
+ 本地：localhost:8010（本地跑需要导入数据库文件）
+ 远程服务器：47.103.10.220:8010（前端Vue接口代码对接的是远程服务器端口）

## **项目内置功能**
1.**学生端**：

  + 用户登录、注册、退出
  + 展示试卷
  + 选择试卷进行考试
  + 计算成绩
  + 查询个人成绩

2.**教师端**（后台管理）：

  + 试卷管理（增、删、改、模糊查询）
  + 题库管理（增、删、改、模糊查询）
  + 公告管理（增、删、改、模糊查询）
  + 公告管理（增、删、改、模糊查询）
  + 成绩管理（查询学生成绩）

3.**个人中心**：

  + 查看个人信息
  + 修改个人信息
 
## **所用技术**
+ 采用Springboot + Vue.js框架搭建项目

1.**前端**

+ Vue.js
+ element-ui组件
+ axios 前后端分离

2.**后端**

+ springboot
+ springMVC
+ MyBatis
+ MySQL
+ Maven
+ 后台接口API: Swagger

## **收获与总结**

1.**跨域问题**：

+ 使用Vue一直无法访问springboot部署在服务器上的接口
+ 解决方法：在springboot的控制器中加入注解@CrossOrigin解决前后端跨端口异步传值问题

2.**传值问题**：

+ 与后端进行数据交互时，后端没有办法获取到前端通过axios传过去的值
+ 解决方法：强行将要传的数据进行格式化，即在data:{……}之后加上一个属性，强行改变数据的格式

3.**session问题**：

+ 后端将如用户名等信息存储在session中时，Vue的页面跳转会重新请求页面，即刷新session
+ 解决方法：后端在控制器中加入注解@CrossOrigin(allowCredentials = "true")，前端在main.js加入axios.defaults.withCredentials=true;

4.**轮播问题**：

+ 使用了element-ui里的“跑马灯”组件，但是没有办法设置跑马灯中的图片
+ 解决方法：img标签中的src使用变量，而图片的地址，以require()的形式请求放在变量中

### **最大的收获**

+ Vue是一个很好的前端渐进式框架，它的目标是通过尽可能简单的 API 实现响应的数据绑定和组合的视图组件，对于已经会了HTML,CSS,JavaScript的开发人员说可以即刻阅读指南开始构建应用。


