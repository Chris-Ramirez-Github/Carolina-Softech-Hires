-- MySQL dump 10.13  Distrib 8.0.19, for macos10.15 (x86_64)
--
-- Host: 127.0.0.1    Database: userdb
-- ------------------------------------------------------
-- Server version	8.0.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `membership`
--

DROP TABLE IF EXISTS `membership`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `membership` (
  `name` varchar(45) DEFAULT NULL,
  `username` varchar(16) NOT NULL,
  `employment-status` varchar(1) DEFAULT NULL,
  `role-status` varchar(30) DEFAULT NULL,
  `phone` varchar(12) DEFAULT NULL,
  `state` varchar(45) DEFAULT NULL,
  `county` varchar(60) DEFAULT NULL,
  `password` varchar(12) DEFAULT NULL,
  `rtspassword` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `membership`
--

LOCK TABLES `membership` WRITE;
/*!40000 ALTER TABLE `membership` DISABLE KEYS */;
INSERT INTO `membership` VALUES ('Admin','admin123','2','Administrator','000-000-0000','North Carolina','Charlotte','cr874B4','cr874B4'),('Amazon inc','amazon123','0','Web Development','999-999-9999','North Carolina','Charlotte','cr874V4','cr874V4'),('Cisco Systems','cis123','0','Database Management','890-231-8911','North Carolina','Charlotte','cr874B4','cr874B4'),('Chris Ramirez','cramir16','1','Java Full Stack Developer','000-000-0000','North Carolina','Charlotte','cr874B4','cr874B4'),('Chris Ramirez','cramir17','1','Java Full Stack Developer','000-000-0000','North Carolina','Charlotte','cr874B4','cr874B4'),('Facebook','fac123','0','Web Development','999-999-9999','North Carolina','Charlotte','cr874B4','cr874B4'),('Google','google123','0','Web Development','0000000000','North Carolina','Charlotte','cr874B4','cr874B4'),('Hotel.com','hot123','0','System Analyst','000-000-0000','North Carolina','Chapel Hill','cr874B4','cr874B4'),('HP.com','hp123','0','Database Management','111-111-1111','North Carolina','Apex','cr874B4','cr874B4'),('Intel','int123','0','System Analyst','342-908-9890','North Carolina','Charlotte','cr874B4','cr874B4'),('Juan Paz','juan123','1','System Analyst','980-000-0000','North Carolina','Charlotte','Juan123','Juan123'),('Kenya Ramirez','kenya123','1','SQL Analyst','888-888-8888','North Carolina','Charlotte','cr874B4','cr874B4'),('Microsoft','mic123','0','System Analyst','231-213-2453','North Carolina','Charlotte','cr874B4','cr874B4'),('Oracle','ora123','0','System Analyst','234-234-0000','North Carolina','Charlotte','cr874B4','cr874B4'),('Amazon RDS','rds123','0','Database Management','888-280-4331','North Carolina','Charlotte','cr874B4','cr874B4'),('Walmart','wal123','0','Database Management','324-324-1234','North Carolina','Charlotte','cr874B4','cr874B4'),('Wells Fargo','wel123','0','Database Management','980-000-0000','North Carolina','Charlotte','cr874B4','cr874B4');
/*!40000 ALTER TABLE `membership` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-05-09 11:43:56
