create database LapTrinhCity_NguyenQuocMinh_TS00553
go

use LapTrinhCity_NguyenQuocMinh_TS00553
go

create table NguoiHoc
(
	MaNH nvarchar(7),
	HoTen nvarchar(50),
	NgaySinh date,
	GioiTinh bit,
	DienThoai varchar(12),
	Email nvarchar(30),
	GhiChu nvarchar(200),
	MaNV nvarchar(20),
	NgayDK date,
	primary key(MaNH)
)
go

create table HocVien
(
	MaHV nvarchar(4),
	MaKH nvarchar(4),
	MaNH nvarchar(7),
	Diem float,
	primary key(MaHV)
)
go

create table KhoaHoc
(
	MaKH nvarchar(4),
	MaCD nvarchar(5),
	HocPhi float,
	ThoiLuong float,
	NgayKG date,
	GhiChu nvarchar(200),
	MaNV nvarchar(20),
	NgayTao date,
	primary key(MaKH)
)
go

create table NhanVien
(
	MaNV nvarchar(20),
	MatKhau binary(32),
	HoTen nvarchar(50),
	VaiTro nvarchar(50),
	primary key(MaNV)
)
go

create table ChuyenDe
(
	MaCD nvarchar(5),
	TenCD nvarchar(50),
	HocPhi float,
	ThoiLuong float,
	Hinh nvarchar(100),
	MoTa nvarchar(200),
	primary key(MaCD)
)
go

alter table KhoaHoc
	add constraint FK_MaCD_KhoaHoc
		foreign key (MaCD) references ChuyenDe(MaCD),
	constraint FK_MaNV_KhoaHoc
		foreign key (MaNV) references NhanVien(MaNV)
go

alter table HocVien
	add constraint FK_MaKH_HocVien
		foreign key (MaKH) references KhoaHoc(MaKH),
	constraint FK_MaNH_HocVien
		foreign key (MaNH) references NguoiHoc(MaNH)
go

alter table NguoiHoc
	add constraint FK_MaNV_NguoiHoc
		foreign key (MaNV) references NhanVien(MaNV)
go

create or alter function UserLogin
(
@MaNV nvarchar(100),
@MatKhau varchar(32)
)
returns bit
as
begin
	if exists(select * from NhanVien where MaNV like @MaNV AND MatKhau like HASHBYTES('SHA2_256', @MatKhau))
	begin
		return 1
	end
	return 0
end;
go

select dbo.UserLogin('Minh', 'hello');