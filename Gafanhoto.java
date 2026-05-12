public class Gafanhoto extends Person{
    
    protected String login;
    protected int totWatched;

    public void watchOneMore() {

    }


    public Gafanhoto(String name, int age, String gender, String login) {
        super(name, age, gender);
        this.login = login;
        this.totWatched = 0;
    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotWatched() {
        return totWatched;
    }

    public void setTotWatched(int totWatched) {
        this.totWatched = totWatched;
    }


    @Override
    public String toString() {
        return "Gafanhoto [login=" + login + super.toString() + ", totWatched=" + totWatched + "]";
    }


    

}
