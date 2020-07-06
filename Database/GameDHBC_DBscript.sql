/*Create database DHBC*/
create database Game_DHBC
go
use Game_DHBC
go
drop database Game_DHBC
/*Create table Admins*/
create table Admins(
	AdID varchar(30) primary key,
	AdPassword varchar(30) not null,
	AdEmail varchar(50) not null,
	AdDOB date not null,
	AdPhone varchar(20) not null,
	CreatedDate date default(getdate()) not null,
)
go

/*Create table Player*/
create table Players(
	PlayerID varchar(30) primary key,
	PlayerPassword varchar(30) not null,
	PlayerEmail varchar(50) not null,
	PlayerDOB date not null ,
	PlayerPhone varchar(20) not null ,
	JoinDate date default(getdate()) not null,
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
	PlayedDate datetime default(getdate()) not null,
	PlayerGem int default(20) not null,
	PlayerScore int default(0) not null
	primary key (PlayerID, quesId)
)
go

/*Create table Help-Support*/
create table HelpSupport (
	CaseID int identity(1,1) primary key,
	PlayerID varchar(30) not null references Players(PlayerID),
	CaseTitle nvarchar(50) not null,
	[Messages] nvarchar(max) not null,
	Images image,
	ReceivedDate date default(getdate()) not null
)
go

/*Create table Store*/
create table Store (
	CardID varchar(20) primary key not null,
	Seri varchar(20) not null,
	Card_value int not null,
	Gem int not null,
	CardStatus bit default(0) -- 0:not used yet, 1: used
)
go

 /*Create view viewHighScore*/
create view vwHighScore
as
select rank() over (order by  PlayerScore desc, PlayedDate asc) AS [Rank], PlayerID, PlayerScore, quesId, PlayedDate 
from GameplayInfo
go

select * from GamePlayInfo
select * from Players
select * from Admins
select * from vwHighScore
select * from QA
/*Insert into Admins*/
insert into Admins(AdID,AdPassword,AdEmail,AdDOB,AdPhone)
values
('ThienKim','TK1234','TKim@gmail.com','2001-06-23','090909090')


insert into Players(PlayerID,PlayerPassword,PlayerEmail,PlayerDOB,PlayerPhone)
values
('ThienKim','TK1234','TKim@gmail.com','2001-06-23','090909090')


insert into Players(PlayerID,PlayerPassword,PlayerEmail,PlayerDOB,PlayerPhone)
values
('ThienKim1234','ThienKim1234','ThienKim@gmail.com','2001-06-23','0963179602')

insert into Players(PlayerID,PlayerPassword,PlayerEmail,PlayerDOB,PlayerPhone)
values
('ThanhAn456','ThanhAn456','ThanhAn@gmail.com','1992-01-01','0961672858'),
('BuuBuu789','BuuBuu789','BuuBuu@gmail.com','1986-10-10','0909873526')


drop table GamePlayInfo
drop table QA


 insert QA(quesContent,ansContent,ScenNo,quesGem,quesScore) values
('./src/QAImages/9Thang10Ngay.JPG','CHINTHANGMUOINGAY',1,5,40),
('./src/QAImages/an-may.png','ANMAY',2,5,40),
('./src/QAImages/BunBoGioHeo.JPG','BUNBOGIOHEO',3,5,40),
('./src/QAImages/CaoChayXaBay.JPG','CAOCHAYXABAY',4,5,40),
('./src/QAImages/tranhsondau.jpg','TRANHSONDAU',5,5,40),
('./src/QAImages/nambancau.png','NAMBANCAU',6,5,40),
('./src/QAImages/lan-toa-niem-vui.png','LANTOAMNIEMVUI',7,5,40)


insert into GamePlayInfo(PlayerID,quesId,PlayerGem,PlayerScore)
values
('ThienKim1234',1,70,0)

insert into GamePlayInfo(PlayerID,quesId,PlayerGem,PlayerScore)
values
('ThanhAn456',4,100,10),('BuuBuu789',2,200,20)

select Players.PlayerID, Players.PlayerPassword, GamePlayInfo.quesId,GamePlayInfo.PlayerGem, GamePlayInfo.PlayerScore, GamePlayInfo.PlayedDate from GamePlayInfo
join Players
on GamePlayInfo.PlayerID = Players.PlayerID

UPDATE
  GamePlayInfo
  set PlayerGem = 80,
  PlayedDate = GETDATE()
  where PlayerID = 'ThienKim1234'

insert into Admins(AdID,AdPassword,AdEmail,AdDOB,AdPhone)
values
('Admin','012345678','Admin@gmail.com','2001-06-23','0123456789')