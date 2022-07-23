# Desafio de Projeto - Padrões de projeto

Olá time TQI e time DIO! Primeiramente, gostaria de agradecer a oportunidade de participar deste desafio.

Neste documento irei comentar sobre: como rodar o projeto, pontuando algumas das decisões tomadas durante o desenvolvimento da aplicação.

## Introdução

Durante o desenvolvimento deste projeto, foquei em alguns pontos:

- Desenvolver, através das boas práticas, um código legível, organizado e com uma boa arquitetura de maneira a facilitar a escalabilidade e manutenção da aplicação.
- Explorar os diferentes conceitos abordados durante o Bootcamp
- Optei neste caso, por manter a estrutura original do projeto. Focando em compreender e aprender todos os passos e conceitos apresentados pelo ministrador do curso.

## Principais ferramentas utilizadas:

- JDK 17
- IntelliJ IDEA
- Maven

## Arquitetura

Este projeto utiliza a arquitetura disponibilizada pelo Maven, além disso, criei 3 pacotes:

1) controller: arquivos responsáveis por abstratir a complexidade de todas as integrações realizadas durante o proejeto em uma interface simplificada
2) model: arquivos de classes e repositórios utilizados durante o projeto
3) service: arquivos responsáveis por implementar as lógicas de negócio e as chamadas de API

## Rodando o projeto

Para executar o projeto serão necessários os seguintes programas

- [JDK 17: Necessário para executar o projeto Java](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- [Maven: Necessário para realizar o build do projeto Java](https://maven.apache.org/download.cgi)
- [IntelliJ IDEA: Para desenvolver o projeto](https://www.jetbrains.com/pt-br/idea/download/#section=windows)

## Conceito do projeto

Este projeto possui a funcionalidade de realizar consultas à API ViaCep, retornando informações sobre o endereço de clientes e realizando o registro de tais informações em um banco de dados.

### Gerenciamento de tarefas

Para controle das tarefas a serem executadas, utilizei a ferramenta "Notion", criando uma lista das necessidades da aplicação e os respectivos to do's para atender tais necessidades.

## Conclusão

Novamente, gostaria de agradecer a oportunidade! Espero que gostem do projeto tanto quanto gostei de desenvolvê-lo =)

Good coding!
