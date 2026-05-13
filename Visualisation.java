public class Visualisation {
    
    private Gafanhoto viewer;
    private Video movie;

    public Visualisation(Gafanhoto viewer, Video movie) {
        this.movie = movie;
        this.viewer = viewer;
        this.viewer.setTotWatched(this.viewer.getTotWatched() + 1);
        this.movie.setViews(this.movie.getViews() + 1);
    }

    public void review() {

    }

    public void review(int score) {

    }

    public void review(String porc) {

    }

    

    public Gafanhoto getViewer() {
        return viewer;
    }

    public void setViewer(Gafanhoto viewer) {
        this.viewer = viewer;
    }

    public Video getMovie() {
        return movie;
    }

    public void setMovie(Video movie) {
        this.movie = movie;
    }

    @Override
    public String toString() {
        return "Visualisation [viewer=" + viewer + ", movie=" + movie + "]";
    }

    

    


}
