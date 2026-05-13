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
        this.movie.setReview(5);
    }

    public void review(int score) {
        this.movie.setReview(score);
    }

    public void review(double perc) {
        int tot = 0;
        if (perc <= 20) {
            tot = 3;
        } else if (perc <=50) {
            tot = 5;
        } else if (perc <= 90) {
            tot = 8;
        } else {
            tot = 10;
        }
        this.movie.setReview(tot);
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
