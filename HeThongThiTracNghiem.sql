create database HeThongThiTracNghiem;

use HeThongThiTracNghiem;

create table GiaoVien(
	maGV varchar(10) primary key,
	tenGV nvarchar(50),
	matkhau varchar(50),
	phanquyen int default 2
	--phanquyen: 1-admin; 2-giaovien
);

--drop table GiaoVien

insert GiaoVien(maGV, tenGV, matkhau, phanquyen) values
('GV001', N'Trần Thị H', 'haha', 1),
('GV003', N'Nguyễn Văn A', 'adad', 2),
('GV002', N'Trần Thị X', 'xaxa', 2)
select* from GiaoVien;

select* from SinhVien
create table SinhVien(
	maSV varchar(10) primary key,
	tenSV nvarchar(50),
	lop varchar(10),
	matkhau varchar(50)
);

insert SinhVien(maSV, tenSV, lop, matkhau) values
('SV0001', N'Nguyễn F', 'AT13A', 'fa'),
('SV0002', N'Nguyễn B', 'AT13D', 'baba'),
('SV0003', N'Nguyễn A', 'AT13A', 'sasa')


create table MonHoc(
	maMH int identity primary key,
	tenMH nvarchar(100)
);

create table CauHoi(
	maCH int identity primary key,
	maMH int Foreign key (maMH) References monhoc,
	noidung nvarchar(500),
	dapanA nvarchar(500),
	dapanB nvarchar(500),
	dapanC nvarchar(500),
	dapanD nvarchar(500),
	dapandung nvarchar(10)
);

create table DeThi(
	maDT varchar(50) primary key,
	maMH int Foreign key (maMH) References monhoc,
	thoigianlammoicau int
);

--drop table dethi
--drop table chitietdethi
create table ChiTietDeThi(
	maCH int,
	maDT varchar(50),
	constraint pk_chitietdethi primary key(maCH, maDT),
	foreign key (maCH) references CauHoi,
	foreign key (maDT) references DeThi
);

insert ChiTietDeThi(maCH, maDT) values
(3, 'TOAN01'),
(4, 'TOAN01'),
(5, 'TOAN01')


select* from chitietdethi
join 

create table KetQua(
	maSV varchar(10),
	maMH int,
	diem float,
	constraint pk_ketqua primary key(maSV, maMH),
	foreign key (maSV) references SinhVien,
	foreign key (maMH) references MonHoc
);