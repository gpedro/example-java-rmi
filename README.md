# Java RMI Example

### Como usar
1. Inicie o PingServer
> Ping server ready

2. Inicie o PingClient
> Packet Size: 64
> Packet Date: (dia de hoje)


### FAQ

> ShapeList server main access denied ("java.net.SocketPermission" "127.0.0.1:1099" "connect,resolve")

Baixe o [wireopen.policy](http://patriot.net/~tvalesky/wideopen.policy), coloque na raíz do projeto e adicione este argumento na VM -Djava.security.policy=<local absoluto do teu projeto>\wideopen.poliy

### Referencias:
* http://www.cdk5.net/wp/extra-material/supplementary-material-for-chapter-5
* http://patriot.net/~tvalesky/easyrmi.html