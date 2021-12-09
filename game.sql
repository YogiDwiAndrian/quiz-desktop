-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 05 Jun 2020 pada 00.56
-- Versi server: 10.4.6-MariaDB
-- Versi PHP: 7.3.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `game`
--

DELIMITER $$
--
-- Prosedur
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `updateSkor` (`new_skor` INT, `new_id` INT)  BEGIN
	UPDATE rank SET skor = new_skor WHERE id_rank = new_id;
END$$

--
-- Fungsi
--
CREATE DEFINER=`root`@`localhost` FUNCTION `jml_user_dgn_nama` (`new_nama` VARCHAR(30)) RETURNS INT(11) BEGIN
	DECLARE jml_user INT;
    SELECT COUNT(*) AS jumlah_user INTO jml_user FROM user WHERE user.nama_user = new_nama;
    RETURN jml_user;
END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Struktur dari tabel `admin`
--

CREATE TABLE `admin` (
  `id` int(2) NOT NULL,
  `username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `admin`
--

INSERT INTO `admin` (`id`, `username`, `password`) VALUES
(1, 'admin', 'admin'),
(2, 'yogi', 'yogi');

-- --------------------------------------------------------

--
-- Struktur dari tabel `hist_soal_jawaban`
--

CREATE TABLE `hist_soal_jawaban` (
  `id` int(11) NOT NULL,
  `soal_lama` text NOT NULL,
  `soal_baru` text NOT NULL,
  `jawaban_a_lama` text NOT NULL,
  `jawaban_a_baru` text NOT NULL,
  `jawaban_b_lama` text NOT NULL,
  `jawaban_b_baru` text NOT NULL,
  `jawaban_c_lama` text NOT NULL,
  `jawaban_c_baru` text NOT NULL,
  `jawaban_d_lama` text NOT NULL,
  `jawaban_d_baru` text NOT NULL,
  `kunci_jawaban_lama` enum('A','B','C','D') NOT NULL,
  `kunci_jawaban_baru` enum('A','B','C','D') NOT NULL,
  `waktu_perubahan` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `hist_soal_jawaban`
--

INSERT INTO `hist_soal_jawaban` (`id`, `soal_lama`, `soal_baru`, `jawaban_a_lama`, `jawaban_a_baru`, `jawaban_b_lama`, `jawaban_b_baru`, `jawaban_c_lama`, `jawaban_c_baru`, `jawaban_d_lama`, `jawaban_d_baru`, `kunci_jawaban_lama`, `kunci_jawaban_baru`, `waktu_perubahan`) VALUES
(1, 'asda', 'testing 1', 'sad', '1', 'asd', '1', 'asd', '1', 'asd', '1', 'D', 'A', '2020-06-03 12:28:18'),
(2, '<html>\r\nJika MARDANI = 740-5410 dan MARTONO = \r\n<br>\r\n740-2616 maka 740-5616 adalah …\r\n</html>', '<html>\r\nJika MARDANI = 740-5410 dan MARTONO = \r\n<br>\r\n740-2616 maka 740-5616 adalah â€¦\r\n</html>', 'MARDONO', 'MARDONO', 'MARTONI', 'MARTONI', 'MARIANI', 'MARIANI', 'SUMARTONO', 'SUMARTONO', 'A', 'B', '2020-06-05 04:50:57'),
(3, '<html>\r\nJika MARDANI = 740-5410 dan MARTONO = \r\n<br>\r\n740-2616 maka 740-5616 adalah â€¦\r\n</html>', '<html>\r\nJika MARDANI = 740-5410 dan MARTONO = \r\n<br>\r\n740-2616 maka 740-5616 adalah Ã¢â‚¬Â¦\r\n</html>', 'MARDONO', 'MARDONO', 'MARTONI', 'MARTONI', 'MARIANI', 'MARIANI', 'SUMARTONO', 'SUMARTONO', 'B', 'A', '2020-06-05 04:51:07');

-- --------------------------------------------------------

--
-- Struktur dari tabel `kategori_soal`
--

CREATE TABLE `kategori_soal` (
  `id_kategori` int(11) NOT NULL,
  `nama_kategori` varchar(20) NOT NULL,
  `durasi` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `kategori_soal`
--

INSERT INTO `kategori_soal` (`id_kategori`, `nama_kategori`, `durasi`) VALUES
(1, 'TestIQ', 70),
(2, 'Psikotes', 60),
(3, 'Test Logika', 120),
(4, 'Test Peng Umum', 60);

-- --------------------------------------------------------

--
-- Struktur dari tabel `rank`
--

CREATE TABLE `rank` (
  `id_rank` int(11) NOT NULL,
  `tanggal` date NOT NULL,
  `skor` int(11) NOT NULL DEFAULT 0,
  `sisa_durasi` int(11) NOT NULL DEFAULT 0,
  `id_user` int(11) NOT NULL,
  `id_kategori` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `rank`
--

INSERT INTO `rank` (`id_rank`, `tanggal`, `skor`, `sisa_durasi`, `id_user`, `id_kategori`) VALUES
(1, '2020-05-14', 200, 46, 2, 1),
(2, '2020-05-14', 0, 0, 2, 2),
(3, '2020-05-15', 300, 43, 3, 1),
(4, '2020-05-16', 200, 51, 5, 1),
(5, '2020-05-16', 300, 91, 5, 3),
(6, '2020-05-16', 300, 53, 5, 4),
(7, '2020-05-16', 0, 54, 5, 2),
(8, '2020-05-16', 200, 60, 6, 1),
(9, '2020-05-16', 100, 100, 6, 3),
(10, '2020-05-16', 200, 50, 6, 4),
(11, '2020-05-16', 200, 51, 6, 2),
(12, '2020-05-16', 300, 105, 7, 3),
(13, '2020-05-16', 0, 0, 7, 2),
(14, '2020-05-16', 0, 0, 7, 1),
(15, '2020-05-16', 0, 0, 8, 1),
(16, '2020-05-16', 300, 62, 9, 1),
(17, '2020-05-16', 0, 53, 9, 4),
(18, '2020-05-16', 200, 114, 9, 3),
(19, '2020-05-16', 200, 55, 9, 2),
(20, '2020-05-16', 300, 67, 10, 1),
(21, '2020-05-16', 300, 117, 10, 3),
(22, '2020-05-16', 300, 57, 10, 4),
(23, '2020-05-16', 400, 57, 10, 2),
(24, '2020-06-03', 200, 64, 11, 1),
(25, '2020-06-03', 400, 9, 13, 4),
(26, '2020-06-04', 500, 57, 14, 1),
(27, '2020-06-04', 300, 55, 14, 4),
(28, '2020-06-04', 100, 114, 14, 3),
(29, '2020-06-04', 500, 55, 14, 2),
(30, '2020-06-04', 0, 112, 15, 3),
(31, '2020-06-04', 100, 47, 15, 2),
(32, '2020-06-04', 800, 96, 16, 3),
(33, '2020-06-04', 200, 53, 16, 4),
(34, '2020-06-04', 400, 53, 17, 2),
(35, '2020-06-04', 400, 56, 18, 4),
(36, '2020-06-04', 400, 67, 18, 1),
(37, '2020-06-04', 400, 67, 19, 1),
(38, '2020-06-04', 1000, 38, 19, 4),
(39, '2020-06-04', 400, 57, 20, 1),
(40, '2020-06-04', 300, 56, 20, 4);

-- --------------------------------------------------------

--
-- Struktur dari tabel `soal_jawaban`
--

CREATE TABLE `soal_jawaban` (
  `id_soal_jawaban` int(11) NOT NULL,
  `text_soal` text NOT NULL,
  `jawaban_a` text NOT NULL,
  `jawaban_b` text NOT NULL,
  `jawaban_c` text NOT NULL,
  `jawaban_d` text NOT NULL,
  `kunci_jawaban` enum('A','B','C','D') NOT NULL,
  `id_kategori` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `soal_jawaban`
--

INSERT INTO `soal_jawaban` (`id_soal_jawaban`, `text_soal`, `jawaban_a`, `jawaban_b`, `jawaban_c`, `jawaban_d`, `kunci_jawaban`, `id_kategori`) VALUES
(1, '<html>\r\nAskes (seketen) Konsisten\r\n<br>\r\nGemar (...) Polemik\r\n</html>', 'Kamrim', 'Mikram', 'Armmik', 'Imkram', 'C', 2),
(2, 'Motor : Roda', 'Buku : Bolpoin', 'Rumah : Pintu', 'Buku : Lembar', 'Rumah : pondasi', 'D', 2),
(3, 'Emas : Tambang', 'Permata : Perhiasan', 'Kayu : Pohon', 'Garam : Logam', 'Lidah : Mulut', 'B', 2),
(4, 'Merdeka = ...', 'Luas', 'Adil', 'Belenggu', 'Bebas', 'D', 2),
(5, 'Terbenam = ...', 'Tenggelam', 'Pasti', 'Luar', 'Sial', 'A', 2),
(6, '192, 192, 96, 32, ...', '8', '6', '4', '2', 'A', 2),
(7, '<html>\r\nJika Bandung adalah kucing dan Surabaya\r\n<br>\r\nadalah kambing maka jakarta adalah ...\r\n</html>', 'Kuda', 'Ayam', 'Merak', 'Burung', 'A', 2),
(8, 'Aplha ><', 'Hadir', 'Bolos', 'Lari', 'Rajin', 'A', 2),
(9, 'Ilusi ><', 'Fiksi', 'Nyata', 'Khayalan', 'Diksi', 'B', 2),
(10, '3, 9, 27, 81, 243, 729, ...', '2917', '2987', '2967', '2187', 'D', 2),
(11, '<html>\r\nJika MARDANI = 740-5410 dan MARTONO = \r\n<br>\r\n740-2616 maka 740-5616 adalah Ã¢â‚¬Â¦\r\n</html>', 'MARDONO', 'MARTONI', 'MARIANI', 'SUMARTONO', 'A', 1),
(12, 'Kalau MASUK = KAMUS lalu KUSAM = …', 'SUKAM', 'MUKAS', 'SAKUM', 'MAKUS', 'B', 1),
(13, '<html>\r\nSelesaikan yang belum terisi dalam rangkaian ini,\r\n<br>\r\n Z 3 W S T 13 Q 18 N 23 _ 28 _\r\n<html>', '24 dan 32', 'K dan 33', 'R dan 32', 'O dan S', 'B', 1),
(15, '<html>\r\nManakah dari bilangan-bilangan berikut\r\n<br>\r\nini yang sesuai dengan urutan di bawah ini?\r\n<br>\r\n_ _ _ , 281, 435, 634, 923, 573, 312, 421, 233, 315, 361, _ _ _\r\n</html>', '281', '634', '315', '0', 'A', 1),
(16, 'Kalau 231 = BCA, dan 458 = DEH, maka 109111 adalah?', 'JIKA', 'JIAA', 'JIAAA', 'JIKAAA', 'A', 1),
(17, 'NSOMNIA = …', 'Cemas', 'Sedih', 'Tidak bisa tidur', 'Kenyataanya', 'C', 1),
(18, '<html>\r\nAnda ikut berlomba. Anda menyalip orang di posisi nomor dua. \r\n<br>\r\nSekarang posisi anda nomor berapa?\r\n</html>', '1', '2', '3', '4', 'B', 1),
(19, '<html>\r\nJika lima kucing mampu menangkap lima tikus dalam waktu lima menit,\r\n<br>\r\nmaka berapa banyak kucing yang diperlukan untuk menangkap \r\n<br>\r\nseratus tikus dalam waktu seratus menit?\r\n</html>', '10', '6', '5', '4', 'C', 1),
(20, '<html>\r\nJangan gunakan kertas atau pensil atau kalkulator. \r\n<br>\r\nCobalah. Ambil 1000 dan tambahkan 40 padanya. \r\n<br>\r\nSekarang tambahkan 1000 lagi. Sekarang tambahkan 30! Tambahkan 1000 lagi. \r\n<br>\r\nSekarang tambahkan 20. Sekarang tambahkan 1000. \r\n<br>\r\nSekarang tambahkan 10 . Berapa totalnya?\r\n</html>', '5000', '4100', '4500', '5500', 'B', 1),
(21, 'Benua biru adalah sebutan bagi benua ....', 'Asia', 'Eropa', 'Afrika', 'Amerika', 'B', 4),
(22, 'Suku Bugis berada di provinsi ....', 'Sumatra Utara', 'Sulawesi Selatan', 'Kalimantan Timur', 'NTT', 'B', 4),
(23, 'Ankara adalah ibukota dari negara ....', 'Libanon', 'Bahrain', 'Turki', 'Qatar', 'D', 4),
(24, 'Tanggal 14 Agustus diperingata sebagai hari ....', 'Sumpah Pemuda', 'Kesaktian Pancasila', 'Pramuka', 'PMI', 'C', 4),
(25, 'Harbour Bridge terletak di Negara ...', 'Inggris', 'Italia', 'Australia', 'Austria', 'C', 4),
(26, '<html>\r\nBerikut ini adalah nama negara-negara ASEAN \r\n<br>\r\nyang berbentuk kerajaan, kecuali .....\r\n</html>', 'Thailand', 'Malaysia', 'Filipna', 'Brunei Darussalam', 'C', 4),
(27, 'Rudi Hartono memenangi kejuaraan All England sebanyak ...', '8 kali', '9 kali', '10 kali', '11 kali ', 'A', 4),
(28, 'Terusan Sues berada dinegara ...', 'Mesir', 'India', 'Saudi Arabia', 'Cina', 'A', 4),
(29, 'Sungai terpanjang di dunia adalah sungai ...', 'Nil', 'Bengawan Solo', 'Berantas', 'Amazon', 'A', 4),
(30, '<html>\r\nPresiden negara Indonesia yang paling \r\n<br>\r\nlama memimpin adalah presiden ....\r\n</html>', 'Sukarno', 'Suharto', 'Joko Widodo', 'B.J. Habibie', 'B', 4),
(31, '<html>\r\nAnda mengikuti lomba lari. Lalu Anda menyalip orang di posisi nomor dua. \r\n<br>\r\nSekarang posisi anda nomor berapa ?\r\n</html>', '1', '2', '3', '4', 'B', 3),
(32, '<html>\r\nkerjakan di pikiran anda saja. Jangan gunakan kertas atau pensil atau \r\n<br>\r\nkalkulator. Cobalah Ambil 1000 dan tambahkan 40 padanya. Sekarang \r\n<br>\r\ntambahkan 1000 lagi. Sekarang tambahkan 30! Tambahkan 1000 lagi. Sekarang \r\n<br>\r\ntambahkan 20. Sekarang tambahkan 1000. Sekarang tambahkan 10. Berapa totalnya?\r\n</html>', '4100', '4000', '4400', '4300', 'A', 3),
(33, '<html>\r\nJika lima kucing mampu menangkap lima tikus dalam waktu lima menit, <br> maka berapa banyak kucing yang diperlukan <br>untuk menangkap seratus tikus dalam waktu seratus menit?\r\n</html>', '6 Kucing', '7 Kucing', '5 Kucing', '3 Kucing', 'C', 3),
(34, '<html>\r\nSeorang kakek, seorang nenek, 2 orang ayah, 2 orang ibu, <br> 3 anak laki-laki dan 2 anak perempuan pergi ke restoran. <br>Berapa jumlah makanan yang harus dibeli agar setiap orang mendapat tepat 1 jatah?\r\n</html>', '5 Porsi', '9 Porsi', '6 Porsi', '7 Porsi', 'D', 3),
(35, '<html>\r\nDi sebuah taxi ada 1 supir dan 1 orang penumpang, <br> penumpang itu adalah anak dari supir itu, <br> tapi supir itu bukan ayah dari penumpang itu, <br> jadi siapa supirnya?\r\n<html>', 'Pamannya', 'Ibunya', 'Kakaknya', 'Kakeknya', 'B', 3),
(36, '<html>\r\nBila Seorang Bankir, memiliki anak 3 Umam, Miftah, Wahyudi,<br> dan memiliki suami bernama Rozaq. <br> Coba tebak siapakah nama bankir itu ?\r\n</html>', 'Bila', 'Waktu', 'Telah', 'Wahyudi', 'A', 3),
(37, '<html>\r\nSeorang petani mengkombinasikan dua tumpukan semen dengan tiga yang lain. \r\n<br>\r\nBerapa banyak tumpukan yang ia miliki sekarang ?\r\n</html>', 'Dua tumpukan', 'Empat tumpukan', 'Tiga tumpukan', 'Satu tumpukan', 'D', 3),
(38, 'Berapa kali angka 7 muncul diantara bilangan 1 sampai 100?', '7 Kali', '10 Kali', '20 Kali', '24 Kali', 'C', 3),
(39, '<html>\r\nJika diperlukan waktu satu menit untuk merebus satu telur, <br> berapa waktu yang diperlukan untuk merebus sepuluh telur dengan cepat?\r\n</html>', '1 Menit', '10 Menit', '5 Menit', '3 Menit', 'A', 3),
(40, '<html>\r\nPada waktu mencari air, seekor katak terjatuh ke dalam dasar sumur dengan \r\n<br>\r\nkedalaman 30 meter. Pada waktu siang, katak tersebut berhasil memanjat naik 5 meter,\r\n<br>\r\nnamun pada malam hari katak tersebut merosot turun 4 meter. Begitu terus setiap harinya. \r\n<br>\r\nPada hari ke berapa katak tersebut dapat keluar dari dalam sumur tersebut ?\r\n\r\n</html>', '30 Hari', '28 Hari', '31 Hari', '26 Hari', 'D', 3),
(42, 'testing 1', '1', '1', '1', '1', 'A', 1);

--
-- Trigger `soal_jawaban`
--
DELIMITER $$
CREATE TRIGGER `history_log` AFTER UPDATE ON `soal_jawaban` FOR EACH ROW BEGIN
    INSERT INTO hist_soal_jawaban
    set 
    soal_lama = old.text_soal,
	soal_baru = new.text_soal,
	jawaban_a_lama = old.jawaban_a,
	jawaban_a_baru = new.jawaban_a,
	jawaban_b_lama = old.jawaban_b,
	jawaban_b_baru = new.jawaban_b,
	jawaban_c_lama = old.jawaban_c,
	jawaban_c_baru = new.jawaban_c,
	jawaban_d_lama = old.jawaban_d,
	jawaban_d_baru = new.jawaban_d,
	kunci_jawaban_lama = old.kunci_jawaban,
	kunci_jawaban_baru = new.kunci_jawaban,
	waktu_perubahan = NOW(); 
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Stand-in struktur untuk tampilan `tampil_soal`
-- (Lihat di bawah untuk tampilan aktual)
--
CREATE TABLE `tampil_soal` (
`text_soal` text
,`nama_kategori` varchar(20)
);

-- --------------------------------------------------------

--
-- Struktur dari tabel `user`
--

CREATE TABLE `user` (
  `id_user` int(11) NOT NULL,
  `nama_user` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `user`
--

INSERT INTO `user` (`id_user`, `nama_user`) VALUES
(1, 'Arief R'),
(2, 'Arief K'),
(3, 'rahman r'),
(4, 'rivur e'),
(5, 'rivur r'),
(6, 'admin 1'),
(7, 'arief J'),
(8, 'asfasfasf'),
(9, 'oaskdoas'),
(10, 'asfasgfagf'),
(11, 'asdasd'),
(12, 'oiuoiu'),
(13, 'yogi dwi'),
(14, 'pypppp'),
(15, 'sadasd'),
(16, 'asdwad'),
(17, 'assssdw'),
(18, 'asdaeade'),
(19, 'aaaaaaaaaaaaa'),
(20, 'aaaaaaaaaasd');

-- --------------------------------------------------------

--
-- Struktur untuk view `tampil_soal`
--
DROP TABLE IF EXISTS `tampil_soal`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `tampil_soal`  AS  select `soal_jawaban`.`text_soal` AS `text_soal`,`kategori_soal`.`nama_kategori` AS `nama_kategori` from (`soal_jawaban` join `kategori_soal` on(`soal_jawaban`.`id_kategori` = `kategori_soal`.`id_kategori`)) ;

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `hist_soal_jawaban`
--
ALTER TABLE `hist_soal_jawaban`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `kategori_soal`
--
ALTER TABLE `kategori_soal`
  ADD PRIMARY KEY (`id_kategori`);

--
-- Indeks untuk tabel `rank`
--
ALTER TABLE `rank`
  ADD PRIMARY KEY (`id_rank`),
  ADD KEY `id_kategori` (`id_kategori`),
  ADD KEY `id_user` (`id_user`);

--
-- Indeks untuk tabel `soal_jawaban`
--
ALTER TABLE `soal_jawaban`
  ADD PRIMARY KEY (`id_soal_jawaban`),
  ADD KEY `id_kategori` (`id_kategori`);

--
-- Indeks untuk tabel `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id_user`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `admin`
--
ALTER TABLE `admin`
  MODIFY `id` int(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT untuk tabel `hist_soal_jawaban`
--
ALTER TABLE `hist_soal_jawaban`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT untuk tabel `kategori_soal`
--
ALTER TABLE `kategori_soal`
  MODIFY `id_kategori` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT untuk tabel `rank`
--
ALTER TABLE `rank`
  MODIFY `id_rank` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=41;

--
-- AUTO_INCREMENT untuk tabel `soal_jawaban`
--
ALTER TABLE `soal_jawaban`
  MODIFY `id_soal_jawaban` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=43;

--
-- AUTO_INCREMENT untuk tabel `user`
--
ALTER TABLE `user`
  MODIFY `id_user` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `rank`
--
ALTER TABLE `rank`
  ADD CONSTRAINT `rank_ibfk_1` FOREIGN KEY (`id_kategori`) REFERENCES `kategori_soal` (`id_kategori`),
  ADD CONSTRAINT `rank_ibfk_2` FOREIGN KEY (`id_user`) REFERENCES `user` (`id_user`);

--
-- Ketidakleluasaan untuk tabel `soal_jawaban`
--
ALTER TABLE `soal_jawaban`
  ADD CONSTRAINT `soal_jawaban_ibfk_1` FOREIGN KEY (`id_kategori`) REFERENCES `kategori_soal` (`id_kategori`);

DELIMITER $$
--
-- Event
--
CREATE DEFINER=`root`@`localhost` EVENT `reset_rank` ON SCHEDULE EVERY 1 MONTH STARTS '2020-06-08 00:00:00' ON COMPLETION NOT PRESERVE ENABLE DO TRUNCATE rank$$

DELIMITER ;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
