package ma.projet.funfacts;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.material.shape.RelativeCornerSize;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*String TAG=FunFactActivity.class.getSimpleName();*/
        FactBook mFactbook = new FactBook();
        ColorWheel mColorWheel = new ColorWheel();

        final TextView factLabel = (TextView) findViewById(R.id.factTextview);
        final Button showFactButton = (Button) findViewById(R.id.showFactButton);
        final RelativeLayout relativLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        View.OnClickListener Listener =new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String fact = mFactbook.getFact();
                factLabel.setText(fact);
                int color = mColorWheel.getColor();
                relativLayout.setBackgroundColor(color);
                showFactButton.setTextColor(color);
            }


        };

        showFactButton.setOnClickListener(Listener);
        Log.d(TAG, "we'relogging from the onCreete()method !");

    }
}