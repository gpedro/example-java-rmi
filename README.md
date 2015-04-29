# Java RMI Example

### Como usar
1. Inicie o ServidorCalculo
> Servidor de Cálculo está pronto para ser utilizado.

2. Inicie o ClienteCalculadora
```
> Enviando execução do método Calculadora#multiplicar
< Resposta do método Calculadora#multiplicar: 42
> Enviando execução do método Calculadora#dividir
< Resposta do método Calculadora#dividir: 4.0
```

### Configuração
#### Servidor

#### Cliente

### FAQ

> ShapeList server main access denied ("java.net.SocketPermission" "127.0.0.1:1099" "connect,resolve")

Baixe o [wireopen.policy](http://patriot.net/~tvalesky/wideopen.policy), coloque na raiz do projeto e adicione este argumento na VM `-Djava.security.policy=<local absoluto do teu projeto>/wideopen.policy`

> java.rmi.server.ExportException: Port already in use: 1099; nested exception is: 

> java.net.BindException: Address already in use

A mensagem de erro diz que já tem algum serviço rodando na porta 1099, então procure e finalize esse serviço que está atrapalhando ou mude a porta.

### Referencias:
* http://www.cdk5.net/wp/extra-material/supplementary-material-for-chapter-5
* http://patriot.net/~tvalesky/easyrmi.html
