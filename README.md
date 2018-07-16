# example-springboot
CRUD using Spring Boot

DDL
CREATE DATABASE manusia

CREATE TABLE profile
(
    id integer NOT NULL,
    name character varying(50),
    address character varying(50),
    CONSTRAINT profile_pkey PRIMARY KEY (id)
)

===================================================
Get All Data
http://localhost:8080/doku/api/profile
Method Type = GET
===================================================
Get Data By Id
http://localhost:8080/doku/api/profile/{id}
Method Type = GET
===================================================
Save To Database
http://localhost:8080/doku/api/profile/
Method Type = POST
===================================================
Update Data From Database
http://localhost:8080/doku/api/profile/{id}
Method Type = PUT
===================================================
Delete Data From Database
http://localhost:8080/doku/api/profile/{id}
Method Type = DELETE
===================================================
