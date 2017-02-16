package com.javier.fourthapp;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class GreenFragment extends Fragment {

    private Button button;
    private MyCallback mycallback;
    private TextView textView;
    private EditText editText;

    public GreenFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mycallback = (MyCallback) context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_green, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        textView = (TextView) view.findViewById(R.id.f_green_TV);
        editText = (EditText) view.findViewById(R.id.f_green_ET);
        button = (Button) view.findViewById(R.id.f_greenbtn);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                mycallback.someoneClicked(editText.getText().toString());
            }
        });
    }

    public interface MyCallback{
        void someoneClicked(String message);
    }

}
