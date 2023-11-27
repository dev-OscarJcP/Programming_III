CREATE DATABASE  IF NOT EXISTS `spar` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `spar`;
-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: spar
-- ------------------------------------------------------
-- Server version	8.0.31

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
-- Table structure for table `cabelo`
--

DROP TABLE IF EXISTS `cabelo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cabelo` (
  `horario` varchar(8) DEFAULT NULL,
  `dataa` varchar(15) DEFAULT NULL,
  `nome` varchar(50) DEFAULT NULL,
  `telefone` varchar(12) DEFAULT NULL,
  `profissional` varchar(20) DEFAULT NULL,
  `id` int NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=29 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cabelo`
--

LOCK TABLES `cabelo` WRITE;
/*!40000 ALTER TABLE `cabelo` DISABLE KEYS */;
INSERT INTO `cabelo` VALUES ('09 : 00',' 26 / 11 / 2023','pedri santos','73 33333333','Mariana Silva',18),('08 : 30',' 26 / 11 / 2023','maria oliveira','7322222222','Mariana Silva',17),('08 : 00',' 26 / 11 / 2023','joao silva','73 11111111','Mariana Silva',16),('08 : 30',' 26 / 11 / 2023','laura lima','73 66666666','Martha Nogueira',21),('09 : 00',' 26 / 11 / 2023','bruno pereira','73 77777777','Martha Nogueira',22),('09 : 30',' 26 / 11 / 2023','camila martins','73 88888888','Martha Nogueira',23),('08 : 30',' 26 / 11 / 2023','larissa rodrigues','73 10101010','Ana Arouca',25),('09 : 00',' 26 / 11 / 2023','rafaela fernandes','73 11111111','Ana Arouca',26),('09 : 30',' 26 / 11 / 2023','anderson costa','73 13131313','Ana Arouca',27);
/*!40000 ALTER TABLE `cabelo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `clientes`
--

DROP TABLE IF EXISTS `clientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `clientes` (
  `cpf` bigint NOT NULL,
  `nome` varchar(50) DEFAULT NULL,
  `telefone` varchar(12) DEFAULT NULL,
  `valorGasto` float DEFAULT '0',
  PRIMARY KEY (`cpf`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clientes`
--

LOCK TABLES `clientes` WRITE;
/*!40000 ALTER TABLE `clientes` DISABLE KEYS */;
INSERT INTO `clientes` VALUES (8070824573,'oscar E. Neto','73 999275970',15),(8070824578,'joao F. silva','73 999275980',30),(8070824593,'matheus rodrigues da silva','73 991247238',150),(65196953515,'Rodrigo SAntos','73 988453808',60),(8070824598,'Ruan Matheus Carvalho','73 988665544',30),(12345678910,'bruno freitas','73988696883',100),(12345678040,'matheus santois silva','73 988453808',200);
/*!40000 ALTER TABLE `clientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `financeiro`
--

DROP TABLE IF EXISTS `financeiro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `financeiro` (
  `horario` varchar(8) DEFAULT NULL,
  `dataa` varchar(8) DEFAULT NULL,
  `nome` varchar(50) DEFAULT NULL,
  `cpf` bigint DEFAULT NULL,
  `telefone` varchar(12) DEFAULT NULL,
  `pagamento` varchar(15) DEFAULT NULL,
  `valor` float DEFAULT NULL,
  `servico` varchar(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `financeiro`
--

LOCK TABLES `financeiro` WRITE;
/*!40000 ALTER TABLE `financeiro` DISABLE KEYS */;
/*!40000 ALTER TABLE `financeiro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `unhas`
--

DROP TABLE IF EXISTS `unhas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `unhas` (
  `horario` varchar(8) DEFAULT NULL,
  `dataa` varchar(15) DEFAULT NULL,
  `nome` varchar(50) DEFAULT NULL,
  `telefone` varchar(12) DEFAULT NULL,
  `profissional` varchar(20) DEFAULT NULL,
  `id` int NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `unhas`
--

LOCK TABLES `unhas` WRITE;
/*!40000 ALTER TABLE `unhas` DISABLE KEYS */;
INSERT INTO `unhas` VALUES ('08 : 30',' 26 / 11 / 2023','isabela santos','73 14141414','Sophia Oliveira',6),('09 : 00',' 26 / 11 / 2023','victor lima','73 15151515','Camila Santos',7),('09: 30',' 26 / 11 / 2023','juliana oliveira','73 16161616','Gabriela Costa',9);
/*!40000 ALTER TABLE `unhas` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-11-26 21:18:06
