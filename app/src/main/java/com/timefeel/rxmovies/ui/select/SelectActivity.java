package com.timefeel.rxmovies.ui.select;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.timefeel.rxmovies.R;
import com.timefeel.rxmovies.ui.select.core.CountryAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by test on 08/03/2017.
 */

/*public class SelectActivity extends AppCompatActivity {

    @BindView(R.id.gridview) GridView gridview;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.country_grid);
        ButterKnife.bind(this);
        gridview.setAdapter(new CountryAdapter(getApplicationContext()));


        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                String tag = (String) v.getTag();
                Toast.makeText(getApplicationContext(), "" + position + tag, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("alpha2", tag);
                startActivity(intent);
                finish();
            }
        });
    }
}*/
