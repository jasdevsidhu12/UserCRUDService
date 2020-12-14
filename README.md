# Simple CRUD Microservice

## Description
A Granular Spring boot web microservice that deal with create, get and delete User Restfull API

## API Requests
### Get all users

```
GET http://localhost:8080/users
```

### Get a user

```
GET http://localhost:8080/users/{name}
```

### Post a user

```
POST http://localhost:8080/users/{name}
JSON Request Body
{
    "name":   "Jasdev",
    "gender": "male",
    "age": 100
}
```
### Delete a user

```
DELETE http://localhost:8080/users/{name}
```