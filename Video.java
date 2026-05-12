public class Video {
    protected String title;
    protected String review;
    protected int views;
    protected int likes;
    protected boolean reproducing;
    
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getReview() {
        return review;
    }
    public void setReview(String review) {
        this.review = review;
    }
    public int getViews() {
        return views;
    }
    public void setViews(int views) {
        this.views = views;
    }
    public int getLikes() {
        return likes;
    }
    public void setLikes(int likes) {
        this.likes = likes;
    }
    public boolean isReproducing() {
        return reproducing;
    }
    public void setReproducing(boolean reproducing) {
        this.reproducing = reproducing;
    }

    
}
