package com.joova.logika_mobile;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class UomListActivity extends AppCompatActivity {

    final String[] uomArray = {
      "Mili Meter", "Centi Meter", "Desi Meter", "Deka Meter", "Kilo Meter", "Meter",
            "Gram", "Ons", "Kilo Gram", "Liter", "Mili Liter"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uom_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //buat list adapter
        ArrayAdapter<String> uomAdpter = new ArrayAdapter<String>(this, R.layout.content_uom_list, R.id.text_username, uomArray);
        ListView listViewUom = (ListView) findViewById(R.id.list_view_uom);

        listViewUom.setAdapter(uomAdpter);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
