
### REST API con Spring Boot

Para ejecutar el REST API, navega al directorio `rest/` y ejecuta los siguientes comandos:

cd rest
mvn spring-boot:run

### Create
-POST
localhost:8080/api/employees
body:{"name":"Jose Perez","salary":60000, "department":"IT"}
### Get by id
-GET
localhost:8080/api/employees/1
### Update by id
-PUT
localhost:8080/api/employees/1
body:{"name":"Jose Perez","salary":65000, "department":"IT"}
### Delete by id
-DELETE
localhost:8080/api/employees/1
### Find all
-GET
localhost:8080/api/employees