-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema bountyjobs
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema bountyjobs
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `bountyjobs` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `bountyjobs` ;

-- -----------------------------------------------------
-- Table `bountyjobs`.`candidate`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bountyjobs`.`candidate` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `email` VARCHAR(45) NOT NULL,
  `first_name` VARCHAR(45) NOT NULL,
  `last_name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `idcandiate_UNIQUE` (`id` ASC) VISIBLE,
  UNIQUE INDEX `email_UNIQUE` (`email` ASC) VISIBLE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `bountyjobs`.`employer`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bountyjobs`.`employer` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `idemployer_UNIQUE` (`id` ASC) VISIBLE,
  UNIQUE INDEX `email_UNIQUE` (`email` ASC) VISIBLE)
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `bountyjobs`.`job`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bountyjobs`.`job` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `status` ENUM('open', 'closed') NOT NULL,
  `employerId` INT NOT NULL,
  `datePosted` DATETIME NOT NULL,
  `title` VARCHAR(45) NOT NULL,
  `salary` FLOAT NOT NULL,
  `type` VARCHAR(45) NOT NULL,
  `description` VARCHAR(1000) NULL DEFAULT NULL,
  `location` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`id`, `employerId`),
  UNIQUE INDEX `idjob_UNIQUE` (`id` ASC) VISIBLE,
  INDEX `employerId_idx` (`employerId` ASC) VISIBLE,
  CONSTRAINT `employerIdKey`
    FOREIGN KEY (`employerId`)
    REFERENCES `bountyjobs`.`employer` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `bountyjobs`.`application`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bountyjobs`.`application` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `candidateId` INT NOT NULL,
  `jobId` INT NOT NULL,
  `status` ENUM('under consideration', 'pass', 'offer extended', 'offer accepted') NOT NULL,
  `dateApplied` DATETIME NOT NULL,
  `dateStatusUpdated` DATETIME NULL DEFAULT NULL,
  PRIMARY KEY (`id`, `candidateId`, `jobId`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
  INDEX `candidateIdKey_idx` (`candidateId` ASC) VISIBLE,
  INDEX `employerIdKey_idx` (`jobId` ASC) VISIBLE,
  CONSTRAINT `candidateIdKey`
    FOREIGN KEY (`candidateId`)
    REFERENCES `bountyjobs`.`candidate` (`id`),
  CONSTRAINT `jobIdKey`
    FOREIGN KEY (`jobId`)
    REFERENCES `bountyjobs`.`job` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `bountyjobs`.`login`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bountyjobs`.`login` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
  UNIQUE INDEX `username_UNIQUE` (`username` ASC) VISIBLE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
