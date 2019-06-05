# mongodb-linux平台

### 下载解压
- `wget https://fastdl.mongodb.org/linux/mongodb-linux-x86_64-4.0.6.tgz`
- `tar -zxvf mongodb-linux-x86_64-4.0.6.tgz`
- `mv mongodb-linux-x86_64-4.0.6 /root/mongodb`
- `cd mongodb`

### 创建数据库目录和日志目录
- `mkdir -p data/db`
- `mkdir -p data/log`

### 添加配置文件
- `cd /root/mongodb/mongodb-linux-x86_64-4.0.6/bin`
- `vi mongodb.conf`
    ```
    dbpath=/root/mongodb/data/db  #数据文件存放目录
    logpath=/root/mongodb/data/log/mongodb.log  #日志文件存放目录
    logappend=true  #开启日志追加添加日志
    port=24017  #端口，默认27017，可以自定义
    bind_ip=0.0.0.0  #本地监听IP，0.0.0.0表示允许所有IP连接
    fork=true  #以守护程序的方式启用，即在后台运行
    ```

### 配置 firewall 防火墙策略：
- `firewall-cmd --permanent --add-port=24017/tcp`
- `firewall-cmd --reload`

### 启动 MongoDB 服务
- `cd /root/mongodb/mongodb-linux-x86_64-4.0.6/bin`
- `./mongod --config mongodb.conf`

### 停止 MongoDB 服务
- `ps aux |grep mongodb`
- `kill -15 22671`	