# mysql-linux平台

### 安装mysql

```
docker pull mysql:5.7
```

### 启动mysql（设置端口、账号密码、本地路径）

```
docker run --name mysql-5.7 -v /root/volumes/mysql:/var/lib/mysql -e MYSQL_ROOT_PASSWORD=123456 -p 3306:3306 -d mysql:5.7
```

### 建数据库
```
docker exec -it mysql-5.7  bash
mysql -uroot -p
123456
show databases;
CREATE DATABASE db_xxxxx  DEFAULT CHARSET utf8;
```