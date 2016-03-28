package ice_pbru.netkasak.santipap.piano;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mpBgm;
    Button btnOK;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOK = (Button) findViewById(R.id.c1);
        btnOK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MediaPlayer mpEffect
                        = MediaPlayer.create(MainActivity.this, R.raw.song1);
                mpEffect.start();
                mpEffect.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });


        btnOK = (Button) findViewById(R.id.c2);
        btnOK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MediaPlayer mpEffect
                        = MediaPlayer.create(MainActivity.this, R.raw.song2);
                mpEffect.start();
                mpEffect.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });


        btnOK = (Button) findViewById(R.id.c3);
        btnOK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MediaPlayer mpEffect
                        = MediaPlayer.create(MainActivity.this, R.raw.song3);
                mpEffect.start();
                mpEffect.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });


        btnOK = (Button) findViewById(R.id.c4);
        btnOK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MediaPlayer mpEffect
                        = MediaPlayer.create(MainActivity.this, R.raw.song4);
                mpEffect.start();
                mpEffect.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });


        btnOK = (Button) findViewById(R.id.c5);
        btnOK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MediaPlayer mpEffect
                        = MediaPlayer.create(MainActivity.this, R.raw.song5);
                mpEffect.start();
                mpEffect.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });


        btnOK = (Button) findViewById(R.id.c6);
        btnOK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MediaPlayer mpEffect
                        = MediaPlayer.create(MainActivity.this, R.raw.song6);
                mpEffect.start();
                mpEffect.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });


        btnOK = (Button) findViewById(R.id.c7);
        btnOK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MediaPlayer mpEffect
                        = MediaPlayer.create(MainActivity.this, R.raw.song7);
                mpEffect.start();
                mpEffect.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });






    }






}
