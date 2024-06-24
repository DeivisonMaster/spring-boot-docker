# Spring Boot Docker

**API Spring Boot 3.x de base para geração de imagem docker**

## O que foi desenvolvido
**Simples API que exibe uma mensagem de olá ao usuario. A aplicação tem por objetivo servir de base para geração de imagens docker**


## Como rodar a aplicação

**Inicie a aplicação usando qualquer um dos comandos abaixo**

> **Nota:** Para os dois primeiros comandos, é necessario executar dentro da pasta raiz do projeto i.e **spring-docker-imagem** pasta

- **Usando maven** ``` mvn spring-boot:run```

- **A partir de arquivo jar**
  Criar um arquivo jar usando o comando '**mvn clean install**' e então executar 
  <br/>```java -jar target/spring-docker-imagem-0.0.1-SNAPSHOT.jar```


- **Diretamente a partir de uma IDE**
  <br/>```Clicar com o botão direito em SpringDockerImagemApplication.java e então clicar na opção 'Run' ```
  <br/><br/>

> **Nota:** Por padrão aplicações Spring Boot iniciam na porta 8080. 
Se a porta 8080 estiver ocupada em seu sistema, então voce pode mudar o numero da porta atualizando a linha **server.port**  dentro do arquivo 
**application.properties** que esta disponivel dentro da pasta **src > main > resources**.

<br/>

**Envie uma requisição GET para o endpoint '/api' usando um aplicativo terceiro como o Postman**

## Gerando Imagem Docker

> **Nota** Executar o comando no diretorio raiz do projeto ''spring-docker-imagem''

- **Comando:** ```docker build -t nome_da_imagem_da_aplicacao:versao | ex: docker build -t spring-boot-hello:1.0 .``` 
- **Listar a Imagem Criada:** ```docker images```
- **Rodar a imagem na porta externa do container :8080** ```docker run -p8080:8080 spring-boot-hello:1.0```
- **Listar o Container ativo:** ```docker ps```



