# Host: localhost  (Version: 5.5.5-10.4.21-MariaDB)
# Date: 2021-12-14 23:58:45
# Generator: MySQL-Front 5.3  (Build 1.18)

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE */;
/*!40101 SET SQL_MODE='NO_ZERO_IN_DATE,NO_ZERO_DATE,NO_ENGINE_SUBSTITUTION' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES */;
/*!40103 SET SQL_NOTES='ON' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS */;
/*!40014 SET FOREIGN_KEY_CHECKS=0 */;

#
# Source for table "usuario"
#

DROP TABLE IF EXISTS `usuario`;
CREATE TABLE `usuario` (
  `nombre` varchar(200) NOT NULL,
  `contraseña` varchar(200) NOT NULL,
  `email` varchar(200) NOT NULL,
  PRIMARY KEY (`nombre`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

#
# Data for table "usuario"
#

INSERT INTO `usuario` VALUES ('Daniel','7110eda4d09e062aa5e4a390b0a572ac0d2c0220','daniel@gmail.com'),('ejemplo1','1234','ejemplo1@email.com'),('ejemplo2','7110eda4d09e062aa5e4a390b0a572ac0d2c0220','hola@hola.com'),('Gabriel','7110eda4d09e062aa5e4a390b0a572ac0d2c0220','gabriel@gmail.com'),('JUNIT5 P1','1234','hola@gmail.com'),('JUNIT5 P10','1234','hola@gmail.com'),('JUNIT5 P11','1234','hola@gmail.com'),('JUNIT5 P12','1234','hola@gmail.com'),('JUNIT5 P2','1234','hola@gmail.com'),('JUNIT5 P4','1234','hola@gmail.com'),('JUNIT5 P6','1234','hola@gmail.com'),('JUNIT5 P7','1234','hola@gmail.com'),('JUNIT5 P8','1234','hola@gmail.com'),('JUNIT5 P9','1234','hola@gmail.com'),('nicolas','1234','hola@gmail.com'),('prueba1','7110eda4d09e062aa5e4a390b0a572ac0d2c0220','prueba1@gmail.com'),('prueba2','99800b85d3383e3a2fb45eb7d0066a4879a9dad0','hola@gmail.com'),('Video1','7110eda4d09e062aa5e4a390b0a572ac0d2c0220','video1@gmail.com'),('VideoPrueba','1234','hola@gmail.com');

/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
