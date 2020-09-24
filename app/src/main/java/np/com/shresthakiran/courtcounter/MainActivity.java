package np.com.shresthakiran.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA = 0;
    int scoreB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void display(int score){
        TextView tvTeamAScore = findViewById(R.id.tvTeamAScore);
        tvTeamAScore.setText(String.valueOf(score));
    }
    public void displayB(int score){
        TextView tvTeamBScore = findViewById(R.id.tvTeamBScore);
        tvTeamBScore.setText(String.valueOf(score));
    }

    public void pointerA3(View v){
        scoreA+=3;
        display(scoreA);
    }

    public void pointerA2(View v){
        scoreA+=2;
        display(scoreA);
    }

    public  void pointAFree(View v){
        scoreA+=1;
        display(scoreA);
    }

    public void pointerB3(View v){
        scoreB+=3;
        displayB(scoreB);
    }

    public void pointerB2(View v){
        scoreB+=2;
        displayB(scoreB);
    }

    public  void pointBFree(View v){
        scoreB+=1;
        displayB(scoreB);
    }
}