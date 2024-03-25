import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String title;
    private List<Actor> actors;
    private Director director;
    private Filming filming;

    public Movie(String nameMovie,String nameDirector, String[] actorsName, String[] filmingData) {
        this.setTitle(nameMovie);

        this.actors = new ArrayList<>(); 
        for (String actorName : actorsName) {
            this.actors.add(new Actor(actorName));
        }

        this.director = new Director(nameDirector);
        this.setTitle(nameDirector);
        
        this.filming = new Filming();
        this.filming.setLocation(filmingData[0]);
        this.filming.setTime(filmingData[1]);
        this.filming.setDateStart(filmingData[2]);
        this.filming.setDateEnd(filmingData[3]);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public Filming getFilming() {
        return filming;
    }

    public void setFilming(Filming filming) {
        this.filming = filming;
    }

    public void getMovieData() {
        System.out.println("Movie: " + this.getTitle());
        System.out.println("Director: " + this.getDirector().getName());
        System.out.println("Actors: ");
        for (Actor actor : this.getActors()) {
            System.out.println("°"+actor.getName());
        }
        System.out.println("Filming: ");
        System.out.println("Location: " + this.getFilming().getLocation());
        System.out.println("Time: " + this.getFilming().getTime());
        System.out.println("Date Start: " + this.getFilming().getDateStart());
        System.out.println("Date End: " + this.getFilming().getDateEnd());
    }
}
