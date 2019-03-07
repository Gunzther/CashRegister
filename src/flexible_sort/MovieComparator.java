package flexible_sort;

import java.util.Comparator;

public class MovieComparator implements Comparator<Movie>{
	
	@Override
	public int compare(Movie m1, Movie m2) {
		if(m1.getTitle().length() > m2.getTitle().length()) return 1;
		else if(m1.getTitle().length() < m2.getTitle().length()) return -1;
		else return m1.getTitle().compareTo(m2.getTitle());
	}
}
