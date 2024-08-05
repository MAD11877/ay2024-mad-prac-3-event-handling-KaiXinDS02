package sg.edu.np.mad.madpractical2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User user = new User("MAD", "MAD Developer", 1, false);

        TextView nameTextView = findViewById(R.id.nameTextView);
        TextView descriptionTextView = findViewById(R.id.descriptionTextView);
        Button followButton = findViewById(R.id.followButton);
        Button messageButton = findViewById(R.id.messageButton);

        Intent intent = getIntent();
        int randomNumber = intent.getIntExtra("randomNumber", -1);

        if (randomNumber != -1) {
            nameTextView.setText(user.name + " " + randomNumber);
        } else {
            nameTextView.setText(user.name);
        }

        descriptionTextView.setText(user.description);

        followButton.setText(user.followed ? "Unfollow" : "Follow");

        followButton.setOnClickListener(view -> {
            user.followed = !user.followed;
            followButton.setText(user.followed ? "Unfollow" : "Follow");
            Toast.makeText(MainActivity.this, user.followed ? "Followed" : "Unfollowed", Toast.LENGTH_SHORT).show();
        });

        messageButton.setOnClickListener(view -> {
            Intent messageIntent = new Intent(MainActivity.this, MessageGroup.class);
            startActivity(messageIntent);
        });
    }
}
