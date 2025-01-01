# To-Do List REST API Application

## Description
This application provides a simple REST API for managing a to-do list. Users can create tasks, view all tasks, retrieve specific tasks, update their statuses, and delete tasks.

## Features
- Create a new task.
- Fetch all tasks.
- Fetch a task by its ID.
- Update the status of a task.
- Delete a task by its ID.

## Technologies Used
- Java
- Spring Boot
- JPA/Hibernate
- MySQL Database
- Maven

---

## Prerequisites
Ensure you have the following installed on your machine:
1. Java Development Kit (JDK) 11 or higher
2. Maven
3. MySQL Server
4. An IDE (e.g., IntelliJ IDEA, Eclipse) or a text editor (e.g., Visual Studio Code)

---

## Steps to Run the Application

### 1. Clone the Repository
```bash
https://github.com/your-username/todo-list-api.git
```

### 2. Navigate to the Project Directory
```bash
cd todo-list-api
```

### 3. Configure the Database
- Create a new database in MySQL:
```sql
CREATE DATABASE todo_db;
```
- Update the `application.properties` file with your MySQL credentials:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/todo_db
spring.datasource.username=your-username
spring.datasource.password=your-password
spring.jpa.hibernate.ddl-auto=update
```

### 4. Build the Application
Ensure that Maven is installed and configured correctly.
```bash
mvn clean install
```

### 5. Run the Application
Start the application using the following command:
```bash
mvn spring-boot:run
```
Alternatively, you can run the generated `.jar` file:
```bash
java -jar target/todo-list-api-0.0.1-SNAPSHOT.jar
```

### 6. Access the API
The application will run on `http://localhost:8080` by default.

---

## Endpoints

### 1. Create a New Task
**POST /tasks**
- Request Body:
```json
{
    "title": "Task Title",
    "description": "Task Description",
    "status": "pending"
}
```

### 2. Fetch All Tasks
**GET /tasks**

### 3. Fetch a Task by ID
**GET /tasks/{id}**

### 4. Update Task Status
**PUT /tasks/{id}**
- Request Body:
```json
{
    "status": "in-progress"
}
```

### 5. Delete a Task by ID
**DELETE /tasks/{id}**

---

## MySQL Database
Ensure that the MySQL server is running and properly configured. The application connects to the `todo_db` database using the credentials provided in the `application.properties` file.

You can verify the data using any MySQL client or command-line tool:
```sql
SELECT * FROM tasks;
```

---

## Testing
You can use tools like Postman or cURL to test the endpoints.

### Example cURL Commands
1. **Create a Task**:
```bash
curl -X POST http://localhost:8080/tasks \
-H "Content-Type: application/json" \
-d '{"title": "Buy Groceries", "description": "Get vegetables and fruits", "status": "pending"}'
```

2. **Fetch All Tasks**:
```bash
curl http://localhost:8080/tasks
```

3. **Update Task Status**:
```bash
curl -X PUT http://localhost:8080/tasks/1 \
-H "Content-Type: application/json" \
-d '{"status": "completed"}'
```

---

## Future Enhancements
- Add user authentication and authorization.
- Implement pagination and sorting for task retrieval.
- Add support for categories or tags for tasks.

