# 🛠️ Spring CRUD Demo

Microserviço REST em Java 17 usando Spring Boot, JPA e banco H2 em memória.

Este projeto foi criado para demonstrar um CRUD completo de produtos, com boas práticas de arquitetura, DTOs, camada de serviço, mapeamento, e endpoints REST testáveis via Postman ou navegador.

---

## 🚀 Tecnologias utilizadas

- ✅ Java 17
- ✅ Spring Boot 3.2.x
- ✅ Spring Data JPA
- ✅ H2 Database (em memória)
- ✅ Maven

---

## 📦 Funcionalidades

| Método | Endpoint               | Descrição                 |
|--------|------------------------|---------------------------|
| `GET`  | `/api/products`        | Lista todos os produtos   |
| `GET`  | `/api/products/{id}`   | Busca um produto por ID   |
| `POST` | `/api/products`        | Cria um novo produto      |
| `PUT`  | `/api/products/{id}`   | Atualiza um produto       |
| `DELETE`| `/api/products/{id}`  | Deleta um produto         |

---

## 🧪 Como executar localmente

### 1. Clone o repositório

```bash
git clone https://github.com/lcsmarinho/spring-crud-demo.git
cd spring-crud-demo
```

### 2. Compile o projeto

```bash
mvn clean install
```

### 3. Execute o microserviço

```bash
mvn spring-boot:run
```

A aplicação será iniciada na porta `8080`.

---

## 📂 Estrutura do projeto

```
spring-crud-demo/
├── controller/        # Camada REST
├── service/           # Lógica de negócio
├── repository/        # JPA Repository
├── model/             # Entidade Product
├── dto/               # Objeto de transferência (DTO)
├── mapper/            # Conversor Entity ↔ DTO
└── application.yml    # Configurações (se quiser adicionar depois)
```

---

## 🧠 Exemplos de uso

### Criar produto (POST `/api/products`)
```json
{
  "name": "Teclado Mecânico",
  "price": 350.00
}
```

### Resposta esperada (GET `/api/products`)
```json
[
  {
    "id": 1,
    "name": "Teclado Mecânico",
    "price": 350.00
  }
]
```

---

## 📘 Notas

- O banco de dados **é zerado a cada reinício da aplicação**, por ser H2 em memória.
- O projeto usa `BigDecimal` para representar valores monetários com precisão.
- A arquitetura está separada em camadas (Controller, Service, Repository) para facilitar testes e manutenção.

---

## 📌 Autor

Feito por **Lucas Marinho** como parte de estudos e preparação para entrevistas com foco em back-end Java.
```
