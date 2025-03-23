# 📚 API Bookstore - Spring Boot & H2

API desenvolvida em Java com Spring Boot que simula a relação de uma loja de livros. Utiliza Spring Data JPA para gerenciar entidades, permitindo operações de CRUD e persistência de dados no banco de dados H2 Console.

## 🚀 Tecnologias Utilizadas

- **Java 23**
- **Spring Boot**
- **Spring Data JPA**
- **H2 Database**
- **Maven**
- **Visual Studio Code**

## 📂 Estrutura do Projeto

```
JPA/
│── src/
│   ├── main/
│   │   ├── java/com/bookstore/jpa/
│   │   │   ├── controllers/
│   │   │   ├── dtos/
│   │   │   ├── models/
│   │   │   ├── repositories/
│   │   │   ├── services/
│   │   ├── resources/
│   │   │   ├── application.properties
│   ├── test/
│── pom.xml
│── README.md
```

## 📌 Endpoints

### 📖 Livros

| Método   | Endpoint                  | Descrição                                 |
|----------|---------------------------|-------------------------------------------|
| `GET`    | `/bookstore/books`         | Retorna todos os livros cadastrados      |
| `POST`   | `/bookstore/books`         | Cadastra um novo livro                   |
| `DELETE` | `/bookstore/books/{id}`    | Remove um livro pelo ID                  |


## 🔧 Configuração do Banco H2

No arquivo `application.properties`, certifique-se de incluir:
```properties
spring.datasource.url=jdbc:h2:mem:bookstore
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true
```
Acesse o **H2 Console** através de `http://localhost:8080/h2-console` e use `jdbc:h2:mem:bookstore` como URL do banco.

## 🏁 Como Executar o Projeto

1. Clone este repositório:
   ```sh
   git clone https://github.com/laurabonilha/bookstore-api.git
   ```
2. Acesse o diretório do projeto:
   ```sh
   cd jpa
   ```
3. Execute o projeto com Maven:
   ```sh
   mvn spring-boot:run
   ```
4. A API estará disponível em `http://localhost:8080/bookstore/books`

---

## 🚧 Melhorias em Progresso

Estou constantemente aprimorando a API para torná-la mais robusta e fácil de usar. Atualmente, estou trabalhando nas seguintes melhorias:

⚙️ **Novos Endpoints:** Planejamento para adicionar novos endpoints para recursos como atualização de itens, filtragem avançada e buscas específicas.

🎨 **Interface Gráfica:** Em andamento a criação de uma interface gráfica simples para facilitar a visualização dos cursos cadastrados e permitir a inserção de novos dados diretamente pela interface.

🛠 **Otimizações de Performance:** Foco em melhorias para garantir que a API seja mais eficiente e escalável conforme o número de requisições aumente.

🔐 **Autenticação e Segurança:** Implementação de mecanismos de autenticação para garantir maior segurança nas interações com a API.

Fique à vontade para contribuir e sugerir outras melhorias!

---

## 👨‍💻 Autor
Desenvolvido com 💙 por **[Laura Bonilha](https://github.com/laurabonilha)** 🚀

