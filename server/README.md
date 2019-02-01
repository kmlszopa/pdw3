# Java Server module
    
konekty z przodem aplikacji

## Getting Started

zanim cokolwiek zrobimy trzeba ustawic polaczenie z baza danych
(jeżeli zakladamy ze narazie kazdy ma swoja lokalnie) 

w pliku application.properties ustawiamy bazę

```
# Datasource
spring.datasource.url=jdbc:postgresql://{adres bazy}
spring.datasource.username={uzytkownik}
spring.datasource.password={haslo}
```
ogólnie wystarczy z lini komend uruchomic apke
```
mvn spring-boot:run
```
wtedy można zadawać pytania do endpointów

dostępne endpointy można podejrzeć przez swaggera

wpisz w przeglądarce poniższy adres:

```
http://localhost:8080/api/swagger
```


