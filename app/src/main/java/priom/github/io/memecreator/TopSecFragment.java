package priom.github.io.memecreator;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.*;
import android.app.*;
import android.widget.*;

public class TopSecFragment extends Fragment {
//    Global var for text views
    private static EditText topTxtIn;
    private static EditText bottomTxtIn;

    TopSecListen activityCommander;

//    Interface for meme
    public interface TopSecListen {
        void createMeme(String top, String bottom);
    }

//    Attach activity
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            activityCommander = (TopSecListen) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString());
        }
    }

//    Create view
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.top_section_fragment, container, false);

        topTxtIn = (EditText) view.findViewById(R.id.topTextIn);
        bottomTxtIn = (EditText) view.findViewById(R.id.bottomTxtIn);
        final Button button = (Button) view.findViewById(R.id.button);

        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        buttonClicked(v);
                    }
                }
        );

        return view;
    }

//    Button action
    public void buttonClicked(View view) {
        activityCommander.createMeme(topTxtIn.getText().toString(), bottomTxtIn.getText().toString());
    }
}
