# redis-linux平台


### 安装依赖
- `yum install gcc`
- `yum install gcc-c++`

### 下载解压安装
- `wget http://download.redis.io/releases/redis-5.0.4.tar.gz`
- `tar -xzvf redis-5.0.4.tar.gz`
- `rm redis-5.0.4.tar.gz`
- `cd redis-5.0.4`
- `make`

### 使用
- 运行命令：`nohup src/redis-server redis.conf > /home/redis.log 2>&1 &`
- 查看运行: `ps -ef | grep redis`
- 关闭命令：`src/redis-cli shutdown`
- 强制关闭：`kill -9 id`

### 其他
- 默认只允许自己的电脑（127.0.0.1）连接，远程电脑连接，修改redis.conf，重启redis服务：  
    `bind 127.0.0.1 10.10.10.10 123.123.123.123`  
    `protected-mode no`  

- 增加密码需要修改redis.conf，将requirepass的注释解除掉，在后面加上自己的密码，重启redis服务:  
    `requirepass  mypassword`  
    增加密码后连接命令：`src/redis-cli -a mypassword`  
    增加密码后关闭命令：`src/redis-cli -a mypassword shutdown`  

