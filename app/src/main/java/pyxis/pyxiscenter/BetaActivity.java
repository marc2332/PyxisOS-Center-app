package pyxis.pyxiscenter;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class BetaActivity extends AppCompatActivity {

    String version;
    TextView text;
    Button button;
    ImageButton imageButton;
    ImageButton imageButton2;
    ImageButton imageButton3;
    ImageButton imageButton4;
    ImageButton imageButton5;
    ImageButton settings;
    TextView title;
    String string;

    TextView version2;
    TextView changelog;

    AlertDialog alertDialog1;
    CharSequence[] values = {" Stable version", " Beta version"};

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        setContentView(R.layout.content_beta);



        addListenerOnButton();
        addListenerOnButton2();
        addListenerOnButton3();
        addListenerOnButton4();
        addListenerOnButton5();
        Typeface font = Typeface.createFromAsset(getAssets(), "fonts/Product Sans Bold.ttf");
        TextView title = (TextView) findViewById(R.id.title2);
        TextView version = (TextView) findViewById(R.id.VT);
        TextView version2 = (TextView) findViewById(R.id.version);
        TextView changelog = (TextView) findViewById(R.id.ChangelogTitle);
        title.setTypeface(font);
        version.setTypeface(font);
        version2.setTypeface(font);
        changelog.setTypeface(font);


        imageButton5 = (ImageButton) findViewById(R.id.imageButton5);

        imageButton5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), faq.class);
                startActivity(i);
            }
        });

        settings = (ImageButton) findViewById(R.id.settingsButton2);
        settings.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {

                CreateAlertDialogWithRadioButtonGroup();


            }


        });

    }

    public void CreateAlertDialogWithRadioButtonGroup() {


        AlertDialog.Builder builder = new AlertDialog.Builder(BetaActivity.this);

        builder.setTitle("Choose your version");

        builder.setSingleChoiceItems(values, 1, new DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialog, int item) {

                switch (item) {
                    case 0:

                        finish();
                        Intent i = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(i);
                        break;

                    case 1:

                        Toast.makeText(getApplicationContext(),"You are alredy in Beta version", Toast.LENGTH_LONG).show();
                        break;


                }
                alertDialog1.dismiss();
            }
        });
        alertDialog1 = builder.create();
        alertDialog1.show();

    }


    public void addListenerOnButton() {
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {

                String url = getResources().getString(R.string.linkBeta);

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);




            }


        });

    }
    public void addListenerOnButton2() {
        imageButton = (ImageButton) findViewById(R.id.imageButton);
        imageButton.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {

                Dialog();



            }


        });

    }
    public void addListenerOnButton3() {
        imageButton2 = (ImageButton) findViewById(R.id.imageButton2);
        imageButton2.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {

                String url = "https://t.me/nosorion";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);


            }


        });

    }
    public void addListenerOnButton4() {
        imageButton3 = (ImageButton) findViewById(R.id.imageButton3);
        imageButton3.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {


                String url = "https://github.com/nitrogen-orion-project";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);


            }


        });

    }
    public void addListenerOnButton5() {
        imageButton4 = (ImageButton) findViewById(R.id.imageButton4);
        imageButton4.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {

                String url = "https://drive.google.com/drive/folders/129BD7p-Om2QsS5MmgCp7BYvTg_LR-ae_";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);




            }


        });

    }

    public void Dialog() {

        new AlertDialog.Builder(this)
                .setTitle("About Pyxis")
                .setMessage("Pyxisn is a modified ROM based on official Nitrogen OS with some significant improvements.\n" +
                        "\n" +
                        "Developer of Pyxis ROM: saurus280 and mkenzo_8\n" +
                        "\n" +
                        "Thanks: xyyx, Dmitry-777, XeonDead, psndna88")

                .setPositiveButton("Ok", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                }).create().show();

    }



}
