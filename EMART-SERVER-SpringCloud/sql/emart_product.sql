/*
SQLyog Ultimate v11.24 (32 bit)
MySQL - 5.7.13 : Database - emart_product
*********************************************************************
*/


/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`emart_product` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `emart_product`;

/*Table structure for table `tb_category` */

DROP TABLE IF EXISTS `tb_category`;

CREATE TABLE `tb_category` (
  `category_id` varchar(11) NOT NULL,
  `category_name` varchar(32) NOT NULL,
  `brief_details` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`category_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/* Data for the table `tb_category` */

LOCK TABLES `tb_category` WRITE;

insert  into `tb_category`(`category_id`,`category_name`,`brief_details`) values ('0000001','Electronic',NULL),('0000002','Test2',NULL),('0000003','Test3',NULL),('0000004','Test4',NULL),('0000005','Test5',NULL);

UNLOCK TABLES;



/*Table structure for table `tb_subcategory` */

DROP TABLE IF EXISTS `tb_subcategory`;

CREATE TABLE `tb_subcategory` (
  `subcategory_id` varchar(11) NOT NULL,
  `subcategory_name` varchar(32) NOT NULL,
  `brief_details` varchar(100) DEFAULT NULL,
  `category_id` varchar(11) NOT NULL,
  PRIMARY KEY (`subcategory_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/* Data for the table `tb_category` */

LOCK TABLES `tb_subcategory` WRITE;

insert  into `tb_subcategory`(`subcategory_id`,`subcategory_name`,`brief_details`,`category_id`) values ('0000001','Test1',NULL,'0000001'),('0000002','Test2',NULL,'0000001'),('0000003','Test3',NULL,'0000001'),('0000004','Test4',NULL,'0000001'),('0000005','Test5',NULL,'0000001');

UNLOCK TABLES;


/*Table structure for table `tb_product_item` */

DROP TABLE IF EXISTS `tb_product_item`;

CREATE TABLE `tb_product_item` (
  `item_id` varchar(10) NOT NULL,
  `category_id` varchar(11) NOT NULL,
  `subcategory_id` varchar(11) NOT NULL,
  `item_name` varchar(20) NOT NULL,
  `description` varchar(100) DEFAULT NULL,
  `thumb` varchar(100) DEFAULT NULL,
  `price` int(11) NOT NULL,
  `stock_number` int(11) NOT NULL,
  `create_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_by` varchar(32) DEFAULT NULL,
  `update_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `remarks` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`item_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


/*Table structure for table `tb_product_discount` */

DROP TABLE IF EXISTS `tb_product_discount`;

CREATE TABLE `tb_product_discount` (
  `item_id` varchar(10) NOT NULL,
  `discount_code` varchar(11) NOT NULL,
  `start_date` varchar(11) NOT NULL,
  `end_date` varchar(11) NOT NULL,
  `item_name` varchar(20) NOT NULL,
  `description` varchar(100) DEFAULT NULL,
  `thumb` varchar(100) DEFAULT NULL,
  `percentage` int(11) NOT NULL,
  `create_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_by` varchar(32) DEFAULT NULL,
  `update_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `remarks` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`item_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `tb_product_cart` */

DROP TABLE IF EXISTS `tb_product_cart`;

CREATE TABLE `tb_product_cart` (
  `user_id` varchar(10) NOT NULL,
  `item_id` varchar(10) NOT NULL,
  `item_name` varchar(20) NOT NULL,
  `thumb` varchar(100) DEFAULT NULL,
  `account` int(11) NOT NULL,
  `create_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_by` varchar(32) DEFAULT NULL,
  `update_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `remarks` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
