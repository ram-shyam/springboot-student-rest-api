# Spring Boot Student Management API

This is a RESTful API developed using Spring Boot to manage student records. It provides CRUD operations to handle student data. Future enhancements are planned, such as adding batch operations for saving and deleting multiple student records.

## Features

- **Create Student:** Add a new student to the system.
- **Retrieve Students:** Fetch all students or a specific student by ID.
- **Update Student:** Modify the details of an existing student.
- **Delete Student:** Remove a student record.
- **Future Enhancements:** Add batch save and delete functionality.

## Technology Stack

- **Framework:** Spring Boot
- **Database:** (Add your database here, e.g., H2, MySQL, PostgreSQL, etc.)
- **Language:** Java
- **Build Tool:** Maven/Gradle (specify which you're using)

---

## API Endpoints

### Base URL
`/students`

### Endpoints
1. **Create a new student**
    - **Method:** `POST`
    - **Endpoint:** `/students`
    - **Request Body:**
      ```json
      {
        "name": "Student Name",
        "marks": 85
      }
      ```
    - **Response:** Returns the created student object.

2. **Get all students**
    - **Method:** `GET`
    - **Endpoint:** `/students`
    - **Response:** A list of all students.

3. **Get a student by ID**
    - **Method:** `GET`
    - **Endpoint:** `/students/{id}`
    - **Path Variable:** `id` (integer)
    - **Response:** The student object with the specified ID.

4. **Update a student**
    - **Method:** `PUT`
    - **Endpoint:** `/students/{id}`
    - **Path Variable:** `id` (integer)
    - **Request Body:**
      ```json
      {
        "name": "Updated Name",
        "marks": 90
      }
      ```
    - **Response:** The updated student object.

5. **Delete a student**
    - **Method:** `DELETE`
    - **Endpoint:** `/students/{id}`
    - **Path Variable:** `id` (integer)
    - **Response:** A confirmation message.

---

## Future Enhancements

### Batch Save Students
- **Method:** `POST`
- **Endpoint:** `/students/batch`
- **Description:** Save multiple student records in a single request.

### Batch Delete Students
- **Method:** `DELETE`
- **Endpoint:** `/students/batch`
- **Description:** Delete multiple student records by their IDs.

---

## Running the Application

1. Clone the repository.
2. Configure your database in `application.properties` or `application.yml`.
3. Run the application using:
   ```bash
   mvn spring-boot:run
   ```
4. Access the API at `http://localhost:8080/students`.
