-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: dobestmotos
-- ------------------------------------------------------
-- Server version	8.2.0

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
-- Table structure for table `categoria`
--

DROP TABLE IF EXISTS `categoria`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `categoria` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `codigo` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `codigo_UNIQUE` (`codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=201 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categoria`
--

LOCK TABLES `categoria` WRITE;
/*!40000 ALTER TABLE `categoria` DISABLE KEYS */;
INSERT INTO `categoria` VALUES (1,'Accessories','accessories'),(2,'Air Filter','air-filter'),(3,'Brake Pads','brake-pads'),(4,'Brake Pump','brake-pump'),(5,'Carburetor Installation Repair Tool Kit','carburetor-installation-repair-tool-kit'),(6,'Carburetor Intake Manifter Cuff','carburetor-intake-manifter-cuff'),(7,'Clutch Line','clutch-line'),(8,'Clutch Plate','clutch-plate'),(9,'Connecting Rod','connecting-rod'),(10,'Damper Oil Seal','damper-oil-seal'),(11,'Drive Belt','drive-belt'),(12,'Driven Wheel Centrifugal Clutch','driven-wheel-centrifugal-clutch'),(13,'Engine Clutch Starter Bearing','engine-clutch-starter-bearing'),(14,'Engine Oil Filler Plug Fill Cap Screw','engine-oil-filler-plug-fill-cap-screw'),(15,'Engine Oil Filter','engine-oil-filter'),(16,'Engine Timing Chain','engine-timing-chain'),(17,'Film Screen Protector','film-screen-protector'),(18,'Footrest Pedals Pegs','footrest-pedals-pegs'),(19,'Fuel Cock Faucet Valve Switche Pump','fuel-cock-faucet-valve-switche-pump'),(20,'Benell','benell-accessories'),(21,'BMW','bmw-accessories'),(22,'Ducati','ducati-accessories'),(23,'Honda','honda-accessories'),(24,'Kawasaki','kawasaki-accessories'),(25,'KTM','ktm-accessories'),(26,'Suzuki','suzuki-accessories'),(27,'Yamaha','yamaha-accessories'),(28,'BMW','bmw-air-filter'),(29,'Harley Davidson','harley-davidson-air-filter'),(30,'Honda','honda-air-filter'),(31,'Husqvarna','husqvarna-air-filter'),(32,'Hyosung','hyosung-air-filter'),(33,'Kawasaki','kawasaki-air-filter'),(34,'KTM','ktm-air-filter'),(35,'Kymco','kymco-air-filter'),(36,'Piaggio','piaggio-air-filter'),(37,'Suzuki','suzuki-air-filter'),(38,'SYM','sym-air-filter'),(39,'Triumph','triumph-air-filter'),(40,'Vespa','vespa-air-filter'),(41,'Yamaha','yamaha-air-filter'),(42,'Other','other-air-filter'),(43,'BMW','bmw-brake-guard-with-installation-kit'),(44,'Aprilia','aprilia-brake-pads'),(45,'Buell','buell-brake-pads'),(46,'Can-am','can-am-brake-pads'),(47,'CFMOTO','cfmoto-brake-pads'),(48,'Ducati','ducati-brake-pads'),(49,'Harley Davidson','harley-davidson-brake-pads'),(50,'Honda','honda-brake-pads'),(51,'Husqvarna','husqvarna-brake-pads'),(52,'Hyosung','hyosung-brake-pads'),(53,'Kawasaki','kawasaki-brake-pads'),(54,'KTM','ktm-brake-pads'),(55,'Kymco','kymco-brake-pads'),(56,'Polaris','polaris-brake-pads'),(57,'Suzuki','suzuki-brake-pads'),(58,'SYM','sym-brake-pads'),(59,'Triumph','triumph-brake-pads'),(60,'Yamaha','yamaha-brake-pads'),(61,'Other','other-brake-pads'),(62,'Aprilia','aprilia-brake-pump'),(63,'Arctic Cat','arctic-cat-brake-pump'),(64,'Ducati','ducati-brake-pump'),(65,'Honda','honda-brake-pump'),(66,'Husqvarna','husqvarna-brake-pump'),(67,'Kawasaki','kawasaki-brake-pump'),(68,'KTM','ktm-brake-pump'),(69,'Polaris','polaris-brake-pump'),(70,'Suzuki','suzuki-brake-pump'),(71,'Yamaha','yamaha-brake-pump'),(72,'Other','other-brake-pump'),(73,'Honda','honda-carburetor-installation-repair-tool-kit'),(74,'Honda','honda-carburetor-intake-manifter-cuff'),(75,'Kawasaki','kawasaki-carburetor-intake-manifter-cuff'),(76,'Polaris','polaris-carburetor-intake-manifter-cuff'),(77,'Suzuki','suzuki-carburetor-intake-manifter-cuff'),(78,'Yamaha','yamaha-carburetor-intake-manifter-cuff'),(79,'Other','other-carburetor-intake-manifter-cuff'),(80,'BMW','bmw-clutch-line'),(81,'Honda','honda-clutch-line'),(82,'Kawasaki','kawasaki-clutch-line'),(83,'Suzuki','suzuki-clutch-line'),(84,'Yamaha','yamaha-clutch-line'),(85,'BMW','bmw-clutch-plate'),(86,'Buell','buell-clutch-plate'),(87,'Harley Davidson','harley-davidson-clutch-plate'),(88,'Honda','honda-clutch-plate'),(89,'Husqvarna','husqvarna-clutch-plate'),(90,'Kawasaki','kawasaki-clutch-plate'),(91,'KTM','ktm-clutch-plate'),(92,'Suzuki','suzuki-clutch-plate'),(93,'Triumph','triumph-clutch-plate'),(94,'Yamaha','yamaha-clutch-plate'),(95,'Other','other-clutch-plate'),(96,'Honda','honda-connecting-rod'),(97,'Kawasaki','kawasaki-connecting-rod'),(98,'KTM','ktm-connecting-rod'),(99,'Polaris','polaris-connecting-rod'),(100,'Suzuki','suzuki-connecting-rod'),(101,'Yamaha','yamaha-connecting-rod'),(102,'Aprilia','aprilia-damper-oil-seal'),(103,'BMW','bmw-damper-oil-seal'),(104,'Harley Davidson','harley-davidson-damper-oil-seal'),(105,'Honda','honda-damper-oil-seal'),(106,'Husqvarna','husqvarna-damper-oil-seal'),(107,'Hyosung','hyosung-damper-oil-seal'),(108,'Kawasaki','kawasaki-damper-oil-seal'),(109,'Suzuki','suzuki-damper-oil-seal'),(110,'Triumph','triumph-damper-oil-seal'),(111,'Yamaha','yamaha-damper-oil-seal'),(112,'Other','other-damper-oil-seal'),(113,'Aprilia','aprilia'),(114,'Arctic Cat','arctic-cat-drive-belt'),(115,'BMW','bmw-drive-belt'),(116,'Can-am','can-am-drive-belt'),(117,'CFMOTO','cfmoto-drive-belt'),(118,'Honda','honda-drive-belt'),(119,'Kawasaki','kawasaki-drive-belt'),(120,'Kymco','kymco-drive-belt'),(121,'Piaggio','piaggio'),(122,'Polaris','polaris-drive-belt'),(123,'Ski doo','ski-doo-drive-belt'),(124,'Suzuki','suzuki-drive-belt'),(125,'SYM','sym-drive-belt'),(126,'Yamaha','yamaha-drive-belt'),(127,'Other','other-drive-belt'),(128,'CFMOTO','cfmoto-driven-wheel-centrifugal-clutch'),(129,'Honda','honda-driven-wheel-centrifugal-clutch'),(130,'Kawasaki','kawasaki-driven-wheel-centrifugal-clutch'),(131,'Kymco','kymco-driven-wheel-centrifugal-clutch'),(132,'Other','other-driven-wheel-centrifugal-clutch'),(133,'Aprilia','aprilia-engine-clutch-starter-bearing'),(134,'Arctic Cat','arctic-cat-engine-clutch-starter-bearing'),(135,'BMW','bmw-engine-clutch-starter-bearing'),(136,'Can-am','can-am-engine-clutch-starter-bearing'),(137,'CFMOTO','cfmoto-engine-clutch-starter-bearing'),(138,'Ducati','ducati-engine-clutch-starter-bearing'),(139,'Honda','honda-engine-clutch-starter-bearing'),(140,'Husqvarna','husqvarna-engine-clutch-starter-bearing'),(141,'Kawasaki','kawasaki-engine-clutch-starter-bearing'),(142,'KTM','ktm-engine-clutch-starter-bearing'),(143,'Kymco','kymco-engine-clutch-starter-bearing'),(144,'Polaris','polaris-engine-clutch-starter-bearing'),(145,'Ski doo','ski-doo-engine-clutch-starter-bearing'),(146,'Suzuki','suzuki-engine-clutch-starter-bearing'),(147,'Yamaha','yamaha-engine-clutch-starter-bearing'),(148,'Other','other-engine-clutch-starter-bearing'),(149,'BMW','bmw-engine-oil-filler-plug-fill-cap-screw'),(150,'Ducati','ducati-engine-oil-filler-plug-fill-cap-screw'),(151,'Honda','honda-engine-oil-filler-plug-fill-cap-screw'),(152,'Kawasaki','kawasaki-engine-oil-filler-plug-fill-cap-screw'),(153,'Suzuki','suzuki-engine-oil-filler-plug-fill-cap-screw'),(154,'Yamaha','yamaha-engine-oil-filler-plug-fill-cap-screw'),(155,'Aprilia','aprilia-engine-oil-filter'),(156,'BMW','bmw-engine-oil-filter'),(157,'Honda','honda-engine-oil-filter'),(158,'Hyosung','hyosung-engine-oil-filter'),(159,'Kawasaki','kawasaki-engine-oil-filter'),(160,'Polaris','polaris-engine-oil-filter'),(161,'Suzuki','suzuki-engine-oil-filter'),(162,'Yamaha','yamaha-engine-oil-filter'),(163,'Other','other-engine-oil-filter'),(164,'Arctic Cat','arctic-cat-engine-timing-chain'),(165,'BMW','bmw-engine-timing-chain'),(166,'Honda','honda-engine-timing-chain'),(167,'Husqvarna','husqvarna-engine-timing-chain'),(168,'Kawasaki','kawasaki-engine-timing-chain'),(169,'KTM','ktm-engine-timing-chain'),(170,'Suzuki','suzuki-engine-timing-chain'),(171,'Yamaha','yamaha-engine-timing-chain'),(172,'Other','other-engine-timing-chain'),(173,'Aprilia','aprilia-film-screen-protector'),(174,'BMW','bmw-film-screen-protector'),(175,'Ducati','ducati-film-screen-protector'),(176,'Harley Davidson','harley-davidson-film-screen-protector'),(177,'Honda','honda-film-screen-protector'),(178,'Kawasaki','kawasaki-film-screen-protector'),(179,'KTM','ktm-film-screen-protector'),(180,'Suzuki','suzuki-film-screen-protector'),(181,'Triumph','triumph-film-screen-protector'),(182,'Vespa','vespa-film-screen-protector'),(183,'Yamaha','yamaha-film-screen-protector'),(184,'Other','other-film-screen-protector'),(185,'Aprilia','aprilia-footrest-pedals-pegs'),(186,'BMW','bmw-footrest-pedals-pegs'),(187,'Ducati','ducati-footrest-pedals-pegs'),(188,'Honda','honda-footrest-pedals-pegs'),(189,'Hyosung','hyosung-footrest-pedals-pegs'),(190,'Kawasaki','kawasaki-footrest-pedals-pegs'),(191,'Suzuki','suzuki-footrest-pedals-pegs'),(192,'Triumph','triumph-footrest-pedals-pegs'),(193,'Yamaha','yamaha-footrest-pedals-pegs'),(194,'Harley Davidson','harley-davidson-fuel-cock-faucet-valve-switche-pump'),(195,'Honda','honda-fuel-cock-faucet-valve-switche-pump'),(196,'Hyosung','hyosung-fuel-cock-faucet-valve-switche-pump'),(197,'Kawasaki','kawasaki-fuel-cock-faucet-valve-switche-pump'),(198,'Polaris','polaris-fuel-cock-faucet-valve-switche-pump'),(199,'Suzuki','suzuki-fuel-cock-faucet-valve-switche-pump'),(200,'Yamaha','yamaha-fuel-cock-faucet-valve-switche-pump');
/*!40000 ALTER TABLE `categoria` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `producto`
--

DROP TABLE IF EXISTS `producto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `producto` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `precio` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `escala` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `div1` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `div2` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `producto`
--

LOCK TABLES `producto` WRITE;
/*!40000 ALTER TABLE `producto` DISABLE KEYS */;
INSERT INTO `producto` VALUES (1,'soy una descripcion','soy un precio','soy una categoria','soy un div','soy un div');
/*!40000 ALTER TABLE `producto` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-11-24  4:14:15
