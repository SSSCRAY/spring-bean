package spring.project.com;

public class DarkMusic implements Music {

    @Override
    public String getSong() {
        return "MPEG-4";
    }

    @Override
    public String getAuthor() {
        return "BONES";
    }

    @Override
    public Integer getNumber() {
        return 3;
    }
}
