-- MySQL dump 10.16  Distrib 10.1.29-MariaDB, for debian-linux-gnu (x86_64)
--
-- Host: 127.0.0.1    Database: ligaUFC
-- ------------------------------------------------------
-- Server version	10.1.40-MariaDB

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
-- Table structure for table `Lutador`
--

DROP TABLE IF EXISTS `Lutador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Lutador` (
  `idLutador` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `sexo` varchar(2) NOT NULL,
  `categoria` varchar(45) NOT NULL,
  `pais` varchar(35) NOT NULL,
  PRIMARY KEY (`idLutador`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Lutador`
--

LOCK TABLES `Lutador` WRITE;
/*!40000 ALTER TABLE `Lutador` DISABLE KEYS */;
INSERT INTO `Lutador` VALUES (1,'Daniel Cormier','m','Peso pesado','Estados Unidos'),(2,'Stipe Miocic','m','Peso pesado','Estados Unidos'),(3,'Francis Ngannou','m','Peso pesado','Camarões'),(4,'Derrick Lewis','m','Peso pesado','Estados Unidos'),(5,'Júnior dos Santos','m','Peso pesado','Brasil'),(6,'Jon Jones','m','Meio-Pesado','Estados Unidos'),(7,'Anthony Smith','m','Meio-Pesado','Estados Unidos'),(8,'Thiago Santos','m','Meio-Pesado','Brasil'),(9,'Jan Blachowicz','m','Meio-Pesado','Polónia'),(10,'Jan Blachowicz','m','Meio-Pesado','Polónia'),(11,'Jimi Manuwa','m','Médio','Inglaterra'),(12,'Luke Rockhold','m','Médio','Estados Unidos'),(13,'Ronaldo Souza','m','Médio','Brasil'),(14,'Anderson Silva','m','Médio','Brasil'),(15,'Elias Theodorou','m','Médio','Canadá'),(16,'Tony Ferguson','m','Leve','Estados Unidos'),(17,'Khabib Nurmagomedov','m','Leve','Rússia'),(18,'Conor McGregor','m','Leve','Irlanda'),(19,'Edson Barboza','m','Leve','Brasil'),(20,'Charles Oliveira','m','Leve','Brasil'),(21,'Max Holloway','m','Pena','Estados Unidos'),(22,'José Aldo','m','Pena','Brasil'),(23,'Yair Rodriguez','m','Pena','Brasil'),(24,'Chan Sung Jung','m','Pena','Coreia do Sul'),(25,'Zabit Magomedsharipov','m','Pena','Rússia'),(26,'Henry Cejudo','m','Mosca','Estados Unidos'),(27,'Jussier Formiga','m','Mosca','Brasil'),(28,'Ray Borg','m','Mosca','Estados Unidos'),(29,'Deiveson Figueiredo','m','Mosca','Brasil'),(30,'Magomed Bibulatov','m','Mosca','Rússia'),(31,'Holly Holm','f','Pena','Estados Unidos'),(32,'Amanda Nunes','f','Pena','Brasil'),(33,'Germaine De Randaime','f','Pena','Holanda'),(34,'Cris Cyborg','f','Pena','Brasil');
/*!40000 ALTER TABLE `Lutador` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-06-15  9:40:20
