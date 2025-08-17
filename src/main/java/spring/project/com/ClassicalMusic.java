package spring.project.com;

public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }

    @Override
    public String getAuthor() {
        return "Rhapsody, Franz Liszt";
    }

    @Override
    public Integer getNumber() {
        return 1;
    }
}
