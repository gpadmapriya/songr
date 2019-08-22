#### Songr application
- Available Routes
  - /hello - renders a HTML page with hello world 
  - /capitalize - turns words to uppercase. Takes a path variable embedded in the URL and turns it to uppercase.
  - /reverse?sentence=String - reverses the order of words entered as a query parameter
  - /albums - retuns all albums by different artists along with their titles, song count and length in minutes. Users can add an album with an input form. Data is persisted into a Postgres SQL database.

#### Feature tasks
- Create an Album model. It should have an artist, title, song count, length in seconds and an album cover image.
- A user should be able to see information about all the albums on the site.
- A user should be able to add albums to the site.

#### To Run
- Spring MVC should be running
- Run SongrApplication in IntelliJ
- Routes should be available when trying from localhost at port 8080 (http://localhost/8080)
- Include following dependencies in build.gradle
  - compile 'org.springframework.boot:spring-boot-starter-data-jpa'
  - runtimeOnly('org.postgresql:postgresql')
- Create a postgres database named 'albums'.
- Update application.properties to include
  - spring.datasource.url=jdbc:postgresql://localhost:5432/albums
  - spring.datasource.username=username (postgres user name)
  - spring.datasource.password=pwd (postgres password)
  - spring.jpa.hibernate.ddl-auto=create
- To persist data between requests, comment out the previous line (use # to comment out) in application.properties after running for the first time 
- App listens on port 8080. Be sure to check all routes at http://localhost:8080 
- Use gradle bootRun to run from terminal

[Code](https://github.com/gpadmapriya/songr/tree/master/src/main/java/com/example/songr)

[Test Cases](https://github.com/gpadmapriya/songr/tree/master/src/test/java/com/example/songr)