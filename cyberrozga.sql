-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Feb 10, 2019 at 09:41 AM
-- Server version: 10.1.36-MariaDB
-- PHP Version: 7.2.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `cyberrozga`
--

-- --------------------------------------------------------

--
-- Table structure for table `Classes`
--

CREATE TABLE `Classes` (
  `name` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Classes`
--

INSERT INTO `Classes` (`name`) VALUES
('1a'),
('1b');

-- --------------------------------------------------------

--
-- Table structure for table `credentials`
--

CREATE TABLE `credentials` (
  `id` int(11) NOT NULL,
  `email` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  `position` enum('student','teacher','office worker','parent') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `credentials`
--

INSERT INTO `credentials` (`id`, `email`, `password`, `position`) VALUES
(1, 'luctus.et@in.edu', 'sit', 'student'),
(2, 'orci.consectetuer@nonvestibulu', 'adipiscing', 'student'),
(3, 'amet@Fuscealiquam.org', 'Curabitur', 'student'),
(4, 'aliquet.Phasellus@sagittisNull', 'Quisque', 'student'),
(5, 'nec.tellus.Nunc@sapiengravida.', 'mollis', 'student'),
(6, 'in.consequat.enim@sodalespurus', 'ipsum.', 'student'),
(7, 'non@Nullatincidunt.co.uk', 'dui', 'student'),
(8, 'et.netus.et@scelerisqueneque.n', 'Pellentesque', 'student'),
(9, 'in@Nuncacsem.com', 'at', 'student'),
(10, 'sit.amet@velitQuisque.co.uk', 'a', 'student'),
(11, 'Donec.tempus.lorem@loremfringi', 'ac', 'student'),
(12, 'ligula@faucibuslectusa.net', 'metus', 'student'),
(13, 'dapibus.id.blandit@commodoauct', 'parturient', 'student'),
(14, 'pede@nonummy.edu', 'Suspendisse', 'student'),
(15, 'Nulla@orciUtsemper.edu', 'amet', 'student'),
(16, 'pellentesque.Sed.dictum@lobort', 'ante', 'student'),
(17, 'velit@volutpat.org', 'porta', 'student'),
(18, 'neque.tellus@arcuNunc.com', 'felis', 'student'),
(19, 'tincidunt.tempus.risus@sed.org', 'eleifend', 'student'),
(20, 'Integer.vitae.nibh@arcuSed.edu', 'feugiat', 'student'),
(21, 'non.massa.non@orci.edu', 'Sed', 'parent'),
(22, 'Class.aptent@suscipit.com', 'sapien,', 'parent'),
(23, 'dolor.quam@sitamet.com', 'ut,', 'parent'),
(24, 'quis@augueid.ca', 'turpis', 'parent'),
(25, 'penatibus.et.magnis@malesuadav', 'nonummy', 'parent'),
(26, 'neque@Sed.co.uk', 'turpis', 'parent'),
(27, 'eros.turpis.non@vitaerisus.ca', 'volutpat.', 'parent'),
(28, 'Quisque.porttitor@nuncQuisque.', 'non,', 'parent'),
(29, 'enim@amet.ca', 'turpis', 'parent'),
(30, 'non@cursus.ca', 'erat,', 'parent'),
(31, 'nec@rhoncusProinnisl.net', 'sit', 'parent'),
(32, 'erat.neque.non@odiotristiqueph', 'varius.', 'parent'),
(33, 'erat.neque@consectetueripsum.c', 'mollis', 'parent'),
(34, 'et@id.net', 'vehicula', 'parent'),
(35, 'eleifend.non@consequat.ca', 'magna.', 'parent'),
(36, 'laoreet.libero.et@ligula.net', 'egestas.', 'parent'),
(37, 'bibendum.fermentum@ultriciesor', 'malesuada', 'parent'),
(38, 'risus.a@auctorveliteget.ca', 'Nunc', 'parent'),
(39, 'lobortis@consequatlectus.edu', 'eget', 'parent'),
(40, 'non.magna.Nam@fermentummetus.c', 'lobortis', 'parent'),
(41, 'Sed.eu.nibh@faucibusorci.org', 'nisl', 'parent'),
(42, 'est.vitae@Integerid.ca', 'vulputate,', 'parent'),
(43, 'auctor.nunc.nulla@malesuada.or', 'at,', 'parent'),
(44, 'mi@In.org', 'magna.', 'parent'),
(45, 'id@ut.co.uk', 'et', 'parent'),
(46, 'Nullam@ipsum.org', 'ultrices,', 'parent'),
(47, 'scelerisque.sed@mollisDuis.co.', 'nulla.', 'parent'),
(48, 'a.malesuada@accumsanlaoreetips', 'mauris', 'parent'),
(49, 'amet.lorem@risusIn.org', 'feugiat', 'parent'),
(51, 'gdhwiog@hj.com', 'hcdj', 'office worker'),
(52, 'hcdiwhceui@hjk.com', 'fhdk', 'teacher'),
(53, 'dcbgshklvg@ds.com', 'chds', 'teacher'),
(54, 'cgsjkcs@hhh.com', 'cgdbhk', 'teacher');

-- --------------------------------------------------------

--
-- Table structure for table `English`
--

CREATE TABLE `English` (
  `id` int(11) NOT NULL,
  `id_student` int(11) NOT NULL,
  `id_teacher` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `English`
--

INSERT INTO `English` (`id`, `id_student`, `id_teacher`) VALUES
(1, 1, 54),
(2, 2, 54),
(3, 3, 54),
(4, 4, 54),
(5, 5, 54),
(6, 6, 54),
(7, 7, 54),
(8, 8, 54),
(9, 9, 54),
(10, 10, 54),
(11, 11, 54),
(12, 12, 54),
(13, 13, 54),
(14, 14, 54),
(15, 15, 54),
(16, 16, 54),
(17, 17, 54),
(18, 18, 54),
(19, 19, 54),
(20, 20, 54);

-- --------------------------------------------------------

--
-- Table structure for table `grades`
--

CREATE TABLE `grades` (
  `id` int(11) NOT NULL,
  `id_student` int(11) NOT NULL,
  `subject` int(11) NOT NULL,
  `grade` int(11) NOT NULL,
  `weight` enum('spr','krtk','odp','zad') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `grades`
--

INSERT INTO `grades` (`id`, `id_student`, `subject`, `grade`, `weight`) VALUES
(1, 1, 1, 2, 'spr'),
(2, 2, 1, 2, 'spr'),
(3, 3, 1, 2, 'spr'),
(4, 4, 1, 4, 'spr'),
(5, 5, 1, 3, 'spr'),
(6, 6, 1, 5, 'spr'),
(7, 7, 1, 3, 'spr'),
(8, 8, 1, 5, 'spr'),
(9, 9, 1, 2, 'spr'),
(10, 10, 1, 5, 'spr'),
(11, 11, 1, 2, 'spr'),
(12, 12, 1, 5, 'spr'),
(13, 13, 1, 2, 'spr'),
(14, 14, 1, 2, 'spr'),
(15, 15, 1, 2, 'spr'),
(16, 16, 1, 2, 'spr'),
(17, 17, 1, 3, 'spr'),
(18, 18, 1, 3, 'spr'),
(19, 19, 1, 3, 'spr'),
(20, 20, 1, 5, 'spr'),
(21, 1, 1, 3, 'odp'),
(22, 2, 1, 3, 'odp'),
(23, 3, 1, 4, 'odp'),
(24, 4, 1, 4, 'odp'),
(25, 5, 1, 3, 'odp'),
(26, 6, 1, 5, 'odp'),
(27, 7, 1, 3, 'odp'),
(28, 8, 1, 4, 'odp'),
(29, 9, 1, 4, 'odp'),
(30, 10, 1, 4, 'odp'),
(31, 11, 1, 5, 'odp'),
(32, 12, 1, 3, 'odp'),
(33, 13, 1, 4, 'odp'),
(34, 14, 1, 3, 'odp'),
(35, 15, 1, 5, 'odp'),
(36, 16, 1, 4, 'odp'),
(37, 17, 1, 3, 'odp'),
(38, 18, 1, 5, 'odp'),
(39, 19, 1, 3, 'odp'),
(40, 20, 1, 5, 'odp'),
(41, 1, 1, 1, 'krtk'),
(42, 2, 1, 4, 'krtk'),
(43, 3, 1, 4, 'krtk'),
(44, 4, 1, 4, 'krtk'),
(45, 5, 1, 3, 'krtk'),
(46, 6, 1, 3, 'krtk'),
(47, 7, 1, 3, 'krtk'),
(48, 8, 1, 1, 'krtk'),
(49, 9, 1, 3, 'krtk'),
(50, 10, 1, 2, 'krtk'),
(51, 11, 1, 3, 'krtk'),
(52, 12, 1, 2, 'krtk'),
(53, 13, 1, 3, 'krtk'),
(54, 14, 1, 2, 'krtk'),
(55, 15, 1, 2, 'krtk'),
(56, 16, 1, 1, 'krtk'),
(57, 17, 1, 4, 'krtk'),
(58, 18, 1, 2, 'krtk'),
(59, 19, 1, 2, 'krtk'),
(60, 20, 1, 3, 'krtk'),
(61, 1, 2, 4, 'spr'),
(62, 2, 2, 4, 'spr'),
(63, 3, 2, 4, 'spr'),
(64, 4, 2, 3, 'spr'),
(65, 5, 2, 3, 'spr'),
(66, 6, 2, 5, 'spr'),
(67, 7, 2, 3, 'spr'),
(68, 8, 2, 4, 'spr'),
(69, 9, 2, 4, 'spr'),
(70, 10, 2, 5, 'spr'),
(71, 11, 2, 5, 'spr'),
(72, 12, 2, 4, 'spr'),
(73, 13, 2, 3, 'spr'),
(74, 14, 2, 5, 'spr'),
(75, 15, 2, 4, 'spr'),
(76, 16, 2, 4, 'spr'),
(77, 17, 2, 4, 'spr'),
(78, 18, 2, 4, 'spr'),
(79, 19, 2, 5, 'spr'),
(80, 20, 2, 5, 'spr'),
(81, 1, 3, 4, 'spr'),
(82, 2, 3, 3, 'spr'),
(83, 3, 3, 3, 'spr'),
(84, 4, 3, 3, 'spr'),
(85, 5, 3, 3, 'spr'),
(86, 6, 3, 4, 'spr'),
(87, 7, 3, 3, 'spr'),
(88, 8, 3, 4, 'spr'),
(89, 9, 3, 3, 'spr'),
(90, 10, 3, 4, 'spr'),
(91, 11, 3, 3, 'spr'),
(92, 12, 3, 4, 'spr'),
(93, 13, 3, 4, 'spr'),
(94, 14, 3, 4, 'spr'),
(95, 15, 3, 4, 'spr'),
(96, 16, 3, 3, 'spr'),
(97, 17, 3, 3, 'spr'),
(98, 18, 3, 4, 'spr'),
(99, 19, 3, 4, 'spr'),
(100, 20, 3, 3, 'spr'),
(101, 1, 3, 4, 'krtk'),
(102, 2, 3, 4, 'krtk'),
(103, 3, 3, 3, 'krtk'),
(104, 4, 3, 3, 'krtk'),
(105, 5, 3, 4, 'krtk'),
(106, 6, 3, 5, 'krtk'),
(107, 7, 3, 2, 'krtk'),
(108, 8, 3, 5, 'krtk'),
(109, 9, 3, 5, 'krtk'),
(110, 10, 3, 2, 'krtk'),
(111, 11, 3, 4, 'krtk'),
(112, 12, 3, 2, 'krtk'),
(113, 13, 3, 4, 'krtk'),
(114, 14, 3, 5, 'krtk'),
(115, 15, 3, 2, 'krtk'),
(116, 16, 3, 4, 'krtk'),
(117, 17, 3, 4, 'krtk'),
(118, 18, 3, 5, 'krtk'),
(119, 19, 3, 2, 'krtk'),
(120, 20, 3, 3, 'krtk');

-- --------------------------------------------------------

--
-- Table structure for table `IT`
--

CREATE TABLE `IT` (
  `id` int(11) NOT NULL,
  `id_student` int(11) NOT NULL,
  `id_teacher` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `IT`
--

INSERT INTO `IT` (`id`, `id_student`, `id_teacher`) VALUES
(1, 1, 53),
(2, 2, 53),
(3, 3, 53),
(4, 4, 53),
(5, 5, 53),
(6, 6, 53),
(7, 7, 53),
(8, 8, 53),
(9, 9, 53),
(10, 10, 53),
(11, 11, 53),
(12, 12, 53),
(13, 13, 53),
(14, 14, 53),
(15, 15, 53),
(16, 16, 53),
(17, 17, 53),
(18, 18, 53),
(19, 19, 53),
(20, 20, 53);

-- --------------------------------------------------------

--
-- Table structure for table `Mathematics`
--

CREATE TABLE `Mathematics` (
  `id` int(11) NOT NULL,
  `id_student` int(11) NOT NULL,
  `id_teacher` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Mathematics`
--

INSERT INTO `Mathematics` (`id`, `id_student`, `id_teacher`) VALUES
(1, 1, 52),
(2, 2, 52),
(3, 3, 52),
(4, 4, 52),
(5, 5, 52),
(6, 6, 52),
(7, 7, 52),
(8, 8, 52),
(9, 9, 52),
(10, 10, 52),
(11, 11, 52),
(12, 12, 52),
(13, 13, 52),
(14, 14, 52),
(15, 15, 52),
(16, 16, 52),
(17, 17, 52),
(18, 18, 52),
(19, 19, 52),
(20, 20, 52);

-- --------------------------------------------------------

--
-- Table structure for table `parents`
--

CREATE TABLE `parents` (
  `id` int(11) NOT NULL,
  `name` varchar(30) NOT NULL,
  `surname` varchar(30) NOT NULL,
  `kid` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `parents`
--

INSERT INTO `parents` (`id`, `name`, `surname`, `kid`) VALUES
(21, 'Porter', 'Shannon', 1),
(22, 'Kenneth', 'Welch', 1),
(23, 'Malcolm', 'Dickerson', 2),
(24, 'Keaton', 'Chandler', 2),
(25, 'Brady', 'Moses', 3),
(26, 'Nissim', 'Small', 3),
(27, 'David', 'Garrison', 4),
(28, 'Len', 'Charles', 4),
(29, 'Ulysses', 'Mccall', 5),
(30, 'Damon', 'Blackburn', 5),
(31, 'Herman', 'Hudson', 6),
(32, 'Howard', 'Hanson', 6),
(33, 'Blaze', 'Callahan', 7),
(34, 'Murphy', 'Wright', 7),
(35, 'Prescott', 'Conner', 8),
(36, 'Christian', 'Bowers', 8),
(37, 'Vernon', 'Ingram', 9),
(38, 'Aidan', 'Acevedo', 9),
(39, 'Kibo', 'Stephenson', 10),
(40, 'Cullen', 'Molina', 10),
(41, 'Stewart', 'Lynn', 11),
(42, 'Rooney', 'Rocha', 11),
(43, 'Garth', 'Shaffer', 12),
(44, 'Hop', 'Bailey', 12),
(45, 'Arthur', 'Price', 13),
(46, 'Valentine', 'Underwood', 13),
(47, 'Gareth', 'Bowman', 14),
(48, 'Sean', 'Salinas', 14),
(49, 'Beck', 'Barrett', 15),
(54, 'Allen', 'Henry', 15),
(25, 'Brady', 'Moses', 16),
(26, 'Nissim', 'Small', 16),
(33, 'Blaze', 'Callahan', 17),
(34, 'Murphy', 'Wright', 17),
(21, 'Porter', 'Shannon', 18),
(22, 'Kenneth', 'Welch', 18),
(21, 'Porter', 'Shannon', 19),
(22, 'Kenneth', 'Welch', 19),
(43, 'Garth', 'Shaffer', 20),
(44, 'Hop', 'Bailey', 20);

-- --------------------------------------------------------

--
-- Table structure for table `students`
--

CREATE TABLE `students` (
  `id` int(11) NOT NULL,
  `name` varchar(30) NOT NULL,
  `surname` varchar(30) NOT NULL,
  `parent1` int(11) NOT NULL,
  `parent2` int(11) NOT NULL,
  `class` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `students`
--

INSERT INTO `students` (`id`, `name`, `surname`, `parent1`, `parent2`, `class`) VALUES
(1, 'Lyle', 'Parks', 21, 22, '1a'),
(2, 'Eaton', 'Bonner', 23, 24, '1a'),
(3, 'Caesar', 'Hart', 25, 26, '1a'),
(4, 'Vaughan', 'Frederick', 27, 28, '1a'),
(5, 'Len', 'Clay', 29, 30, '1a'),
(6, 'Elijah', 'Combs', 31, 32, '1a'),
(7, 'Jared', 'Rice', 33, 34, '1a'),
(8, 'Slade', 'Mclean', 35, 36, '1a'),
(9, 'Giacomo', 'Ellison', 37, 38, '1a'),
(10, 'Zahir', 'Sherman', 39, 40, '1a'),
(11, 'Orlando', 'Page', 41, 42, '1b'),
(12, 'Drew', 'Flynn', 43, 44, '1b'),
(13, 'Steel', 'Gilbert', 45, 46, '1b'),
(14, 'Aristotle', 'Oconnor', 47, 48, '1b'),
(15, 'Rashad', 'Hodge', 49, 54, '1b'),
(16, 'Dieter', 'Mcbride', 25, 26, '1b'),
(17, 'Berk', 'Middleton', 33, 34, '1b'),
(18, 'Nathan', 'Camacho', 21, 22, '1b'),
(19, 'Graiden', 'Sweeney', 21, 22, '1b'),
(20, 'Lucius', 'Moon', 43, 44, '1b');

-- --------------------------------------------------------

--
-- Table structure for table `subjects`
--

CREATE TABLE `subjects` (
  `id` int(11) NOT NULL,
  `name` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `subjects`
--

INSERT INTO `subjects` (`id`, `name`) VALUES
(1, 'Matematyka'),
(2, 'Informatyka'),
(3, 'Angielski');

-- --------------------------------------------------------

--
-- Table structure for table `teacher`
--

CREATE TABLE `teacher` (
  `id` int(11) NOT NULL,
  `name` varchar(30) NOT NULL,
  `surname` varchar(30) NOT NULL,
  `subject` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `teacher`
--

INSERT INTO `teacher` (`id`, `name`, `surname`, `subject`) VALUES
(52, 'Lucian', 'Thompson', 1),
(53, 'Kuame', 'Collins', 2),
(54, 'Allen', 'Henry', 3);

-- --------------------------------------------------------

--
-- Table structure for table `TeacherToClass`
--

CREATE TABLE `TeacherToClass` (
  `teacherid` int(11) NOT NULL,
  `class` varchar(30) NOT NULL,
  `subjectid` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `TeacherToClass`
--

INSERT INTO `TeacherToClass` (`teacherid`, `class`, `subjectid`) VALUES
(52, '1a', 1),
(52, '1b', 1),
(53, '1a', 2),
(53, '1b', 2),
(54, '1a', 3),
(54, '1b', 3);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Classes`
--
ALTER TABLE `Classes`
  ADD PRIMARY KEY (`name`);

--
-- Indexes for table `credentials`
--
ALTER TABLE `credentials`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `English`
--
ALTER TABLE `English`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id_student` (`id_student`,`id_teacher`),
  ADD KEY `id_teacher` (`id_teacher`);

--
-- Indexes for table `grades`
--
ALTER TABLE `grades`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_student` (`id_student`),
  ADD KEY `subject` (`subject`);

--
-- Indexes for table `IT`
--
ALTER TABLE `IT`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id_student` (`id_student`,`id_teacher`),
  ADD KEY `id_teacher` (`id_teacher`);

--
-- Indexes for table `Mathematics`
--
ALTER TABLE `Mathematics`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id_student` (`id_student`,`id_teacher`),
  ADD KEY `id_teacher` (`id_teacher`);

--
-- Indexes for table `parents`
--
ALTER TABLE `parents`
  ADD KEY `id` (`id`),
  ADD KEY `kid` (`kid`);

--
-- Indexes for table `students`
--
ALTER TABLE `students`
  ADD PRIMARY KEY (`id`),
  ADD KEY `parent1` (`parent1`),
  ADD KEY `parent2` (`parent2`),
  ADD KEY `classes_fk_4` (`class`);

--
-- Indexes for table `subjects`
--
ALTER TABLE `subjects`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `teacher`
--
ALTER TABLE `teacher`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `subject` (`subject`);

--
-- Indexes for table `TeacherToClass`
--
ALTER TABLE `TeacherToClass`
  ADD KEY `teacherid` (`teacherid`),
  ADD KEY `class` (`class`),
  ADD KEY `subjectid` (`subjectid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `credentials`
--
ALTER TABLE `credentials`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=55;

--
-- AUTO_INCREMENT for table `English`
--
ALTER TABLE `English`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT for table `grades`
--
ALTER TABLE `grades`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=121;

--
-- AUTO_INCREMENT for table `IT`
--
ALTER TABLE `IT`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT for table `Mathematics`
--
ALTER TABLE `Mathematics`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT for table `parents`
--
ALTER TABLE `parents`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=55;

--
-- AUTO_INCREMENT for table `students`
--
ALTER TABLE `students`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT for table `subjects`
--
ALTER TABLE `subjects`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `teacher`
--
ALTER TABLE `teacher`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=55;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `English`
--
ALTER TABLE `English`
  ADD CONSTRAINT `English_ibfk_1` FOREIGN KEY (`id_student`) REFERENCES `students` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `English_ibfk_2` FOREIGN KEY (`id_teacher`) REFERENCES `teacher` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `grades`
--
ALTER TABLE `grades`
  ADD CONSTRAINT `grades_ibfk_1` FOREIGN KEY (`id_student`) REFERENCES `students` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `grades_ibfk_2` FOREIGN KEY (`subject`) REFERENCES `subjects` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `IT`
--
ALTER TABLE `IT`
  ADD CONSTRAINT `IT_ibfk_1` FOREIGN KEY (`id_student`) REFERENCES `students` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `IT_ibfk_2` FOREIGN KEY (`id_teacher`) REFERENCES `teacher` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `Mathematics`
--
ALTER TABLE `Mathematics`
  ADD CONSTRAINT `Mathematics_ibfk_1` FOREIGN KEY (`id_student`) REFERENCES `students` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `Mathematics_ibfk_2` FOREIGN KEY (`id_teacher`) REFERENCES `teacher` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `parents`
--
ALTER TABLE `parents`
  ADD CONSTRAINT `parents_ibfk_1` FOREIGN KEY (`id`) REFERENCES `credentials` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `parents_ibfk_2` FOREIGN KEY (`kid`) REFERENCES `students` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `students`
--
ALTER TABLE `students`
  ADD CONSTRAINT `classes_fk_4` FOREIGN KEY (`class`) REFERENCES `Classes` (`name`),
  ADD CONSTRAINT `students_ibfk_1` FOREIGN KEY (`parent1`) REFERENCES `parents` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `students_ibfk_2` FOREIGN KEY (`parent2`) REFERENCES `parents` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `students_ibfk_3` FOREIGN KEY (`id`) REFERENCES `credentials` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `teacher`
--
ALTER TABLE `teacher`
  ADD CONSTRAINT `teacher_ibfk_1` FOREIGN KEY (`subject`) REFERENCES `subjects` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `teacher_ibfk_2` FOREIGN KEY (`id`) REFERENCES `credentials` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `TeacherToClass`
--
ALTER TABLE `TeacherToClass`
  ADD CONSTRAINT `TeacherToClass_ibfk_1` FOREIGN KEY (`teacherid`) REFERENCES `teacher` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `TeacherToClass_ibfk_2` FOREIGN KEY (`class`) REFERENCES `Classes` (`name`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `TeacherToClass_ibfk_3` FOREIGN KEY (`subjectid`) REFERENCES `subjects` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
