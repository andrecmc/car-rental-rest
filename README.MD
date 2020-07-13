## Introducao
Esse projeto cria uma API REST usando Spring Data JPA para um sistema de cadastro de veiculos.

## Configuracao Inicial
* Inicie um servidor mongoDB.

No Windows:

Instale o MongoDB Server a partir da URL com as opções default: https://www.mongodb.com/try/download/community
- Crie a pasta "C:\data\db" (local padrao utilizado pelo MongoDB Server)
- Inicie o MongoDB com o comando: "C:\Program Files\MongoDB\Server\4.2\bin\mongod.exe"

No Linux:

- Instale o MongoDB Server a partir da URL com as opções default: https://www.mongodb.com/try/download/community
- Inicie o MongoDB pela linha de comando: mongod

## Como rodar
* Inicie o servidor da API Rest com o comando: gradle bootRun

## Como rodar os testes automaticos

- Executar:  .\gradlew --info test

- O Relatorio dos testes em formato HTML será gerado em: .\build\reports\tests\test\index.html

## Postman API Documentation:
https://www.getpostman.com/collections/093e81a4b9be7e2e3adc
