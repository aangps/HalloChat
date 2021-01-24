package com.aangps01.hallochat.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.aangps01.hallochat.LoginActivity;
import com.aangps01.hallochat.R;
import com.aangps01.hallochat.RegisterActivity;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.rengwuxian.materialedittext.MaterialEditText;

import com.aangps01.hallochat.RegisterActivity;

import java.util.HashMap;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragAddPsikiater#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragAddPsikiater extends Fragment {


    public FragAddPsikiater() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static FragAddPsikiater newInstance() {
        FragAddPsikiater fragment = new FragAddPsikiater();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_add_psikiater, container, false);


    }
}