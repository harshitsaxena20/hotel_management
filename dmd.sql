-- phpMyAdmin SQL Dump
-- version 3.4.5
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jul 24, 2018 at 04:06 PM
-- Server version: 5.5.16
-- PHP Version: 5.3.8

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `dmd`
--

-- --------------------------------------------------------

--
-- Table structure for table `booking`
--

CREATE TABLE IF NOT EXISTS `booking` (
  `customerid` int(11) NOT NULL DEFAULT '0',
  `name` varchar(30) DEFAULT NULL,
  `roomtype` varchar(10) DEFAULT NULL,
  `adress` varchar(30) DEFAULT NULL,
  `city` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`customerid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `city`
--

CREATE TABLE IF NOT EXISTS `city` (
  `city` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `city`
--

INSERT INTO `city` (`city`) VALUES
('Mumbai'),
('Delhi'),
('Chennai'),
('Noida'),
('Gaziabad'),
('Moradabad'),
('Bareilly'),
('Pune'),
('Kochi'),
('Patna'),
('Lucknow'),
('Kanpur'),
('Chandausi'),
('Nainital'),
('Haridwar'),
('Gangtok'),
('Agra'),
('Haldwani'),
('Chandausi');

-- --------------------------------------------------------

--
-- Table structure for table `discount`
--

CREATE TABLE IF NOT EXISTS `discount` (
  `discount_given` double DEFAULT NULL,
  `customerid` int(11) NOT NULL,
  `amount` double DEFAULT NULL,
  PRIMARY KEY (`customerid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `discount`
--

INSERT INTO `discount` (`discount_given`, `customerid`, `amount`) VALUES
(400, 1, 3700),
(350, 12, 6400),
(600, 13, 6900);

-- --------------------------------------------------------

--
-- Table structure for table `electricitybill`
--

CREATE TABLE IF NOT EXISTS `electricitybill` (
  `amountpaid` double DEFAULT NULL,
  `dateofbill` date DEFAULT NULL,
  `billno` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`billno`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `electricitybill`
--

INSERT INTO `electricitybill` (`amountpaid`, `dateofbill`, `billno`) VALUES
(12000, '2018-04-24', 1);

-- --------------------------------------------------------

--
-- Table structure for table `guest`
--

CREATE TABLE IF NOT EXISTS `guest` (
  `customerid` int(11) NOT NULL,
  `name` varchar(30) DEFAULT NULL,
  `roomtype` varchar(20) DEFAULT NULL,
  `city` varchar(20) DEFAULT NULL,
  `phoneno` double DEFAULT NULL,
  `address` varchar(30) DEFAULT NULL,
  `membership` varchar(20) DEFAULT NULL,
  `amount` double DEFAULT NULL,
  PRIMARY KEY (`customerid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `guestinhotel`
--

CREATE TABLE IF NOT EXISTS `guestinhotel` (
  `no_of_guests` double DEFAULT NULL,
  `adults` int(11) DEFAULT NULL,
  `children` int(11) DEFAULT NULL,
  `roomid` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `investment`
--

CREATE TABLE IF NOT EXISTS `investment` (
  `category` varchar(30) DEFAULT NULL,
  `amount` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE IF NOT EXISTS `login` (
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) NOT NULL,
  `password` varchar(30) DEFAULT NULL,
  `emailid` varchar(35) DEFAULT NULL,
  `name` varchar(30) DEFAULT NULL,
  `admin` varchar(5) DEFAULT NULL,
  PRIMARY KEY (`uid`),
  UNIQUE KEY `username` (`username`),
  UNIQUE KEY `username_2` (`username`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`uid`, `username`, `password`, `emailid`, `name`, `admin`) VALUES
(1, 'admin', '123', 'bansallakshya94128@gmail.com', 'Lakshya Bansal', 'yes'),
(2, 'lakshya', '9999', 'lb@samundra', 'Lakshya Bansal', 'no');

-- --------------------------------------------------------

--
-- Table structure for table `membership`
--

CREATE TABLE IF NOT EXISTS `membership` (
  `guestid` int(11) NOT NULL,
  `membershipid` int(11) DEFAULT NULL,
  `membership` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`guestid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `rooms`
--

CREATE TABLE IF NOT EXISTS `rooms` (
  `roomid` int(11) NOT NULL,
  `roomtype` varchar(20) DEFAULT NULL,
  `roomservice` varchar(20) DEFAULT NULL,
  `datefrom` date DEFAULT NULL,
  `dateto` date DEFAULT NULL,
  `customerid` int(11) DEFAULT NULL,
  `available` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`roomid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `rooms`
--

INSERT INTO `rooms` (`roomid`, `roomtype`, `roomservice`, `datefrom`, `dateto`, `customerid`, `available`) VALUES
(1, 'luxury', 'yes', '2018-05-11', '2018-05-12', 1, 'NO');

-- --------------------------------------------------------

--
-- Table structure for table `waterbill`
--

CREATE TABLE IF NOT EXISTS `waterbill` (
  `amountpaid` double DEFAULT NULL,
  `dateofbill` date DEFAULT NULL,
  `billno` int(11) NOT NULL,
  PRIMARY KEY (`billno`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `waterbill`
--

INSERT INTO `waterbill` (`amountpaid`, `dateofbill`, `billno`) VALUES
(5000, '2018-04-24', 1);

-- --------------------------------------------------------

--
-- Table structure for table `wdepartment`
--

CREATE TABLE IF NOT EXISTS `wdepartment` (
  `department` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `wdepartment`
--

INSERT INTO `wdepartment` (`department`) VALUES
('Driver'),
('Cook'),
('Guard');

-- --------------------------------------------------------

--
-- Table structure for table `worker`
--

CREATE TABLE IF NOT EXISTS `worker` (
  `name` varchar(30) DEFAULT NULL,
  `salary` double DEFAULT NULL,
  `department` varchar(20) DEFAULT NULL,
  `residence` varchar(20) DEFAULT NULL,
  `contact` double DEFAULT NULL,
  `workerid` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `worker`
--

INSERT INTO `worker` (`name`, `salary`, `department`, `residence`, `contact`, `workerid`) VALUES
('Manoj Singh', 5000, 'driver', 'Delhi', 98, 1);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
