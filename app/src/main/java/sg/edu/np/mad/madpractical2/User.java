package sg.edu.np.mad.madpractical2;

public class User {
    private String name;
    private String description;
    private int id;
    private boolean followed;

    public User(String name, String description, int id, boolean followed) {
        this.name = name;
        this.description = description;
        this.id = id;
        this.followed = followed;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

    public boolean isFollowed() {
        return followed;
    }
}
