# Linear Search (Lineare Suche)

## Beschreibung

Der Algorithm kann auf sortierten und unsortierten Arrays funktionieren.

Er sucht ein Index vom eingegebenen Element und gibt ihn zurück oder wenn das Element nicht gefunden ist, gibt er **-1** zurück.
Er ist gut geeignet für kleine Datei-Sets, unsortierte Liste und nicht komplexe Implementationen.

---

## Time complexity (Zeitliche Komplexität):

- Best case (Bester Fall) - **O(1)**
- Average case (Durchschnittlicher Fall) - **O(N)**
- Worst case (Schlimmster Fall) - **O(N)**

**O(1)** - constant time complexity (Konstante Zeitkomplexität). Wenn das gesuchte Element auf der ersten Position des Arrays (Index == 0) gefunden wurde.

**O(N)** - linear time complexity (Lineare Zeitkomplexität). Wenn des gesuchten Elements auf der letzten Position des Arrays (Index == arr.length - 1) oder gar nicht gefunden wurde.

## Space complexity (Raumkomplexität):

- Best case (Bester Fall) - **O(1)**
- Average case (Durchschnittlicher Fall) - **O(1)**
- Worst case (Schlimmster Fall) - **O(1)**

**O(1)** - man braucht nur eine Variable für die Iteration durch den Array. Diese Variable wird an jeden Schritt durchgeschrieben.

---

## Preconditions (Voraussetzungen):

- Keine bestimmten Voraussetzungen.

---

[Source](https://www.geeksforgeeks.org/dsa/linear-search/)