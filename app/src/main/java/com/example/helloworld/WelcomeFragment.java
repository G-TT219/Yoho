package com.example.helloworld;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class WelcomeFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    public WelcomeFragment(int contentLayoutId) {
        super(contentLayoutId);
    }

    public static WelcomeFragment newInstance(int id){
        WelcomeFragment welcomeFragment=new WelcomeFragment(id);
        return welcomeFragment;
    }
}
