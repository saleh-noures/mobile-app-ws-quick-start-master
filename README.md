# mobile-app-ws-quick-start-master

A sample project for RESTfull API using Spring Boot. 
 
1- Create a user --> POST http://localhost:8080/users/ and in the body: 
```
{
    "email": "Saleh@yahoo.com",
    "firstName": "Saleh",
    "lastName": "Noures",
    "password": "sosonono"
}
```

2- Get user --> GET http://localhost:8080/users/UUID

3- Update user --> PUT http://localhost:8080/UUID and in the body: 
```
{
"firstName":"Salem",
"lastName":"Noures"
}
```

4- Delete User --> DELETE http://localhost:8080/users/UUID
