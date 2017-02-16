package com.javier.fourthapp;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

import java.util.Date;


/**
 * A simple {@link Fragment} subclass.
 */
public class RedFragment extends Fragment {


    private static final String TAG ="RedFragmentTAG_"  ;

    private TextView textView;

    private Button button;
    private ImageView imageView;


    public RedFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.d(TAG, "onCreateView: ");
        return inflater.inflate(R.layout.fragment_red, container, false);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d(TAG, "onAttach: ");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(TAG, "onDetach: ");
    }

    @Override
    public void onInflate(Context context, AttributeSet attrs, Bundle savedInstanceState) {
        super.onInflate(context, attrs, savedInstanceState);

        //button= (Button) getView().findViewById(R.id.f_red_btn);
        Log.d(TAG, "onInflate: " + button);

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(TAG, "onDestroyView: ");
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        button= (Button) getView().findViewById(R.id.f_red_btn);
        textView = (TextView) getView().findViewById(R.id.f_red_tv1) ;
        imageView = (ImageView) getView().findViewById(R.id.f_red_img) ;

        Picasso.with(getContext())
                .load("http://i.imgur.com/DvpvklR.png")
                .into(imageView);


        Log.d(TAG, "onViewCreated: ");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        button= (Button) getView().findViewById(R.id.f_red_btn);
        Log.d(TAG, "onActivityCreated: ");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String date = new Date().toString();


                Log.d(TAG, "onClick: " + date);

                Intent intent = new Intent(getContext(), SecondActivity.class);
                startActivity(intent);
            }
        });
    }
    void updateText(String Text){
        //textView.setText();


    }
}
