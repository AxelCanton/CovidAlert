CREATE TABLE users(
                      user_id serial NOT NULL PRIMARY KEY,
                      first_name varchar(30) NOT NULL,
                      last_name varchar(30) NOT NULL,
                      email varchar(80) NOT NULL,
                      phone_number varchar(20) NOT NULL,
                      password varchar(100) NOT NULL
);

CREATE TABLE locations(
                          location_id serial PRIMARY KEY,
                          latitude numeric(18, 16) NOT NULL,
                          longitude numeric(18, 16) NOT NULL,
                          location_date timestamp without time zone NOT NULL
);

CREATE TABLE user_locations
(
    user_id integer NOT NULL REFERENCES users (user_id),
    location_id integer NOT NULL REFERENCES locations (location_id)
);

CREATE TABLE persistent_logins
(
    username varchar(50) NOT NULL REFERENCES users(username),
    series varchar(64) PRIMARY KEY,
    token varchar(64) NOT NULL,
    last_user timestamp NOT NULL
);

CREATE TABLE verif_tokens
(
    token varchar(200) PRIMARY KEY,
    username varchar(64) NOT NULL,
    expiryDate timestamp NOT NULL
)
