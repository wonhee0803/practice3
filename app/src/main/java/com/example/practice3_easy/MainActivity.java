package com.example.practice3_easy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.practice3_easy.databinding.ActivityMainBinding;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private boolean checked = false;
    private final Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.button.setOnClickListener(v -> {
            if (checked) {
                Toast.makeText(this, "한번만 할 수 있음", Toast.LENGTH_SHORT).show();
                return;
            }
            checked = true;
            int score = random.nextInt(101);
            binding.score.setText(String.format("%d점", score));
        });
    }
}