package ua.zt.mezon.thingstest.thingmatrix.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;

import ua.zt.mezon.thingstest.thingmatrix.MainActivity;
import ua.zt.mezon.thingstest.thingmatrix.R;


public class FragControls extends BaseFragment {


    private Button mbuttonMicDemo;
    private Button mbuttonMic2Demo;
    private FragControlsPresenter mPresenter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter = new FragControlsPresenterImpl();
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    private MainActivity getMainActivity() {
        return (MainActivity) getActivity();
    }

    @Override
    public void onResume() {
        super.onResume();

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_control, container, false);


        mbuttonMicDemo = setEffButton(mbuttonMicDemo, view, 1, R.id.buttonMicDemo);
        mbuttonMic2Demo = setEffButton(mbuttonMic2Demo, view, 2, R.id.buttonFFTeffect1);

        return view;

    }

    private Button setEffButton(Button mbutton, View view, int efftype, int resId) {
        mbutton = view.findViewById(resId);

        mbutton.setOnClickListener(
                view1 -> getMainActivity().startDemo(efftype, 10, true, 44100));

        return mbutton;
    }


}
