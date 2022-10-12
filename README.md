# cinema-app-api :tada:

### :rainbow: ABOUT
This REST-FULL web-app is built using the Spring Framework.
The program operates with such entities as user, cinema hall, movie, movie session, ticket, order and shopping cart.
The user can get lists of cinema halls, movies, and movies sessions.
He can also view all available movie viewing sessions on a given day. And of course he can create an order.
Admin can add, delete and modify movies, cinema halls and movies sessions.
Also admin can get information about user by the email.

### :dart: FEATURES
+ registration
+ authentication
+ authorization
+ create, update and remove certain entities according to roles.
+ display list off certain entities
+ make an order

### :hammer: TECHNOLOGIES AND FRAMEWORKS
+ Spring MVC / Data / Security
+ Hibernate
+ MySQL

### :vertical_traffic_light: PROJECT STRUCTURE
The project has an N-Tier Architecture.
+ DAO
> all the work with the database takes place at this stage(CRUD methods).
+ Service
> all business logic takes place at the service level
+ Controller
> receives requests from a client and sends responses to them

### :eyes: INSTRUCTIONS FOR LAUNCHING THE PROJECT:
1. Fork this repository
2. Clone the repository to your PC
4. Edit db.properties - set the necessary parameters:
~~~java
    db.driver="YOUR_DATABASE_DRIVER"
    db.url="YOUR_DATABASE_URL"
    db.user="YOUR_DATABASE_LOGIN"
    db.password="YOUR_DATABASE_PASSWORD"
~~~
5. Install Tomcat (9.0.50)
6. Add Tomcat server to configuration
7. Run project
