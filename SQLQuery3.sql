	CREATE DATABASE PRJPROJECT
 USE PRJPROJECT
CREATE TABLE [dbo].[Category](
	[cid] [int] NOT NULL,
	[cname] [nvarchar](50) NOT NULL,
 --CONSTRAINT [PK_Category] PRIMARY KEY CLUSTERED 
)
CREATE TABLE Product(
		id INT IDENTITY(1,1) NOT null,
		pname NVARCHAR(MAX)NULL,
		price FLOAT NULL,
		[IMAGE] NVARCHAR(MAX) NULL,
		[IMAGE2] NVARCHAR(MAX) NULL,
		[description] NVARCHAR(MAX) NULL,
		cid INT,
		newProd INT,
		SalePricePercent INT
)
CREATE TABLE [dbo].[Order](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[date] [date] NOT NULL,
	[cid] [int] NOT NULL,
	[totalmoney] [money] NULL,

)
CREATE TABLE [dbo].[OrderLine](
	[oid] [int] NOT NULL,
	[pid] [int] NOT NULL,
	[quantity] [float] NOT NULL,
	[price] [float] NOT NULL,
)
CREATE TABLE [dbo].[Customer](
	[id] [int] identity NOT NULL,
	[name] [varchar](150) NOT NULL,
	[username] [varchar](50) NULL,
	[password] [varchar](50) NULL,
)
CREATE TABLE [MESSAGE](
	[id] [int] IDENTITY(1,1) NOT NULL,
	name NVARCHAR(MAX) NOT NULL,
	[email] VARCHAR(40) NOT NULL,
	phoneNumber INT  NOT NULL,
	mess NVARCHAR(MAX) NOT NULL 
)
CREATE TABLE [comment](
	username NVARCHAR(30),
	comment NVARCHAR(500),
	commentTime NVARCHAR(100)
)

INSERT INTO Category VALUES('1',N'Quần lửng')

INSERT INTO Category VALUES('2',N'Quần lịch sự')

INSERT INTO Category VALUES('3',N'Sơ mi và áo kiểu')

INSERT INTO Category VALUES('4',N'Áo Blazer')

INSERT INTO Category VALUES('5',N'Túi và ví')

INSERT INTO Category VALUES('6',N'hoodies & sweatshirt')

INSERT INTO Category VALUES('7',N'giày')

INSERT INTO Product VALUES('MASS PANTS',455,'https://ssstutter.com/wp-content/uploads/2021/02/sp1-1.jpg','https://ssstutter.com/wp-content/uploads/2021/02/sp1-8.jpg',N'Quần quảng châu mang lại sự thoải mái cho người dùng',1,0,50)
INSERT INTO Product VALUES('Wise Pants',455,'https://ssstutter.com/wp-content/uploads/2021/02/WisePants_Xam_PT_2.jpg','https://ssstutter.com/wp-content/uploads/2021/02/WisePants_Den_PT_1.jpg',N'Quần quảng châu mang lại sự thoải mái cho người dùng',2,1,40)
INSERT INTO Product VALUES('Strap PANTS',449,'https://ssstutter.com/wp-content/uploads/2021/02/StrapPants_Xam_PT_2.jpg','https://ssstutter.com/wp-content/uploads/2021/02/StrapPants_Den_PT_3.jpg',N'Quần quảng châu mang lại sự thoải mái cho người dùng',2,0,20)
INSERT INTO Product VALUES('Pyra Shirt',449,'https://ssstutter.com/wp-content/uploads/2021/02/PyraShirt_Den_FL_2.jpg','https://ssstutter.com/wp-content/uploads/2021/02/sp4-2.jpg',N'Áo quảng châu mang lại sự thoải mái cho người dùng',3,1,10)
INSERT INTO Product VALUES('Retro plaid Shirt',300,'https://ssstutter.com/wp-content/uploads/2021/02/sp9-5.jpg','https://ssstutter.com/wp-content/uploads/2021/02/sp9-3.jpg',N'Áo quảng châu mang lại sự thoải mái cho người dùng',3,0,0)
INSERT INTO Product VALUES('Win Blazer',900,'https://ssstutter.com/wp-content/uploads/2021/01/WinBlazer_Be_PT_3.jpg','https://ssstutter.com/wp-content/uploads/2021/01/WinBlazer_Be_PT_1.jpg',N'Áo quảng châu mang lại sự thoải mái cho người dùng',4,1,0)
INSERT INTO Product VALUES('Win Blazer',900,'https://ssstutter.com/wp-content/uploads/2021/01/WideBlazer-8.jpg','https://ssstutter.com/wp-content/uploads/2021/01/WinBlazer_Den_PT_4.jpg',N'Áo quảng châu mang lại sự thoải mái cho người dùng',4,0,10)
INSERT INTO Product VALUES('Daniel Wallet',200,'https://ssstutter.com/wp-content/uploads/2020/08/DANIEL-WALLET-DEN.jpg','https://ssstutter.com/wp-content/uploads/2020/08/DANIEL-WALLET.jpg',N'ví siêu mỏng không chỉ để đựng tiền mà còn nhiều hơn thế nữa',5,0,10)
INSERT INTO Product VALUES('Para Sweater',250,'https://ssstutter.com/wp-content/uploads/2020/11/parass-trang-pt-1.jpg','https://ssstutter.com/wp-content/uploads/2020/11/parass-trang-pt-2.jpg',N'Áo quảng châu mang lại sự thoải mái cho người dùng',6,1,10)
INSERT INTO Product VALUES('S hoodies',300,'https://ssstutter.com/wp-content/uploads/2021/01/SHoodie_Nau_PT_1.jpg','https://ssstutter.com/wp-content/uploads/2021/01/SHoodie_Nau_PT_2.jpg',N'Áo quảng châu mang lại sự thoải mái cho người dùng',6,1,0)
INSERT INTO Product VALUES('Ace boots',700,'https://ssstutter.com/wp-content/uploads/2021/01/AceBoots_3.jpg','https://ssstutter.com/wp-content/uploads/2021/01/AceBoots_2.jpg',N'Giày quảng châu mang lại sự thoải mái cho người dùng',7,1,10)
INSERT INTO Product VALUES('Austin Blazer',1900,'https://scontent.fhan2-5.fna.fbcdn.net/v/t1.15752-9/156476807_342363603798478_1669958228041226533_n.jpg?_nc_cat=109&ccb=1-3&_nc_sid=ae9488&_nc_ohc=ugwn6Tcc8xgAX8KdKrK&_nc_ht=scontent.fhan2-5.fna&oh=d9aea897987d1a8df85b4b4fdff8abcd&oe=6068897F','https://lookstore.vn/images/products/2021/small/LOOK54.jpg',N'Beatutyful Combo For Man',4,1,60)

INSERT INTO Customer VALUES ('quang','haha','123456')
INSERT INTO Customer VALUES ('van','cute','123456789')
INSERT INTO Customer VALUES ('thao','xinh','1234')
INSERT INTO Customer VALUES ('binh','rapper','4231')

 ALTER TABLE dbo.Customer 
ADD CateId INT ;
/* INSERT INTO MESSAGE
(
	-- id -- this column value is auto-generated
	name,
	email,
	phoneNumber,
	mess
)
VALUES
(
	N'Đỗ Quang',
	'quangdd@fpt.edu',
	123456789,
	'khá là hay nhé'
) */