package priom.github.io.memecreator;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.*;
import android.widget.*;

public class BottomPicFragment extends Fragment {
//    Global var for text views
    private static TextView topMemeTxt;
    private static TextView bottomMemeTxt;

//    Create view for meme texts
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_picture_fragment, container, false);
        topMemeTxt = (TextView) view.findViewById(R.id.topMemeTxt);
        bottomMemeTxt = (TextView) view.findViewById(R.id.bottomMemeTxt);
        return view;
    }

//    Set text for both top and bottom
    public void setMemeTxt(String top, String bottom) {
        topMemeTxt.setText(top);
        bottomMemeTxt.setText(bottom);
    }
}
