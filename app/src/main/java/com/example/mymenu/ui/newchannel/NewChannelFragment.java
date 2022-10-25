package com.example.mymenu.ui.newchannel;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.mymenu.databinding.FragmentNewChannelBinding;

public class NewChannelFragment extends Fragment {

    private FragmentNewChannelBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        NewChannelViewModel chatViewModel =
                new ViewModelProvider(this).get(NewChannelViewModel.class);

        binding = FragmentNewChannelBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textNewchannel;
        chatViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}