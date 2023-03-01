# Projeto Software Ubíquos

Projeto desenvolvido como trabalho final da disciplina de Software para Sistemas Ubíquos, no semestre 2022/2 do curso de Engenharia de Software da Universidade Federal de Goiás, por

* Ariel Marte Araújo Silva (201900264)
* Gustavo Henrique de Freitas Martins (201800227)
* Marco Feitosa Araújo (201905542)

## Instruções Para Execução

Para executar a aplicação, é preciso iniciar cada serviço separadamente.

Para executar o servidor gRPC deve ser instalado o mariadb configurado com usuario root e senha root e executar o comando:

> python3 server_grpc_auth.py

O banco mariadb deve possuir um banco sensor carregado com as definições de tabela do arquivo create_table.sql

Na mesma máquina deve ser executado o comando:

> python3 consumer.py

Esse comando inicia o consumidor Kafka que escuta as produções do raspberry.

O produtor kafka deve ser executado com o comando abaixo no raspberry:

> python3 producer.py

Para execução dos comandos python todos os modulos devem ser instalados com o comando: 

> pip install "modulo"

Para executar o proxy Spring do gRPC é necessário gerar o .jar do projeto com o comando:

> mvn clean package

Esse comando deve ser executada na pasta Gateway/SensorProxy.

Após a execução, um .jar da aplicação Spring é gerado e a mesma pode ser iniciada apenas executando o jar.

Para o front-end, é preciso ter o ambiente de execução NodeJS instalado, e então instalar o gerenciador de pacotes Yarn através do comando 

> npm install yarn -g

Em seguida, use o comando 

> yarn install 

na pasta da aplicação para instalar as dependências do front-end, e por fim execute o comando 

>yarn dev 

para iniciá-lo.
