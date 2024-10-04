# SpringBoot CRUD Operation using RESTful APIs

## Introduction
This is a basic SpringBoot project that demonstrates CRUD (Create, Read, Update, Delete) operations using RESTful APIs. The application interacts with a MySQL database to perform operations on user data. The MySQL database is hosted on the Aiven platform for cloud database services.

## Project Overview
- **Framework:** SpringBoot
- **Database:** MySQL (hosted on Aiven)
- **APIs:** RESTful APIs for CRUD operations
- **Language:** Java
- This project serves as a practical example of using SpringBoot to build a REST API that interacts with a MySQL database, allowing us to manage user data.
  
## Running the Project
To run this project:

1. **Clone the repository** to your local machine.

2. **Set up your MySQL database** on Aiven or any other platform.

3. **Update the `application.properties` file** with your database credentials.

4. **Build the project using Gradle**:

   ```bash
   ./gradlew build

5. **Run the SpringBoot application:**
   ```bash
   ./gradlew bootRun
6. Use tools like Postman or curl to interact with the API endpoints.

## Example Requests
- Add a User:
   ```bash
   curl -X POST "http://localhost:8080/demo/add?name=JohnDoe&email=johndoe@example.com"
- Get All User:
  ```bash
  curl -X GET "http://localhost:8080/demo/all"
- Update a user:
  ```bash
  curl -X PUT "http://localhost:8080/demo/update/1?name=JaneDoe"
- Delete a user:
  ```bash
  curl -X DELETE "http://localhost:8080/demo/delete/1"
