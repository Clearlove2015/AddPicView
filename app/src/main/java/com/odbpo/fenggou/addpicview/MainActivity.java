package com.odbpo.fenggou.addpicview;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.odbpo.fenggou.lib.add_pic_view.AddPicView;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * https://github.com/yzytmac/YzyAddPicView
 */
public class MainActivity extends AppCompatActivity {

    @Bind(R.id.add_pic_view)
    AddPicView addPicView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 0x01 && resultCode == Activity.RESULT_OK) {
            Uri vData = data.getData();
            Log.e("yzy", "onActivityResult: " + vData);
            addPicView.addPicture(vData);
        }
    }

}
