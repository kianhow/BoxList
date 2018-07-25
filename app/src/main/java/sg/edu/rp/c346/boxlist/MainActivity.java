package sg.edu.rp.c346.boxlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvBox;
    ArrayList<BoxItem> alBoxList;
    CustomAdapter caBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvBox = findViewById(R.id.ListViewBox);

        alBoxList = new ArrayList<>();

        BoxItem item1 = new BoxItem(true, false);
        BoxItem item2 = new BoxItem(false, false);
        BoxItem item3 = new BoxItem(false, true);

        alBoxList.add(item1);
        alBoxList.add(item2);
        alBoxList.add(item3);

        caBox = new CustomAdapter(this, R.layout.box_item, alBoxList);
        lvBox.setAdapter(caBox);

    }
}
