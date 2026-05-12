public class Video implements VideoActions{
    private String title;
    private int review;
    private int views;
    private int likes;
    private boolean reproducing;
    
    

    public Video(String title) {
        this.title = title;
        this.review = 1;
        this.views = 0;
        this.likes = 0;
        this.reproducing = false;
    }

    @Override
    public void like() {
        this.likes ++;
        
    }
    @Override
    public void pause() {
        this.reproducing = false;
        
    }
    @Override
    public void play() {
        this.reproducing = true;
        
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getReview() {
        return review;
    }
    public void setReview(int review) {
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

    @Override
    public String toString() {
        return "Video [title=" + title + ", review=" + review + ", views=" + 
        views + ", likes=" + likes + ", reproducing=" + reproducing + "]";
    }

    
    
}
