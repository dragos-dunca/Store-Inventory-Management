# Store Inventory Management API

## Descriere
Acest proiect este un RESTful API dezvoltat cu Spring Boot care permite gestionarea produselor unui magazin. Aplicația oferă operații de tip CRUD (Create, Read, Update, Delete) și folosește o bază de date pentru stocarea informațiilor.

---

## Tehnologii utilizate
- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database
- Maven

---

## Funcționalități
- Adăugare produs
- Vizualizare produse
- Actualizare produs
- Ștergere produs

---

## Structura proiectului
- controller – gestionează request-urile HTTP
- service – conține logica aplicației
- repository – acces la baza de date
- model – entitatea Product

---

## Endpoint-uri REST
- POST `/api/products` – adăugare produs
- GET `/api/products` – afișare produse
- PUT `/api/products/{id}` – actualizare produs
- DELETE `/api/products/{id}` – ștergere produs

---

## Testare
Aplicația a fost testată folosind HTTP Client-ul integrat în IntelliJ IDEA, prin request-uri POST, GET, PUT și DELETE.

---

## Rulare
Aplicația se pornește rulând clasa principală:
`StoreInventoryApplication`

Serverul rulează pe:
`http://localhost:8080`
