package priom.github.io.memecreator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements TopSecFragment.TopSecListen {
//    Layout
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//    Connect bottom fragment with top fragment
    @Override
    public void createMeme(String top, String bottom) {
        BottomPicFragment bottomFragment = (BottomPicFragment) getSupportFragmentManager().findFragmentById(R.id.bottomFragment);
        bottomFragment.setMemeTxt(top, bottom);
    }
}
