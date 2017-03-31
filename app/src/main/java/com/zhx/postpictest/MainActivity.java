package com.zhx.postpictest;

import android.os.Bundle;
import android.os.Environment;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //img = (ImageView) findViewById(R.id.img);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/
                uploadPic();
            }
        });
    }

    private void uploadPic() {
        File file = new File(Environment.getExternalStorageDirectory()+File.separator+"你文件的路径");
        Map<String,RequestBody> params = new HashMap<>();
        params.put("key",toRequestBody("你申请的Key"));
        params.put("cardType",toRequestBody("2"));
        params.put("pic\"; filename=\""+file.getName()+"",RequestBody.create(MediaType.parse("image/jpg"),file));
        Observable<Person> observale = OneHttp.getServiceInstance().uploadFile(params);
        observale.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Person>() {
                    @Override
                    public void onCompleted() {
                    }
                    @Override
                    public void onError(Throwable e) {
                        Log.d("zhang",e.toString());
                    }
                    @Override
                    public void onNext(Person person) {
                        Log.d("zhanghanxuan","1");
                        Log.d("zhanghanxuan", person.getReason() +"/"+person.getError_code()+"/"+person.getResult().get姓名()+person.getResult().get出生()+person.getResult().get性别()+person.getResult().get民族()+person.getResult().get住址());
                        Log.d("zhanghanxuan","3");
                    }
                });
    }

    public RequestBody toRequestBody(String value){
        RequestBody mRequestBody = RequestBody.create(MediaType.parse("text/plain"),value);
        return mRequestBody;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
