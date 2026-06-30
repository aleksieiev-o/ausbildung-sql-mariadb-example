# Binary Search (Binäre Suche)

## Beschreibung

Der Algorithm kann nur auf sortierten Arrays funktionieren.

Vorgehensweise sind die folgenden: 

- Array wird halbiert.
- Das Element in der Mitte des Arrays wird überprüft.
- Falls das Element in der Mitte mit der gesuchten Number nicht gleich ist, wird gesuchte Number mit dem Element in der Mitte verglicht.
- Dann mit der Abhängigkeit, od die gesuchte Number größer oder Kleiner ist, wird der rechter oder bzw. linker Teil vom Array weiter halbiert.
- So geht weiter bis das Element nicht gefunden wurde oder der Array nicht beendet wurde.

Er sucht ein Index vom eingegebenen Element und gibt ihn zurück oder wenn das Element nicht gefunden ist, gibt er **-1** zurück.

---

## Time complexity (Zeitliche Komplexität):

- Best case (Bester Fall) - **O(1)**
- Average case (Durchschnittlicher Fall) - **O(log n)**
- Worst case (Schlimmster Fall) - **O(log n)**

**O(1)** - constant time complexity (Konstante Zeitkomplexität). Wenn das gesuchte Element in der Mitte des Arrays gefunden wurde.

**O(log n)** - logarithmic time complexity (Logarithmische Zeitkomplexität). Wenn man für Suche des Elements mehr als ein (1) Durchgang braucht oder wenn das Element gar nicht gefunden wurde.

## Space complexity (Raumkomplexität):

### Iterative Variante
- Best case (Bester Fall) - **O(1)**
- Average case (Durchschnittlicher Fall) - **O(1)**
- Worst case (Schlimmster Fall) - **O(1)**

### Rekursive Variante
- Best case (Bester Fall) - **O(log n)**
- Average case (Durchschnittlicher Fall) - **O(log n)**
- Worst case (Schlimmster Fall) - **O(log n)**

---

## Preconditions (Voraussetzungen):

- Array muss sortiert sein.

---

[Source](https://www.geeksforgeeks.org/dsa/binary-search/)