package com.example.mymenu.ui.newchat;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.mymenu.databinding.FragmentNewChatBinding;

public class NewChatFragment extends Fragment {

    private FragmentNewChatBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        NewChatViewModel chatViewModel =
                new ViewModelProvider(this).get(NewChatViewModel.class);

        binding = FragmentNewChatBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textNewchat;
        chatViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
