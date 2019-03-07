package flexible_sort;

public class Main {

	public static void main(String[] args) {
		
		Integer[] num = { 9, 3, 1, 1, 2, 7, 9, 5, 6, 4, 0 };
		SelectionSort.sort(num, new IntegerComparator());
		for (Integer i : num) System.out.println(i);
		System.out.println("------------------------");
		
		String[] word = { "Banana", "Orange", "Apple", "grape", "blue berry" };
		SelectionSort.sort(word, new StringComparator());
		for (String s : word) System.out.println(s);
		System.out.println("------------------------");
		
		Movie mov1 = new Movie("Bird Box");
		Movie mov2 = new Movie("Spiderman");
		Movie mov3 = new Movie("Spidergwen");
		Movie mov4 = new Movie("Titanic");
		Movie mov5 = new Movie("Jaws");
		Movie[] movie = { mov1, mov2, mov3, mov4, mov5 };
		SelectionSort.sort(movie, new MovieComparator());
		for (Movie m : movie) System.out.println(m.getTitle());
	}

}
