# banco-persistencia-de-dados

## 🔍Sobre
Banco com persistência de dados em arquivo Json local.
Um aplicativo que simula o cadastro e login de um banco. Utilizando um JSON local para fazer o armazenamento local das contas.

## 🤖 Tecnologias

- Java

## 🏃 Como executar o projeto

### 📍 Requisitos para execução

- Java 17

Para testar o aplicativo, você terá que especificar o local do JSON. Para fazer isso, vá até a classe DataPath e adicione a localização no retorno do método getPath(). 

```
public class DataPath {

    public String getPath() {
        return "C:\\banco-persistencia-de-dados-main\\src\\main\\resources\\data.json"; modifique esta linha
    }

}
```

*# clone o repositório*

```
git clone https://github.com/CrisDeniz/banco-persistencia-de-dados
```

*# vá até a pasta do projeto*

```
cd banco-persistencia-de-dados
```

*# execute o projeto*

```
mvn exec:java
```

## Autor

Cristian Deniz

https://www.linkedin.com/in/cristian-deniz/
