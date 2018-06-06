package wadamasaya.lifecyclesample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LifeCycleMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle_main);
    }
}
