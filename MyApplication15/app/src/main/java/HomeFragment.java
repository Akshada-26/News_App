package com.example.newsapp.ui.Home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.R;

import java.HomeViewModel;
import java.WebViewController;


public class HomeFragment extends Fragment {

    public HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        homeViewModel = new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        // Created a WebView and used the loadurl method
        // to give url to WebView Controller class
        WebView webView = root.findViewById(R.id.web_view_zee);

        // Url of website is passed here
        webView.loadUrl("https://zeenews.india.com/");

        // WebViewController is used
        webView.setWebViewClient(new WebViewController());
        return root;
    }
}
