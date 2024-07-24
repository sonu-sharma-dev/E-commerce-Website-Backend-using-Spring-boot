# E-commerce Backend

## Overview
This project is the backend of the E-commerce Full Stack Website, built with Spring Boot and MySQL. It provides RESTful APIs for  product management, shopping cart operations, order processing, and product search.

## Features
- Product Management: Add, update, and delete products
- Shopping Cart: Add to cart, update items, and manage your cart with ease
- Order Processing: Smooth checkout and comprehensive order history
- Product Search: Fast and efficient product search functionality

## Technologies Used
- Spring Boot
- Spring Data JPA
- MySQL

## Getting Started

### Prerequisites
- Java 11 or later
- MySQL server
- Maven

### Installation

1. **Clone the repository:**
    ```bash
    git clone https://github.com/sonu-sharma-dev/E-commerce-Backend.git
    cd E-commerce-Backend
    ```

2. **Configure the database connection in `src/main/resources/application.properties`:**
    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
    spring.datasource.username=your_database_username
    spring.datasource.password=your_database_password
    spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true
    ```

3. **Build and run the Spring Boot application:**
    ```bash
    ./mvnw spring-boot:run
    ```

### Database Initialization
- The database schema is automatically created by Hibernate based on the JPA entities.
- You can initialize the database with some sample data using `data.sql` in `src/main/resources`.

## Contributing
We welcome contributions! Please fork the repository and create a pull request with your enhancements.

## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Contact
For any inquiries or support, please contact [Your Name] at [your.email@example.com].
