package OOP.DaHinh_Polymorphism;

import java.util.Scanner;

public class TestMovie {
    public static void main(String[] args) {
//        Movie theMovie = Movie.getMovie("A", "Stars war");
//        theMovie.watchMovie();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter Type (A for Adventure, C for Comedy, or Q to quit): ");
            String type = sc.nextLine();
            if ("Qq".contains(type)) {
                break;
            }
            System.out.print("Enter title of movie: ");
            String title = sc.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();


        }


    }
}
