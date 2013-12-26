CREATE DATABASE  IF NOT EXISTS `brightonbeach` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `brightonbeach`;
-- MySQL dump 10.13  Distrib 5.5.16, for Win32 (x86)
--
-- Host: localhost    Database: brightonbeach
-- ------------------------------------------------------
-- Server version	5.5.30-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `apply`
--

DROP TABLE IF EXISTS `apply`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `apply` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(40) NOT NULL,
  `state` varchar(40) NOT NULL,
  `card_id` bigint(20) NOT NULL,
  `user_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`),
  UNIQUE KEY `state` (`state`),
  KEY `FK58B836E7A9F6653` (`user_id`),
  KEY `FK58B836EA4606433` (`card_id`),
  CONSTRAINT `FK58B836EA4606433` FOREIGN KEY (`card_id`) REFERENCES `card` (`id`),
  CONSTRAINT `FK58B836E7A9F6653` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `apply`
--

LOCK TABLES `apply` WRITE;
/*!40000 ALTER TABLE `apply` DISABLE KEYS */;
/*!40000 ALTER TABLE `apply` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `card`
--

DROP TABLE IF EXISTS `card`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `card` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `afterConversionType` varchar(100) DEFAULT NULL,
  `archiveEdrpou` varchar(100) DEFAULT NULL,
  `archiveName` varchar(100) DEFAULT NULL,
  `arriveDate` datetime DEFAULT NULL,
  `arriveMessageDate` datetime DEFAULT NULL,
  `author` varchar(100) DEFAULT NULL,
  `beforeConversionType` varchar(100) DEFAULT NULL,
  `conversionAct` varchar(100) DEFAULT NULL,
  `conversionActFileName` varchar(100) DEFAULT NULL,
  `conversionDate` datetime DEFAULT NULL,
  `conversionName` varchar(100) DEFAULT NULL,
  `conversionVersion` varchar(100) DEFAULT NULL,
  `conversor` varchar(100) DEFAULT NULL,
  `countryId` varchar(100) DEFAULT NULL,
  `deal` varchar(100) DEFAULT NULL,
  `dealHeader` varchar(100) DEFAULT NULL,
  `dealIndex` varchar(100) DEFAULT NULL,
  `dealTerm` datetime DEFAULT NULL,
  `designReviewDate` datetime DEFAULT NULL,
  `destroyAct` varchar(100) DEFAULT NULL,
  `destroyDate` datetime DEFAULT NULL,
  `destroyer` varchar(100) DEFAULT NULL,
  `documentDate` datetime DEFAULT NULL,
  `documentIndex` varchar(100) DEFAULT NULL,
  `done` varchar(100) DEFAULT NULL,
  `doneTerm` datetime DEFAULT NULL,
  `eMessageAcceptReject` varchar(100) DEFAULT NULL,
  `editDate` datetime DEFAULT NULL,
  `edrpou` varchar(100) DEFAULT NULL,
  `fund` varchar(100) DEFAULT NULL,
  `header` varchar(100) DEFAULT NULL,
  `index0` varchar(100) DEFAULT NULL,
  `cardName` varchar(100) NOT NULL,
  `pageNumber` int(11) DEFAULT NULL,
  `performer` varchar(100) DEFAULT NULL,
  `positionAcceptReject` varchar(100) DEFAULT NULL,
  `resolution` varchar(100) DEFAULT NULL,
  `reviewAct` varchar(100) DEFAULT NULL,
  `reviewDate` datetime DEFAULT NULL,
  `storageTerm` datetime DEFAULT NULL,
  `suggestionDate` datetime DEFAULT NULL,
  `suggestionReviewDate` datetime DEFAULT NULL,
  `technicalReview` varchar(100) DEFAULT NULL,
  `termIncrement` varchar(100) DEFAULT NULL,
  `unit` varchar(100) DEFAULT NULL,
  `unitDate` datetime DEFAULT NULL,
  `volume` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `card`
--

LOCK TABLES `card` WRITE;
/*!40000 ALTER TABLE `card` DISABLE KEYS */;
/*!40000 ALTER TABLE `card` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `fullname` varchar(40) NOT NULL,
  `username` varchar(40) NOT NULL,
  `password` varchar(40) NOT NULL,
  `role` varchar(40) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'Первинний адміністратор','admin','admin','ROLE_ADMIN');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2013-12-26  2:10:32
