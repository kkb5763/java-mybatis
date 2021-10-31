# java-mybatis
java-mybatis

mysql config
/*database 생성 -> 테이블 추가*/
CREATE DATABASE study_dev;
use study_dev;
create table user (
userId varchar(10),
name   varchar(50),
gender varchar(20),
city   varchar(100)
);
flush privileges;
SHOW GRANTS FOR study_dev@localhost;

/**mysql user 확인**/
use mysql;
select user, host, a.* from user a;
/**mysql user 생성 및 권한 추가**/
create user user_id@host identified by 'password';
grant all privileges on *.* to study_dev@localhost;
/**비밀번호 변경**/
update mysql.user set password=password('pass') where user='user';
flush privileges;
