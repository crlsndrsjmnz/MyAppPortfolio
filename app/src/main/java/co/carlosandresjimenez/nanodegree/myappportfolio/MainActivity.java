package co.carlosandresjimenez.nanodegree.myappportfolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity implements View.OnClickListener {

    private Button spotifyStreamerButton;
    private Button scoresAppButton;
    private Button libraryAppButton;
    private Button buildItBiggerButton;
    private Button xyzReaderButton;
    private Button capstoneButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spotifyStreamerButton = (Button) findViewById(R.id.spotify_streamer_bt);
        scoresAppButton = (Button) findViewById(R.id.scores_app_bt);
        libraryAppButton = (Button) findViewById(R.id.library_app_bt);
        buildItBiggerButton = (Button) findViewById(R.id.build_it_bigger_bt);
        xyzReaderButton = (Button) findViewById(R.id.xyz_reader_bt);
        capstoneButton = (Button) findViewById(R.id.capstone_bt);

        spotifyStreamerButton.setOnClickListener(this);
        scoresAppButton.setOnClickListener(this);
        libraryAppButton.setOnClickListener(this);
        buildItBiggerButton.setOnClickListener(this);
        xyzReaderButton.setOnClickListener(this);
        capstoneButton.setOnClickListener(this);
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

    @Override
    public void onClick(View v) {
        String msgText = "This button will launch ";
        switch (v.getId()) {
            case R.id.spotify_streamer_bt:
                msgText += getString(R.string.spotify_streamer_bt);
                break;
            case R.id.scores_app_bt:
                msgText += getString(R.string.scores_app_bt);
                break;
            case R.id.library_app_bt:
                msgText += getString(R.string.library_app_bt);
                break;
            case R.id.build_it_bigger_bt:
                msgText += getString(R.string.build_it_bigger_bt);
                break;
            case R.id.xyz_reader_bt:
                msgText += getString(R.string.xyz_reader_bt);
                break;
            case R.id.capstone_bt:
                msgText += getString(R.string.capstone_bt);
                break;
        }
        Toast.makeText(this, msgText, Toast.LENGTH_SHORT).show();
    }
}
