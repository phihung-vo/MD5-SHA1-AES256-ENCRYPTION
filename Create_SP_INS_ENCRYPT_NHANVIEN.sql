/*----------------------------------------------------------
MASV: N17DCAT031
HO TEN: VO PHI HUNG
LAB: 04
NGAY: 24/09/2020
----------------------------------------------------------*/ 
USE [QLSV]
GO
CREATE PROC SP_INS_ENCRYPT_NHANVIEN (
	@MANV VARCHAR(20) ,
	@HOTEN NVARCHAR(100) ,
	@EMAIL VARCHAR(20) ,
	@LUONG VARCHAR(256),
	@TENDN NVARCHAR(100),
	@MATKHAU VARCHAR(32)  )
AS
BEGIN
	DECLARE @MK VARBINARY (256)
	SET @MK = HASHBYTES('SHA1',@MATKHAU)

	INSERT INTO NHANVIEN(MANV,HOTEN,EMAIL,LUONG,TENDN,MATKHAU)
	VALUES(@MANV,@HOTEN,@EMAIL,CONVERT(VARBINARY(256),@LUONG),@TENDN,@MK)
END