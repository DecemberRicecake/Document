# **whistle**  

安装启动whistle，需要以下四个步骤： 安装Node、安装whistle、启动whistle、配置代理。   

## **1. 安装Node**  

Windows或Mac系统，[下载](https://nodejs.org/)，安装LTS版本的Node，默认安装即可。  

安装完Node后，执行下面命令，查看当前Node版本。  

``` 
$ node -v  

```

如果能正常输出Node的版本号，表示Node已安装成功(Windows系统可能需要重新打开cmd)。  

## **2. 安装whistle**

Node安装成功后，执行如下npm命令安装whistle （Mac或Linux的非root用户需要在命令行前面加sudo，如：sudo npm install -g whistle）  

```
$ npm install -g whistle

```

建议开启蓝灯，或者直接指定镜像安装：

```
$ npm install whistle -g --registry=https://registry.npm.taobao.org

```   

whistle安装完成后，执行命令 whistle help 或 w2 help，查看whistle的帮助信息

```
$ w2 help

Usage: w2 <command> [options]

  Commands:

    run       Start a front service
    start     Start a background service
    stop      Stop current background service
    restart   Restart current background service
    help      Display help information

  Options:

    -h, --help                                      output usage information
    -d, --debug                                     debug mode
    -l, --localUIHost [hostname]                    local ui host(local.whistlejs.com by default)
    -n, --username [username]                       login username
    -w, --password [password]                       login password
    -S, --storage [newStorageDir]                   the new local storage directory
    -C, --copy [storageDir]                         copy storageDir to newStorageDir
    -p, --port [port]                               whistle port(8899 by default)
    -m, --middlewares [script path or module name]  express middlewares path(as: xx,yy/zz.js)
    -u, --uipath [script path]                      web ui plugin path
    -t, --timeout [ms]                              request timeout(36000 ms by default)
    -s, --sockets [number]                          max sockets(12 by default)
    -V, --version                                   output the version number
    -c, --command <command>                         command parameters ("node --harmony")
```
如果能正常输出whistle的帮助信息，表示whistle已安装成功。

## **3. 启动whistle**

### 启动whistle:  

```
$ w2 start  

```
### 停止whistle:  

```
$ w2 stop  

```

### 重启whsitle:  

```
$ w2 restart  

```
## **4. 配置代理**

浏览器访问：127.0.0.1:8899,配置站点代理



