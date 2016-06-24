-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jun 24, 2016 at 02:08 PM
-- Server version: 10.1.13-MariaDB
-- PHP Version: 7.0.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `whms`
--

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `customer_ID` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_persian_ci;

-- --------------------------------------------------------

--
-- Table structure for table `orders`
--

CREATE TABLE `orders` (
  `order_ID` int(10) UNSIGNED NOT NULL,
  `delivery_time` datetime NOT NULL,
  `order_time` datetime NOT NULL,
  `customer_ID` int(10) UNSIGNED NOT NULL,
  `personnel_code` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_persian_ci;

-- --------------------------------------------------------

--
-- Table structure for table `person`
--

CREATE TABLE `person` (
  `person_ID` int(10) UNSIGNED NOT NULL,
  `first_name` varchar(30) COLLATE utf8_persian_ci NOT NULL,
  `surname` varchar(40) CHARACTER SET utf8 NOT NULL,
  `birth_date` date NOT NULL,
  `cell_number` text COLLATE utf8_persian_ci NOT NULL,
  `address` text COLLATE utf8_persian_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_persian_ci;

-- --------------------------------------------------------

--
-- Table structure for table `ware`
--

CREATE TABLE `ware` (
  `ware_ID` int(10) UNSIGNED NOT NULL,
  `warehouse_ID` int(10) UNSIGNED NOT NULL,
  `ware_kind` varchar(40) COLLATE utf8_persian_ci NOT NULL,
  `ware_name` varchar(40) COLLATE utf8_persian_ci NOT NULL,
  `ware_price` int(10) UNSIGNED NOT NULL,
  `ware_size` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_persian_ci;

-- --------------------------------------------------------

--
-- Table structure for table `warehouse`
--

CREATE TABLE `warehouse` (
  `warehouse_ID` int(10) UNSIGNED NOT NULL,
  `name` varchar(45) COLLATE utf8_persian_ci NOT NULL,
  `state` tinyint(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_persian_ci;

-- --------------------------------------------------------

--
-- Table structure for table `warehouse_keeper`
--

CREATE TABLE `warehouse_keeper` (
  `personnel_code` int(10) UNSIGNED NOT NULL,
  `password` text COLLATE utf8_persian_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_persian_ci;

-- --------------------------------------------------------

--
-- Table structure for table `wares_in_order`
--

CREATE TABLE `wares_in_order` (
  `order_ID` int(10) UNSIGNED NOT NULL,
  `ware_ID` int(10) UNSIGNED NOT NULL,
  `num_of_ware` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`customer_ID`);

--
-- Indexes for table `orders`
--
ALTER TABLE `orders`
  ADD PRIMARY KEY (`order_ID`),
  ADD KEY `customer_ID_idx` (`customer_ID`),
  ADD KEY `personnel_code_idx` (`personnel_code`);

--
-- Indexes for table `person`
--
ALTER TABLE `person`
  ADD PRIMARY KEY (`person_ID`);

--
-- Indexes for table `ware`
--
ALTER TABLE `ware`
  ADD PRIMARY KEY (`ware_ID`),
  ADD UNIQUE KEY `ware_ID_UNIQUE` (`ware_ID`),
  ADD KEY `warehouse_ID` (`warehouse_ID`);

--
-- Indexes for table `warehouse`
--
ALTER TABLE `warehouse`
  ADD PRIMARY KEY (`warehouse_ID`);

--
-- Indexes for table `warehouse_keeper`
--
ALTER TABLE `warehouse_keeper`
  ADD PRIMARY KEY (`personnel_code`);

--
-- Indexes for table `wares_in_order`
--
ALTER TABLE `wares_in_order`
  ADD PRIMARY KEY (`order_ID`),
  ADD KEY `ware_ID` (`ware_ID`),
  ADD KEY `num_of_ware` (`num_of_ware`),
  ADD KEY `num_of_ware_2` (`num_of_ware`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
  MODIFY `customer_ID` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `orders`
--
ALTER TABLE `orders`
  MODIFY `order_ID` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `person`
--
ALTER TABLE `person`
  MODIFY `person_ID` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `ware`
--
ALTER TABLE `ware`
  MODIFY `ware_ID` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT for table `warehouse`
--
ALTER TABLE `warehouse`
  MODIFY `warehouse_ID` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
--
-- AUTO_INCREMENT for table `warehouse_keeper`
--
ALTER TABLE `warehouse_keeper`
  MODIFY `personnel_code` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `customer`
--
ALTER TABLE `customer`
  ADD CONSTRAINT `fk_customer_id_person` FOREIGN KEY (`customer_ID`) REFERENCES `person` (`person_ID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `orders`
--
ALTER TABLE `orders`
  ADD CONSTRAINT `customer_ID` FOREIGN KEY (`customer_ID`) REFERENCES `customer` (`customer_ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `personnel_code` FOREIGN KEY (`personnel_code`) REFERENCES `warehouse_keeper` (`personnel_code`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `ware`
--
ALTER TABLE `ware`
  ADD CONSTRAINT `fk_warehouse_ware` FOREIGN KEY (`warehouse_ID`) REFERENCES `warehouse` (`warehouse_ID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `warehouse_keeper`
--
ALTER TABLE `warehouse_keeper`
  ADD CONSTRAINT `fk__keeper_person` FOREIGN KEY (`personnel_code`) REFERENCES `person` (`person_ID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `wares_in_order`
--
ALTER TABLE `wares_in_order`
  ADD CONSTRAINT `fk_order_ID_orders` FOREIGN KEY (`order_ID`) REFERENCES `orders` (`order_ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_ware_ID_ware` FOREIGN KEY (`ware_ID`) REFERENCES `ware` (`ware_ID`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
