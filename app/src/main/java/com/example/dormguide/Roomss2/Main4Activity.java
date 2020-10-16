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

public class Main4Activity extends AppCompatActivity {

    ListView listView;

    String mTitle[] = {"Room 1", "Room 2", "Room 3", "Room 4", "Room 5", "Room 6"};
    String mDescription[] = {
            //room 1

            "• sharing room with 2 single bed\n\n"
                    + "• frame & mattress\n\n" +
            "• fan room\n\n" +
            "• study table and chair\n\n" +
            "• electric water heater\n\n" +
            "• sharing bathroom with other tenants\n\n" +
            "• easy to find restaurants nearby\n\n" +
            "• fast food outlet nearby such as KFC, Dominos, McD\n\n" +
            "• starbucks nearby\n\n" +
            "• bus stop to mrt stations \n\n",
            //room2

            "• sharing room with 1 king size bed frame & mattress\n\n" +
                    "• private bathroom\n\n" +
                    "• balcony room\n\n" +
                    "• aircond room (pay by own usage meter)\n\n" +
                    "• comes with microwave & electric water heater\n\n" +
                    "• small dinner table\n\n" +
                    "• study table & chair, \n\n" +
                    "• stand fan included\n\n" +
                    "• clothes hanging rack included\n\n",
            //room3


            "• sharing room with 2 single bed frame & mattress\n\n" +
                    "• aircond room (pay by own usage meters)\n\n" +
                    "• study table and chair\n\n" +
                    "• clothes cupboard included \n\n" +
                    "• private bathroom\n\n" +
                    "• room without balcony\n\n" +
                    "• small dinner table\n\n" +
                    "• nearby icon mall, bus stop to mrt\n\n" +
                    "• easy excess to highways\n\n" +
                    "• 20 minutes to KL city\n\n",
            //room4


            "• sharing room with 2 single bed\n\n"
                    + "• frame & mattress\n\n" +
                    "• fan room\n\n" +
                    "• study table and chair\n\n" +
                    "• electric water heater\n\n" +
                    "• sharing bathroom with other tenants\n\n" +
                    "• easy to find restaurants nearby\n\n" +
                    "• fast food outlet nearby such as KFC, Dominos, McD\n\n" +
                    "• starbucks nearby\n\n" +
                    "• bus stop to mrt stations \n\n",
            //room5


            "• sharing room with 1 king size bed frame & mattress\n\n" +
                    "• private bathroom\n\n" +
                    "• balcony room\n\n" +
                    "•aircond room (pay by own usage meter)\n\n" +
                    "• comes with microwave & electric water heater\n\n" +
                    "• small dinner table\n\n" +
                    "• study table & chair, \n\n" +
                    "• stand fan included\n\n" +
                    "• clothes hanging rack included\n\n",

            //room 6

            "• sharing room with 2 single bed frame & mattress\n\n" +
                    "• aircond room (pay by own usage meters)\n\n" +
                    "• study table and chair\n\n" +
                    "• clothes cupboard included \n\n" +
                    "• private bathroom\n\n" +
                    "• room without balcony\n\n" +
                    "• small dinner table\n\n" +
                    "• nearby icon mall, bus stop to mrt\n\n" +
                    "• easy excess to highways\n\n" +
                    "• 20 minutes to KL city\n\n"  };
    String mPrice[] = {"RM 500", "RM 650", "RM 700", "RM 800", "RM 850","800RM"};
    int images[] = {R.drawable.medium_room_1, R.drawable.medium_room_2, R.drawable.medium_room_3, R.drawable.medium_room_4, R.drawable.medium_room_5,R.drawable.medium_room_6};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main4);

        listView = findViewById(R.id.list_view3);


        Main4Activity.MyAdapter adapter = new Main4Activity.MyAdapter(this, mTitle, mDescription, images,mPrice);
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
            super(c, R.layout.row3, R.id.textView1, title);
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

            View row3 = layoutInflater.inflate(R.layout.row3, parent, false);

            ImageView images = row3.findViewById(R.id.image);
            TextView myTitle = row3.findViewById(R.id.textView1);
            TextView myDescription = row3.findViewById(R.id.textView2);
            TextView myPrice = row3.findViewById(R.id.textView3);

            images.setImageResource(rImages[position]);
            myTitle.setText(rTitle[position]);
            myDescription.setText(rDescription[position]);
            myPrice.setText(rPrice[position]);

            return row3;
        }
    }
}