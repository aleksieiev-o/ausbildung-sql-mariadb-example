# MariaDB Übungsprojekt

## Schritte zum Starten
> Man muss zuerst die *.env*-Datei in Root-Ordner mit folgendem Struktur erstellen
```
MARIADB_DATABASE=ticket_system
MARIADB_ROOT_PASSWORD=root
```

1. Docker Setup. *docker-compose.yml* wurde erstellt
	* Es wurde in der Datei die folgenden Felder angelegt:
		* *env_file* - Umgebungsvariablen für die Verbindung mit der Datenbank
		* *volumes* - Persistentes Volume für Daten
			* *./init:/docker-entrypoint-initdb.d/* - Automatische Ausführung aller Befehlen, die in der Datei angelegt sind, wenn der Container am ersten Mal erstellt wird
		* *ports* - Port-Mapping für den Zugriff der Datenbank im Container
		* *healthcheck* - Regelmäßige Überprüfung der Datenbank im Container

2. `docker compose up -d --build` - um alle Services aus *docker-compose.yml* im Hintergrund laufen zu lassen
	* Alles wird durch die Datei *./init/init.sql* automatisch erstellt
	* Benutzer **root** mit dem Passwort **root** wird auch automatisch erstellt
---

## Schritte zum Erledigen (Manuell)
> Man muss zuerst die *.env*-Datei in Root-Ordner mit folgendem Struktur erstellen
```
MARIADB_USER=root
MARIADB_PASSWORD=root
MARIADB_DATABASE=ticket_system
MARIADB_ROOT_PASSWORD=root
```

> Die Datei *./init/init.sql* muss man löschen, um alles manuell umzusetzen

1. Docker Setup. *docker-compose.yml* wurde erstellt
	* Es wurde in der Datei die folgenden Felder angelegt:
		* *env_file* - Umgebungsvariablen für die Verbindung mit der Datenbank
		* *volumes* - Persistentes Volume für Daten
		* *ports* - Port-Mapping für den Zugriff der Datenbank im Container
		* *healthcheck* - Regelmäßige Überprüfung der Datenbank im Container

2. Docker Container Start
	* `docker compose up -d --build` - um alle Services aus *docker-compose.yml* im Hintergrund laufen zu lassen
	* `docker compose ps` - um die laufenden Containers aufzulisten
	* `docker compose down` - um alle laufenden Services zu löschen
	* `docker exec -it database_container mariadb -u root -p` - um die Verbindung mit dem laufenden Container zu erstellen und um einen Befehl gleichzeitig auszuführen

	> Um alle local gespeicherten Daten zu löschen, muss man den Ordner *./volumes* löschen

3. Datenbank anpassen
	* Die Datenbank "**ticket_system**" wurde beim ersten Start vom Container automatisch erstellt
		* Man kann das in der Console des Containers überprüfen `SHOW DATABASES;`
		* *Ausgabe*:
		```
		+--------------------+
		| Database           |
		+--------------------+
		| information_schema |
		| mysql              |
		| performance_schema |
		| sys                |
		| ticket_system      |
		+--------------------+
		```
	* Falls die Datenbank nicht erstellt wurde, muss man den Befehl `CREATE DATABASE ticket_system;` in der Console ausführen
	* Um Befehlen in der Datenbank nutzen zu können, muss man die Datenbank ausführen `USE ticket_system;`

4. Benutzer in der Datenbank wurden angelegt
	* `CREATE USER 'admin' IDENTIFIED BY 'admin';` - um einen Benutzer mit dem Name und Passwort anzulegen
	* `CREATE USER 'app_user' IDENTIFIED BY 'app_user';` - --||--
	* `CREATE USER 'report_user' IDENTIFIED BY 'report_user';` - --||--

5. Rechte in der Datenbank wurden angelegt. Das Symbol *%* bedeutet für alle Hosts
	* `GRANT ALL PRIVILEGES ON ticket_system.* TO 'admin'@'%' WITH GRANT OPTION;` - um alle Rechte den Benutzern zu geben
	* `GRANT SELECT, INSERT, UPDATE, DELETE ON ticket_system.* TO 'app_user'@'%';` - um nur CRUD-Rechte den Benutzer zu geben
	* `GRANT SELECT ON ticket_system.* TO 'report_user'@'%';` - um View-Rechte den Benutzer zu geben
