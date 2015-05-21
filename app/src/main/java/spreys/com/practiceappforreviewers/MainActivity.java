package spreys.com.practiceappforreviewers;


import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openMediaStreamer(View view) {
        showToast("Media Streamer button pressed");
    }

    public void openSuperDuo(View view) {
        showToast("Super Duo button pressed");
    }

    public void openBaconReader(View view) {
        showToast("Bacon Reader button pressed");
    }

    public void openSunshineWear(View view){
        showToast("Sunshine Wear button pressed");
    }

    public void openAntTerminator(View view) {
        showToast("Ant Terminator button pressed");
    }

    public void openCapstone(View view) {
        showToast("Capstone button pressed");
    }

    private void showToast (String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
