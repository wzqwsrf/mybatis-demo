-- role
insert into role (rolename,alias) values('ROLE_ADMIN','超级管理员');
insert into role (rolename,alias) values('ROLE_MANAGER','普通管理员');
insert into role (rolename,alias) values('ROLE_USER','普通用户');
insert into role (rolename,alias) values('ROLE_ANONYMOUS','未登录用户');


-- user
insert into user(username,password) values('zhenqing.wang','123');
insert into user(username,password) values('admin','admin');
insert into user(username,password) values('anonymous','ano');