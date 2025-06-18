<h1 align="center"> :cyclone: Arcane Quotes :cyclone: </h1>

<div align="center">
<p>This is a fullstack project that showcases the most memorable quotes from the Arcane (League of Legends) animation. The application consists of a backend in Java (Spring Boot), a frontend in HTML/CSS/JavaScript, and a PostgreSQL database.</p>

![homepage](./frontend/img/homepage.png)

</div>

## :gear: Features
- Displays quotes from Arcane characters.
- RESTful backend to serve the quotes.
- Responsive and interactive frontend.

## :pushpin: Project Structure
```
arcanequotesproject/
├── backend/        # Spring Boot API
├── frontend/       # HTML, CSS, JS
├── database/       # dump.sql for PostgreSQL
```

## :computer: Prerequisites
- Java 17+
- Maven
- PostgreSQL
- Node.js (optional, to serve the frontend)

## :wrench: Database Setup
1. Create a PostgreSQL database named `arcanequotes`.
2. Import the `database/dump.sql` file to populate the tables:
   ```sh
   psql -U your_user -d arcanequotes -f database/dump.sql
   ```
3. Configure the database credentials in the file `backend/src/main/resources/application.properties`:
   ```properties
   spring.datasource.url=jdbc:postgresql://localhost:5432/arcanequotes
   spring.datasource.username=your_user
   spring.datasource.password=your_password
   ```

## :arrow_forward: How to Run the Backend
1. Navigate to the `backend` folder:
   ```sh
   cd backend
   ```
2. Build and run the project:
   ```sh
   ./mvnw spring-boot:run
   ```
   The backend will be available at `http://localhost:8080`.

## :arrow_forward: How to Run the Frontend
1. Navigate to the `frontend` folder:
   ```sh
   cd frontend
   ```
2. Open the `index.html` file in your browser or use an extension like Live Server in VSCode.

## :pencil2: Notes
- Make sure the backend is running before accessing the frontend.
- The frontend makes requests to the backend to fetch the quotes.

## :page_facing_up: License
This project is licensed under the MIT License.
