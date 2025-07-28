# 📝 Note API

A simple RESTful API for managing notes, built with Spring Boot and Gradle. This project was created as part of a take-home coding assignment.

---

## 🚀 Features

- Create, read, update, and delete notes
- In-memory data storage (no database required)
- Validation using Jakarta Bean Validation
- Global error handling
- Simple and lightweight design

---

## 📦 Tech Stack

- Java 17+
- Spring Boot
- Spring Web
- Jakarta Validation
- Gradle
- In-memory `ConcurrentHashMap` storage

---

## 📂 API Endpoints

| Method | Endpoint       | Description             |
|--------|----------------|-------------------------|
| POST   | `/notes`       | Create a new note       |
| GET    | `/notes`       | Get all notes           |
| GET    | `/notes/{id}`  | Get a note by ID        |
| PUT    | `/notes/{id}`  | Update a note by ID     |
| DELETE | `/notes/{id}`  | Delete a note by ID     |

---

## 🧪 Example `curl` Commands

### Create a Note
```bash
curl -X POST http://localhost:8080/notes \
  -H "Content-Type: application/json" \
  -d '{"title": "Test Note", "body": "This is the content."}'

### Get All Notes
```bash
curl http://localhost:8080/notes
'

### Get Note by ID
```bash
curl -X PUT http://localhost:8080/notes/1 \
  -H "Content-Type: application/json" \
  -d '{"title": "Updated", "body": "Updated content"}'
'

### Update Note
```bash
curl -X PUT http://localhost:8080/notes/1 \
  -H "Content-Type: application/json" \
  -d '{"title": "Updated", "body": "Updated content"}'
'

### Delete a Note
```bash
curl -X DELETE http://localhost:8080/notes/1
'

