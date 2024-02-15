package OOP.DaHinh_Polymorphism;

public class NextMain {
    public static void main(String[] args) {
        Movie movie = Movie.getMovie("A", "Star wars");
        movie.watchMovie();

        Adventure jaws = (Adventure) Movie.getMovie("A", "Jaws");
        jaws.watchMovie();
        jaws.watchAdventure();

        Object comedy = Movie.getMovie("C", "Mr.Bean");
        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchMovie();
        comedyMovie.watchComedy();

        var airplane = Movie.getMovie("A", "Airplane");
        airplane.watchMovie();

        Object unknownObject = Movie.getMovie("C", "Tom and Jerry");
        if (unknownObject.getClass().getSimpleName().equals("Comedy")) {
            Comedy c = (Comedy) unknownObject;
            c.watchComedy();
        } else if (unknownObject instanceof Adventure) {
            System.out.println("Cant watch Movie");

        }
    }
}
