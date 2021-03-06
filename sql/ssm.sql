/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 80013
 Source Host           : localhost:3306
 Source Schema         : ssm

 Target Server Type    : MySQL
 Target Server Version : 80013
 File Encoding         : 65001

 Date: 23/02/2022 17:00:17
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for appointment
-- ----------------------------
DROP TABLE IF EXISTS `appointment`;
CREATE TABLE `appointment`  (
  `book_id` bigint(20) NOT NULL COMMENT '图书ID',
  `student_id` bigint(20) NOT NULL COMMENT '学号',
  `appoint_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '预约时间',
  PRIMARY KEY (`book_id`, `student_id`) USING BTREE,
  INDEX `idx_appoint_time`(`appoint_time`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '预约图书表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book`  (
  `book_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '图书ID',
  `name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '图书名称',
  `number` int(11) NOT NULL COMMENT '馆藏数量',
  PRIMARY KEY (`book_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1004 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '图书表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book` VALUES (1000, 'Java程序设计', 10);
INSERT INTO `book` VALUES (1001, '数据结构', 10);
INSERT INTO `book` VALUES (1002, '设计模式', 10);
INSERT INTO `book` VALUES (1003, '编译原理', 10);

SET FOREIGN_KEY_CHECKS = 1;
