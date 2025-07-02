WhatsApp Backend
A Java Spring Boot backend replicating core WhatsApp functionality, including user authentication, chat messaging, and notification handling.




1️⃣ Features
User login and logout

One-to-one messaging

Real-time notification simulation

Clean service-controller architecture

JPA-based data persistence

2️⃣ Getting Started
2.1 Prerequisites
Java 17+

Maven 3+

Relational database (H2 or MySQL, configured via JPA)

2.2 Installation
Clone the repository




git clone https://github.com/yourusername/whatsapp-backend.git
cd whatsapp-backend
Build the project




mvn clean install
2.3 Running the Application
Recommended way




mvn spring-boot:run
Alternative (JAR build):




mvn package
java -jar target/whatsapp-backend.jar
VS Code option: right-click WhatsappApplication.java → Run.

3️⃣ Project Structure
plaintext


src/main/java/com/example/whatsapp/
  ├── controller/
  │     ├── ChatController.java
  │     └── UserController.java
  ├── service/
  │     ├── ChatService.java
  │     ├── NotificationService.java
  │     └── UserService.java
  ├── model/
  │     ├── Message.java
  │     └── User.java
  ├── dto/
  │     └── MessageDTO.java
  └── WhatsappApplication.java
4️⃣ API Endpoints
4.1 UserController
Method	Endpoint	Description
POST	/login	Log in a user
POST	/logout	Log out a user
GET	/users/{id}	Get user details

4.2 ChatController
Method	Endpoint	Description
POST	/messages	Send a new message
GET	/messages/{chatId}	Retrieve messages for a chat

5️⃣ Technologies Used
Java 17

Spring Boot 3

Spring Data JPA

Maven

H2 or MySQL (configurable)

6️⃣ Future Enhancements
Group chat functionality

Media (images, videos) support

WebSocket for live chat updates

JWT-based secure authentication

7️⃣ Contributing
Pull requests and suggestions are welcome. Please open an issue or submit a PR if you’d like to contribute!

8️⃣ License
This project is licensed under the MIT License.
