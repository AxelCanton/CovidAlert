# CovidAlert


## Table of Contents
1. [General Info](#general-info)
2. [Installation](#installation)
3. [Collaboration](#collaboration)
4. [Licence](#licence)


<a name="general-info"></a>
## General Info
CovidAlert is a Spring Boot application similar to TousAntiCovid.

This application allows users to register (create an account), proactively record their locations, notify them if they are near a positive test person or a contact case
within a few tens of meters, register their tests and vaccines and communicate them
and communicate news to them.


<a name="installation"></a>
## Installation
To install and run CovidAlert on your machine, follow these steps:
1. Download the source code of this repository.
2. In IntelliJ, open the folder as a project.
3. Create a docker volume:
```bash
docker volume create pgdata
```
4. Create a docker to manage data:
```bash
docker run --rm -P -p 127.0.0.1:5432:5432
-v pgdata:/var/lib/postgresql/data
-e POSTGRES_PASSWORD="postgres"
-e POSTGRES_USER="postgres"
--name postgres-covid postgres:alpine
```
5. Launch Postgres on docker:
```bash
docker exec -it postgres-covid psql -U postgres
```
6. Create a Postgres database:
```bash
create database covid_alert_db;
```
7. Run the [Script SQL](https://github.com/AxelCanton/CovidAlert/blob/88eba846a46be0195dfcefa8c7172b39c9d77d18/src/main/resources/sql/init_tables.sql) de création de table
8. Run the application with Graddle (appRun Task).


<a name="collaboration"></a>
## Collaboration
* [Valentin Guyon](https://github.com/V2i)
* [Alexia Ognard](https://github.com/Alexiaognard)
* [Axel Canton](https://github.com/AxelCanton)


<a name="licence"></a>
## License
[MIT](https://choosealicense.com/licenses/mit/)
