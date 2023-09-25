package br.com.tiagors09.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import br.com.tiagors09.cardview.R;
import br.com.tiagors09.cardview.adapter.PostagemAdapter;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerViewPostagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewPostagem = findViewById(R.id.recyclerViewPostagens);

        // Define layout manager
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(
                getApplicationContext()
        );

        this.recyclerViewPostagem.setLayoutManager(layoutManager);

        // Definir adapter
        PostagemAdapter postagemAdapter = new PostagemAdapter();
        this.recyclerViewPostagem.setAdapter(postagemAdapter);

    }

}