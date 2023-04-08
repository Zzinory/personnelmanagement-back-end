/*
Navicat MySQL Data Transfer

Source Server         : root
Source Server Version : 50726
Source Host           : localhost:3306
Source Database       : personnelmanagement

Target Server Type    : MYSQL
Target Server Version : 50726
File Encoding         : 65001

Date: 2023-04-08 17:22:51
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for affair
-- ----------------------------
DROP TABLE IF EXISTS `affair`;
CREATE TABLE `affair` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `affair_id` int(11) DEFAULT NULL,
  `affair_name` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `affair_Drafter` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `drafter_id` int(11) DEFAULT NULL,
  `affair_content` text COLLATE utf8_bin,
  `affair_state` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of affair
-- ----------------------------
INSERT INTO `affair` VALUES ('1', '1', 'test', '叶初航', '2', 0x313233313233313233313233323133323133313331323332313331333231333133323133, '1');
INSERT INTO `affair` VALUES ('2', '2', 'test2', '罗瑞劼', '3', 0x3164736667616765726777716577716577717277717271777277713132333132333132, null);

-- ----------------------------
-- Table structure for attendance
-- ----------------------------
DROP TABLE IF EXISTS `attendance`;
CREATE TABLE `attendance` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `attendance_id` int(11) DEFAULT NULL,
  `attendance_time` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `exit_time` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `user_name` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=71 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of attendance
-- ----------------------------
INSERT INTO `attendance` VALUES ('67', '5', '1', '2023/4/8 13:29:31', null, 'cby');
INSERT INTO `attendance` VALUES ('68', '5', '2', '2023/4/8 13:30:44', null, 'cby');
INSERT INTO `attendance` VALUES ('69', '5', '3', '2023/4/8 13:30:49', null, 'cby');
INSERT INTO `attendance` VALUES ('70', '5', '4', null, '2023/4/8 13:30:59', 'cby');

-- ----------------------------
-- Table structure for file
-- ----------------------------
DROP TABLE IF EXISTS `file`;
CREATE TABLE `file` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `file_id` int(11) DEFAULT NULL,
  `file_path` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `file_name` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `file_upload_time` datetime DEFAULT NULL,
  `file_upload_user_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of file
-- ----------------------------

-- ----------------------------
-- Table structure for leavee
-- ----------------------------
DROP TABLE IF EXISTS `leavee`;
CREATE TABLE `leavee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `leave_id` int(11) DEFAULT NULL,
  `leave_state` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `applicant_name` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `censor_name` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `censor_id` int(11) DEFAULT NULL,
  `start_time` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `end_time` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `leave_reason` varchar(5000) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=17 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of leavee
-- ----------------------------
INSERT INTO `leavee` VALUES ('1', null, '1', '未审批', '罗瑞劼', '', null, '2023-03-15 ', '2023-03-16 ', null);
INSERT INTO `leavee` VALUES ('2', null, '1', '已通过', '张超', '叶初航', '2', '2023-03-15 ', '2023-03-31 ', null);
INSERT INTO `leavee` VALUES ('3', null, '1', '已退回', '张超2', '叶初航', '2', '2023-03-25 ', '2023-03-31 ', null);
INSERT INTO `leavee` VALUES ('4', null, null, '待审批', '叶', null, null, '2023-02-27 ', '2023-03-08 ', null);
INSERT INTO `leavee` VALUES ('5', null, null, '待审批', '叶', null, null, null, null, null);
INSERT INTO `leavee` VALUES ('6', null, null, '待审批', '叶', null, null, '2023-03-06 ', '2023-03-22 ', null);
INSERT INTO `leavee` VALUES ('7', '5', null, '待审批', 'cby', null, null, null, null, null);
INSERT INTO `leavee` VALUES ('8', '5', null, '待审批', 'cby', null, null, null, null, null);
INSERT INTO `leavee` VALUES ('9', '5', null, '待审批', 'cby', null, null, null, null, null);
INSERT INTO `leavee` VALUES ('10', '5', null, '待审批', 'cby', null, null, null, null, null);
INSERT INTO `leavee` VALUES ('11', '5', null, '待审批', 'cby', null, null, '2023-04-15', '2023-04-16', null);
INSERT INTO `leavee` VALUES ('12', '5', null, '待审批', 'cby', null, null, '2023-04-15', '2023-04-16', 'sisjaiosdjfioasjdhohioj');
INSERT INTO `leavee` VALUES ('13', '5', null, '待审批', 'cby', null, null, '2023-04-15', '2023-04-16', 'sisjaiosdjfioasjdhohioj');
INSERT INTO `leavee` VALUES ('14', '5', null, '待审批', 'cby', null, null, '2023-04-15', '2023-05-10', null);
INSERT INTO `leavee` VALUES ('15', '5', null, '待审批', 'cby', null, null, '2023-04-14', '2023-05-15', '奥术大师多');
INSERT INTO `leavee` VALUES ('16', '5', null, '待审批', 'cby', null, null, null, null, '阿达水电费阿斯蒂芬啥地方阿斯蒂芬阿斯蒂芬啥地方阿斯蒂芬阿萨德发斯蒂芬阿斯蒂芬阿斯蒂芬阿斯蒂芬');

-- ----------------------------
-- Table structure for overtime
-- ----------------------------
DROP TABLE IF EXISTS `overtime`;
CREATE TABLE `overtime` (
  `id` int(11) NOT NULL,
  `overtime_time` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `overtime_reason` varchar(5000) COLLATE utf8_bin DEFAULT NULL,
  `censor_name` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `censor_state` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `overtime_subsidy` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `censor_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of overtime
-- ----------------------------

-- ----------------------------
-- Table structure for salary
-- ----------------------------
DROP TABLE IF EXISTS `salary`;
CREATE TABLE `salary` (
  `id` int(11) NOT NULL,
  `user_id` int(11) DEFAULT NULL,
  `pay_time` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `base_salary` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `overtime_salary` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `start_time` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `gross_salary` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `pay_person` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `deduct_salary` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `end_time` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of salary
-- ----------------------------
INSERT INTO `salary` VALUES ('1', '5', '2023/4/15', '5000', '3000', '2023/3/15', '7750', '4', '150', '2023/4/15');
INSERT INTO `salary` VALUES ('2', '6', '2023/4/15', '4000', '2000', '2023/3/15', '5700', '4', '300', '2023/4/15');
INSERT INTO `salary` VALUES ('3', '5', '2023/3/15', '5000', '1500', '2023/2/15', '6400', '4', '100', '2023/3/15');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_account` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `user_name` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `password` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `role` int(11) DEFAULT NULL,
  `position` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `entry_date` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `quit_date` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `birthday` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `hobby` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `img_url` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=14 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('4', 'wangjiale11', '王佳乐', '123456', '1', null, '2023-03-25', null, '2000-1-1', '打球', null);
INSERT INTO `user` VALUES ('5', '1', 'cby', '123', '2', null, '2023-03-15', null, '2000-1-1', '踢球', null);
INSERT INTO `user` VALUES ('6', 'yechuhang33', '罗瑞劼', '123456', '2', null, '2023-03-17', null, '2000-1-1', '羽毛球', null);
INSERT INTO `user` VALUES ('7', 'yechuhangaf', '叶初航', '123456', '2', null, '2023-03-15', null, '2000-1-1', null, null);
INSERT INTO `user` VALUES ('8', 'yechuhangd1', '叶初航', '123456', '2', null, '2023-03-02', null, '2000-1-1', null, null);
INSERT INTO `user` VALUES ('9', 'yechuhangbc', '叶初航', '123456', '2', null, '2023-03-16', null, '2000-1-1', null, null);
INSERT INTO `user` VALUES ('10', 'yechuhang0c', '叶初航', '123456', '2', null, '2023-03-22', null, '2000-1-1', null, null);
INSERT INTO `user` VALUES ('11', 'yechuhange5', '叶初航', '123456', '2', null, '2023-03-23', null, '2000-1-1', null, null);
INSERT INTO `user` VALUES ('12', 'yechuhang62', '叶初航', '123456', '2', null, '2023-03-14', null, '2000-1-1', null, null);
INSERT INTO `user` VALUES ('13', 'yechuhang11', '叶初航', '123456', '2', null, '2023-03-26', null, '2000-1-1', null, null);
