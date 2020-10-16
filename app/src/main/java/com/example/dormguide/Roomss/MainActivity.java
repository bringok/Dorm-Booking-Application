package com.example.dormguide.Roomss;

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

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.dormguide.R;

public class MainActivity extends AppCompatActivity {


    ListView listView;

    String mTitle[] = {"Room 1", "Room 2", "Room 3", "Room 4", "Room 5", "Room 6"};
    String mDescription[] = {
            //room1

            "• Fully furnished Single Room For Rent \n\n" +
                    "• single bed for one person only\n\n" +
                    "• near ucsi university\n\n" +
                    "• 5 minutes to mamak by walking\n\n" +
                    "• 5 minutes Pizza Hut, KFC and 99 speedmart \n\n" +
                    "• INCLUDED UTILITIES\n\n" +
                    "• Nearby Bus Stop to MRT Taman Connaught, Taman Mutiara \n\n" +
                    "• Fully Furnished room comes with Mattress, Bed frame, study table and chair, lights and fans, clothes hanging rack. \n\n" +
                    "• 5 mins walking to icon mall\n\n" +
                    "• nearby gym\n\n",
             //room 2

            "• Partially furnished single room \n\n" +
                    "• 5 minutes to ucsi\n\n" +
                    "• single bed can’t share with other person\n\n" +
                    "• near fast food chain restaurant (KFC, Mcd, Dominos & Pizzahut)\n\n" +
                    "• near mamak restaurants\n\n" +
                    "• bubble tea outlets\n\n" +
                    "• near to bus stop to mrt taman connaught, taman mutiara\n\n" +
                    "• room included with mattress, bed frame, table & chair, fans and lights, small dining table, clothes hanging rack\n\n" +
                    "• share washing machine & kitchen\n\n" +
                    "• nearby gym\n\n" +
                    "• shared bathrooms\n\n",
            //room3

                    "• Share washing machine & kitchen\n\n" +
                    "• single bed for one person only\n\n" +
                    "• private bathroom\n\n" +
                    "• bed frame, mattress, study table & chair, lights, racks.\n\n" +
                    "• Utilities included except aircond usage\n\n" +
                    "• Nearby bus stop to mrt taman connaught, taman Mutiara\n\n" +
                    "• Near salak highway\n\n" +
                    "• Fast food chain restaurants friendly (KFC, dominos, pizzahut, mcd)\n\n+" +
                    "• Near self-laundry dobby\n\n" +
                    "• 10 minutes to eko cheras mall, leisure mall & tesco cheras\n",
            //room4

            "• Fully furnished Single Room For Rent \n\n" +
                    "• single bed for one person only\n\n" +
                    "• near ucsi university\n\n" +
                    "• 5 minutes to mamak by walking\n\n" +
                    "• 5 minutes Pizza Hut, KFC and 99 speedmart \n\n" +
                    "• INCLUDED UTILITIES\n\n" +
                    "• Nearby Bus Stop to MRT Taman Connaught, Taman Mutiara \n\n" +
                    "• Fully Furnished room comes with Mattress, Bed frame, study table and chair, lights and fans, clothes hanging rack. \n\n" +
                    "• 5 mins walking to icon mall\n\n" +
                    "• nearby gym\n\n",
            //room5

            "• Partially furnished single room \n\n" +
                    "• 5 minutes to ucsi\n\n" +
                    "• single bed can’t share with other person\n\n" +
                    "• near fast food chain restaurant (KFC, Mcd, Dominos & Pizzahut)\n\n" +
                    "• near mamak restaurants\n\n" +
                    "• bubble tea outlets\n\n" +
                    "• near to bus stop to mrt taman connaught, taman mutiara\n\n" +
                    "• room included with mattress, bed frame, table & chair, fans and lights, small dining table, clothes hanging rack\n\n" +
                    "• share washing machine & kitchen\n\n" +
                    "• nearby gym\n\n" +
                    "• shared bathrooms\n\n",
            //room6

            "• Share washing machine & kitchen\n\n" +
                    "• single bed for one person only\n\n" +
                    "• private bathroom\n\n" +
                    "• bed frame, mattress, study table & chair, lights, racks.\n\n" +
                    "• Utilities included except aircond usage\n\n" +
                    "• Nearby bus stop to mrt taman connaught, taman Mutiara\n\n" +
                    "• Near salak highway\n\n" +
                    "• Fast food chain restaurants friendly (KFC, dominos, pizzahut, mcd)\n\n+" +
                    "• Near self-laundry dobby\n\n" +
                    "• 10 minutes to eko cheras mall, leisure mall & tesco cheras\n"};
    String mPrice[] = {"RM 335", "RM 450", "RM 500", "RM 570", "RM 550", "RM 600"};
    int images[] = {R.drawable.room1, R.drawable.room2, R.drawable.room3, R.drawable.room4, R.drawable.room5, R.drawable.room6};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list_view);


        MyAdapter adapter = new MyAdapter(this, mTitle, mDescription, images, mPrice);
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
                    intent.putExtra("position", "" + 0);
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
                    intent.putExtra("position", "" + 1);
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
                    intent.putExtra("position", "" + 2);
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
                    intent.putExtra("position", "" + 3);
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
                    intent.putExtra("position", "" + 4);
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
                    intent.putExtra("position", "" + 5);
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
            super(c, R.layout.row, R.id.textView1, title);
            this.context = c;
            this.rTitle = title;
            this.rDescription = description;
            this.rPrice = price;
            this.rImages = imgs;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            View row = layoutInflater.inflate(R.layout.row, parent, false);

            ImageView images = row.findViewById(R.id.image);
            TextView myTitle = row.findViewById(R.id.textView1);
            TextView myDescription = row.findViewById(R.id.textView2);
            TextView myPrice = row.findViewById(R.id.textView3);

            images.setImageResource(rImages[position]);
            myTitle.setText(rTitle[position]);
            myDescription.setText(rDescription[position]);
            myPrice.setText(rPrice[position]);

            return row;
        }
    }
}
