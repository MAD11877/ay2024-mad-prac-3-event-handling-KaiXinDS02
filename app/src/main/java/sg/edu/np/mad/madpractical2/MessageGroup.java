package sg.edu.np.mad.madpractical2;

import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class MessageGroup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_group);

        Button buttonGroup1 = findViewById(R.id.buttonGroup1);
        Button buttonGroup2 = findViewById(R.id.buttonGroup2);

        buttonGroup1.setOnClickListener(view -> loadFragment(new Group1Fragment()));
        buttonGroup2.setOnClickListener(view -> loadFragment(new Group2Fragment()));
    }

    private void loadFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragmentContainer, fragment);
        transaction.commit();
    }
}
