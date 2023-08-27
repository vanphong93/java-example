create database db_kho
go
use db_kho
go
create table tb_loai_san_pham (
	id char(5) primary key,
	name nvarchar(100) not null unique,
	note nvarchar(500)
)
create table tb_nha_cung_cap (
	id char(5) primary key,
	name nvarchar(100) not null unique,
	note nvarchar(500)
)
go
create table tb_san_pham (
	id char(5) primary key,
	name nvarchar(100) not null unique,
	id_loai_san_pham char(5) not null,
	id_nha_cung_cap char(5) not null,
	ngay_nhap datetime not null,
	so_luong int not null,
	don_gia money not null,
	note nvarchar(500),
	constraint fk_tb_san_pham_tb_loai_san_pham foreign key (id_loai_san_pham) references tb_loai_san_pham(id),
	constraint fk_tb_san_pham_tb_nha_cung_cap foreign key (id_nha_cung_cap) references tb_nha_cung_cap(id)
)
go
-- Set date format to day/month/year.  
SET DATEFORMAT dmy; 
go
insert into tb_loai_san_pham
values	('LS001', N'Nước ngọt', N'Nước uống có ga'),
		('LS002', N'Bia', N'Nước uống có cồn'),
		('LS003', N'Rượu', N'Nước uống có cồn')
go
insert into tb_nha_cung_cap
values	('CC001', N'Nhà Cung nước ngọt 1', N'Nhà cung cấp thức uống trong nước'),
		('CC002', N'Nhà Cung cấp Bia 1', N'Nhà cung cấp bia trong nước'),
		('CC003', N'Nhà Cung cấp Rượu 1', N'Nhà Cung cấp rượu')
go
insert into tb_san_pham
values	('SP001', N'Trà xanh 0 độ', 'LS001', 'CC001', '12/3/2023', 10, 200000, 'trà'),
		('SP002', N'Trà ôlong', 'LS001', 'CC002', '11/4/2023', 20, 50000, 'trà ôlong'),
		('SP003', N'Bia Tiger', 'LS002', 'CC003', '22/1/2023', 300, 250000, 'bia')
go
select * from tb_loai_san_pham
go
select * from tb_nha_cung_cap
go
select * from tb_san_pham
script
password ? md5 using
powermockito
report