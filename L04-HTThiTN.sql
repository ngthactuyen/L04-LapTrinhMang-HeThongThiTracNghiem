USE [master]
GO
/****** Object:  Database [HeThongThiTracNghiem]    Script Date: 15-Mar-19 10:25:43 PM ******/
CREATE DATABASE [HeThongThiTracNghiem]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'HeThongThiTracNghiem', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL11.SQLEXPRESS\MSSQL\DATA\HeThongThiTracNghiem.mdf' , SIZE = 3136KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'HeThongThiTracNghiem_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL11.SQLEXPRESS\MSSQL\DATA\HeThongThiTracNghiem_log.ldf' , SIZE = 784KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [HeThongThiTracNghiem] SET COMPATIBILITY_LEVEL = 110
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [HeThongThiTracNghiem].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [HeThongThiTracNghiem] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [HeThongThiTracNghiem] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [HeThongThiTracNghiem] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [HeThongThiTracNghiem] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [HeThongThiTracNghiem] SET ARITHABORT OFF 
GO
ALTER DATABASE [HeThongThiTracNghiem] SET AUTO_CLOSE ON 
GO
ALTER DATABASE [HeThongThiTracNghiem] SET AUTO_CREATE_STATISTICS ON 
GO
ALTER DATABASE [HeThongThiTracNghiem] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [HeThongThiTracNghiem] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [HeThongThiTracNghiem] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [HeThongThiTracNghiem] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [HeThongThiTracNghiem] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [HeThongThiTracNghiem] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [HeThongThiTracNghiem] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [HeThongThiTracNghiem] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [HeThongThiTracNghiem] SET  ENABLE_BROKER 
GO
ALTER DATABASE [HeThongThiTracNghiem] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [HeThongThiTracNghiem] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [HeThongThiTracNghiem] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [HeThongThiTracNghiem] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [HeThongThiTracNghiem] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [HeThongThiTracNghiem] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [HeThongThiTracNghiem] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [HeThongThiTracNghiem] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [HeThongThiTracNghiem] SET  MULTI_USER 
GO
ALTER DATABASE [HeThongThiTracNghiem] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [HeThongThiTracNghiem] SET DB_CHAINING OFF 
GO
ALTER DATABASE [HeThongThiTracNghiem] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [HeThongThiTracNghiem] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
USE [HeThongThiTracNghiem]
GO
/****** Object:  Table [dbo].[CauHoi]    Script Date: 15-Mar-19 10:25:43 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[CauHoi](
	[maCH] [int] IDENTITY(1,1) NOT NULL,
	[maMH] [int] NULL,
	[noidung] [nvarchar](500) NULL,
	[dapanA] [nvarchar](500) NULL,
	[dapanB] [nvarchar](500) NULL,
	[dapanC] [nvarchar](500) NULL,
	[dapanD] [nvarchar](500) NULL,
	[dapandung] [nvarchar](10) NULL,
PRIMARY KEY CLUSTERED 
(
	[maCH] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[ChiTietDeThi]    Script Date: 15-Mar-19 10:25:43 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[ChiTietDeThi](
	[maCH] [int] NOT NULL,
	[maDT] [varchar](50) NOT NULL,
 CONSTRAINT [pk_chitietdethi] PRIMARY KEY CLUSTERED 
(
	[maCH] ASC,
	[maDT] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[DeThi]    Script Date: 15-Mar-19 10:25:43 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[DeThi](
	[maDT] [varchar](50) NOT NULL,
	[maMH] [int] NULL,
	[thoigianlammoicau] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[maDT] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[GiaoVien]    Script Date: 15-Mar-19 10:25:43 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[GiaoVien](
	[maGV] [varchar](10) NOT NULL,
	[tenGV] [nvarchar](50) NULL,
	[matkhau] [varchar](50) NULL,
	[phanquyen] [int] NULL DEFAULT ((2)),
PRIMARY KEY CLUSTERED 
(
	[maGV] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[KetQua]    Script Date: 15-Mar-19 10:25:43 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[KetQua](
	[maSV] [varchar](10) NOT NULL,
	[maMH] [int] NOT NULL,
	[diem] [float] NULL,
 CONSTRAINT [pk_ketqua] PRIMARY KEY CLUSTERED 
(
	[maSV] ASC,
	[maMH] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[MonHoc]    Script Date: 15-Mar-19 10:25:43 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[MonHoc](
	[maMH] [int] IDENTITY(1,1) NOT NULL,
	[tenMH] [nvarchar](100) NULL,
PRIMARY KEY CLUSTERED 
(
	[maMH] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[SinhVien]    Script Date: 15-Mar-19 10:25:43 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[SinhVien](
	[maSV] [varchar](10) NOT NULL,
	[tenSV] [nvarchar](50) NULL,
	[lop] [varchar](10) NULL,
	[matkhau] [varchar](50) NULL,
PRIMARY KEY CLUSTERED 
(
	[maSV] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[CauHoi] ON 

INSERT [dbo].[CauHoi] ([maCH], [maMH], [noidung], [dapanA], [dapanB], [dapanC], [dapanD], [dapandung]) VALUES (3, 1, N'1+1=?	', N'1', N'2', N'3', N'4', N'B')
INSERT [dbo].[CauHoi] ([maCH], [maMH], [noidung], [dapanA], [dapanB], [dapanC], [dapanD], [dapandung]) VALUES (4, 1, N'1+2=?', N'1', N'2', N'3', N'4', N'C')
INSERT [dbo].[CauHoi] ([maCH], [maMH], [noidung], [dapanA], [dapanB], [dapanC], [dapanD], [dapandung]) VALUES (5, 1, N'q', N'1', N'2', N'3', N'4', N'A')
INSERT [dbo].[CauHoi] ([maCH], [maMH], [noidung], [dapanA], [dapanB], [dapanC], [dapanD], [dapandung]) VALUES (6, 1, N'w', N'q', N'w', N'e', N'r', N'B')
INSERT [dbo].[CauHoi] ([maCH], [maMH], [noidung], [dapanA], [dapanB], [dapanC], [dapanD], [dapandung]) VALUES (7, 1, N'e', N'q', N'w', N'e', N'r', N'C')
SET IDENTITY_INSERT [dbo].[CauHoi] OFF
INSERT [dbo].[ChiTietDeThi] ([maCH], [maDT]) VALUES (3, N'TOAN01')
INSERT [dbo].[ChiTietDeThi] ([maCH], [maDT]) VALUES (4, N'TOAN01')
INSERT [dbo].[ChiTietDeThi] ([maCH], [maDT]) VALUES (5, N'TOAN01')
INSERT [dbo].[ChiTietDeThi] ([maCH], [maDT]) VALUES (7, N'TOAN01')
INSERT [dbo].[DeThi] ([maDT], [maMH], [thoigianlammoicau]) VALUES (N'LY01', 4, 3)
INSERT [dbo].[DeThi] ([maDT], [maMH], [thoigianlammoicau]) VALUES (N'TOAN01', 1, 5)
INSERT [dbo].[DeThi] ([maDT], [maMH], [thoigianlammoicau]) VALUES (N'TOAN02', 1, 5)
INSERT [dbo].[DeThi] ([maDT], [maMH], [thoigianlammoicau]) VALUES (N'TOAN03', 1, 5)
INSERT [dbo].[DeThi] ([maDT], [maMH], [thoigianlammoicau]) VALUES (N'TOAN04', 1, 5)
INSERT [dbo].[GiaoVien] ([maGV], [tenGV], [matkhau], [phanquyen]) VALUES (N'a', N'a', N'a', 2)
INSERT [dbo].[GiaoVien] ([maGV], [tenGV], [matkhau], [phanquyen]) VALUES (N'GV001', N'Trần Thị H', N'a', 1)
INSERT [dbo].[GiaoVien] ([maGV], [tenGV], [matkhau], [phanquyen]) VALUES (N'GV002', N'Trần Thị X', N'xaxa', 2)
INSERT [dbo].[GiaoVien] ([maGV], [tenGV], [matkhau], [phanquyen]) VALUES (N'GV003', N'Nguyễn Văn A', N'adad', 2)
INSERT [dbo].[GiaoVien] ([maGV], [tenGV], [matkhau], [phanquyen]) VALUES (N'GV004', N'q', N'q', 2)
INSERT [dbo].[GiaoVien] ([maGV], [tenGV], [matkhau], [phanquyen]) VALUES (N'GV005', N'a', N'a', 2)
INSERT [dbo].[GiaoVien] ([maGV], [tenGV], [matkhau], [phanquyen]) VALUES (N'q', N'q', N'q', 2)
SET IDENTITY_INSERT [dbo].[MonHoc] ON 

INSERT [dbo].[MonHoc] ([maMH], [tenMH]) VALUES (1, N'Toán')
INSERT [dbo].[MonHoc] ([maMH], [tenMH]) VALUES (4, N'Lý')
INSERT [dbo].[MonHoc] ([maMH], [tenMH]) VALUES (5, N'Hóa')
INSERT [dbo].[MonHoc] ([maMH], [tenMH]) VALUES (13, N'q12')
SET IDENTITY_INSERT [dbo].[MonHoc] OFF
INSERT [dbo].[SinhVien] ([maSV], [tenSV], [lop], [matkhau]) VALUES (N'a', N'Trần A', N'a', N'a')
INSERT [dbo].[SinhVien] ([maSV], [tenSV], [lop], [matkhau]) VALUES (N'SV0001', N'Nguyễn F', N'AT13A', N'fa')
INSERT [dbo].[SinhVien] ([maSV], [tenSV], [lop], [matkhau]) VALUES (N'SV0002', N'Nguyễn B', N'AT13D', N'baba')
INSERT [dbo].[SinhVien] ([maSV], [tenSV], [lop], [matkhau]) VALUES (N'SV0003', N'Nguyễn A', N'AT13A', N'sasa')
ALTER TABLE [dbo].[CauHoi]  WITH CHECK ADD FOREIGN KEY([maMH])
REFERENCES [dbo].[MonHoc] ([maMH])
GO
ALTER TABLE [dbo].[ChiTietDeThi]  WITH CHECK ADD FOREIGN KEY([maCH])
REFERENCES [dbo].[CauHoi] ([maCH])
GO
ALTER TABLE [dbo].[ChiTietDeThi]  WITH CHECK ADD FOREIGN KEY([maDT])
REFERENCES [dbo].[DeThi] ([maDT])
GO
ALTER TABLE [dbo].[DeThi]  WITH CHECK ADD FOREIGN KEY([maMH])
REFERENCES [dbo].[MonHoc] ([maMH])
GO
ALTER TABLE [dbo].[KetQua]  WITH CHECK ADD FOREIGN KEY([maMH])
REFERENCES [dbo].[MonHoc] ([maMH])
GO
ALTER TABLE [dbo].[KetQua]  WITH CHECK ADD FOREIGN KEY([maSV])
REFERENCES [dbo].[SinhVien] ([maSV])
GO
USE [master]
GO
ALTER DATABASE [HeThongThiTracNghiem] SET  READ_WRITE 
GO
