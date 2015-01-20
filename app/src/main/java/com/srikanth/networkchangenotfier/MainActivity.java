package com.srikanth.networkchangenotfier;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {

    private ListView mConnectionListView;
    private ArrayAdapter<String> mArrayAdapter;
    private ArrayList<String> statusChangeList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mConnectionListView = (ListView) findViewById(R.id.listView);
        if (statusChangeList == null) {
            statusChangeList = new ArrayList<>();
        }
        mArrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, statusChangeList);
    }
}
