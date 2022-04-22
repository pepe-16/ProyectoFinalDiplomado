-- phpMyAdmin SQL Dump
-- version 5.1.3
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 22-04-2022 a las 23:57:10
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `proyectofinal`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `capturapoderes`
--

CREATE TABLE `capturapoderes` (
  `idCapturaPod` int(11) NOT NULL,
  `numControlPod` int(11) NOT NULL,
  `fecExpPod` date NOT NULL,
  `numInstruPod` varchar(50) NOT NULL,
  `numNotarioPod` int(11) NOT NULL,
  `notarioPod` varchar(50) NOT NULL,
  `rutapdfPod` varchar(250) NOT NULL,
  `representantePod` varchar(50) NOT NULL,
  `poderPod` int(10) NOT NULL,
  `caseFilePod` int(10) NOT NULL,
  `entityPod` int(10) NOT NULL,
  `cargoPod` int(10) NOT NULL,
  `statuscapturaPod` bit(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `capturapoderes`
--

INSERT INTO `capturapoderes` (`idCapturaPod`, `numControlPod`, `fecExpPod`, `numInstruPod`, `numNotarioPod`, `notarioPod`, `rutapdfPod`, `representantePod`, `poderPod`, `caseFilePod`, `entityPod`, `cargoPod`, `statuscapturaPod`) VALUES
(1, 15, '2022-04-02', '15DA', 18, 'Jose Luis Yedra Padilla', '/pdf/joseluis', 'Aurora Padilla Flores', 2, 2, 1, 2, b'1'),
(2, 16, '2022-04-13', '16DA', 18, 'Jose Luis Yedra Padilla', '/pdf/joseluis', 'Arturo Padilla Flores', 1, 1, 5, 4, b'1'),
(3, 17, '2022-04-12', '17DA', 18, 'Jose Luis Yedra Padilla', '/pdf/joseluis', 'Jose Luis Padilla Flores', 1, 2, 3, 5, b'1');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `capturaprotos`
--

CREATE TABLE `capturaprotos` (
  `idCapturaPro` int(11) NOT NULL,
  `numControlPro` int(11) NOT NULL,
  `fecExpPro` date NOT NULL,
  `numInstruPro` varchar(50) NOT NULL,
  `numNotarioPro` int(11) NOT NULL,
  `notarioPro` varchar(50) NOT NULL,
  `rutapdfPro` varchar(250) NOT NULL,
  `otorgantePro` varchar(50) NOT NULL,
  `caseFilePro` int(10) DEFAULT NULL,
  `entityPro` int(10) DEFAULT NULL,
  `cargoPro` int(10) DEFAULT NULL,
  `statuscapturaPro` bit(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `capturaprotos`
--

INSERT INTO `capturaprotos` (`idCapturaPro`, `numControlPro`, `fecExpPro`, `numInstruPro`, `numNotarioPro`, `notarioPro`, `rutapdfPro`, `otorgantePro`, `caseFilePro`, `entityPro`, `cargoPro`, `statuscapturaPro`) VALUES
(1, 84, '2022-04-19', 'A145', 12, 'Cesar Andrés Robles Nieva', '/pdf/cesar', 'Ian Ramirez Revilla', 2, 4, 4, b'1'),
(2, 85, '2022-04-19', 'A146', 12, 'Cesar Andrés Robles Nieva', '/pdf/cesar', 'Gerardo Beltrán Medina', 2, 5, 2, b'1'),
(3, 86, '2022-02-22', 'A147', 12, 'Cesar Andrés Robles Nieva', '/pdf/cesar', 'Karen Gutierrez Flores', 1, 3, 2, b'1');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cargo`
--

CREATE TABLE `cargo` (
  `idcargo` int(11) NOT NULL,
  `cargo` varchar(100) DEFAULT NULL,
  `statuscargo` bit(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `cargo`
--

INSERT INTO `cargo` (`idcargo`, `cargo`, `statuscargo`) VALUES
(1, 'RECTOR', b'1'),
(2, 'ABOGADO GENERAL', b'1'),
(3, 'PRESIDENTE DEL PATRONATO UNIVERSITARIO', b'1'),
(4, 'DIRECTOR', b'0'),
(5, 'ABOGADO AUXILIAR', b'0');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `casefile`
--

CREATE TABLE `casefile` (
  `idcaseFile` int(11) NOT NULL,
  `caseFile` varchar(30) NOT NULL,
  `statuscaseFile` bit(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `casefile`
--

INSERT INTO `casefile` (`idcaseFile`, `caseFile`, `statuscaseFile`) VALUES
(1, 'FOTOCOPIA', b'1'),
(2, 'COPIA CERTIFICADA', b'0');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `entidad`
--

CREATE TABLE `entidad` (
  `identity` int(11) NOT NULL,
  `entity` varchar(50) NOT NULL,
  `statusentity` bit(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `entidad`
--

INSERT INTO `entidad` (`identity`, `entity`, `statusentity`) VALUES
(1, 'AGUASCALIENTES', b'1'),
(2, 'BAJA CALIFORNIA', b'1'),
(3, 'BAJA CALIFORNIA SUR', b'1'),
(4, 'CAMPECHE', b'0'),
(5, 'CHIAPAS', b'1');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `poder`
--

CREATE TABLE `poder` (
  `idpoder` int(11) NOT NULL,
  `poder` varchar(100) DEFAULT NULL,
  `statuspoder` bit(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `poder`
--

INSERT INTO `poder` (`idpoder`, `poder`, `statuspoder`) VALUES
(1, 'GENERAL', b'1'),
(2, 'ESPECIFICO', b'1');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `capturapoderes`
--
ALTER TABLE `capturapoderes`
  ADD PRIMARY KEY (`idCapturaPod`),
  ADD KEY `fk_poderPod` (`poderPod`),
  ADD KEY `fk_casefilePod` (`caseFilePod`),
  ADD KEY `fk_entityPod` (`entityPod`),
  ADD KEY `fk_cargoPod` (`cargoPod`);

--
-- Indices de la tabla `capturaprotos`
--
ALTER TABLE `capturaprotos`
  ADD PRIMARY KEY (`idCapturaPro`),
  ADD KEY `fk_casefilePro` (`caseFilePro`),
  ADD KEY `fk_entityPro` (`entityPro`),
  ADD KEY `fk_cargoPro` (`cargoPro`);

--
-- Indices de la tabla `cargo`
--
ALTER TABLE `cargo`
  ADD PRIMARY KEY (`idcargo`);

--
-- Indices de la tabla `casefile`
--
ALTER TABLE `casefile`
  ADD PRIMARY KEY (`idcaseFile`);

--
-- Indices de la tabla `entidad`
--
ALTER TABLE `entidad`
  ADD PRIMARY KEY (`identity`);

--
-- Indices de la tabla `poder`
--
ALTER TABLE `poder`
  ADD PRIMARY KEY (`idpoder`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `capturapoderes`
--
ALTER TABLE `capturapoderes`
  MODIFY `idCapturaPod` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `capturaprotos`
--
ALTER TABLE `capturaprotos`
  MODIFY `idCapturaPro` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `cargo`
--
ALTER TABLE `cargo`
  MODIFY `idcargo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `casefile`
--
ALTER TABLE `casefile`
  MODIFY `idcaseFile` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `entidad`
--
ALTER TABLE `entidad`
  MODIFY `identity` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `poder`
--
ALTER TABLE `poder`
  MODIFY `idpoder` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `capturapoderes`
--
ALTER TABLE `capturapoderes`
  ADD CONSTRAINT `fk_cargoPod` FOREIGN KEY (`cargoPod`) REFERENCES `cargo` (`idcargo`),
  ADD CONSTRAINT `fk_casefilePod` FOREIGN KEY (`caseFilePod`) REFERENCES `casefile` (`idcaseFile`),
  ADD CONSTRAINT `fk_entityPod` FOREIGN KEY (`entityPod`) REFERENCES `entidad` (`identity`),
  ADD CONSTRAINT `fk_poderPod` FOREIGN KEY (`poderPod`) REFERENCES `poder` (`idpoder`);

--
-- Filtros para la tabla `capturaprotos`
--
ALTER TABLE `capturaprotos`
  ADD CONSTRAINT `fk_cargoPro` FOREIGN KEY (`cargoPro`) REFERENCES `cargo` (`idcargo`),
  ADD CONSTRAINT `fk_casefilePro` FOREIGN KEY (`caseFilePro`) REFERENCES `casefile` (`idcaseFile`),
  ADD CONSTRAINT `fk_entityPro` FOREIGN KEY (`entityPro`) REFERENCES `entidad` (`identity`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
