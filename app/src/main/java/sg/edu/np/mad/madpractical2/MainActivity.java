package sg.edu.np.mad.madpractical2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User user = new User("John Doe", "Android Developer", 1, false);

        TextView nameTextView = findViewById(R.id.nameTextView);
        TextView descriptionTextView = findViewById(R.id.descriptionTextView);
        Button followButton = findViewById(R.id.followButton);

        nameTextView.setText(user.name);
        descriptionTextView.setText(user.description);

        followButton.setText(user.followed ? "Unfollow" : "Follow");

        followButton.setOnClickListener(view -> {
            user.followed = !user.followed;
            followButton.setText(user.followed ? "Unfollow" : "Follow");
        });
    }
}
