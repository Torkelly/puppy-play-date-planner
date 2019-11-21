-- MySQL dump 10.13  Distrib 8.0.17, for Win64 (x86_64)
--
-- Host: localhost    Database: demo
-- ------------------------------------------------------
-- Server version	8.0.17

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
-- Table structure for table `message`
--

DROP TABLE IF EXISTS `message`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `message` (
  `message_id` int(11) NOT NULL AUTO_INCREMENT,
  `sender` int(11) NOT NULL,
  `receiver` int(11) NOT NULL,
  `subject` varchar(30) DEFAULT NULL,
  `body` varchar(120) DEFAULT NULL,
  PRIMARY KEY (`message_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `message`
--

LOCK TABLES `message` WRITE;
/*!40000 ALTER TABLE `message` DISABLE KEYS */;
/*!40000 ALTER TABLE `message` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `confirmationtoken`
--

DROP TABLE IF EXISTS `confirmationtoken`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `confirmationtoken` (
  `token_id` bigint(20) NOT NULL,
  `confirmation_token` varchar(255) DEFAULT NULL,
  `createdDate` datetime(6) DEFAULT NULL,
  `user_id` int(11) NOT NULL,
  PRIMARY KEY (`token_id`),
  KEY `FKh6pgxu19b0x5rvabde7s5yuoh` (`user_id`),
  CONSTRAINT `FKh6pgxu19b0x5rvabde7s5yuoh` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `confirmationtoken`
--

LOCK TABLES `confirmationtoken` WRITE;
/*!40000 ALTER TABLE `confirmationtoken` DISABLE KEYS */;
INSERT INTO `confirmationtoken` VALUES (23,'56501f30-4453-4bbb-868a-ff18eb936e9e','2019-11-20 18:24:00.424000',22),(24,'6aaa7ba9-aa70-42b4-9d2d-bf530d0e9067','2019-11-20 18:27:28.115000',22),(25,'31eaa8a1-d9fa-49a2-9a0e-efb2bf7b2f05','2019-11-20 18:30:52.502000',22),(26,'911b229f-9b35-498b-89da-a7ca0f19bc6e','2019-11-20 18:31:52.246000',22),(27,'11bae8f9-75da-4055-8eb9-17ad7b3bcb72','2019-11-20 18:33:28.947000',22);
/*!40000 ALTER TABLE `confirmationtoken` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `playdate`
--

DROP TABLE IF EXISTS `playdate`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `playdate` (
  `id` int(11) NOT NULL,
  `date` datetime(6) NOT NULL,
  `description` varchar(255) NOT NULL,
  `dogParkLocation` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `playdate`
--

LOCK TABLES `playdate` WRITE;
/*!40000 ALTER TABLE `playdate` DISABLE KEYS */;
/*!40000 ALTER TABLE `playdate` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `puppy`
--

DROP TABLE IF EXISTS `puppy`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `puppy` (
  `id` int(11) NOT NULL,
  `birthday` datetime(6) NOT NULL,
  `breed` int(11) NOT NULL,
  `description` varchar(250) NOT NULL,
  `name` varchar(15) NOT NULL,
  `size` varchar(15) NOT NULL,
  `user_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKehwum7uron3mafpmgmaocjb2f` (`user_id`),
  CONSTRAINT `FKehwum7uron3mafpmgmaocjb2f` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `puppy`
--

LOCK TABLES `puppy` WRITE;
/*!40000 ALTER TABLE `puppy` DISABLE KEYS */;
/*!40000 ALTER TABLE `puppy` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `description` varchar(250) DEFAULT NULL,
  `dogParkLocation` int(11) DEFAULT NULL,
  `email` varchar(255) NOT NULL,
  `enabled` bit(1) DEFAULT NULL,
  `last_name` varchar(255) NOT NULL,
  `first_name` varchar(255) NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_ob8kqyqqgmefl0aco34akdtpe` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (22,NULL,4,'lauramejiat16@gmail.com',_binary '','Mejia','Laura','$2a$12$.d3tIVCcqwd8KjaMu4npiOK6DnHayUq1Q7q7MAcWHgR5gaWl/0lai');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'demo'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-11-20 18:45:01
