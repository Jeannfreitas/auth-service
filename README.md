# auth-service

O Auth-Service é um microserviço de autenticação feito em Java com Spring Boot.
Ele permite autenticar usuários de forma simples, segura e escalável, sendo perfeito para aplicações modernas baseadas em microserviços.
--------

# 🐳 Rodando com Docker

Para rodar o serviço via Docker, siga estes passos:

Crie a imagem do projeto:
```properties
docker build -t auth-service .
```

Execute o contêiner:
```properties
docker run -p 8080:8080 auth-service
```

Depois disso, o serviço estará disponível em http://localhost:8080.

---

# 📦 Endpoints

Aqui estão os principais endpoints que você pode usar:

Método	Endpoint	O que faz
```properties
POST	/auth/login	Faz login do usuário
```
```properties
POST	/auth/register	Cria um novo usuário
```
```properties
GET	/auth/validate	Valida o token JWT do usuário
```


# Exemplo de Login

Request:

```properties
POST /auth/login
{
  "email": "usuario@email.com",
  "password": "senha123"
}
```
```properties
Response:

{
  "token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9..."
}
```


Exemplo de Registro

Request:

```properties
POST /auth/register
{
  "name": "Jean Nascimento",
  "email": "jean@email.com",
  "password": "senha123"
}
```

Response:
```properties

{
  "id": 1,
  "name": "Jean Nascimento",
  "email": "jean@email.com"
}
```

# 🔒 Como funciona a autenticação

O fluxo de autenticação é bem simples:

O usuário faz login com email e senha.

O serviço retorna um token JWT válido por um período configurado.

Para acessar endpoints protegidos, basta enviar o token no header:

```properties
Authorization: Bearer <token>
```





