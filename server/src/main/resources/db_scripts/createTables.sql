CREATE TABLE Uzytkownicy_Keylogger
(
    ID INT Primary Key GENERATED ALWAYS AS IDENTITY,
    Nazwa_Komputera VARCHAR(50) NOT NULL,
	Nazwa_Uzytkownika_Na_Komputerze varchar(50) not null,
	Opis varchar(250)
);

create table Ustawienia_Internetowe
(
	ID int Primary Key Generated Always as Identity,
	ID_Uzytkownicy_Keylogger int references Uzytkownicy_Keylogger(ID) not null,
	Czy_Monitorowac_Transfer_Obecny smallint not null,
	Co_Ile_Monitorowac_Transfer_Obecny int,
	Czy_Predkosc_Wysylania smallint not null,
	Czy_Predkosc_Pobierania smallint not null,
	Czy_Zbierac_Informacje_O_Karcie_Sieciowej smallint not null,
	Co_Ile_Zbierac_Informacje_O_Karcie_Sieciowej int
);

create table Transfer_Obecny
(
	ID int primary key generated always as identity,
	ID_Uzytkownicy_Keylogger int references Uzytkownicy_Keylogger(ID) not null,
	Predkosc_Wysylania int,
	Predkosc_Pobiernia int,
	kiedy_rozpoczeto_pomiar timestamp not null
);

create table Informacje_O_Karcie_Sieciowej
(
	ID int primary key generated always as identity,
	ID_Uzytkownicy_Keylogger int references Uzytkownicy_Keylogger(ID) not null,
	Ineterface varchar(50),
	Mac varchar(20),
	Ip varchar(20),
	Maska varchar(20),
	Broadcast varchar(20),
	kiedy_Zebrano_Informacje timestamp not null
);

create table Ustawienia_Keylogger
(
	ID int primary key generated always as identity,
	ID_Uzytkownicy_Keylogger int references Uzytkownicy_Keylogger(ID) not null,
	Czy_Zbierac_Wiadomosc smallint not null
);

create table Keylogger_Wiadomosci
(
	ID int primary key generated always as identity,
	ID_Uzytkownicy_Keylogger int references Uzytkownicy_Keylogger(ID) not null,
	Wiadomosc varchar(2000) not null,
	kiedy_Zebrano_wiadomosc timestamp not null
);