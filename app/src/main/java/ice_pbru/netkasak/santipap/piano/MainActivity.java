package ice_pbru.netkasak.santipap.piano;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    private void _intObject()
    {
        Button c_song = (Button) this.findViewById(R.id.c_song);
        c_song.setOnClickListener(new View.OnClickListener() {
                                      public void onClick(View v)

                                      {
                                          MediaPlayer play = MediaPlayer.create(getBaseContext(),
                                                  R.raw.song1);
                                          play.start();

                                      }


                                  }
        );


    }


}
