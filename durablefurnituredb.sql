/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 100408
 Source Host           : localhost:3306
 Source Schema         : durablefurnituredb

 Target Server Type    : MySQL
 Target Server Version : 100408
 File Encoding         : 65001

 Date: 08/12/2020 20:01:14
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for bill
-- ----------------------------
DROP TABLE IF EXISTS `bill`;
CREATE TABLE `bill`  (
  `BillId` int(11) NOT NULL AUTO_INCREMENT,
  `ClientName` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `Address` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `Date` datetime(0) NOT NULL,
  `PhoneNumber` char(0) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `Email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `StaffId` int(11) NOT NULL,
  `TotalPrice` double(10, 2) NOT NULL,
  PRIMARY KEY (`BillId`) USING BTREE,
  INDEX `StaffId`(`StaffId`) USING BTREE,
  CONSTRAINT `bill_ibfk_1` FOREIGN KEY (`StaffId`) REFERENCES `staff` (`StaffId`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for brand
-- ----------------------------
DROP TABLE IF EXISTS `brand`;
CREATE TABLE `brand`  (
  `BrandId` int(11) NOT NULL AUTO_INCREMENT,
  `BrandName` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `Image` varbinary(255) NULL DEFAULT NULL,
  PRIMARY KEY (`BrandId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of brand
-- ----------------------------
INSERT INTO `brand` VALUES (1, 'Test', NULL);

-- ----------------------------
-- Table structure for cart
-- ----------------------------
DROP TABLE IF EXISTS `cart`;
CREATE TABLE `cart`  (
  `BillId` int(11) NOT NULL,
  `ProductId` int(11) NOT NULL,
  `Quantity` int(255) NULL DEFAULT NULL,
  `TotalPrice` double(10, 2) NULL DEFAULT NULL,
  PRIMARY KEY (`BillId`, `ProductId`) USING BTREE,
  INDEX `ProductId`(`ProductId`) USING BTREE,
  CONSTRAINT `cart_ibfk_1` FOREIGN KEY (`BillId`) REFERENCES `bill` (`BillId`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `cart_ibfk_2` FOREIGN KEY (`ProductId`) REFERENCES `product` (`ProductId`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for category
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category`  (
  `CategoryId` int(11) NOT NULL AUTO_INCREMENT,
  `CategoryName` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `Image` varbinary(255) NULL DEFAULT NULL,
  PRIMARY KEY (`CategoryId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of category
-- ----------------------------
INSERT INTO `category` VALUES (1, 'Test', NULL);

-- ----------------------------
-- Table structure for color
-- ----------------------------
DROP TABLE IF EXISTS `color`;
CREATE TABLE `color`  (
  `ColorId` int(11) NOT NULL AUTO_INCREMENT,
  `ColorName` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`ColorId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of color
-- ----------------------------
INSERT INTO `color` VALUES (1, 'Test');

-- ----------------------------
-- Table structure for material
-- ----------------------------
DROP TABLE IF EXISTS `material`;
CREATE TABLE `material`  (
  `MaterialId` int(11) NOT NULL AUTO_INCREMENT,
  `MaterialName` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`MaterialId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of material
-- ----------------------------
INSERT INTO `material` VALUES (1, 'Test');

-- ----------------------------
-- Table structure for member
-- ----------------------------
DROP TABLE IF EXISTS `member`;
CREATE TABLE `member`  (
  `MemberId` int(11) NOT NULL AUTO_INCREMENT,
  `FullName` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `Address` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `PhoneNumber` int(11) NOT NULL,
  `Email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `Level` tinyint(255) NULL DEFAULT NULL,
  PRIMARY KEY (`MemberId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for product
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product`  (
  `ProductId` int(11) NOT NULL AUTO_INCREMENT,
  `ProductName` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `BrandId` int(11) NULL DEFAULT NULL,
  `CategoryId` int(11) NULL DEFAULT NULL,
  `UnitPrice` double(10, 2) NULL DEFAULT NULL,
  `UnitInStock` smallint(6) NULL DEFAULT NULL,
  `Status` tinyint(4) NULL DEFAULT NULL,
  `Description` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL,
  PRIMARY KEY (`ProductId`) USING BTREE,
  INDEX `CategoryId`(`CategoryId`) USING BTREE,
  INDEX `BrandId`(`BrandId`) USING BTREE,
  CONSTRAINT `product_ibfk_2` FOREIGN KEY (`BrandId`) REFERENCES `brand` (`BrandId`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `product_ibfk_3` FOREIGN KEY (`CategoryId`) REFERENCES `category` (`CategoryId`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of product
-- ----------------------------
INSERT INTO `product` VALUES (1, 'SanPhamTest', 1, 1, 100.00, 10, 1, 'OK');

-- ----------------------------
-- Table structure for productcolor
-- ----------------------------
DROP TABLE IF EXISTS `productcolor`;
CREATE TABLE `productcolor`  (
  `ProductId` int(11) NOT NULL,
  `ColorId` int(11) NOT NULL,
  `UnitInStock` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`ProductId`, `ColorId`) USING BTREE,
  INDEX `ProductId`(`ProductId`) USING BTREE,
  INDEX `ColorId`(`ColorId`) USING BTREE,
  CONSTRAINT `productcolor_ibfk_1` FOREIGN KEY (`ColorId`) REFERENCES `color` (`ColorId`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `productcolor_ibfk_2` FOREIGN KEY (`ProductId`) REFERENCES `product` (`ProductId`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of productcolor
-- ----------------------------
INSERT INTO `productcolor` VALUES (1, 1, '4');

-- ----------------------------
-- Table structure for productimage
-- ----------------------------
DROP TABLE IF EXISTS `productimage`;
CREATE TABLE `productimage`  (
  `ProductId` int(11) NOT NULL AUTO_INCREMENT,
  `Img` varbinary(255) NULL DEFAULT NULL,
  PRIMARY KEY (`ProductId`) USING BTREE,
  CONSTRAINT `productimage_ibfk_1` FOREIGN KEY (`ProductId`) REFERENCES `product` (`ProductId`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for productmaterial
-- ----------------------------
DROP TABLE IF EXISTS `productmaterial`;
CREATE TABLE `productmaterial`  (
  `ProductId` int(11) NOT NULL,
  `MaterialId` int(11) NOT NULL,
  `UnitInStock` varchar(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`ProductId`, `MaterialId`) USING BTREE,
  INDEX `MaterialId`(`MaterialId`) USING BTREE,
  CONSTRAINT `productmaterial_ibfk_1` FOREIGN KEY (`ProductId`) REFERENCES `product` (`ProductId`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `productmaterial_ibfk_2` FOREIGN KEY (`MaterialId`) REFERENCES `material` (`MaterialId`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of productmaterial
-- ----------------------------
INSERT INTO `productmaterial` VALUES (1, 1, '4');

-- ----------------------------
-- Table structure for productsize
-- ----------------------------
DROP TABLE IF EXISTS `productsize`;
CREATE TABLE `productsize`  (
  `ProductId` int(11) NOT NULL,
  `SizeId` int(11) NOT NULL,
  `UnitInstock` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`ProductId`, `SizeId`) USING BTREE,
  INDEX `SizeId`(`SizeId`) USING BTREE,
  CONSTRAINT `productsize_ibfk_1` FOREIGN KEY (`ProductId`) REFERENCES `product` (`ProductId`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `productsize_ibfk_2` FOREIGN KEY (`SizeId`) REFERENCES `size` (`SizeId`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of productsize
-- ----------------------------
INSERT INTO `productsize` VALUES (1, 1, 4);

-- ----------------------------
-- Table structure for size
-- ----------------------------
DROP TABLE IF EXISTS `size`;
CREATE TABLE `size`  (
  `SizeId` int(11) NOT NULL AUTO_INCREMENT,
  `SizeName` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`SizeId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of size
-- ----------------------------
INSERT INTO `size` VALUES (1, 'Test');

-- ----------------------------
-- Table structure for staff
-- ----------------------------
DROP TABLE IF EXISTS `staff`;
CREATE TABLE `staff`  (
  `StaffId` int(11) NOT NULL AUTO_INCREMENT,
  `FullName` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `BirthYear` int(11) NULL DEFAULT NULL,
  `Address` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `PhoneNumber` int(11) NOT NULL,
  `Email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `Level` tinyint(255) NOT NULL,
  `Username` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `Password` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`StaffId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
