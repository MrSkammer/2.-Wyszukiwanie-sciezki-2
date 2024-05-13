# 2.-Wyszukiwanie-sciezki-najkrotszej


Spis treści:

1.Opis klasy ShortestPath
2.Konstruktor ShortestPath
3.Metoda findPath()
4.Metoda main()


Opis klasy ShortestPath:

- Klasa ShortestPath zawiera implementację algorytmu znajdowania najkrótszej ścieżki dwuwymiarowej siatce liczb.

___________________________________________________________________________________________
Konstruktor ShortestPath:

Metoda: ShortestPath(int[][] grid)

- Konstruktor przyjmuje dwuwymiarową siatkę liczb jako argument i inicjalizuje pola grid, rows i cols.

___________________________________________________________________________________________
Metoda findPath():

Metoda: findPath()

- Metoda znajduje najmniejszą liczbę w każdej kolumnie siatki i sumuje je. Zwraca sumę oraz wyświetla wymiary siatki oraz najmniejszą liczbę w każdej kolumnie.
Metoda main():

___________________________________________________________________________________________
Metoda: main(String[] args)

- Metoda główna programu, tworzy obiekt ShortestPath z podaną siatką liczb, wywołuje metodę findPath() i wyświetla sumę najmniejszych liczb oraz sumę wszystkich przebytych liczb.

___________________________________________________________________________________________
Program nie potrzebuje żadnych paczek ani plików. Wszystko dzieje się w konsoli