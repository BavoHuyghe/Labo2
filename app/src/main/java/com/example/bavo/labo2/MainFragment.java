package com.example.bavo.labo2;


import android.app.ListFragment;
import android.content.Context;
import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends ListFragment {

    ListView elementsList;
    ArrayAdapter<String> adapter;
    Context context;

    String tag = this.getClass().getSimpleName();

    public MainFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        Log.i(tag, "onAttach");
        super.onAttach(context);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.i(tag, "onCreate");
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.i(tag, "onCreateView");

        context = getActivity();

        View view;
        view = inflater.inflate(R.layout.elementslistfragment,container,false);

        elementsList = (ListView) view.findViewById(R.id.elementslist);

        String[] elements = context.getResources().getStringArray(R.array.superheroes_names);
        adapter = new ArrayAdapter<String>(context,android.R.layout.simple_list_item_activated_1, elements);

        elementsList.setAdapter(adapter);

        return view;
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        Log.i(tag, "onActivityCreated");
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStart() {
        Log.i(tag, "onStart");
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.i(tag, "onResume");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.i(tag, "onPause");
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.i(tag, "onStop");
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        Log.i(tag, "onDestroyView");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.i(tag, "onDestroy");
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Log.i(tag, "onDetach");
        super.onDetach();
    }






















}
