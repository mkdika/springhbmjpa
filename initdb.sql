DROP DATABASE IF EXISTS `coderclub`;
CREATE DATABASE `coderclub`;

USE `coderclub`;

DROP TABLE IF EXISTS `person`;
CREATE TABLE `person` (
	`id` INT(11) NOT NULL AUTO_INCREMENT PRIMARY KEY ,
	`personname` VARCHAR(32) NOT NULL,
	`gender` INT(1) NOT NULL,
	`email` VARCHAR(100) NOT NULL,
	`birthday` DATE NOT NULL
) ENGINE=`InnoDB`;