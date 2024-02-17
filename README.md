# RailwayReservationSystem

The Railway Reservation System is a sophisticated application developed using Spring Boot, a powerful and versatile Java-based framework for creating web applications and microservices. This system leverages MongoDB, a popular NoSQL database, for data storage, ensuring high performance, scalability, and flexibility in handling large volumes of unstructured data.

The core functionality of this system is encapsulated within the ReservationServiceImpl class, which serves as a REST controller, exposing a set of APIs for interacting with the reservation data. The system is designed to manage railway reservation records efficiently, offering features for inserting and retrieving reservation data through HTTP requests.

Key features include:

**Data Insertion:** The @PostMapping annotated insertData method allows for adding new reservation records into the MongoDB collection. This method takes a JSON representation of the RailwayReservation object as input through the request body, showcasing Spring Boot's seamless request handling and JSON parsing capabilities.

**Data Retrieval**: Through the @GetMapping annotated selectData/{pnrno} method, the system offers the functionality to retrieve reservation details based on the PNR number. This demonstrates the system's use of path variables for fetching specific records, enhancing user experience by providing quick access to reservation details.

Exception handling is a critical aspect of the system, ensuring robustness and reliability. Custom exceptions, like the RailwayReservationException, are defined to handle scenarios such as missing or incorrect PNR numbers, thereby providing meaningful feedback to the user or system consuming the API.

The system's configuration details for connecting to MongoDB are specified in the application properties, indicating the database's URI, host, port, and the specific database name (RRdb) to be used. This configuration underscores Spring Boot's convention-over-configuration paradigm, simplifying the MongoDB integration process.

Overall, this Railway Reservation System represents a modern, efficient, and scalable solution for managing railway reservations, demonstrating the effective use of Spring Boot and MongoDB in building high-performance web applications.
