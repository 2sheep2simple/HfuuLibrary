/*
SQLyog Ultimate v11.11 (32 bit)
MySQL - 5.5.53 : Database - library
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`library` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `library`;

/*Table structure for table `book` */

DROP TABLE IF EXISTS `book`;

CREATE TABLE `book` (
  `id` int(5) NOT NULL COMMENT '序号',
  `name` varchar(20) DEFAULT NULL COMMENT '书名',
  `author` varchar(20) DEFAULT NULL COMMENT '作者',
  `press` varchar(20) DEFAULT NULL COMMENT '出版社',
  `pressdate` date DEFAULT NULL COMMENT '出版日期',
  `status` varchar(5) DEFAULT NULL COMMENT '在馆状态',
  `address` varchar(50) DEFAULT NULL COMMENT '所在位置',
  `detail` varchar(100) DEFAULT NULL COMMENT '详情',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `book` */

insert  into `book`(`id`,`name`,`author`,`press`,`pressdate`,`status`,`address`,`detail`) values (1,'无法理解虚拟机','周志明','北京大出版社','2019-03-06','在馆','P0A1','很好'),(2,'深入理解虚拟机','黄海明','南京大学出版社','2019-03-11','在馆','P0A2','很好'),(3,'TCP/IP详解','黄春梅','天津大学出版社','2019-03-14','在馆','P0A3','很好'),(0,'HTTP详解','朱丽丽','牛津大学出版社','2019-02-28','在馆','P0A4','很好'),(4,'软件测试','卢建军','广州大学出版社','2019-03-20','在馆','P0A5','很好'),(5,'软件工程学','张飞机','宁波大学出版社','2019-03-14','在馆','P0H7','很好'),(6,'云计算与大数据','霍元甲','中山大学出版社','2019-03-14','在馆','P0J7','很好'),(7,'人工智能与大数据','维也纳','人民大学出版社','2019-03-14','已出馆','P0H5','很好');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(5) NOT NULL,
  `name` varchar(20) NOT NULL,
  `status` int(11) NOT NULL,
  `password` varchar(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`id`,`name`,`status`,`password`) values (1,'hey',0,'hey'),(2,'hadoop',0,'hadoop');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
