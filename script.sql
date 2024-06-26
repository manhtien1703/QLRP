USE [master]
GO
/****** Object:  Database [QLRP]    Script Date: 27/05/2024 1:42:02 SA ******/
CREATE DATABASE [QLRP]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'QLRP', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL16.MSSQLSERVER\MSSQL\DATA\QLRP.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'QLRP_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL16.MSSQLSERVER\MSSQL\DATA\QLRP_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT, LEDGER = OFF
GO
ALTER DATABASE [QLRP] SET COMPATIBILITY_LEVEL = 160
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [QLRP].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [QLRP] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [QLRP] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [QLRP] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [QLRP] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [QLRP] SET ARITHABORT OFF 
GO
ALTER DATABASE [QLRP] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [QLRP] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [QLRP] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [QLRP] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [QLRP] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [QLRP] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [QLRP] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [QLRP] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [QLRP] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [QLRP] SET  DISABLE_BROKER 
GO
ALTER DATABASE [QLRP] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [QLRP] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [QLRP] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [QLRP] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [QLRP] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [QLRP] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [QLRP] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [QLRP] SET RECOVERY FULL 
GO
ALTER DATABASE [QLRP] SET  MULTI_USER 
GO
ALTER DATABASE [QLRP] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [QLRP] SET DB_CHAINING OFF 
GO
ALTER DATABASE [QLRP] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [QLRP] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [QLRP] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [QLRP] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO
EXEC sys.sp_db_vardecimal_storage_format N'QLRP', N'ON'
GO
ALTER DATABASE [QLRP] SET QUERY_STORE = ON
GO
ALTER DATABASE [QLRP] SET QUERY_STORE (OPERATION_MODE = READ_WRITE, CLEANUP_POLICY = (STALE_QUERY_THRESHOLD_DAYS = 30), DATA_FLUSH_INTERVAL_SECONDS = 900, INTERVAL_LENGTH_MINUTES = 60, MAX_STORAGE_SIZE_MB = 1000, QUERY_CAPTURE_MODE = AUTO, SIZE_BASED_CLEANUP_MODE = AUTO, MAX_PLANS_PER_QUERY = 200, WAIT_STATS_CAPTURE_MODE = ON)
GO
USE [QLRP]
GO
/****** Object:  User [##MS_PolicyTsqlExecutionLogin##]    Script Date: 27/05/2024 1:42:02 SA ******/
CREATE USER [##MS_PolicyTsqlExecutionLogin##] FOR LOGIN [##MS_PolicyTsqlExecutionLogin##] WITH DEFAULT_SCHEMA=[dbo]
GO
/****** Object:  Table [dbo].[CTHD]    Script Date: 27/05/2024 1:42:02 SA ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[CTHD](
	[MASP] [nvarchar](255) NOT NULL,
	[SOHD] [int] NOT NULL,
	[THANHTIEN] [decimal](10, 2) NOT NULL,
	[SOLUONG] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[MASP] ASC,
	[SOHD] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[DATVE]    Script Date: 27/05/2024 1:42:02 SA ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[DATVE](
	[MAGHE] [nvarchar](255) NOT NULL,
	[MASC] [nvarchar](255) NOT NULL,
	[SOHD] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[MAGHE] ASC,
	[MASC] ASC,
	[SOHD] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[GHE]    Script Date: 27/05/2024 1:42:02 SA ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[GHE](
	[MAGHE] [nvarchar](255) NOT NULL,
	[MARAP] [nvarchar](255) NOT NULL,
	[VITRI] [nvarchar](255) NOT NULL,
	[LOAIGHE] [nvarchar](255) NULL,
	[GIA] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[MAGHE] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY],
UNIQUE NONCLUSTERED 
(
	[MAGHE] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[HOADON]    Script Date: 27/05/2024 1:42:02 SA ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HOADON](
	[SOHD] [int] IDENTITY(1,1) NOT NULL,
	[MANV] [nvarchar](255) NOT NULL,
	[MATV] [nvarchar](255) NULL,
	[NGAYHD] [date] NOT NULL,
	[TONGTIEN] [decimal](10, 2) NOT NULL,
	[MAKM] [nvarchar](255) NULL,
	[DTL] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[SOHD] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[KHUYENMAI]    Script Date: 27/05/2024 1:42:02 SA ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KHUYENMAI](
	[MAKM] [nvarchar](255) NOT NULL,
	[TENKM] [nvarchar](255) NOT NULL,
	[TYLEKM] [decimal](5, 2) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[MAKM] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[LOAIPHIM]    Script Date: 27/05/2024 1:42:02 SA ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[LOAIPHIM](
	[MALP] [nvarchar](255) NOT NULL,
	[TENLP] [nvarchar](255) NOT NULL,
	[HINHTHUC] [nvarchar](255) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[MALP] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NHANVIEN]    Script Date: 27/05/2024 1:42:02 SA ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NHANVIEN](
	[MANV] [nvarchar](255) NOT NULL,
	[MANQL] [nvarchar](255) NOT NULL,
	[MATK] [nvarchar](255) NOT NULL,
	[HOTENNV] [nvarchar](255) NOT NULL,
	[GIOITINH] [nvarchar](3) NOT NULL,
	[NGAYSINH] [date] NOT NULL,
	[DIACHI] [nvarchar](255) NOT NULL,
	[SDT] [nvarchar](15) NOT NULL,
	[LUONG] [decimal](10, 2) NOT NULL,
	[NGAYVAOLAM] [date] NOT NULL,
	[CHUCVU] [nvarchar](255) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[MANV] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY],
UNIQUE NONCLUSTERED 
(
	[MATK] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[PHIM]    Script Date: 27/05/2024 1:42:02 SA ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PHIM](
	[MAPHIM] [nvarchar](255) NOT NULL,
	[MALP] [nvarchar](255) NOT NULL,
	[TENPHIM] [nvarchar](255) NOT NULL,
	[THOILUONG] [int] NOT NULL,
	[QUOCGIA] [nvarchar](255) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[MAPHIM] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY],
UNIQUE NONCLUSTERED 
(
	[TENPHIM] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[RAPCHIEU]    Script Date: 27/05/2024 1:42:02 SA ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[RAPCHIEU](
	[MARAP] [nvarchar](255) NOT NULL,
	[SLGHE] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[MARAP] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[SANPHAM]    Script Date: 27/05/2024 1:42:02 SA ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[SANPHAM](
	[MASP] [nvarchar](255) NOT NULL,
	[TENSP] [nvarchar](255) NOT NULL,
	[GIA] [decimal](10, 2) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[MASP] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[SUATCHIEU]    Script Date: 27/05/2024 1:42:02 SA ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[SUATCHIEU](
	[MASC] [nvarchar](255) NOT NULL,
	[MARAP] [nvarchar](255) NOT NULL,
	[MAPHIM] [nvarchar](255) NOT NULL,
	[NGAYCHIEU] [date] NOT NULL,
	[THOIGIANCHIEU] [nvarchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[MASC] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[TAIKHOAN]    Script Date: 27/05/2024 1:42:02 SA ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TAIKHOAN](
	[MATK] [nvarchar](255) NOT NULL,
	[MANGUOIDUNG] [nvarchar](255) NOT NULL,
	[TENTK] [nvarchar](255) NOT NULL,
	[PASSWORD] [nvarchar](255) NOT NULL,
	[LOAITK] [nvarchar](255) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[MATK] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[THANHVIEN]    Script Date: 27/05/2024 1:42:02 SA ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[THANHVIEN](
	[MATV] [nvarchar](255) NOT NULL,
	[TENTV] [nvarchar](255) NOT NULL,
	[GIOITINH] [nvarchar](3) NOT NULL,
	[NGAYSINH] [date] NOT NULL,
	[DIACHI] [nvarchar](255) NOT NULL,
	[SDT] [nvarchar](15) NOT NULL,
	[CMND] [nvarchar](255) NOT NULL,
	[NGAYDANGKY] [date] NOT NULL,
	[DIEMTICHLUY] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[MATV] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
ALTER TABLE [dbo].[CTHD]  WITH CHECK ADD FOREIGN KEY([MASP])
REFERENCES [dbo].[SANPHAM] ([MASP])
GO
ALTER TABLE [dbo].[CTHD]  WITH CHECK ADD FOREIGN KEY([SOHD])
REFERENCES [dbo].[HOADON] ([SOHD])
GO
ALTER TABLE [dbo].[DATVE]  WITH CHECK ADD FOREIGN KEY([MAGHE])
REFERENCES [dbo].[GHE] ([MAGHE])
GO
ALTER TABLE [dbo].[DATVE]  WITH CHECK ADD FOREIGN KEY([MASC])
REFERENCES [dbo].[SUATCHIEU] ([MASC])
GO
ALTER TABLE [dbo].[DATVE]  WITH CHECK ADD FOREIGN KEY([SOHD])
REFERENCES [dbo].[HOADON] ([SOHD])
GO
ALTER TABLE [dbo].[HOADON]  WITH CHECK ADD FOREIGN KEY([MAKM])
REFERENCES [dbo].[KHUYENMAI] ([MAKM])
GO
ALTER TABLE [dbo].[HOADON]  WITH CHECK ADD FOREIGN KEY([MANV])
REFERENCES [dbo].[NHANVIEN] ([MANV])
GO
ALTER TABLE [dbo].[HOADON]  WITH CHECK ADD FOREIGN KEY([MATV])
REFERENCES [dbo].[THANHVIEN] ([MATV])
GO
ALTER TABLE [dbo].[NHANVIEN]  WITH CHECK ADD FOREIGN KEY([MANQL])
REFERENCES [dbo].[NHANVIEN] ([MANV])
GO
ALTER TABLE [dbo].[NHANVIEN]  WITH CHECK ADD FOREIGN KEY([MATK])
REFERENCES [dbo].[TAIKHOAN] ([MATK])
GO
ALTER TABLE [dbo].[PHIM]  WITH CHECK ADD FOREIGN KEY([MALP])
REFERENCES [dbo].[LOAIPHIM] ([MALP])
GO
ALTER TABLE [dbo].[SUATCHIEU]  WITH CHECK ADD FOREIGN KEY([MAPHIM])
REFERENCES [dbo].[PHIM] ([MAPHIM])
GO
ALTER TABLE [dbo].[SUATCHIEU]  WITH CHECK ADD FOREIGN KEY([MARAP])
REFERENCES [dbo].[RAPCHIEU] ([MARAP])
GO
ALTER TABLE [dbo].[NHANVIEN]  WITH CHECK ADD CHECK  (([NGAYSINH]<[NGAYVAOLAM]))
GO
ALTER TABLE [dbo].[NHANVIEN]  WITH CHECK ADD CHECK  (([GIOITINH]='Nu' OR [GIOITINH]='Nam'))
GO
ALTER TABLE [dbo].[THANHVIEN]  WITH CHECK ADD CHECK  (([NGAYSINH]<[NGAYDANGKY]))
GO
ALTER TABLE [dbo].[THANHVIEN]  WITH CHECK ADD CHECK  (([GIOITINH]='Nu' OR [GIOITINH]='Nam'))
GO
USE [master]
GO
ALTER DATABASE [QLRP] SET  READ_WRITE 
GO
