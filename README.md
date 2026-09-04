<div align="center">

# 🌱 Tópicos - Backend

</div>

## 🌿 Sobre

API e plataforma acadêmica construída a partir de conceitos e aprendizados explorados ao longo da disciplina de **Tópicos Especiais em Informática**.

O projeto serve como ambiente de experimentação e estudo, permitindo aplicar na prática os conceitos apresentados em aula e documentar sua evolução ao longo do desenvolvimento.

## 🔧 Tecnologias

![Spring](https://img.shields.io/badge/Spring-66BB6A?style=for-the-badge&logo=spring&logoColor=white)
![Java](https://img.shields.io/badge/Java-66BB6A?style=for-the-badge&logo=openjdk&logoColor=white)
![Maven](https://img.shields.io/badge/Apache%20Maven-66BB6A?style=for-the-badge&logo=apachemaven&logoColor=white)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-66BB6A?style=for-the-badge&logo=postgresql&logoColor=white)
![Docker](https://img.shields.io/badge/Docker-66BB6A?style=for-the-badge&logo=docker&logoColor=white)

## 📖 Estudos

### Iniciando com Spring
- [Spring Initializr](https://start.spring.io/)

### 🧪 Anotações
> Em construção...

## 🚀 Como Executar

### Pré-requisitos
* Java JDK 17+ instalado
* Maven instalado (ou utilizar o `./mvnw` do projeto)
* Docker & Docker Compose (para subida do banco PostgreSQL)

### Passo a Passo

1. Clone o repositório:
```sh
git clone https://github.com/raphaelamonteiro/topicos-backend.git
cd topicos-backend

```

2. Suba o container do banco de dados:

```sh
docker compose up -d

```

3. Execute a aplicação:

```sh
mvn spring-boot:run

```

## 🧩 Comandos Úteis

```sh
# Limpa o projeto e executa os testes
mvn clean test

# Compila e gera o arquivo .jar em target/
mvn clean package

# Exibe a árvore de dependências para verificar conflitos
mvn dependency:tree

```


### ⭐ Gostou do projeto?

Se este projeto foi útil para você, deixe uma ⭐ no repositório.

💻 Desenvolvido por [Raphaela Monteiro](https://github.com/raphaelamonteiro).

> Laboratório de estudos desenvolvido ao longo da disciplina de Tópicos Especiais em Informática, sob orientação do professor [Emanuel Mineda](https://github.com/mineda).
