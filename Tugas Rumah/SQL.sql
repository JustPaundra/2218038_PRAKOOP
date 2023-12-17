-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 17 Des 2023 pada 16.47
-- Versi server: 10.4.32-MariaDB
-- Versi PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `prak_2218038`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `gbp`
--

CREATE TABLE `gbp` (
  `id` int(11) NOT NULL,
  `NamaGudang` varchar(100) NOT NULL,
  `NamaBarang` varchar(100) NOT NULL,
  `KapasitasBarang` int(5) NOT NULL,
  `StokMinimum` int(2) NOT NULL,
  `StokBahan` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `gbp`
--

INSERT INTO `gbp` (`id`, `NamaGudang`, `NamaBarang`, `KapasitasBarang`, `StokMinimum`, `StokBahan`) VALUES
(1, 'test1', 'test2', 120, 50, 60),
(3, 'xxxx', 'xxxx', 222, 12, 200);

-- --------------------------------------------------------

--
-- Struktur dari tabel `pemasok`
--

CREATE TABLE `pemasok` (
  `id` int(11) NOT NULL,
  `NamaGudang` varchar(100) NOT NULL,
  `NamaBarang` varchar(100) NOT NULL,
  `KapasitasBarang` int(5) NOT NULL,
  `Alamat` varchar(100) NOT NULL,
  `NoTelepon` int(12) NOT NULL,
  `StokMinimum` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `pemasok`
--

INSERT INTO `pemasok` (`id`, `NamaGudang`, `NamaBarang`, `KapasitasBarang`, `Alamat`, `NoTelepon`, `StokMinimum`) VALUES
(1, 'test1', 'test23', 200, 'xxxxx', 129301, 20),
(2, 'test1', 'asdasd', 222, 'sadasdasd', 123123, 22);

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `gbp`
--
ALTER TABLE `gbp`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `pemasok`
--
ALTER TABLE `pemasok`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `gbp`
--
ALTER TABLE `gbp`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT untuk tabel `pemasok`
--
ALTER TABLE `pemasok`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
