package com.example.manuel.fragments;

import android.app.AlertDialog;
import android.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.zip.Inflater;

/**
 * Created by manuel on 08/10/2017.
 */

public class Izquierda extends Fragment {

    View rootview;

    public View onCrateView(LayoutInflater inflater, ViewGroup container, Bundle savedIntanceState){
        rootview= inflater.inflate(R.layout.izquierda,container,false);
         return  rootview;
    }
}
