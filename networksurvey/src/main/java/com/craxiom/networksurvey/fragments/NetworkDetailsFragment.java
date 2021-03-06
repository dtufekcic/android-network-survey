package com.craxiom.networksurvey.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import com.craxiom.networksurvey.R;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * A fragment for displaying the latest cellular network details to the user.
 */
public class NetworkDetailsFragment extends Fragment
{
    public static final AtomicBoolean visible = new AtomicBoolean(false);

    public NetworkDetailsFragment()
    {
        super(R.layout.fragment_network_details);
    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onResume()
    {
        super.onResume();

        visible.set(true);
    }

    @Override
    public void onPause()
    {
        visible.set(false);

        super.onPause();
    }

    @Override
    public void onDetach()
    {
        super.onDetach();
    }
}
