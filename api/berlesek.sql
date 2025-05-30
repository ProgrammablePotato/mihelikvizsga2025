-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Gép: 127.0.0.1
-- Létrehozás ideje: 2025. Máj 30. 16:41
-- Kiszolgáló verziója: 10.4.32-MariaDB
-- PHP verzió: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Adatbázis: `chefsdb`
--

-- --------------------------------------------------------

--
-- Tábla szerkezet ehhez a táblához `berlesek`
--

CREATE TABLE `berlesek` (
  `id` int(11) NOT NULL,
  `uid` int(11) DEFAULT NULL,
  `chefId` int(11) DEFAULT NULL,
  `startDate` datetime DEFAULT NULL,
  `endDate` datetime DEFAULT NULL,
  `dailyRate` int(11) DEFAULT NULL,
  `baseFee` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- A tábla adatainak kiíratása `berlesek`
--

INSERT INTO `berlesek` (`id`, `uid`, `chefId`, `startDate`, `endDate`, `dailyRate`, `baseFee`) VALUES
(1, 1000, 100, '2022-02-02 00:00:00', '2022-02-05 00:00:00', 900, 900);

--
-- Indexek a kiírt táblákhoz
--

--
-- A tábla indexei `berlesek`
--
ALTER TABLE `berlesek`
  ADD PRIMARY KEY (`id`);

--
-- A kiírt táblák AUTO_INCREMENT értéke
--

--
-- AUTO_INCREMENT a táblához `berlesek`
--
ALTER TABLE `berlesek`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
