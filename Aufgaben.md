# Aufgaben

Die Lösungen zu den Aufgaben finden Sie in gleich benannten Branches.

---

#### Aufgabe1:

Erstellen Sie eine Quarkus App, die eine REST Schnittstelle bereitstellt, die einen Chat-Server darstellt.
Die Schnittstelle besteht aus einem GET Endpunkt, welcher alle vorhandenen Nachrichten zurückgibt und einem POST Endpunkt, der eine neue Nachricht entgegennimmt. (quarkus-resteasy-reactive-jsonb)

Das Object Chat soll aus einem User und einer Message bestehen.

Nutzen Sie JSON als Datenformat für die Kommunikation.

---

#### Aufgabe2:

Erstellen Sie eine Quarkus App, die eine REST Schnittstelle bereitstellt, die einen Chat-Client darstellt.
Der Chat-Client soll Nachrichten an den Chat-Server aus Aufgabe 1 senden können und die Nachrichten des Servers anzeigen können.

Der Einfachheit halber wird hier ebenfalls nur ein GET und ein POST Endpunkt für die Eingabe am Chat-Client verwendet.
Hier kann quasi ein Duplikat der Aufgabe 1 erstellt werden, nur dass hier die Nachrichten an einen anderen Server gesendet werden.

Verwenden Sie für die Kommunikation zwischen den beiden Apps die RESTEasy-Client-Implementierung. (quarkus-rest-client-reactive-jsonb)

--- 

#### Aufgabe3:

Fügen Sie der Chat-Server App aus Aufgabe 1 eine Datenbank hinzu, die die Nachrichten speichert.
Verwenden Sie hierfür Panache und einen PostgreSQL Treiber.
(quarkus-hibernate-orm-panachem, quarkus-jdbc-postgresql)

---

#### Aufgabe4:

Passen Sie den Chat-Server aus Aufgabe 3 an, sodass die REST Kommunikation und der Datenbankzugriff asynchron ablaufen.
Verwenden Sie hierfür die reaktiven Erweiterungen von RESTEasy, Panache und dem DB Treiber.
(quarkus-resteasy-reactive-jsonb, quarkus-hibernate-reactive-panache, quarkus-reactive-pg-client)

In der Dev UI von Quarkus kann man sich in der Extension RESTEasy Reactive die Endpoint scores anschauen.

---