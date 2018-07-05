package pyxis.pyxiscenter;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FaqActivity extends AppCompatActivity {
    TextView Faq;
    private FloatingActionButton fab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);

        getSupportActionBar().hide();

        Typeface font = Typeface.createFromAsset(getAssets(), "fonts/Product Sans Bold.ttf");
        TextView Faq = (TextView) findViewById(R.id.textView);
        Faq.setTypeface(font);

        FloatingActionButton fab=(FloatingActionButton)findViewById(R.id.fab1);

        fab.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                onBackPressed();
            }
        });
    }
}
