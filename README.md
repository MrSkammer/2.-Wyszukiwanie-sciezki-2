# 2.-Wyszukiwanie-sciezki-najkrotszej


Spis treści:

1.Opis klasy ShortestPath ,
2.Konstruktor ShortestPath ,
3.Metoda findPath() ,
4.Metoda main() .


Klasa ShortestPath:

- Jest to klasa Java, która zawiera implementację algorytmu znajdującego najkrótszą ścieżkę w dwuwymiarowej tablicy liczb.
Składa się z pól danych, konstruktora oraz metody służącej do znalezienia najkrótszej ścieżki.

_______________________________________________________________________________________________________________________________________________________________________________________

Pola danych:

- grid: Dwuwymiarowa tablica liczb reprezentująca siatkę, na której szukamy najkrótszej ścieżki.
- rows: Liczba wierszy w tablicy grid.
- cols: Liczba kolumn w tablicy grid.

_______________________________________________________________________________________________________________________________________________________________________________________

Konstruktor ShortestPath(int[][] grid):

- Konstruktor inicjalizuje obiekt ShortestPath daną dwuwymiarową tablicą liczb grid, ustawiając odpowiednio pola rows i cols.

_______________________________________________________________________________________________________________________________________________________________________________________

Metoda findPath():

- Metoda ta szuka najkrótszej ścieżki w tablicy grid, zwracając sumę najmniejszych wartości w każdej kolumnie.
Iteruje po kolumnach i dla każdej kolumny znajduje najmniejszą wartość, sumując je.
Wyświetla wymiary tablicy oraz zawartość tablicy, a także najmniejsze wartości z każdej kolumny.

_______________________________________________________________________________________________________________________________________________________________________________________

Metoda main(String[] args):

- Metoda główna programu, która tworzy obiekt klasy ShortestPath z przykładową tablicą liczb grid.
Wywołuje metodę findPath() na tym obiekcie, aby znaleźć najkrótszą ścieżkę, a następnie wyświetla sumę najmniejszych wartości w kolumnach.

___________________________________________________________________________________________
Program nie potrzebuje żadnych paczek ani plików. Wszystko dzieje się w konsoli
