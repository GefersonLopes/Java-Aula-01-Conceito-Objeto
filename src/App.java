import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name of Movie:");
        String nameMovie = scanner.nextLine();

        System.out.print("Name of Director:");
        String nameDirector = scanner.nextLine();
        
        System.out.print("Name of Actor 1:");
        String nameActor1 = scanner.nextLine();
        
        System.out.print("Name of Actor 2:");
        String nameActor2 = scanner.nextLine();

        String[] actorsName = {nameActor1, nameActor2};

        System.out.print("Name of location:");
        String location = scanner.nextLine();

        System.out.print("Time:");
        String time = scanner.nextLine();

        System.out.print("Date Start:");
        String dateStart = scanner.nextLine();

        System.out.print("Date End:");
        String dateEnd = scanner.nextLine();

        String[] filmingData = {location, time, dateStart, dateEnd};


        Movie movie = new Movie(nameMovie, nameDirector, actorsName, filmingData);
        movie.getMovieData();

        scanner.close();
    }
}
