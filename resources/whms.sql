-- MySQL dump 10.13  Distrib 5.7.12, for osx10.9 (x86_64)
--
-- Host: localhost    Database: whms
-- ------------------------------------------------------
-- Server version	5.6.26

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
-- Table structure for table `invoice`
--

DROP TABLE IF EXISTS `invoice`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `invoice` (
  `invoice_ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `num_of_ware` int(10) unsigned NOT NULL,
  `ware_description` text COLLATE utf8_persian_ci NOT NULL,
  `personnel_code` int(10) unsigned NOT NULL,
  `ware_ID` int(10) unsigned NOT NULL,
  PRIMARY KEY (`invoice_ID`),
  KEY `ware_ID_idx` (`ware_ID`),
  KEY `sdcsdf_idx` (`personnel_code`),
  CONSTRAINT `f_personnel_code` FOREIGN KEY (`personnel_code`) REFERENCES `warehouse_keeper` (`personnel_code`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `f_ware_ID` FOREIGN KEY (`ware_ID`) REFERENCES `ware` (`ware_ID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_persian_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `orders` (
  `order_ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `delivery_time` datetime NOT NULL,
  `order_time` datetime NOT NULL,
  `customer_ID` int(10) unsigned NOT NULL,
  `ware_ID` int(10) unsigned NOT NULL,
  `personnel_code` int(10) unsigned NOT NULL,
  PRIMARY KEY (`order_ID`),
  KEY `customer_ID_idx` (`customer_ID`),
  KEY `ware_ID_idx` (`ware_ID`),
  KEY `personnel_code_idx` (`personnel_code`),
  CONSTRAINT `customer_ID` FOREIGN KEY (`customer_ID`) REFERENCES `person` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `personnel_code` FOREIGN KEY (`personnel_code`) REFERENCES `warehouse_keeper` (`personnel_code`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `ware_ID` FOREIGN KEY (`ware_ID`) REFERENCES `ware` (`ware_ID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_persian_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `person`
--

DROP TABLE IF EXISTS `person`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `person` (
  `ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `first_name` varchar(30) COLLATE utf8_persian_ci NOT NULL,
  `surname` varchar(40) CHARACTER SET utf8 NOT NULL,
  `birth_date` date NOT NULL,
  `cell_number` text COLLATE utf8_persian_ci NOT NULL,
  `address` text COLLATE utf8_persian_ci NOT NULL,
  `customer_ID` int(10) unsigned DEFAULT NULL,
  `personnel_code` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `f_personnel_code_idx` (`personnel_code`),
  CONSTRAINT `fk_personnel_code` FOREIGN KEY (`personnel_code`) REFERENCES `warehouse_keeper` (`personnel_code`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_persian_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `ware`
--

DROP TABLE IF EXISTS `ware`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ware` (
  `ware_ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `ware_kind` varchar(40) COLLATE utf8_persian_ci NOT NULL,
  `ware_name` varchar(40) COLLATE utf8_persian_ci NOT NULL,
  `ware_price` int(10) unsigned NOT NULL,
  `width` int(10) unsigned NOT NULL,
  `length` int(10) unsigned NOT NULL,
  PRIMARY KEY (`ware_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_persian_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `warehouse`
--

DROP TABLE IF EXISTS `warehouse`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `warehouse` (
  `warehouse_ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(45) COLLATE utf8_persian_ci NOT NULL,
  `state` tinyint(4) NOT NULL,
  PRIMARY KEY (`warehouse_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COLLATE=utf8_persian_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `warehouse_keeper`
--

DROP TABLE IF EXISTS `warehouse_keeper`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `warehouse_keeper` (
  `personnel_code` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `password` varchar(32) CHARACTER SET utf8 NOT NULL,
  PRIMARY KEY (`personnel_code`)
) ENGINE=InnoDB AUTO_INCREMENT=952 DEFAULT CHARSET=utf8 COLLATE=utf8_persian_ci;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-06-21 15:27:06
