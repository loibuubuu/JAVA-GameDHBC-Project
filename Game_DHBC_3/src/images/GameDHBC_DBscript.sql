/*Create database KBC*/
create database Game_DHBC
go
use Game_DHBC
go


/*Create table Admins*/
create table Admins(
	AdID varchar(30) primary key,
	AdPassword varchar(30) not null,
	AdEmail varchar(50) not null,
	AdDOB smalldatetime not null,
	AdPhone varchar(20) not null,
	CreatedDate date default(getdate()) not null,
)
go

/*Create table Player*/
create table Players(
	PlayerID varchar(30) primary key,
	PlayerEmail varchar(50) not null,
	PlayerDOB date not null,
	PlayerPhone varchar(20) not null,
	JoinDate date default(getdate()) not null,
	PlayerGem int not null,
	PlayerAvatar varchar(100),
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
	CaseTitle nvarchar(50) not null,
	[Messages] nvarchar(max) not null,
	Images image,
	ReceivedDate date default(getdate()) not null,
	
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
