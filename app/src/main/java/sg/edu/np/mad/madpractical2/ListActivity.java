package sg.edu.np.mad.madpractical2;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ImageView centerImageView = findViewById(R.id.centerImageView);
        centerImageView.setOnClickListener(view -> {
            AlertDialog.Builder builder = new AlertDialog.Builder(ListActivity.this);
            builder.setMessage("MADness")
                    .setCancelable(false)
                    .setPositiveButton("View", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            Random random = new Random();
                            int randomNumber = random.nextInt(100000);
                            Intent intent = new Intent(ListActivity.this, MainActivity.class);
                            intent.putExtra("randomNumber", randomNumber);
                            startActivity(intent);
                        }
                    })
                    .setNegativeButton("Close", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.cancel();
                        }
                    });
            AlertDialog alert = builder.create();
            alert.show();
        });
    }
}
