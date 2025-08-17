package spring.project.com;

public class RockMusic implements Music {

    @Override
    public String getSong() {
        return "Wind cries Mary";
    }

    @Override
    public String getAuthor() {
        return "Jimi Hendrix";
    }

    @Override
    public Integer getNumber() {
        return 2;
    }
}
