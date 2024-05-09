import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
public class home {

    public static void main(String[] args) {
        
        System.out.print("Enter an email address for registration: ");
        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();
        

        List<Movie> movieList = new ArrayList<>();
        List<Fav_Movie> favmovieList = new ArrayList<>();

        // Avengers: Endgame
        List<String> cast1 = new ArrayList<>();
        cast1.add("Robert Downey Jr.");
        cast1.add("Chris Evans");
        cast1.add("Chris Hemsworth");

        movieList.add(new Movie("Avengers: Endgame", cast1, "Action", "2019-04-26", 356000000.0));


        // The Shawshank Redemption
        List<String> cast2 = new ArrayList<>();
        cast2.add("Tim Robbins");
        cast2.add("Morgan Freeman");

        movieList.add(new Movie("The Shawshank Redemption", cast2, "Drama", "1994-10-14", 25000000.0));

        // Inception
        List<String> cast3 = new ArrayList<>();
        cast3.add("Leonardo DiCaprio");
        cast3.add("Joseph Gordon-Levitt");

        movieList.add(new Movie("Inception", cast3, "Sci-Fi", "2010-07-16", 160000000.0));
        
        // Titanic
        List<String> cast4 = new ArrayList<>();
        cast4.add("Leonardo DiCaprio");
        cast4.add("Kate Winslet");

        movieList.add(new Movie("Titanic", cast4, "Romance", "1997-12-19", 200000000.0));

        // The Godfather
        List<String> cast5 = new ArrayList<>();
        cast5.add("Marlon Brando");
        cast5.add("Al Pacino");
        cast5.add("James Caan");
 
        movieList.add(new Movie("The Godfather", cast5, "Crime", "1972-03-24", 6000000.0));

        // Jurassic Park
        List<String> cast6 = new ArrayList<>();
        cast6.add("Sam Neill");
        cast6.add("Laura Dern");
        cast6.add("Jeff Goldblum");

        movieList.add(new Movie("Jurassic Park", cast6, "Adventure", "1993-06-11", 63000000.0));

        // The Matrix
        List<String> cast7 = new ArrayList<>();
        cast7.add("Keanu Reeves");
        cast7.add("Laurence Fishburne");
        cast7.add("Carrie-Anne Moss");

        movieList.add(new Movie("The Matrix", cast7, "Action", "1999-03-31", 63000000.0));

        // The Expendables
        List<String> cast8 = new ArrayList<>();
        cast8.add("Sylvester Stallone");
        cast8.add("Jason Statham");
        cast8.add("Jet Li");

        movieList.add(new Movie("The Expendables", cast8, "Action", "2010-08-03", 80000000.0));

        // Se7en
        List<String> cast9 = new ArrayList<>();
        cast9.add("Morgan Freeman");
        cast9.add("Brad Pitt");
        cast9.add("Kevin Spacey");

        movieList.add(new Movie("Se7en", cast9, "Crime", "1995-09-22", 33000000.0));

        Collections.sort(movieList);
        while(true)
        {
            System.out.println("Enter 1 for search movie");
            System.out.println("Enter 2 for see movie details");
            System.out.println("Enter 3 for search movie from favorites list");
            System.out.println("Enter 4 for add movies to favorites list");
            System.out.println("Enter 5 for delete movies from favorites list");
            System.out.println("Enter 6 for Personal details and favorites movie list");
            System.out.println("Enter 7 for Exit the application");

            int val = scanner.nextInt();
            scanner.nextLine();
            
            if(val==1)
            {
                System.out.println("Enter 1 for search movie by title");
                System.out.println("Enter 2 for search movie by catagory");
                int val1 = scanner.nextInt();
                scanner.nextLine();

                if(val1==1)
                {
                    System.out.print("Enter movie title: ");
                    String title = scanner.nextLine();
                    for (Movie movie : movieList) 
                    {
                        if(title.equals(movie.getTitle()))
                        {
                            System.out.print("Title: " + movie.getTitle()+" ");
                            System.out.println();
                        }
                    }
                    System.out.println();
                }
                else if(val1==2)
                {
                    System.out.print("Enter movie Catagory: ");
                    String cat = scanner.nextLine();
                    for (Movie movie : movieList) 
                    {
                        if(cat.equals(movie.getCategory()))
                        {
                            System.out.print("Title: " + movie.getTitle()+" ");
                            System.out.println();
                        }
                    }
                    System.out.println();
                }
            }
            else if(val==2)
            {
                System.out.print("Enter movie title: ");
                String title = scanner.nextLine();
                for (Movie movie : movieList) 
                {
                    if(title.equals(movie.getTitle()))
                    {
                        System.out.print("Title: " + movie.getTitle()+" ");
                        System.out.print("Cast: " + movie.getCast()+" ");
                        System.out.print("Category: " + movie.getCategory()+" ");
                        System.out.print("Release Date: " + movie.getReleaseDate()+" ");
                        System.out.print("Budget: " + movie.getBudget()+" ");
                        System.out.println();
                    }
                }
                System.out.println();
            }
            else if(val==3)
            {
                System.out.print("Enter movie title: ");
                String title = scanner.nextLine();
                for (Fav_Movie movie : favmovieList) 
                {
                    if(title.equals(movie.getTitle()))
                    {
                        System.out.print("Title: " + movie.getTitle()+" ");
                        System.out.print("Cast: " + movie.getCast()+" ");
                        System.out.print("Category: " + movie.getCategory()+" ");
                        System.out.print("Release Date: " + movie.getReleaseDate()+" ");
                        System.out.print("Budget: " + movie.getBudget()+" ");
                        System.out.println();
                    }
                }
                System.out.println();
            }
            else if(val==4)
            {
                System.out.print("Enter the movie title for add to favourites list: ");
                String title = scanner.nextLine();
                for (Movie movie : movieList) 
                {
                    if(title.equals(movie.getTitle()))
                    {
                        favmovieList.add(new Fav_Movie(movie.getTitle(), movie.getCast(), movie.getCategory(), movie.getReleaseDate(), movie.getBudget()));
                        System.out.println("Movie add to favourite list successfully");
                    }
                }
            }
            else if(val==5)
            {
                System.out.print("Enter the title of the movie to remove: ");
                String titleToDelete = scanner.nextLine();

                boolean deleted = false;
                for (Fav_Movie movie : favmovieList) {
                    if (titleToDelete.equals(movie.getTitle())) {
                        favmovieList.remove(movie);
                        deleted = true;
                        System.out.println("Movie '" + titleToDelete + "' removed successfully.");
                        break; // Exit the loop once the movie is deleted
                    }
                }
                if (!deleted) {
                    System.out.println("Movie '" + titleToDelete + "' not found");
                }
            }
            else if(val==6)
            {
                System.out.println("Name : Rana Hossain");
                System.out.println("Email : "+email);
                System.out.println("Number : 01838782840");
                System.out.println();
                for (Fav_Movie movie : favmovieList) 
                {
                    System.out.print("Title: " + movie.getTitle()+" ");
                    System.out.print("Cast: " + movie.getCast()+" ");
                    System.out.print("Category: " + movie.getCategory()+" ");
                    System.out.print("Release Date: " + movie.getReleaseDate()+" ");
                    System.out.print("Budget: " + movie.getBudget()+" ");
                    System.out.println();
                }
                System.out.println();

            }
            else if(val==7)
            {
                break;
            }
        }
        scanner.close();
        
        // Accessing movie information from the list
        // for (Movie movie : movieList) {
        //     System.out.println("Title: " + movie.getTitle());
        //     System.out.println("Cast: " + movie.getCast());
        //     System.out.println("Category: " + movie.getCategory());
        //     System.out.println("Release Date: " + movie.getReleaseDate());
        //     System.out.println("Budget: " + movie.getBudget());
        //     System.out.println();
        // }
    }
}
class Movie implements Comparable<Movie> {
    private String title;
    private List<String> cast;
    private String category;
    private String releaseDate;
    private double budget;

    public Movie(String title, List<String> cast, String category, String releaseDate, double budget) {
        this.title = title;
        this.cast = cast;
        this.category = category;
        this.releaseDate = releaseDate;
        this.budget = budget;
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public List<String> getCast() {
        return cast;
    }

    public String getCategory() {
        return category;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public double getBudget() {
        return budget;
    }

    @Override
    public int compareTo(Movie otherMovie) {
        return this.title.compareTo(otherMovie.getTitle());
    }
}
class Fav_Movie implements Comparable<Fav_Movie> {
    private String title;
    private List<String> cast;
    private String category;
    private String releaseDate;
    private double budget;

    public Fav_Movie(String title, List<String> cast, String category, String releaseDate, double budget) {
        this.title = title;
        this.cast = cast;
        this.category = category;
        this.releaseDate = releaseDate;
        this.budget = budget;
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public List<String> getCast() {
        return cast;
    }

    public String getCategory() {
        return category;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public double getBudget() {
        return budget;
    }

    @Override
    public int compareTo(Fav_Movie otherMovie) {
        return this.title.compareTo(otherMovie.getTitle());
    }
}