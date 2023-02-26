package com.example.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ProductInfo#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ProductInfo extends Fragment {

    public ProductInfo() {
        // Required empty public constructor
    }

    public static ProductInfo newInstance(String param1, String param2) {
        ProductInfo fragment = new ProductInfo();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.productinfotxt, container, false);
    }
}