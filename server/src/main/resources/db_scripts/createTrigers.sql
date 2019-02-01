CREATE OR REPLACE FUNCTION add_Ustawienia_Internetowe()
  RETURNS trigger AS
$BODY$
BEGIN
 insert into Ustawienia_Internetowe (ID_Uzytkownicy_Keylogger,
									Czy_Monitorowac_Transfer_Obecny,
									Co_Ile_Monitorowac_Transfer_Obecny,
									Czy_Predkosc_Wysylania,
									Czy_Predkosc_Pobierania,
									Czy_Zbierac_Informacje_O_Karcie_Sieciowej,
									co_ile_zbierac_informacje_o_karcie_sieciowej)
values (new.ID,0,null,0,0,0,null);

insert into Ustawienia_Keylogger (ID_Uzytkownicy_Keylogger,Czy_Zbierac_Wiadomosc)
values (new.ID,0);

 RETURN NEW;
END;
$BODY$

LANGUAGE plpgsql VOLATILE
COST 100;


CREATE TRIGGER IF_Add_User
  after insert
  ON Uzytkownicy_Keylogger
  FOR EACH ROW
  EXECUTE PROCEDURE add_Ustawienia_Internetowe();


 CREATE OR REPLACE FUNCTION delete_all()
  RETURNS trigger AS
$BODY$
BEGIN
 delete from Ustawienia_Internetowe where ID_Uzytkownicy_Keylogger = old.id;
 delete from Transfer_Obecny where ID_Uzytkownicy_Keylogger = old.id;
 delete from Informacje_O_Karcie_Sieciowej where ID_Uzytkownicy_Keylogger = old.id;
 delete from Ustawienia_Keylogger where ID_Uzytkownicy_Keylogger = old.id;
 delete from Keylogger_Wiadomosci where ID_Uzytkownicy_Keylogger = old.id;

 RETURN OLD;
END;
$BODY$
LANGUAGE plpgsql VOLATILE
COST 100;



CREATE TRIGGER IF_delete_User
  before delete
  ON Uzytkownicy_Keylogger
  FOR EACH ROW
  EXECUTE PROCEDURE delete_all();