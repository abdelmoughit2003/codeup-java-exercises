import java.util.*;
/**
 * The application stores a list of 10 movies and displays them by category.
         The user can enter any of the following categories to display the films in the list that match the category: animated, drama, horror, scifi.
         After the list is displayed, the user is asked if he or she wants to continue. If no, the program ends.
         Each movie should be represented by an object of type Movie. The Movie class must provide two private fields: title and category. Both of these fields should be Strings. The class should also provide a constructor that accepts a title and category as parameters and uses the values passed to it to initialize its fields.
         When the user enters a category, the program should read through all of the movies in the ArrayList and display a line for any movie whose category matches the category entered by the user.
         Sufficient tests should be present.
         Standardize the category codes by displaying a menu of categories and having the user select the category by number rather than entering the name.
         Display the movies for the selected category in alphabetical order.
         Get the class MoviesIO from here. This class has a method named getMovie. Use this method to fill the array list with 100 Movie objects.
 */
public class MovieRead {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
//Declaring variables
        String userInput;
        boolean askUser;

//create an  arrayList
        ArrayList<Movie> movies=new ArrayList<>();

        // Fill the array list with 100 Movie objects

        for(int i=0;i<=100;i++){
            movies.add(MovieIO.getMovie(i));
        }

do{
// Prompt user to enter inputs
        System.out.println("Please enter which categories of films do you like to see ? 1 animated 2 drama 3 horror 4 scifi");
        userInput=scan.next();
// Sorting  array by title
         Collections.sort(movies);

//Printing the titles of each category of film by alphabetical order.
        System.out.println("List of films in this category :");
        if(userInput.equals("animated") || userInput.equals("1")){

            for(Movie list: movies)
                //output the title of all movies with animated category
            System.out.println(list.title);

        }else if(userInput.equals("drama") || userInput.equals("2")){

            for(Movie list:movies)
                //output the title of all movies with animated drama
                System.out.println(list.title);
        }
        else if(userInput.equals("horror") || userInput.equals("3")){

            for(Movie list:movies)
                //output the title of all movies with animated horror
                System.out.println(list.title);

        }else if(userInput.equals("scifi") || userInput.equals("4")){

            for(Movie list:movies)
                //output the title of all movies with animated scifi
                System.out.println(list.title);
        }else{
            System.out.println("is not in this category");
        }
        System.out.println("Would you continue ?");
        userInput=scan.next();

        if (userInput.equals("yes")){
            askUser=true;

        }else{
            askUser=false;
            System.out.println("GoodBye!" );
        }
    }while (askUser);


        //output the title of all movies

    }

}
// other method
//import java.util.ArrayList;
//        import java.util.Scanner;
//
//public class MovieApp {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in).useDelimiter("\n");
//        Validator validator = new Validator(scan);
//        String userWantsToContinue = "";
//        String userProvidedCategory = "";
//
//        System.out.println("Welcome to MovieLister! It's like IMDB but really small!");
//        // get all the movies provided
//        ArrayList<Movie> movieList = getMovies();
//
//        // make a list of Strings containing all the categories
//        ArrayList<String> categoriesList = getCategories(movieList);
//
//        do {
//            // output all the categories
//            showCategories(categoriesList);
//
//            // prompt user for which category to show
//            userProvidedCategory = validator.getString("Please type a category name to see movies in that category/genre: ");
//
//            // assemble an arrayList of movie objects that have that category.
//            ArrayList<Movie> categoryList = getMoviesByCategory(movieList, userProvidedCategory);
//
//            if(categoryList.size() == 0) {
//                System.out.println("There are no movies in the " + userProvidedCategory + " genre in our application.");
//            } else {
//                // show all the titles in the user provided category
//                System.out.println("Below are all the movies in the " + userProvidedCategory + " ");
//                displayMovies(categoryList);
//            }
//
//            // prompt to continue
//            userWantsToContinue = validator.getString("Type \"yes\" to continue looking up movies by category. ");
//
//        } while(userWantsToContinue.equalsIgnoreCase(("y")) || userWantsToContinue.equalsIgnoreCase("yes"));
//
//        System.out.println("Thank you for using MovieLister!");
//    }
//
//    private static void showCategories(ArrayList<String> categoriesList) {
//        System.out.println("Below are the list of all categories for the movies we have on file. ");
//        for(String category : categoriesList) {
//            System.out.println("\t" + category);
//        }
//    }
//
//    private static ArrayList<String> getCategories(ArrayList<Movie> movieList) {
//        ArrayList<String> categoriesList = new ArrayList<>();
//
//        for(Movie movie : movieList) {
//            if(!categoriesList.contains(movie.getCategory())) {
//                categoriesList.add(movie.getCategory());
//            }
//        }
//
//        return categoriesList;
//    }
//
//    private static ArrayList<Movie> getMovies() {
//        ArrayList<Movie> movieList = new ArrayList<Movie>();
//
//        // assemble the arrayList of movieObjects
//        for(int i = 1; i <= 100; i++) {
//            movieList.add(MovieIO.getMovie(i));
//
//        }
//
//        return movieList;
//    }
//
//    private static ArrayList<Movie> getMoviesByCategory(ArrayList<Movie> movieList, String category) {
//        ArrayList<Movie> categoryList = new ArrayList<>();
//
//        for(Movie movie : movieList) {
//            if(movie.getCategory().equalsIgnoreCase(category)) {
//                categoryList.add(movie);
//            }
//        }
//
//        return categoryList;
//    }
//
//    private static void displayMovies(ArrayList<Movie> categoryList) {
//        for(Movie movie : categoryList) {
//            System.out.println("\t" + movie.getTitle());
//        }
//    }
//}
