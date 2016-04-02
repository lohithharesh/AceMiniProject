package com.example.lohith.ace;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.AdapterView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import com.example.lohith.ace.CardAdapter;
import com.example.lohith.ace.RowItem;
public class PlayerScreen extends Activity implements AdapterView.OnItemClickListener {


        public static final Integer[] images = { R.drawable.c2,
                R.drawable.c3, R.drawable.c4, R.drawable.c5, R.drawable.c5, R.drawable.c5, R.drawable.c5, R.drawable.c5, R.drawable.c5, R.drawable.c5, R.drawable.c5, R.drawable.c5 };

        ListView listView;
        List<RowItem> rowItems;
        int image=0,image2=0,image3=0,image4=0,image5=0;

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_player_screen);

            rowItems = new ArrayList<RowItem>();
            int len = images.length;
                int i;



            for (i = 0; i < images.length/5; i++) {
                image=images[i*5];
                image2=images[i*5+1];
                image3=images[i*5+2];
                image4=images[i*5+3];
                image5=images[i*5+4];

                RowItem item = new RowItem(image,image2,image3,image4,image5,5);
                rowItems.add(item);
            }
            if(images.length%5!=0){


                if (images.length % 5 == 1) {
                    image = images[i * 5];
                }

                else if(images.length%5==2){
                    image =images[i*5];
                    image2=images[i*5+1];
                }

                else if(images.length%5==3){
                    image =images[i*5];
                    image2=images[i*5+1];
                    image2=images[i*5+2];
                }

                else if(images.length%5==4){
                    image =images[i*5];
                    image2=images[i*5+1];
                    image2=images[i*5+2];
                    image2=images[i*5+3];
                }

                RowItem item = new RowItem(image,image2,image3,image4,image5,images.length%5);
                rowItems.add(item);

            }

            try {
                ListView listView = (ListView) findViewById(R.id.list);
                CardAdapter adapter = new CardAdapter(this,
                        R.layout.card_list, rowItems);
                listView.setAdapter(adapter);
                listView.setOnItemClickListener(this);
            }
            catch(Exception e){}
        }

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position,
                                long id) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Item " + (position + 1) + ": " + rowItems.get(position),
                    Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.BOTTOM| Gravity.CENTER_HORIZONTAL, 0, 0);
            toast.show();
        }
    }