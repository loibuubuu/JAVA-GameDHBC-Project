/*Create database KBC*/
create database Game_DHBC
go
use Game_DHBC
go
drop database Game_DHBC

/*Create table Admins*/
create table Admins(
	AdID varchar(30) primary key,
	AdPassword varchar(30) not null,
	AdName nvarchar(50) not null,
	AdEmail varchar(50) not null,
	AdDOB smalldatetime not null,
	AdPhone varchar(20) not null,
	CreatedDate date default(getdate()) not null,
)
go

/*Create table Player*/
create table Players(
	PlayerID varchar(30) primary key,
	PlayerPassword varchar(30) not null,
	PlayerEmail varchar(50) not null,
	PlayerDOB date not null,
	PlayerPhone varchar(20) not null,
	JoinDate date default(getdate()) not null,
	PlayerGem int not null,
	avatar varchar(300)
)
go

/*Create table Q&A*/
create table QA(
	quesId int identity primary key,
	quesContent varchar(200) not null,
	ansContent text not null,
	ScenNo int not null,
	quesGem int not null,
	quesScore int not null,
)
go


/*Create table Game Play Info*/
create table GamePlayInfo(
	PlayerID varchar(30) references Players(PlayerID) not null,
	quesId int references QA(quesId) not null,
	PlayedDate smalldatetime default(getdate()) not null,
	Score int not null,
	primary key (PlayerID, quesID)
)
go

/*Create table Help-Support*/
create table HelpSupport (
	CaseID int identity(1,1) primary key,
	PlayerID varchar(30) not null references Players(PlayerID),
	CaseTitle nvarchar(50),
	[Messages] nvarchar(max) not null,
	Reply nvarchar(max) null,
	RepliedDate date null,
	CaseState bit not null default(1)
)
go

 /*Create view viewHighScore*/
create view vwHighScore
as
select rank() over (order by  Score desc, PlayedDate asc) AS [Rank], PlayerID, Score, quesId, PlayedDate 
from GameplayInfo
go

 /*Insert into Players*/
 insert Players (PlayerID,PlayerPassword,PlayerEmail,PlayerDOB,PlayerPhone,PlayerGem) values
 ('ThienKim','Kim1234','kimnguyen@gmail.com', '2001-06-23', '0963179602',23)

  insert Players (PlayerID,PlayerPassword,PlayerEmail,PlayerDOB,PlayerPhone,PlayerGem) values
 ('BuuBuu','Buu5678','buubuu@gmail.com', '1986-01-01', '01212131558',20),
 ('ThanhAn','An1357','thanhan@gmail.com', '1992-05-01', '0121317199',40),
 ('DinhHuy','Huy2468','dinhhuy@gmail.com', '2000-10-20', '0748293810',25),
 ('DinhHung','Hung9753','dinhhung@gmail.com', '2001-10-25', '0808135790',50),
 ('TrongNghia','Nghia86420','trongnghia@gmail.com', '1999-07-20', '0972029771',45)

 insert QA(quesContent,ansContent,ScenNo,quesGem,quesScore) values
('D:\AptechSem2\Project Sem2\Project\ProjectJAVA\source\Player\src\start\HinhAnh\1.JPG','KYTHU',1,5,40),
('D:\AptechSem2\Project Sem2\Project\ProjectJAVA\source\Player\src\start\HinhAnh\2.JPG','THUTHAP',2,5,40),
('D:\AptechSem2\Project Sem2\Project\ProjectJAVA\source\Player\src\start\HinhAnh\3.JPG','NHATTHUC',3,5,40),
('D:\AptechSem2\Project Sem2\Project\ProjectJAVA\source\Player\src\start\HinhAnh\4.JPG','ANMAY',4,5,40),
('D:\AptechSem2\Project Sem2\Project\ProjectJAVA\source\Player\src\start\HinhAnh\5.JPG','CAOBOI',5,5,40),
('D:\AptechSem2\Project Sem2\Project\ProjectJAVA\source\Player\src\start\HinhAnh\6.JPG','THANMAT',6,5,40),
('D:\AptechSem2\Project Sem2\Project\ProjectJAVA\source\Player\src\start\HinhAnh\7.JPG','BACTINH',7,5,40),
('D:\AptechSem2\Project Sem2\Project\ProjectJAVA\source\Player\src\start\HinhAnh\8.JPG','NUOCMAY',8,5,40),
('D:\AptechSem2\Project Sem2\Project\ProjectJAVA\source\Player\src\start\HinhAnh\9.JPG','TAMPHAM',9,5,40),
('D:\AptechSem2\Project Sem2\Project\ProjectJAVA\source\Player\src\start\HinhAnh\10.JPG','GIOSUU',10,5,40),
('D:\AptechSem2\Project Sem2\Project\ProjectJAVA\source\Player\src\start\HinhAnh\11.JPG','CADO',11,5,40),
('D:\AptechSem2\Project Sem2\Project\ProjectJAVA\source\Player\src\start\HinhAnh\12.JPG','VACHVOI',12,5,40),
('D:\AptechSem2\Project Sem2\Project\ProjectJAVA\source\Player\src\start\HinhAnh\13.JPG','HONGHAO',13,5,40),
('D:\AptechSem2\Project Sem2\Project\ProjectJAVA\source\Player\src\start\HinhAnh\14.JPG','LYTAM',14,5,40),
('D:\AptechSem2\Project Sem2\Project\ProjectJAVA\source\Player\src\start\HinhAnh\15.JPG','DENHIEU',15,5,40)

select * from GamePlayInfo
select * from vwHighScore
insert GamePlayInfo(PlayerID,quesId,Score) values
('ThienKim',10,400),
('TrongNghia',13,520),
('BuuBuu',5,200)

insert GamePlayInfo(PlayerID,quesId,Score) values
('ThanhAn',10,400),
('DinhHuy',13,520),
('DinhHung',5,200)
