-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema Toe_Stubs
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `Toe_Stubs` ;

-- -----------------------------------------------------
-- Schema Toe_Stubs
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `Toe_Stubs` DEFAULT CHARACTER SET utf8 ;
USE `Toe_Stubs` ;

-- -----------------------------------------------------
-- Table `toe_stubs`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `toe_stubs` ;

CREATE TABLE IF NOT EXISTS `toe_stubs` (
  `id` INT(10) NOT NULL AUTO_INCREMENT,
  `toe` VARCHAR(200) NOT NULL,
  `stub_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `cracked_nail` TINYINT(1) NOT NULL DEFAULT 0,
  `still_healing` TINYINT(1) NOT NULL DEFAULT 1,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

SET SQL_MODE = '';
DROP USER IF EXISTS toe_stubber@localhost;
SET SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';
CREATE USER 'toe_stubber'@'localhost' IDENTIFIED BY 'toe_stubber';

GRANT SELECT, INSERT, TRIGGER, UPDATE, DELETE ON TABLE * TO 'toe_stubber'@'localhost';

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `toe_stubs`
-- -----------------------------------------------------
START TRANSACTION;
USE `Toe_Stubs`;
INSERT INTO `toe_stubs` (`id`, `toe`, `stub_time`, `cracked_nail`, `still_healing`) VALUES (1, 'right pinky', '2023-12-25', 0, 0);
INSERT INTO `toe_stubs` (`id`, `toe`, `stub_time`, `cracked_nail`, `still_healing`) VALUES (2, 'left big toe', '2023-12-25', 1, 0);

COMMIT;

