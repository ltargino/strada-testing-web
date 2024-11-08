# Demo automation Testing - Teste Web usando Selenium

### Pré-requisitos

- JAVA_HOME configurada;
- MAVEN_HOME configurada;
- Variável de ambiente PATH contendo JAVA_HOME, MAVEN_HOME e o diretório de binários da Allure;

### Execução

- Download de dependências

``
mvn install
``

- Testes

``
mvn test
``

- Allure Report (Geração dos dados no diretório)

``
mvn allure:report
``

- Allure Server (Página de exibição dos resultados Allure)

``
mvn allure:serve
``