
DROP DATABASE IF EXISTS `a1`;

CREATE DATABASE `a1`;

USE `a1`;

CREATE TABLE article(
id INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
PRIMARY KEY(id),
title CHAR(100) NOT NULL,
`body` TEXT NOT NULL,
regDate DATETIME NOT NULL,
hit INT(10) NOT NULL
);

INSERT INTO article SET regDate = NOW(),
title = 'user1',
`body` = 'user1',
hit = 0;



