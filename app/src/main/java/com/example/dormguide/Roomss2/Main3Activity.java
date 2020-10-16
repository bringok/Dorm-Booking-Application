package com.example.dormguide.Roomss2;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.dormguide.R;
import com.example.dormguide.Roomss.AnotherActivity;

public class Main3Activity extends AppCompatActivity {

    ListView listView;

    String mTitle[] = {"Room 1", "Room 2", "Room 3", "Room 4", "Room 5", "Room 6"};

    String mDescription[] = {
            //room 1

            "• queen size bed frame with mattress\n\n" +
                    "• comes with microwave, electric water heater \n\n" +
                    "• study table and chair, table’s light, wide window with great scenery\n\n" +
                    "• 5 mins walking to ucsi\n\n" +
                    "• nearby gas stations, drink & beverage outlet\n\n" +
                    "• nearby McDonalds, KFC, Dominos\n\n" +
                    "• nearby small park to jog\n\n" +
                    "• clothes cupboard included\n\n" +
                    "• sharing room not allowed\n\n" +
                    "• private bathroom\n\n",
            //room 2

            "• queen size bed frame with mattress\n\n"+
                    "clothes hanging rack\n\n" +
                    "• room with small balcony\n\n" +
                    "• 5mins walking to icon mall\n\n" +
                    "• variety of mamak restaurants nearby\n\n" +
                    "• fast food outlets nearby (KFC, Mcd, Dominos etc)\n\n" +
                    "• self-laundry dobby nearby\n\n" +
                    "• microwave and electric water heater included\n\n" +
                    "• fan room\n\n" +
                    "• sharing room not allowed\n\n" +
                    "• private bathroom\n\n",
            //room 3


            "• king size bed frame with mattress\n\n" +
                    "• aircond room (pay by own usage meter)\n\n" +
                    "• clothes hanging rack\n\n" +
                    "• bus stop to mrt stations nearby \n\n" +
                    "• study table and chair\n\n" +
                    "• small island to eat\n\n" +
                    "• small fridge and electric cooker\n\n" +
                    "• balcony room with aircond\n\n" +
                    "• 10 minutes drive or grab to eko cheras mall, leisure mall, tesco cheras\n\n" +
                    "• private bathroom\n\n",
            //room 4


            "• queen size bed frame with mattress\n\n" +
                    "• comes with microwave, electric water heater \n\n" +
                    "• study table and chair, table’s light, wide window with great scenery\n\n" +
                    "• 5 mins walking to ucsi\n\n" +
                    "• nearby gas stations, drink & beverage outlet\n\n" +
                    "• nearby McDonalds, KFC, Dominos\n\n" +
                    "• nearby small park to jog\n\n" +
                    "• clothes cupboard included\n\n" +
                    "• sharing room not allowed\n\n" +
                    "• private bathroom\n\n",


            //room 5

            "• queen size bed frame with mattress\n\n"+
                    "clothes hanging rack\n\n" +
                    "• room with small balcony\n\n" +
                    "• 5mins walking to icon mall\n\n" +
                    "• variety of mamak restaurants nearby\n\n" +
                    "• fast food outlets nearby (KFC, Mcd, Dominos etc)\n\n" +
                    "• self-laundry dobby nearby\n\n" +
                    "• microwave and electric water heater included\n\n" +
                    "• fan room\n\n" +
                    "• sharing room not allowed\n\n" +
                    "• private bathroom\n\n",

            //room 6


            "• king size bed frame with mattress\n\n" +
                    "• aircond room (pay by own usage meter)\n\n" +
                    "• clothes hanging rack\n\n" +
                    "• bus stop to mrt stations nearby \n\n" +
                    "• study table and chair\n\n" +
                    "• small island to eat\n\n" +
                    "• small fridge and electric cooker\n\n" +
                    "• balcony room with aircond\n\n" +
                    "• 10 minutes drive or grab to eko cheras mall, leisure mall, tesco cheras\n\n" +
                    "• private bathroom\n\n",};
    String mPrice[] = {"RM 450", "RM 550", "RM 600", "RM 475", "RM 800", "650 RM"};

    int images[] = {R.drawable.medium_room_1, R.drawable.medium_room_2, R.drawable.medium_room_3, R.drawable.medium_room_4, R.drawable.medium_room_5,R.drawable.medium_room_6};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main3);

        listView = findViewById(R.id.list_view2);


        Main3Activity.MyAdapter adapter = new Main3Activity.MyAdapter(this, mTitle, mDescription, images,mPrice);
        listView.setAdapter(adapter);


        // now set item click on list view
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[0]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[0]);
                    intent.putExtra("description", mDescription[0]);
                    intent.putExtra("price", mPrice[0]);
                    // also put your position
                    intent.putExtra("position", ""+0);
                    startActivity(intent);


                }
                if (position == 1) {
                    Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[1]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[1]);
                    intent.putExtra("description", mDescription[1]);
                    intent.putExtra("price", mPrice[1]);
                    // also put your position
                    intent.putExtra("position", ""+1);
                    startActivity(intent);
                }
                if (position == 2) {
                    Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[2]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[2]);
                    intent.putExtra("description", mDescription[2]);
                    // also put your position
                    intent.putExtra("position", ""+2);
                    startActivity(intent);
                }
                if (position == 3) {
                    Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[3]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[3]);
                    intent.putExtra("description", mDescription[3]);
                    intent.putExtra("price", mPrice[3]);
                    // also put your position
                    intent.putExtra("position", ""+3);
                    startActivity(intent);
                }
                if (position == 4) {
                    Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[4]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[4]);
                    intent.putExtra("description", mDescription[4]);
                    intent.putExtra("price", mPrice[4]);
                    // also put your position
                    intent.putExtra("position", ""+4);
                    startActivity(intent);
                }

                if (position == 5) {
                    Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[5]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[5]);
                    intent.putExtra("description", mDescription[5]);
                    intent.putExtra("price", mPrice[5]);
                    // also put your position
                    intent.putExtra("position", ""+5);
                    startActivity(intent);
                }
            }
        });
    }

    class MyAdapter extends ArrayAdapter<String> {

        Context context;
        String rTitle[];
        String rPrice[];
        String rDescription[];
        int rImages[];

        MyAdapter(Context c, String[] title, String[] description, int[] imgs, String[] price) {
            super(c, R.layout.row2, R.id.textView1, title);
            this.context = c;
            this.rTitle = title;
            this.rDescription = description;
            this.rPrice = price;
            this.rImages = imgs;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            View row2 = layoutInflater.inflate(R.layout.row2, parent, false);

            ImageView images = row2.findViewById(R.id.image);
            TextView myTitle = row2.findViewById(R.id.textView1);
            TextView myDescription = row2.findViewById(R.id.textView2);
            TextView myPrice = row2.findViewById(R.id.textView3);

            images.setImageResource(rImages[position]);
            myTitle.setText(rTitle[position]);
            myDescription.setText(rDescription[position]);
            myPrice.setText(rPrice[position]);

            return row2;
        }
    }
}