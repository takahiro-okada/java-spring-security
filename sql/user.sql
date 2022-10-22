DROP TABLE IF EXISTS user;

CREATE TABLE user(
    id int unsigned AUTO_INCREMENT,
    username VARCHAR(100) NOT NULL,
    password VARCHAR(100) NOT NULL,
    PRIMARY KEY(id)
);

INSERT INTO user (username,password) VALUES ("bob","password1234");
INSERT INTO user (username,password) VALUES ("tom","password1234");
