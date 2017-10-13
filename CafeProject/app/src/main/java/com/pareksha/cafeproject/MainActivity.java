package com.pareksha.cafeproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import static com.pareksha.cafeproject.R.id.btn;

public class MainActivity extends AppCompatActivity {

    Button button;
    Toolbar toolbar;
    ImageView imageView;
    Menu menu;
    MenuItem item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.imageView);
        String Url = "http://coffeedrinkersgear.net/wp-content/uploads/2016/08/image-20160615-14016-njqw65.jpg";
        Picasso.with(MainActivity.this)
                .load(Url)
                .placeholder(R.mipmap.ic_launcher)
                .into(imageView);


        Button btn = (Button) findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Main2Activity.class));


            }

        });

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:
                startActivity(new Intent(MainActivity.this, Main3Activity.class));
                break;
            case R.id.item2:
                break;

            case R.id.item3:
                break;

            default:
                return super.onOptionsItemSelected(item);

        }
        return true;
    }
}








