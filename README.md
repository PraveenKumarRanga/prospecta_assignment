# prospecta_assignment

This project demonstrates how to use Spring Boot's RestTemplate to communicate with external APIs. It includes two endpoints:

GET `/get_by_category/{category}`: Retrieves a list of products based on the specified category from an external API.
POST `/addProduct`: Adds a new product to an external API.

Endpoints
GET `/get_by_category/{category}`
Retrieves a list of products based on the specified category from an external API.

Method: GET
Path: `/get_by_category/{category}`
Parameters:
{category}: The category of products to retrieve.
Response: Returns a JSON array of products matching the specified category.
POST `/addProduct`
Adds a new product to an external API.

Method: POST
Path: `/addProduct`
Request Body: JSON object representing the product to add.
Response: Returns the added product as JSON.
Usage
Start the application.
Make HTTP requests to the provided endpoints using your preferred HTTP client.
