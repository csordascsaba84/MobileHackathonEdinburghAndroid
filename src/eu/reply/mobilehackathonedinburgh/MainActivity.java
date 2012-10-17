package eu.reply.mobilehackathonedinburgh;

import java.util.Date;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import com.stackmob.android.sdk.common.StackMobAndroid;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        StackMobAndroid.init(getApplicationContext(), 0, "e958e07e-eccf-45b7-968c-3edebba73b6a");
        
        Task myTask = new Task("Hello World from Edinburgh Mobile Hackathon", new Date());
        myTask.save();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    
}
