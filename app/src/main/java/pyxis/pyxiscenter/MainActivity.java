package pyxis.pyxiscenter;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button;
    ImageButton imageButton;
    ImageButton imageButton2;
    ImageButton imageButton3;
    ImageButton imageButton4;
    TextView title;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        addListenerOnButton();
        addListenerOnButton2();
        addListenerOnButton3();
        addListenerOnButton4();
        addListenerOnButton5();
        Typeface font = Typeface.createFromAsset(getAssets(), "fonts/Product Sans Bold.ttf");
        TextView title = (TextView) findViewById(R.id.title);
        title.setTypeface(font);
    }
    public void addListenerOnButton() {
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {

                String url = "https://drive.google.com/folderview?id=19zmhGXyk6dvgex0N3TFIklG97hntSvM1";

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
                        "Developer of Pyxis ROM: saurus280 and and mkenzo_8\n" +
                        "\n" +
                        "Thanks: xyyx, Dmitry-777, XeonDead, psndna88")

                .setPositiveButton("Ok", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                }).create().show();

    }

}
