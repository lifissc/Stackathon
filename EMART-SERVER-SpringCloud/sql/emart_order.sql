/*
SQLyog Ultimate v11.24 (32 bit)
MySQL - 5.7.13 : Database - emart_order
*********************************************************************
*/


/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`emart_order` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `emart_order`;

/*Table structure for table `tb_order_info` */

DROP TABLE IF EXISTS `tb_order_info`;

CREATE TABLE `tb_order_info` (
  `order_id` varchar(32) NOT NULL,
  `item_id` varchar(11) NOT NULL,
  `buyer_id` varchar(11) NOT NULL,
  `seller_id` varchar(11) NOT NULL,
  `item_name` varchar(20) NOT NULL,
  `thumb` varchar(30) DEFAULT NULL,
  `transaction_id` varchar(16) DEFAULT NULL,
  `number_items` int(10) NOT NULL,
  `account_id` varchar(32) DEFAULT NULL,
  `price` int(10) DEFAULT NULL,
  `create_by` varchar(32) DEFAULT NULL,
  `create_date` datetime DEFAULT CURRENT_TIMESTAMP,
  `remark` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tb_order_info` */

LOCK TABLES `tb_order_info` WRITE;

UNLOCK TABLES;


/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
