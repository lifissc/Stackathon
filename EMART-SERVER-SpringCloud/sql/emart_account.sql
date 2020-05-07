/*
SQLyog Ultimate v11.24 (32 bit)
MySQL - 5.7.13 : Database - emart_account
*********************************************************************
*/


/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`emart_account` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `emart_account`;

/*Table structure for table `tb_emart_account` */

DROP TABLE IF EXISTS `tb_emart_account`;

CREATE TABLE `tb_emart_account` (
  `user_id` varchar(32) NOT NULL,
  `user_name` varchar(11) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `password` varchar(16) DEFAULT NULL,
  `role_type` varchar(32) DEFAULT NULL,
  `mobile_number` varchar(11) DEFAULT NULL,
  `company_name` varchar(100) DEFAULT NULL,
  `company_description` varchar(1000) DEFAULT NULL,
  `postal_address` varchar(100) DEFAULT NULL,
  `website` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tb_emart_account` */

LOCK TABLES `tb_emart_account` WRITE;

insert  into `tb_emart_account`(`user_id`,`user_name`,`email`,`password`,`role_type`,`mobile_number`,`company_name`,`company_description`,`postal_address`,`website`) values ('100001','lifissc','test@cn.test.com','123456','0','13912341234','testcompany',NULL,'112321',NULL);

UNLOCK TABLES;



/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
