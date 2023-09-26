package br.com.tiagors09.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import br.com.tiagors09.cardview.R;
import br.com.tiagors09.cardview.adapter.PostagemAdapter;
import br.com.tiagors09.cardview.model.Postagem;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerViewPostagem;
    private List<Postagem> postagens;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.postagens = new ArrayList<Postagem>();
        this.prepararPostagens();

        recyclerViewPostagem = findViewById(R.id.recyclerViewPostagens);

        // Define layout manager
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(
                getApplicationContext()
        );

        this.recyclerViewPostagem.setLayoutManager(layoutManager);

        // Definir adapter
        PostagemAdapter postagemAdapter = new PostagemAdapter(postagens);
        this.recyclerViewPostagem.setAdapter(postagemAdapter);
    }

    public void prepararPostagens() {
        Postagem p = new Postagem(
                "Jamilton Damasceno",
                "#tbt Viagem legal!",
                R.drawable.janela_de_aviao);

        this.postagens.add(p);

        p = new Postagem(
                "Miguel O'Hara",
                "indo concertar o canon",
                R.drawable.selfie);

        this.postagens.add(p);

        p = new Postagem(
                "Paula Tejando",
                "andando de trem",
                R.drawable.trem);

        this.postagens.add(p);
    }
}