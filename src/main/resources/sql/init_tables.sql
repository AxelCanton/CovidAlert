CREATE TABLE users(
                      id_user serial NOT NULL PRIMARY KEY,
                      first_name varchar(30) NOT NULL,
                      last_name varchar(30) NOT NULL,
                      email varchar(80) NOT NULL,
                      phone_number varchar(20) NOT NULL,
                      password varchar(100) NOT NULL
);

CREATE TABLE locations(
                          id_location serial PRIMARY KEY,
                          latitude numeric(18, 16) NOT NULL,
                          longitude numeric(18, 16) NOT NULL,
                          date timestamp without time zone NOT NULL,
                          id_user INTEGER NOT NULL REFERENCES users(id_user)
);

CREATE TABLE tests
(
    id_test serial NOT NULL PRIMARY KEY,
    date timestamp NOT NULL,
    isNegative bool NOT NULL,
    id_user INTEGER NOT NULL REFERENCES users(id_user)
);

CREATE TABLE vaccins
(
    id_vaccin serial NOT NULL PRIMARY KEY,
    date timestamp NOT NULL,
    nom varchar(64) NOT NULL,
    id_user INTEGER NOT NULL REFERENCES users(id_user)
);