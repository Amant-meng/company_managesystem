# company_managesystem
###启动项目

访问地址：localhost:8899


登录用户名：admin   密码：admin

####项目运行环境搭建：

JDK8 +  MySQL数据库 + IntelliJ + IDEA开发工具 + maven

项目使用的技术：

Springboot+Mybatis-plus+ SpringMvc+Shiro+Redis

####项目介绍
Springboot作为容器，使用mybatis作为持久层框架
使用官方推荐的thymeleaf做为模板引擎，shiro作为安全框架,主流技术
几乎零XML，极简配置
两套UI实现(bootstrap+layer ui)，可以自由切换
报表后端采用技术： SpringBoot整合SSM(Spring+Mybatis-plus+ SpringMvc)，spring security 全注解式的权限管理和JWT方式禁用Session,采用redis存储token及权限信息

报表前端采用Bootstrap框架，结合Jquery Ajax，整合前端Layer.js（提供弹窗）+Bootstrap-table（数据列表展示）+ Bootstrap-Export（各种报表导出SQL,Excel,pdf等）框架，整合Echars，各类图表的展示（折线图，饼图，直方图等），使用了layui的弹出层、菜单、文件上传、富文本编辑、日历、选项卡、数据表格等 

Oracle关系型数据库以及非关系型数据库（Redis），Oracle  性能调优（PL/SQL语言，SQL查询优化，存储过程等），用Redis做中间缓存，缓存数据

实现异步处理，定时任务，整合Quartz Job以及Spring Task

邮件管理功能， 整合spring-boot-starter-mail发送邮件等，

数据源:druid

用户管理，菜单管理，角色管理，代码生成 
