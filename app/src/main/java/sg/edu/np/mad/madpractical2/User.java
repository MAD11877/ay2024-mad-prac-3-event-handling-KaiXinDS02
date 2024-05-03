package sg.edu.np.mad.madpractical2;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class User {

    private final String descriptiom;
    public String name;

    public String description;

    public int id;

    public boolean followed;

    public User(String name, String description, int id, Boolean followed ){
        this.name = name;
        this.descriptiom = description;
        this.id = id;
        this.followed = followed;
    }

}